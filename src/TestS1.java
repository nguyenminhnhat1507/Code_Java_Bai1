import java.util.Scanner;

public class TestS1 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);

        FIrstDegreeEquation eq=new FIrstDegreeEquation();

        int a,b;
        System.out.printf("Input a:");
        a=Input.nextInt();
        System.out.printf("Input b:");
        b=Input.nextInt();
        eq.setA(a);
        eq.setB(b);
        System.out.println("Equation: "+a+"x+"+b+"=0");
        System.out.println(eq.resolveOne());
    }
}
