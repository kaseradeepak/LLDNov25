package com.scaler.oops.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (b != 0) {
//            System.out.println(a / b);
//        }

        //System.out.println("After exception.");

//        Integer[] arr = new Integer[10];

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(arr[i]);
//        }

//        File file = new File("path/to/file.txt");
//        FileReader fileReader = new FileReader(file);
//        fileReader.read();

        try {
            System.out.println("Before calling the method.");
            doSomething();
            readFile("abc");
            getProduct();
            System.out.println("After calling the method.");
        }
        catch (IOException e) {
            System.out.println("The file that you are looking for wasn't found.");
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        }
        catch (ProductNotFoundException e) {
            System.out.println("Product not found.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong, that I don't know.");
        }

        System.out.println("After try and catch block");

        random();

        //finally block.
    }


    public static void doSomething() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a / b;

        System.out.println(c);
    }

    public static void readFile(String path) throws IOException{
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        fileReader.read();

//        try {
//            FileReader fileReader = new FileReader(file);
//            fileReader.read();
//        } catch (FileNotFoundException e) {
//
//        } catch (IOException e) {
//
//        }

    }

    public static void getProduct() throws ProductNotFoundException {
        ///Checked Exception -> either handle it or throw it.
        throw new ProductNotFoundException();
    }

    public static void random() {
        random();
    }
}
