package application;

import persistent.EmployeeManager;
import entity.Employee;

public class Main {

    public static void main(String[] args) {
         EmployeeManager employeeManager = new EmployeeManager();
         Employee employee = new Employee("viet","0986091614",10,112);
         employeeManager.saveEmployee(employee);

         // insert into Employee table
        employeeManager.insertEmployee();

         // update into Employee table
        Employee employee1 = new Employee("tai","123456789",15,102);
        employeeManager.updateEmployee(employee1);
        }
    }

