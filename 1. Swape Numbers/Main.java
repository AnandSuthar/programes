import java.util.Scanner;
class SwapNumber {

    public static void main(String[] args) {
        int temp;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the integer value :");
        int a = r.nextInt();
        int b = r.nextInt();
        int c= r.nextInt();
        System.out.println("After valoes");
        System.out.println("First value: " + a);
        System.out.println("Second valoe: " + b);
        System.out.println("Three valoe: "+c);

        temp=a;
        a=b;
        b=temp;
        System.out.println("Before values\n" + "First value: " + a + "\nSecond value: " + b);


        int demo;

        demo=a;
        a=b;
        b=demo;
        b=c;
        c=demo;
        c=a;
        a=demo;

        System.out.println("Before valoes\n" + "First value: " + a + "\nSecond valoe: "+b+ "\nThree valoue:"+c);

    }
}

