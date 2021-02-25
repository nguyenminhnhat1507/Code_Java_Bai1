import java.lang.Math;
public class SeconDegreeEquation {
    private int a;
    private int b;
    private int c;
    private int delta;
    public void setA(int a){this.a=a;}
    public void setB(int b){this.b=b;}
    public void setC(int c){this.c=c;}
    public String resolveThird()
    {
        delta=b*b-4*a*c;
        if (a==0) return("Equation has a solution "+-b/c);
        else if(delta==0) return("Equation has double root "+-b/(2*a));
        else if(delta>0) return("Equation has two distinct root"+(-b+Math.sqrt(delta))/(2*a)+" and " +(-b-Math.sqrt(delta))/(2*a) );
        else return ("Equation has no root");
    }

}
