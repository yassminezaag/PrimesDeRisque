package org.yass;

import org.yass.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class Personnel {

    private Employee employee;

    private List<Employee> employeeList;

    public Personnel() {
        employeeList = new ArrayList<>();
    }

    public void ajouterEmploye(Employee employee){
        employeeList.add(employee);
    }

    public void calculerSalaires(){
        for (Employee emp : employeeList){
            System.out.println(emp.getTitre()+" "+emp.getNom()+" gagne "+ emp.calculerSalaire()+" Dinars");
        }
    }

    public double salaireMoyen() {
        double somme = 0.0;
        double salairemoyen = 0;
        for (Employee emp : employeeList){
            somme += emp.calculerSalaire();
            salairemoyen = somme/employeeList.size();
        }
        return salairemoyen;
    }
}
