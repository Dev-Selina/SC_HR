package hr_application;

import java.util.ArrayList;

public class EmployeeDatabase {

    private ArrayList<EmployeeRecord> employeeRecords = new ArrayList<>(); //encapsulated

    public void addEmployeeRecord(EmployeeRecord i) {//
        this.employeeRecords.add(i);

    }
    public ArrayList<EmployeeRecord> getEmployeeRecords(EmployeeRecord currentUser){
     if(currentUser.position.contains("HR")){//contains searches element position for HR in string
         return employeeRecords; //I want to return the employee database
     }
     return null; //required because of if
    }
    public EmployeeRecord login(int employeeID, String password){ //returns class gives all info "ID card"
        System.out.println("Matching employee details..");
        for (EmployeeRecord employee : employeeRecords) {
           // employee.surname;
            //employee.employee;
            if(employeeID == employee.employeeId){//
                if(password.equals(employee.passwords)){ //
                    System.out.println("Bingo!");
                    return employee;
                }
            }
        }
        return null;
    }
}
