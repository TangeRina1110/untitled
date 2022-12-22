package Homework14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");//hi may name is kate bye
        String input = in.nextLine();
        System.out.print("Enter regex: ");//\w+
        String regex = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}