package Homework27;
import java.util.*;
import java.util.Map;

public class Name {
    public static Map<String, String> createMap(){
        Map<String, String> name = new HashMap<>();
        name.put("Theodor", "Baranov");
        name.put("Ivan","Novikov");
        name.put("Ivan","Nosov");
        name.put("Kirill","Morozov");
        name.put("Nikita","Morozov");
        name.put("Andrey","Lenev");
        name.put("Victor", "Morozov");
        name.put("Katya","Panina");
        name.put("Vasiliy","Denisov");
        name.put("Semen","Morozov");
        return name;
    }

    public static int getSameFirstNameCount (Map<String,String> name){
        return 11 - name.size();
    }

    public static int getSameLastNameCount (Map<String,String> name){
        int mount = 1;
        List<String> lastName = new ArrayList<>();
        lastName.addAll(name.values());
        for (int i = 0; i < lastName.size();  i++){
            for (int j = i + 1; j < lastName.size(); j++){
                if(lastName.get(i).equals(lastName.get(j))){
                    lastName.remove(j--);
                    mount++;
                }
            }
        }
        return mount;
    }

    public static void main(String[] args) {
        Map<String,String> map = createMap();
        System.out.println("The number of first name is the same: " + getSameFirstNameCount(map));
        System.out.println("The number of last name is the same: " + getSameLastNameCount(map));
    }
}
