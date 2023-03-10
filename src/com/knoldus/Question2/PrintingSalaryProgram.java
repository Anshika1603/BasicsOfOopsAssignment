package com.knoldus.Question2;

class Address{
    String Street;
    String City;
    String State;
    String Country;
    int Pincode;
    //Contructor of Address class for initializing address
    Address(String Street, String City, String State, String Country, int Pincode){
        this.Street=Street;
        this.City=City;
        this.State=State;
        this.Country=Country;
        this.Pincode=Pincode;
    }
}

class Member{
    String name;
    int age;
    String phoneNumber;
    Address address;
    double salary;
    //Contructor of Member class for initializing Name,age, PhoneNumber, Address and salary
    Member(String name, int age, String phoneNumber, Address address, double salary){
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.salary=salary;
    }
    //Method for printing salary
    public void printSalary() {
        System.out.println(salary);
    }
}

class Employee extends Member{
    String specialization;
    //Contructor of Employee class for initializing members of Employee class
    Employee(String name,int age, String phoneNumber, Address address, double salary, String specialization){
        super(name,age,phoneNumber,address,salary);
        this.specialization=specialization;
    }
}

class Manager extends Member {
    String department;
    //Contructor of Manager class for initializing members of Manager class
    Manager(String name,int age, String phoneNumber, Address address, double salary, String department){
        super(name,age,phoneNumber,address,salary);
        this.department=department;
    }
}

public class PrintingSalaryProgram {
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee employee = new Employee("Anshika Srivatava", 23, "9651346775",
                new Address("E-1341 Rajajipuram","Lucknow","Uttar Pradesh", "India", 226017),
                500000,"Java");

        // Creating an object of Manager class
        Manager manager = new Manager("Shikha Anand",23, "8874080444",
                new Address("Kasturba Bhawan","Gorakhpur","Uttar Pradesh", "India",201070),
                700000,"Scala Studio");


        // Printing the salary of the employee and manager objects
        System.out.println("Employee Salary: ");
        employee.printSalary();
        System.out.println("Manager Salary: ");
        manager.printSalary();

    }
}
