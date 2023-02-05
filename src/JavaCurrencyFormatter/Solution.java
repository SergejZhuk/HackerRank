package JavaCurrencyFormatter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf1.format(payment);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf2.format(payment);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf3.format(payment);
        DecimalFormat dF = new DecimalFormat( "#,###.00" );
        String india = "Rs." + dF.format(payment);
        //System.out.println(dF.format(payment));
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}