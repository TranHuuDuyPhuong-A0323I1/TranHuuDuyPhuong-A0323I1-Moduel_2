package controller;

import java.util.Scanner;

public class StudentManagementSystemControler {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Nhập số để chọn chức năng trên menu: ");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                case 2:
                    displayCustomerMenu();
                case 3:
                    displayFacilityMenu();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn số trên menu");

            }
        }
    }

    public static void displayEmployeeMenu() {
        boolean check = true;
        while (check) { 
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                    break;
                }
                case 4:
                    return;
            }
            scanner.nextLine();
        }

    }

    public static void displayCustomerMenu() {

        boolean check = true;
        while (check) {
            System.out.println("1 Display list customers");
            System.out.println("2 Add new customer");
            System.out.println("3 Edit customer");
            System.out.println("4 Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4:
                    return;
            }
            scanner.nextLine();
        }
    }

    public static void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1 Display list facility");
            System.out.println("2 Add new facility");
            System.out.println("3 Display list facility maintenance");
            System.out.println("4 Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                }
                case 2: {
                }
                case 3: {

                }
                case 4:
                    return;
            }
            scanner.nextLine();
        }

    }
}
