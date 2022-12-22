package Homework11;

import java.sql.SQLOutput;
        import java.text.SimpleDateFormat;
        import java.util.Date;

public class ex1 {
    static String made = "Time of receiving tasks: Dec 01, 16:07:12";
    static String name = "Baranova";
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM',' HH:mm:ss a" );
        String bebra = dateFormat.format(date);
        System.out.println(name);
        System.out.println(made);
        System.out.println(bebra);
    }
}