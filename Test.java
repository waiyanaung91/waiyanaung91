import java.util.Scanner;

public class App extends Data {
    public static void main(String[] args) {
        Scanner app = new Scanner(System.in);
        do {
            System.out.println("1- Even or Odd \n" +
                    "2- Area of Circle \n" +
                    "3- Leap Year \n" +
                    "4- Calculator \n" +
                    "5- Area of Square \n" +
                    "6- Celsius to Fahrenheit \n" +
                    "7- Factorial \n" +
                    "8- Astrological sign \n" +
                    "9- Exit");

            System.out.println("\n");
            System.out.println("Please; Choose a number you want to do.");
            int input = app.nextInt();
            switch (input) {
                case 1:
                    System.out.println("\n");
                    System.out.println("1- Even or Odd \n" + "Input your number");
                    int a = app.nextInt();
                    App obj = new App();
                    obj.Evenorodd(a);
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("2- Area of Circle \n" + "Input a Circle Radius");
                    int b = app.nextInt();
                    App obj1 = new App();
                    obj1.Areacircle(b);
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("3- Leap Year \n" + "Input a year.");
                    int c = app.nextInt();
                    App obj2 = new App();
                    obj2.Leapyear(c);
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("4- Calculator");
                    App obj3 = new App();
                    obj3.Calculator();
                    break;
                case 5:
                    System.out.println("\n");
                    System.out.println("5- Area of Square");
                    int d = app.nextInt();
                    App obj4 = new App();
                    obj4.Areaofsquare(d);
                    break;
                case 6:
                    App obj5 = new App();
                    obj5.Temperature();
                    break;

                case 7:
                    App obj6 = new App();
                    obj6.factorial();
                    break;

                case 8:
                    App obj7 = new App();
                    obj7.zodiac();
                    break;

                if (input==9) {
                    break;
                }
            }
        }
        while (true);
    }
}
