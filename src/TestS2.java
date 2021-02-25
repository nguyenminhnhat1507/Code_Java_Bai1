import java.util.Scanner;

public class TestS2 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);

        FirstDegreeEquationSystem eq=new FirstDegreeEquationSystem();

        /*int a11,a12;
        int a21,a22;
        int b1,b2;
        System.out.printf("Input a11:"); a11=Input.nextInt();
        System.out.printf("Input a12:"); a12=Input.nextInt();
        System.out.printf("Input a21:"); a21=Input.nextInt();
        System.out.printf("Input a22:"); a22=Input.nextInt();
        System.out.printf("Input b1:"); b1=Input.nextInt();
        System.out.printf("Input b2:"); b2=Input.nextInt();

        eq.setA11(a11);eq.setA12(a12);
        eq.setA21(a21);eq.setA22(a22);
        eq.setB1(b1);eq.setB2(b2);*/
        eq.setA11(5);eq.setA12(2);
        eq.setA21(4);eq.setA22(8);
        eq.setB1(6);eq.setB2(12);
        //System.out.println("Equation System: \n"+a11+"X1 + "+a12+"X2 ="+b1+"\n"+a21+"X1 + "+a22+"X2 ="+b2);
        System.out.println(eq.resolveTwo());
    }
}