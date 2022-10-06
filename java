class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Print the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int rev;

        System.out.println("Print the element of Array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]=  " + arr[i]);
        }
        for (int i =0; i< arr.length/2; i++) {
            rev=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=rev;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]=  " + arr[i]);
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Input the first number: ");
        double a = in.nextDouble();
        print("Input the Second number: ");
        double b = in.nextDouble();
        print("Input the third number: ");
        double c = in.nextDouble();
        print("The smallest value is " + smallest(a, b, c)+"\n" );
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static double smallest(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

}

 class Average {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        print("Input the first number: ");
        double a = in.nextDouble();
        print("Input the second number: ");
        double b = in.nextDouble();
        print("Input the third number: ");
        double c = in.nextDouble();
        print("The average value is " + average(a, b, c)+"\n" );
    }
     public static void print(String text){
         System.out.println(text);
     }
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

class Middle {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        print("Input a number ");
        String a = in.nextLine();
        print("The middle character in the string " + middle(a)+"\n");
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static String middle(String a) {
        int position;
        int length;
        if (a.length() % 2 == 0) {
            position = a.length() / 2 - 1;
            length = 2;
        }
        else {
            position = a.length() / 2;
            length = 1;
        }
        return a.substring(position, position + length);
    }
}

class Vowels {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        print("Input the String ");
        String str = in.nextLine();
        print("Number of  Vowels in the string " + countVowels(str)+"\n");
    }
    public  static void print(String text){
        System.out.println(text);
    }
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i'
                    || str.charAt(i) =='o' || str.charAt(i) =='u') {
                count++;
            }
        }
        return count;
    }
}

class countWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Input the String ");
        String str = in.nextLine();

        print("Expected Output " + count_Words(str)+"\n");
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static int count_Words(String str) {
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
        // veradarcnum e 0. ete toxn sksum e kam verjanum prabelov("  ").
    }
}

class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("Input an Integer ");
        long n = input.nextLong();
        print("The sum is " + sum_Digits(n)+"\n");
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static int sum_Digits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

class Pentagonal {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1; i <= 50; i++){
            System.out.printf("%10d",getPentagonalNumber(i));
            if(count % 10 == 0)
                System.out.println();
            count++;
        }
    }
    public static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1))/2;
    }
}

class investmentValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Input the investment amount ");
        double investment = in.nextDouble();
        print("Input the rate of interest ");
        double rate = in.nextDouble();
        print("Input number of years ");
        int year = in.nextInt();
        rate *= 0.01;
        print("Years    FutureValue");
        for(int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i >= 10) formatter = 18;
            System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
        }
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}

class characters {
    public static void main(String[] args) {
       print_Chars('(','z',20);
    }
    public static void print_Chars(char char1, char char2, int n) {
        for (int a = 1; char1 <= char2; a++, char1++) {
            System.out.print(char1 + " ");
            if (a % n == 0) {
                System.out.println(" ");
            }
        }
        System.out.print("\n");
    }
}