package com.example.bai_thi.demo;



import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Employee[] emps = new Employee[3];

        Scanner scan = new Scanner(System.in);

        System.out.println("vui long nhập thông tin của nhân viên ");

        for(int i = 0 ; i<= emps.length ; i++ ){
            String id = scan.nextLine();
            String name = scan.nextLine();
            double wage = scan.nextDouble();

            Employee add = new Employee();
            Employee emp = new Employee();
            emp.setEmployee(add);
        }
    }
}
