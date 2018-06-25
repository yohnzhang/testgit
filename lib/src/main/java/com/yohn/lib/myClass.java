package com.yohn.lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class myClass {
    public static void main(String[] args) {
        Date date = new Date();  // 对应的北京时间是2017-08-24 11:17:10

        SimpleDateFormat bjSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");     // 北京
        bjSdf.setTimeZone(TimeZone.getTimeZone("GMT+7"));  // 设置北京时区

        SimpleDateFormat tokyoSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // 东京
        tokyoSdf.setTimeZone(TimeZone.getTimeZone("GMT+12"));  // 设置东京时区

        SimpleDateFormat londonSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 伦敦
        londonSdf.setTimeZone(TimeZone.getTimeZone("GMT-12"));  // 设置伦敦时区

        SimpleDateFormat biaozhun = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("毫秒数:" + date.getTime() + ", 北京时间:" + date.getTime());
        try {
            System.out.println("毫秒数:" + date.getTime() + ", 东京时间:" + biaozhun.parse(tokyoSdf.format(date)).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar=Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT-12"));
        calendar.setTime(date);
        Calendar calendar2=Calendar.getInstance();
        calendar2.setTimeZone(TimeZone.getTimeZone("GMT+12"));
        calendar2.setTime(date);
        System.out.println();
        System.out.println("毫秒数:" + date.getTime() + ", 伦敦时间:" + calendar.getTimeInMillis());
        System.out.println();
        System.out.println();
        System.out.println("毫秒数:" + date.getTime() + ", 伦敦时间:" + calendar2.getTimeInMillis());
        System.out.println();




    }



}
