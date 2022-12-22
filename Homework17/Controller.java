package Homework17;


public class Controller {
    private EmployeeView view;
    public Controller(EmployeeView view){
        this.view = view;
    }

    public long getSalaryMonth(){
        EmployeeModel model = view.getEmployeeInfo();
        return model.getSalary()*model.getNumberOfWorkingDays();
    }

    public EmployeeView getView() {
        return view;
    }

    public void setView(EmployeeView view) {
        this.view = view;
    }
}