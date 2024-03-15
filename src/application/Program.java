package application;

import util.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new java.util.Scanner(System.in);

        Bill bill = new Bill();

        System.out.printf("Sexo: ");
        bill.gender = sc.next().charAt(0);
        System.out.printf("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.printf("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.printf("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        System.out.println("-----------------------------");
        System.out.println("        RELATÓRIO");
        System.out.println("-----------------------------");



        System.out.printf("Consumo: %.2f%n", bill.feeding());
        if (Bill.cover() > 0) {
            System.out.printf("Couvert = R$ %.2f%n", Bill.cover());
        } else {
            System.out.println("Isento de Couvert");
        }
        System.out.printf("Ingresso: %.2f%n", bill.ticket());


        System.out.printf("Valor a pagar: %.2f%n", bill.total() + Bill.cover());





        sc.close();
    }
}
