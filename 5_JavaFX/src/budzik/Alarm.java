/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budzik;

import java.util.Comparator;

/**
 *
 * @author marci
 */
public class Alarm implements Comparable<Alarm>{
    private String note;
    private Integer hour;
    private Integer minute;

    public Alarm(String note, int hour, int minute) {
        this.note = note;
        this.hour = hour;
        this.minute = minute;
    }
    
    public Alarm(int hour, int minute) {
        this.note = "none";
        this.hour = hour;
        this.minute = minute;
    }

    public String getNote() {
        return note;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public int compareTo(Alarm o) {
        if(o.getHour()==hour)
        {
            if(o.getMinute()==minute)
                return 0;
            if(o.getMinute()<minute)
                return -1;
            else
                return 1;
        }
        else if(o.getHour()< hour)
            return -1;
        else
            return 1;
    }

   

    
    

    
    
}
