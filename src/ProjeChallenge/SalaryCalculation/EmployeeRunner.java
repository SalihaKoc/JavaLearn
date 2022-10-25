package ProjeChallenge.SalaryCalculation;

import ProjeChallenge.SalaryCalculation.Employee;

public class EmployeeRunner {

    public static void main(String[] args) {

        Employee employee=new Employee("Drake",20000,41,2020);

        System.out.println("Isim = " + employee.name);
        System.out.println("Maas = " + employee.salary);
        System.out.println("Odenecek Vergi = " + employee.tax() + " $");
        System.out.println("Odenecek Bonus = " + employee.bonus()+" $");
        System.out.println("Maas Artısı = " + employee.raiseSalary()+" $");

        System.out.println("Toplam Odenecek Ucret = " + ((employee.salary)+(employee.raiseSalary())));

        System.out.println(employee.toString());

    }
}

