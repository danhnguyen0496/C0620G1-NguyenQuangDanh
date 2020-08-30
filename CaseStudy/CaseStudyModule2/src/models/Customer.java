package models;

import commons.ValidateException;

import java.io.*;
import java.util.*;

public class Customer implements Comparator<Customer> {
    private String name;
    private String birthday;
    private String gender;
    private String identityCardNumber;
    private String numberPhone;
    private String email;
    private String customerType;
    private String address;
    private Services services;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String identityCardNumber, String numberPhone,
                    String email, String customerType, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.numberPhone = numberPhone;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfo() {

        return "Information customer: " +
                "\nName: " + getName() +
                "\nBirthday: " + getBirthday() +
                "\nGender: " + getGender() +
                "\nIdentity Card Number: " + getIdentityCardNumber() +
                "\nNumber Phone: " + getNumberPhone() +
                "\nEmail: " + getEmail() +
                "\nCustomerType: " + getCustomerType() +
                "\nAddress: " + getAddress();
    }


    // nhap thong tin khach hang
    public static Customer addInForCustomer() {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        customer.setName(ValidateException.nameException());
        customer.setBirthday(ValidateException.birthdayException());
        customer.setGender(ValidateException.genderException());
        customer.setIdentityCardNumber(ValidateException.idCardException());
        customer.setNumberPhone(ValidateException.numberPhoneException());
        customer.setEmail(ValidateException.emailException());

        System.out.print("Enter the customer type: ");
        String customerType = scanner.nextLine();
        customer.setCustomerType(customerType);

        System.out.print("Enter the address: ");
        String address = scanner.nextLine();
        customer.setAddress(address);

//        System.out.print("Enter the services: ");
//        String services = scanner.nextLine();
        return customer;
    }

    public static final String PATH_CUSTOMER = "src/data/Customer.csv";
    public static final String DOWN = "\n";
    public static final String COMMA = ", ";

    public static void addNewCustomer() {
        Customer customer = addInForCustomer();
        try {
            FileWriter fileWriter = new FileWriter(new File(PATH_CUSTOMER), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(customer.getName()).append(COMMA).append(customer.getBirthday()).append(COMMA).
                    append(customer.getGender()).append(COMMA).append(customer.getIdentityCardNumber()).append(COMMA).
                    append(customer.getNumberPhone()).append(COMMA).append(customer.getEmail()).append(COMMA).
                    append(customer.getCustomerType()).append(COMMA).append(customer.getAddress()).append(DOWN);
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showInformationCustomers() {
        List<Customer> customerList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(new File(PATH_CUSTOMER));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(", ");
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
                customerList.add(customer);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ????????????
        customerList.sort(new Customer());
        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }
    }

    // ?????????
    @Override
    public int compare(Customer customer1, Customer customer2) {
        int result = customer1.getName().compareTo(customer2.getName());
        if (result != 0) {
            return result;
        } else {
            int answers = Integer.parseInt(customer1.getBirthday().substring(6)) - Integer.parseInt(customer2.getBirthday().substring(6));
            return Integer.compare(answers, 0);
        }
    }
}
