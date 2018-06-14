package main;

import com.sun.xml.internal.ws.api.pipe.ContentType;
import javafx.scene.image.Image;
import model.SSA;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@RestController
public class SSAController {
    @Autowired
    private  SSAService ssaService;


    @RequestMapping("/gallery/pictures")
    public List<SSA> getAllSSA(){
        return ssaService.getAllSSA();
    }



    @RequestMapping("/gallery/picture")
    public List<File> getFileList(){
        return ssaService.getImgList();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/gallery/picture/{id}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getImage(@PathVariable("id") String id) throws IOException{
        byte[] image = ssaService.getImage(id);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
    }
    @ResponseBody


    @RequestMapping(method = RequestMethod.DELETE, value = "/gallery/picture/{id}")
    public void deleteSSA(@PathVariable String id){
        ssaService.deleteSSA(id);
    }

    private String path="C://Users//marci//Desktop";

    @RequestMapping(method = RequestMethod.POST, value = "/gallery/upload")
    public @ResponseBody String handleFileUpload(@RequestParam("foto1.png") MultipartFile file){
        String name = "test11";
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File(name + "-uploaded")));
                stream.write(bytes);
                stream.close();
                return "You successfully uploaded " + name + " into " + name + "-uploaded !";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }
}
