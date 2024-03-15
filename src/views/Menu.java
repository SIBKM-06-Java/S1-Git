package views;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void tampilkanMenu() {
        System.out.println("===================");
        System.out.println("    MENU REGION    ");
        System.out.println("===================");
        System.out.println("1. List all Region");
        System.out.println("2. Find Region with ID");
        System.out.println("3. Find Region with Nama");
        System.out.println("4. Create New Region");
        System.out.println("5. Update Region");
        System.out.println("6. Delete Region");
        System.out.println("0. Exit");
        System.out.println("===================");
        System.out.print("Pilihan: ");
    }

    public int getInputPilihan() {
        return scanner.nextInt();
    }
}