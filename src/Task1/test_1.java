package Task1;

public class test_1 {
   private String name;
   private String email;
   private char gender;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){

        return null;
    }
    public test_1(String name, char gender, String email){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public static void main(String[] args) {
        test_1 example = new test_1("Denis",'m', "123@.ru");
        System.out.println(example.getName());

    }
}

