package Homework6;

import java.util.ArrayList;
public class shelf {
    public static void main(String[] args) {
        ArrayList<Books> list = new ArrayList<Books>();
        list.add(new Books("Kapitanskaya dochka", "A.S.Pushkin"));
        list.add(new Books("Idiot", "F.M.Dostoevskiy"));
        list.add(new Books("Geroy nashego vremeny", "M.Y.Lermontov"));

        for (int i=0; i< list.size();i++){
            list.get(i).print();
        }
    }
}
