public class FIrstDegreeEquation {
    private int a;
    private int b;
    public int getA()
    {
        return this.a;
    }
    public void setA(int a)
    {
        this.a=a;
    }
    public int getB()
    {
        return this.b;
    }
    public void setB(int b)
    {
        this.b=b;
    }
    public String resolveOne()
    {
        if (a==0 && b==0)
            return("Equation have infinite root");
        else if(a==0 && b!=0)
            return("Equation have no root");
        else return("Equation have a root is: "+-(double)b/(double)a+" or "+-b+"/"+a);
    }
}
