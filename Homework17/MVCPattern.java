package Homework17;


    public class MVCPattern {
        public static void main(String[] args) {
            EmployeeView view = new EmployeeView();
            Controller controller = new Controller(view);
            System.out.println(controller.getSalaryMonth());
        }
    }

