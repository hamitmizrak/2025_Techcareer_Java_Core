package com.hamitmizrak.tutorials.javacore;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


/**
 Calendar: new Date'e alternatif olarak gelmiştir */
public class _14_2_Calendar {

    public static void calendarDate(){

        // Calendar instance
        Calendar cal = Calendar.getInstance();

        System.out.println("Şu an: " + cal.getTime());

        // Tarih parçalayıp yaz
        int year = cal.get(Calendar.YEAR); // year
        int month = cal.get(Calendar.MONTH) + 1; // ay
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Yıl: "+ cal.get(Calendar.YEAR)); // 1900 eklemeye,çıkarmaya gerek yok

        System.out.println("Tarih: " + day + "/" + month + "/" + year);

        // 10 gün ekle
        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("10 gün sonra: " + cal.getTime());

        // Saat ayarla
        cal.set(Calendar.HOUR_OF_DAY, 15);
        cal.set(Calendar.MINUTE, 30);
        System.out.println("Saat ayarı sonrası: " + cal.getTime());
    }

    // Formatter
    public static void calendarFormatterTutorials() {

        // 1. Türkçe locale ayarı
        Locale locale = new Locale("tr", "TR");

        // 2. Format belirliyoruz (LocalDateTime ile aynı format)
        // yyyy-MMMM-dd HH:mm:ss  (Örn: 2025-Temmuz-31 15:24:50)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss", locale);

        // 3. Şu anki zamanı Calendar sınıfından alıyoruz
        Calendar calendar = Calendar.getInstance();

        // 4. Calendar'dan Date objesi alıp formatlıyoruz
        System.out.println(calendar.getTime()); // Varsayılan format
        System.out.println(sdf.format(calendar.getTime())); // Formatlanmış çıktı
    }

    public static void main(String[] args) {
        calendarDate();
    }
}
