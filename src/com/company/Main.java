package com.company;
import java.util.Scanner;

public class Main {

    public static int sum(int a, int b) {
        a+=1;
        b-=1;
        if(b>0){
            return sum(a,b);
        }
        else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        int res = sum(a,b);
        System.out.println(res);
    }
}
