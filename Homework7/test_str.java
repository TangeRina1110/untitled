package Homework7.String;

public class test_str {
    public static void main(String[] args) {
        String str = "123456789";
        StringEdit t = new StringEdit();
        System.out.printf("String| %s \n\t\tLength: %s\n\t\tEdited: %s\n", str, t.length(str), t.newString(str));
    }
}
