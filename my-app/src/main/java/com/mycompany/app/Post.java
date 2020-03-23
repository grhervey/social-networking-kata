package com.mycompany.app;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Post {
    private String text;
    Date date;

    public Post(String text){
       this.text = text;
       this.date = new Date(); 
    }
     public String getText(){
         return this.text;
     };

     //I am unsure on how to best test Dates
     public Date getDate(){
         return this.date;
     };

     public String getReadableDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
        return formatter.format(this.date);
     }

}