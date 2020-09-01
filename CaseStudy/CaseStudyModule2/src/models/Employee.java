package models;

import java.io.*;
import java.util.*;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String address;

    public Employee() {
    }

    public Employee(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "id = " + id + ", name = " + name + ", age = " + age + ", address = " + address;
    }

//    public static List<Employee> employeeList = new ArrayList<>();

//    public static void addEmployee() {
//        Scanner scanner = new Scanner(System.in);
//        Employee employee = new Employee();
//        System.out.print("Enter the id: ");
//        String id = scanner.nextLine();
//        employee.setId(Integer.parseInt(id));
//
//        System.out.print("Enter the name: ");
//        String name = scanner.nextLine();
//        employee.setName(name);
//
//        System.out.print("Enter the age: ");
//        String age = scanner.nextLine();
//        employee.setAge(Integer.parseInt(age));
//
//        System.out.print("Enter the address: ");
//        String address = scanner.nextLine();
//        employee.setAddress(address);
//
//        employeeList.add(employee);
//    }

    public static String PATH_EMPLOYEE = "src/data/Employee.csv";

//    public static void writeEmployee() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter amount employee: ");
//        int amountEmployee = scanner.nextInt();
//        for (int i = 0; i < amountEmployee; i++) {
//            addEmployee();
//            System.out.println();
//        }

//        String COMMA = ", ";
//        String DOWN = "\n";
//        for (Employee employee : employeeList) {
//            try {
//                FileWriter fileWriter = new FileWriter(new File(PATH_EMPLOYEE), true);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append(employee.getId()).append(COMMA).append(employee.getName()).append(COMMA).append(employee.getAge()).append(COMMA).
//                        append(employee.getAddress()).append(COMMA).append(DOWN);
//                bufferedWriter.write(stringBuilder.toString());
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public static Map<Integer, Employee> map = new TreeMap<>();

    public static List<Employee> readEmployee() {
//        writeEmployee();
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(new File(PATH_EMPLOYEE));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(", ");
                employee = new Employee(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), temp[3]);
                employeeList.add(employee);
                map.put(employee.getId(), employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static void showInformationOfEmployee() {
        readEmployee();
        for (Map.Entry<Integer, Employee> employee : map.entrySet()) {
            System.out.println("Id = " + employee.getKey() + ", Employee = [" + employee.getValue() + "]");
        }
    }
}
