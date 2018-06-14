package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ExtendedSystemCache cache = new ExtendedSystemCache();
        ScatterSystem system = new ScatterSystem();

        String path = "C:\\Users\\marci\\IdeaProjects\\8_pliki_strumienie\\plik.csv";
        File file = new File(path);

        InputStream in = new FileInputStream(path);

        OutputStream out = new FileOutputStream(path);

        double[] input = {1.0, 2.5, 12.25, 107.12};
        Double output = cache.get(input);

        if(output == null)
        {
            output = system.makeOperation(input);
            cache.put(input, output);
        }

        double[] input2 = {2.0, 1.5, 5.25, 107.12};
        output = cache.get(input2);

        if(output == null)
        {
            output = system.makeOperation(input2);
            cache.put(input2, output);
        }
        try {
            cache.exportCSV(out);
        }catch (IOException e) {
            e.printStackTrace();
        }


        ExtendedSystemCache cache2 = new ExtendedSystemCache();
//        try {
//            cache.exportCSV(path);
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        cache.serialize(path);

//        try {
//            cache2.importCSV(path);
//        }catch (IOException e)
//        {
//            e.printStackTrace();
//        }

        cache2.deserialize(path);
        System.out.println("cache1\n"  + cache.show());

        System.out.println("cache2\n"  + cache2.show());

    }
}
