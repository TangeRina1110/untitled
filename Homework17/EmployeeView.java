package Homework17;

import java.util.Scanner;

public class EmployeeView {
    public static Scanner in = new Scanner(System.in);

    public void showMessage(String msg){
        System.out.println(msg);
    }

    public EmployeeModel getEmployeeInfo(){
        EmployeeModel employee = new EmployeeModel();
        System.out.println("Enter name: ");
        employee.setName(in.nextLine());
        System.out.println("Enter number of working days: ");
        employee.setNumberOfWorkingDays(in.nextInt());
        System.out.println("Enter number of salary: ");
        employee.setSalary(in.nextLong());
        return employee;
    }

}