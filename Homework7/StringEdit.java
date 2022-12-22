package Homework7.String;

public class StringEdit implements StringInt{
    public int length(String str) {
        return str.length();
    }

    public String newString(String str) {
        char arr[] = str.toCharArray();
        String newStr = "";
        for(int i = 0; i < str.length(); i+=2)
            newStr += arr[i];
        return newStr;
    }

    public String reverse(String str) {
        char arr[] = str.toCharArray();
        String newStr = "";
        for(int i = str.length(); i > 0; i--)
            newStr += arr[i];
        return newStr;
    }
}
