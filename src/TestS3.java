public class TestS3 {
    public static void main(String[] args) {
        SeconDegreeEquation seq=new SeconDegreeEquation();
        seq.setA(1);
        seq.setB(4);
        seq.setC(4);
        System.out.println(seq.resolveThird());
    }
}
