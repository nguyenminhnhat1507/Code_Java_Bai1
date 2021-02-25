public class FirstDegreeEquationSystem {
    private int a11,a12;
    private int a21,a22;
    private int b1,b2;
    public void setA11(int a11) { this.a11=a11; }
    public void setA12(int a12) { this.a12=a12; }
    public void setA21(int a21) { this.a21=a21; }
    public void setA22(int a22) { this.a22=a22; }
    public void setB1(int b1) { this.b1=b1; }
    public void setB2(int b2) { this.b2=b2; }
    public String resolveTwo()
    {
        int D=a11*a22-a21*a12;
        int D1=b1*a22-b2*a12;
        int D2=a11*b2-a21*b1;
        if(D!=0)
            return ("System have a unique solution (x1,x2)="+"("+(double)D1/(double)D+","+(double)D2/(double)D+")");
        else if(D1==0 && D2==0)
            return("System have Infinite solution");
        else
            return("System have no solution");
    }


}
