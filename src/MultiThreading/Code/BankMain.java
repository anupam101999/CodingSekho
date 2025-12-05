package MultiThreading.Code;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount you want to withdraw : ");
        int a = sc.nextInt();
        Transaction t1 = new Transaction(a);
        t1.start();

        System.out.print("Enter amount you want to withdraw : ");
        int b = sc.nextInt();
        Transaction t2 = new Transaction(b);
        t2.start();
    }
}

class Transaction extends Thread {
    int balance = 5000;
    int a;

    Transaction(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        if (balance - a > 0) {
            balance = balance - a;
            System.out.println("Balance withdrew");
            System.out.println("Remaining Balance : " + balance);
        } else {
            System.out.println("Balance insufficient");
        }
    }
}