import java.util.Scanner;

public class Data {

    void Evenorodd (int a) {
        if (a%2==0) {
            System.out.println(a + " " + "is even number.");
        }else{
            System.out.println(a+" "+ " is odd number");
        }
    }

    void Areacircle (int a) {
        int r2 = a * a;
        double pi = 3.141593;
        double area = pi * r2;
        System.out.println("Area of circle is" + " " + area);
    }

    void Leapyear (int a) {
        if (a % 4 == 0) {
            System.out.println(a + " " + "is a leap year.");
        }else {
            System.out.println(a + " " + "isn't a leap year.");
        }
    }

    void Calculator () {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input First Number");
        int n1 = input1.nextInt();

        System.out.println("Input Math Operator (e.g- + ,  - , * , / )");
        String o = input1.next();

        System.out.println("Input Second Number");
        int n2 = input1.nextInt();
        switch (o) {
            case "+":
                System.out.println( "Your result is =" + (n1 + n2));
                break;
            case "-":
                System.out.println("Your result is =" + (n1 - n2));
                break;
            case "*":
                System.out.println("Your result is =" + (n1 * n2));
                break;
            case "/":
                System.out.println("Your result is =" + "Divides\t:"+ (n1 / n2) +"\n" +
                        "\t\t\t =" + "Modulus:" + (n1 % n2));
                break;
        }

    }

    void Areaofsquare (int a) {
        System.out.println("Area of square is" + " " + a * a );
    }
    void Temperature () {
        System.out.println("6- Temperature converter");
        Scanner input6 = new Scanner(System.in);
        System.out.println("Input number");
        int Num = input6.nextInt();

        System.out.println("Input Fahrenheit for f and Celsius for c");
        String cf = input6.next();

        System.out.println("Your result is");
        switch (cf) {
            case "c":
                System.out.println((Num * 1.8 + 2) + "'F");
                break;
            case "f":
                System.out.println((Num - 32 * .556) + "C");
                break;
        }
    }
    void factorial () {
        System.out.println("7- Factorial");
        System.out.println("Input Your Number");
        Scanner g = new Scanner(System.in);
        int Num4 = g.nextInt();
        long f = 1;
        int j = Num4;
        while (j > 0) {
            f = f * j;
            j--;
        }
        System.out.println("Factorial of" + Num4 + "is" + f);

    }
    void zodiac () {
        System.out.println("8- Astrological sign");
        System.out.println("Input Date of Birth");
        Scanner n = new Scanner(System.in);
        int date = n.nextInt();

        System.out.println("Input Month of Birth");
        int month = n.nextInt();

        if ((date >= 22 && month == 12) || (date <= 19 && month == 1)) {
            System.out.println("Your Astrological sign is Capricorn");
        }
        if ((date >= 20 && month == 1) || ((date <= 18 && month == 2))) {
            System.out.println("Your Astrological sign is Aquarius");
        }
        if ((date >= 19 && month == 2) || (date <= 20 && month == 3)) {
            System.out.println("Your Astrological sign is Pisces");
        }
        if ((date >= 21 && month == 3) || (date <= 19 && month == 4)) {
            System.out.println("Your Astrological sign is Aries");
        }
        if ((date >= 20 && month == 4) || (date <= 20 && month == 5)) {
            System.out.println("Your Astrological sign is Taurus");
        }
        if ((date >= 21 && month == 5) || (date <= 20 && month == 6)) {
            System.out.println("Your Astrological sign is Gemini");
        }
        if ((date >= 21 && month == 6) || (date <= 22 && month == 7)) {
            System.out.println("Your Astrological sign is Cancer");
        }
        if ((date >= 23 && month == 7) || (date <= 22 && month == 8)) {
            System.out.println("Your Astrological sign is Leo");
        }
        if ((date >= 23 && month == 8) || (date <= 22 && month == 9)) {
            System.out.println("Your Astrological sign is Virgo");
        }
        if ((date >= 23 && month == 9) || (date <= 22 && month == 10)) {
            System.out.println("Your Astrological sign is Libra");
        }
        if ((date >= 23 && month == 10) || (date <= 21 && month == 11)) {
            System.out.println("Your Astrological sign is Scorpio");
        }
        if ((date >= 22 && month == 11) || (date <= 21 && month == 12)) {
            System.out.println("Your Astrological sign is Sagittarius");
        }

    }
}
