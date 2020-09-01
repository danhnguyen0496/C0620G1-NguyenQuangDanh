package models;

import java.util.*;

public class Cabinet {
    public static Stack<Employee> employeeStack = new Stack<>();
    public static List<Employee> employeeList = Employee.readEmployee();

    public static void addEmployeeRecord() {
        System.out.println("List employee: ");
        Employee.showInformationOfEmployee();

        for (Employee employee : employeeList) {
            if (employeeStack.isEmpty()) {
                employeeStack.push(employee);
            } else {
                System.out.println("Cabinet is full");
            }
        }
        System.out.println("Save profile: " + employeeStack);
    }

    public static void findProfileEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter select search condition: ");
        String search = scanner.nextLine();
        boolean flag = false;

        if (search.equals("name")) {
            System.out.println("Enter the name profile employee to find: ");
            String nameProfile = scanner.nextLine();
            for (Employee employee : employeeList) {
                if (nameProfile.equals(employee.getName())) {
                    System.out.println("Profile need to find: " + employee);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Profile employee not find");
            }
        }


        if (search.equals("id")) {
            System.out.println("Enter the id profile employee to find: ");
            int idProfile = scanner.nextInt();
            for (Employee employee : employeeList) {
                if (idProfile == (employee.getId())) {
                    System.out.println("Profile need to find: " + employee);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Profile employee not find");
            }
        }

        if (search.equals("age")) {
            System.out.println("Enter the age profile employee to find: ");
            int ageProfile = scanner.nextInt();
            for (Employee employee : employeeList) {
                if (ageProfile == (employee.getAge())) {
                    System.out.println("Profile need to find: " + employee);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Profile employee not find");
            }
        }

        if (search.equals("address")) {
            System.out.println("Enter the address profile employee to find: ");
            String addressProfile = scanner.nextLine();
            for (Employee employee : employeeList) {
                if (addressProfile.equals(employee.getAddress())) {
                    System.out.println("Profile need to find: " + employee);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Profile employee not find");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: \n1. Save profile  \n2. Find profile");
        System.out.println("Enter the select: ");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                addEmployeeRecord();
                break;
            case 2:
                findProfileEmployee();
                break;
            default:
                System.out.println("Select error");
                break;
        }
    }
}
