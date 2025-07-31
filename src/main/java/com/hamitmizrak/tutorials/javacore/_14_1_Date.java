package com.hamitmizrak.tutorials.javacore;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _14_1_Date {

    // Date (GET)
    public static void getDateTutorials() {
        // Date Instance(Örnekleme)
        Date dateTime = new Date();

        System.out.println("Şu andaki zaman: " + dateTime);
        System.out.println("1 ocak 1970: " + dateTime.  getTime());
        System.out.println("Year: " + dateTime.getYear()); // +1900, -1900
        System.out.println("Year: " + (1900 + dateTime.getYear()));
        System.out.println("Month: " + dateTime.getMonth());     // ay: Sıfırdan başlar
        System.out.println("Day: " + dateTime.getDay());        //
        System.out.println("Ayın Date: " + dateTime.getDate()); //
        System.out.println("Hours: " + dateTime.getHours());    //
        System.out.println("Minute: " + dateTime.getMinutes()); //
        System.out.println("Second: " + dateTime.getSeconds()); //
    }


    // Date (SET)
    public static void setDateTutorials() {
        // Date Instance(Örnekleme)
        Date dateTime = new Date();
        System.out.println("Hours: " + dateTime.getHours());    //
        dateTime.setHours(15);
        System.out.println("Hours: " + dateTime.getHours());    //
    }

    // DateFormatter

    public static void dateToFormatter() {
        Date now= new Date();
        now.setHours(15);

        Locale locale= new Locale("tr","TR");

        // 1.YOL (18.06.2025 20:16)
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat();
        //String formattedToString = simpleDateFormat.format(now);

        // 2.YOL
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMM",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMMM",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("MMMM-yyyy-",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMMM",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMMM-dd",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss",locale);
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss",locale);
        // yyyy:yıl   - MMMM: ay  -  dd: gün HH: saat :mm dakika: ss : milisaniy zzzz:time zone
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss zzzz",locale);
        String formattedToString = simpleDateFormat.format(now);
        System.out.println("formatter "+formattedToString);

    }

    public static void main(String[] args) {
        //getDateTutorials();
        //setDateTutorials();
        dateToFormatter();
    }
}
