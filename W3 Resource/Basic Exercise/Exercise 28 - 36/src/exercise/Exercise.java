package exercise;

import java.util.Scanner;

public class Exercise {

    // Q28. 
    public static int hex_to_decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    // Q33. 
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Q34. 
    public static double hexagonArea(double s) {
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }

    // Q35. 
    public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Q28. convert a hexadecimal to a decimal number
        String hexdec_num;
        int dec_num;

        System.out.print("Q28.convert a hexadecimal to a decimal number\nInput a hexadecimal number: ");
        hexdec_num = in.nextLine();

        dec_num = hex_to_decimal(hexdec_num);

        System.out.print("Equivalent decimal number is: " + dec_num + "\n");

        // Q29. convert a hexadecimal to a binary number. 
        String hexdec_num1;
        int dec_num1, i = 1, j;
        int bin_num[] = new int[100];

        System.out.print("Q29 convert a hexadecimal to a binary number\nEnter Hexadecimal Number : ");
        hexdec_num1 = in.nextLine();

        /* convert hexadecimal to decimal */
        dec_num1 = hex_to_decimal(hexdec_num1);

        /* convert decimal to binary */
        while (dec_num1 != 0) {
            bin_num[i++] = dec_num1 % 2;
            dec_num1 = dec_num1 / 2;
        }

        System.out.print("Equivalent Binary Number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");

        // Q30. convert a hexadecimal to a octal number. 
        String hexdec_num2;
        int dec_num2, a = 1, b;
        int octal_num[] = new int[100];

        System.out.print("Q30 convert a hexadecimal to a octal number\nInput a hexadecimal number: ");
        hexdec_num2 = in.nextLine();

        // Convert hexadecimal to decimal
        dec_num2 = hex_to_decimal(hexdec_num2);

        //Convert decimal to octal
        while (dec_num2 != 0) {
            octal_num[a++] = dec_num2 % 8;
            dec_num2 = dec_num2 / 8;
        }

        System.out.print("Equivalent of octal number is: ");
        for (b = a - 1; b > 0; b--) {
            System.out.print(octal_num[b]);
        }
        System.out.print("\n");

        // Q31. check whether Java is installed on your computer.
        System.out.println("Q31. check whether Java is installed on your computer");
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");

        // Q32. Java program to compare two numbers
        int num1, num2; // numbers to compare
        System.out.print("Q32 compare two numbers\nInput First Interger: ");
        num1 = in.nextInt(); // Read the first number
        System.out.print("Input Second Interger: ");
        num2 = in.nextInt(); // Read the second number

        if (num1 == num2) {
            System.out.println(num1 + " == " + num2);
        }
        if (num1 != num2) {
            System.out.println(num1 + " != " + num2);
        }
        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        }
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        }
        if (num1 <= num2) {
            System.out.println(num1 + " <= " + num2);
        }
        if (num1 >= num2) {
            System.out.println(num1 + " == " + num2);
        }

        // Q33. compute the sum of the digits of an integer.
        System.out.print("Q33. compute the sum of the digits of an integer\nInput an integer: ");
        long n = in.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));

        // Q34. compute the area of a hexagon
        System.out.print("Q34. compute the area of a hexagon\nInput the length of a side of the hexagon: ");
        double s = in.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(s) + "\n");

        // Q35. compute the area of a polygon
        System.out.print("Q35 compute the area of a polygon\nInput the number of sides on the polygon: ");
        int ns = in.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = in.nextDouble();
        System.out.print("The area is: " + polygonArea(ns, side) + "\n");

        // Q36. compute the distance between two points on the surface of earth
        System.out.print("Q36 compute the distance between two points on the surface of earth\nInput the latitude of coordinate 1: ");
        double lat1 = in.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = in.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = in.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = in.nextDouble();

        System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");

    }

    // Points will be converted to radians before calculation
    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; //Kilometers
        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}
