/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budzik;


import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.canvas.Canvas;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author marci
 */
public class FXMLDocumentController implements Initializable {
    
    private ArrayList<Alarm> alarm;
    
    
    @FXML
    private Canvas canvas;
    
    
    
    @FXML private TableView<Alarm> tabela;
    @FXML private TableColumn<Alarm, String> nazwaColumn;
    @FXML private TableColumn<Alarm, Integer> godzinaColumn;
    @FXML private TableColumn<Alarm, Integer> minutaColumn;
    
    private ObservableList<Alarm> alarmy;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        alarm = new ArrayList<Alarm>();
        alarm.add(new Alarm("budzik",14,56));
        alarm.add(new Alarm(14,57));
        alarm.add(new Alarm(14,58));
        alarm.add(new Alarm(10,48));
        
        sortArray();
        
        
        alarmy = FXCollections.observableArrayList(alarm);
        
        
        setArray();
        timer.start();
        
    }    

    private void setArray()
    {
        tabela.itemsProperty().setValue(alarmy);
        nazwaColumn.setCellValueFactory(
                new PropertyValueFactory<Alarm, String>("note"));
        godzinaColumn.setCellValueFactory(
                new PropertyValueFactory<Alarm, Integer>("hour"));
        minutaColumn.setCellValueFactory(
                new PropertyValueFactory<Alarm, Integer>("minute"));
    }
    
    private void sortArray()
    {
        for(int i = 0; i < alarm.size(); i++)
        {
            for(int j=0; j < alarm.size(); j++)
            {
                if(alarm.get(i).compareTo(alarm.get(j))>0)
                {
                    Alarm tmp = alarm.get(i);
                    alarm.set(i, alarm.get(j));
                    alarm.set(j,tmp);
                }
            }
        }
    }
    
    @FXML
    private void zamknijAction(ActionEvent event)
    {
        Platform.exit();
    }
    
    @FXML
    private void removeAlarmAction(ActionEvent event)
    {
        int itemIndex = tabela.getSelectionModel().getSelectedIndex();
        tabela.getItems().remove(itemIndex);
        alarm.remove(itemIndex);
        setArray();
        
    }
    
    @FXML
    private void addAlarm(ActionEvent event){
        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddingWinodow.fxml"));
//            Parent root1 = (Parent) fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Dodaj budzik");
//            stage.setScene(new Scene(root1));
//            stage.show();
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddingWindow.fxml"));
            
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            
             
             
        }catch(Exception e){
            System.out.println("Nie można dodać nowego budzika");
        }
    }
    
    @FXML 
    private void clearAction(ActionEvent event)
    {
        tabela.getItems().clear();
        alarm.clear();
    }
    
    BooleanProperty running = new SimpleBooleanProperty();
    DoubleProperty time = new SimpleDoubleProperty();
    
    AnimationTimer timer = new AnimationTimer(){
        
        
        private long startTime;
        
        @Override
        public void start(){
            startTime = System.currentTimeMillis();
            running.set(true);
            super.start();
        }
        
        @Override
        public void stop(){
            running.set(false);
            super.stop();
        }
        
        @Override
        public void handle(long now) {
            long now1 = System.currentTimeMillis();
            time.set((now1-startTime)/1000.0);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            checkAlarm(alarm);
            
            draw(gc);
            
            
        }
        
    };
   
    boolean isPlaying = false;
    int isPlayingMinute;
    
    private void checkAlarm(ArrayList<Alarm> array){
        
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        
        
        
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        
        
        
            for(int i = 0; i<array.size(); i++)
            {
                 if( array.get(i).getHour() == hour && array.get(i).getMinute() == minute)
                {
                   
                    play();
                    System.out.println("Dzwoni budzik");
                    alarm.remove(i);
                    tabela.getItems().remove(i);
                    
                    
                }
            }
        
        
        
    }
    
    private void play()
    {
        Media sound = new Media(new File("sound.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setCycleCount(10);
        mediaPlayer.play();
    }
    
    private void draw(GraphicsContext gc) {
        int midX = 200;
        int midY = 200;
        
        gc.setFill(Color.BROWN);
        gc.fillOval(0,0, 400, 400);
        gc.setFill(Color.WHITE);
        gc.fillOval(3, 3, 394, 394);
        gc.setFill(Color.BROWN);
        gc.setLineWidth(2);
        gc.strokeLine(0, midY, 10, midY);
        gc.strokeLine(midX, 10, midY, 0);
        gc.strokeLine(canvas.getWidth(), midY, canvas.getWidth()-10, midY);
        gc.strokeLine(midX, canvas.getHeight(), midX, canvas.getHeight()-10);
      
        
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        
        
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int seconds = second+ minute*60+hour*3600;
      
       
        //wskazowka godzinowa
        int hourHand = 130;
        gc.setLineWidth(6);
        int hX = (int) (hourHand*Math.sin((double)(seconds)/3600.0*30*Math.PI/180))+midX;
        int hY = -(int) (hourHand*Math.cos((double)(seconds)/3600.0*30*Math.PI/180))+midY;
        gc.strokeLine(midX, midY, hX, hY);
        
        //wskazowka minutowa
        int minuteHand = 160;
        gc.setFill(Color.RED);
        gc.setLineWidth(4);
        int mX = (int)(minuteHand*Math.sin((double)(seconds)/60.0*6.0*Math.PI/180))+midX;
        int mY = -(int)(minuteHand*Math.cos((double)(seconds)/60.0*6.0*Math.PI/180))+midY;
        gc.strokeLine(midX, midY, mX, mY);
        
        //wskazowka minutowa
        int secondHand = 180;
        gc.setFill(Color.RED);
        gc.setLineWidth(2);
        int sX = (int)(minuteHand*Math.sin((double)(second)*6.0*Math.PI/180))+midX;
        int sY = -(int)(minuteHand*Math.cos((double)(second)*6.0*Math.PI/180))+midY;
        
        gc.strokeLine(midX, midY, sX, sY);
         
        gc.setFill(Color.BLACK);
        gc.fillText(hour+":"+minute+":"+second, 150, 200);
         
    }
    
}
