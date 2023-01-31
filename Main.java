

import src.system.EmployeeSystem;

public class Main {
    public static void main(String[] args){
        EmployeeSystem employeeSystem = new EmployeeSystem();
        
        employeeSystem.loadEmployeeIntoSystem("Rene");
        employeeSystem.loadEmployeeIntoSystem("Astrid");
        employeeSystem.loadEmployeeIntoSystem("Luciano");
        employeeSystem.loadEmployeeIntoSystem("Homero");
        employeeSystem.loadEmployeeIntoSystem("Andres");

        
        
       employeeSystem.findCoincidences("Astrid", "Rene");
       employeeSystem.findCoincidences("Rene", "Astrid");
       employeeSystem.findCoincidences("Luciano", "Homero");
       employeeSystem.findCoincidences("Andres", "Rene");
       employeeSystem.findCoincidences("Astrid", "Andres");
    }
}

