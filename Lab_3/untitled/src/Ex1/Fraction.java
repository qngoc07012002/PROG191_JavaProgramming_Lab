package Ex1;

public class Fraction {
    private int a;
    private int b;
    public Fraction() {
    }

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int gcd (int x, int y){
        int r;
        while (y!=0){
            r=y;
            y=x%y;
            x=r;
        }
        return x;
    }
    public static Fraction simplify(Fraction x){
        int num = x.getA();
        int denom = x.getB();
        int gcd = gcd(num,denom);

        Fraction simp = new Fraction(num/gcd,denom/gcd);
        return simp;

    }
    public void showFraction() {
        System.out.println(a + " / " +b);
    }
    public void showFractionDecimal() {
        System.out.println((double)a/b);
    }
    public static void addFraction(Fraction x, Fraction y){
        if (x.b!=0 && y.b!=0) {
            Fraction sum = new Fraction(x.a * y.b + x.b * y.a,x.b * y.b);
            sum = simplify(sum);
            sum.showFraction();
        } else System.out.println("Invalid");
    }
    public static void subFraction(Fraction x, Fraction y){
        if (x.b!=0 && y.b!=0) {
            Fraction sub = new Fraction(x.a * y.b - x.b * y.a,x.b * y.b);
            sub = simplify(sub);
            sub.showFraction();
        } else System.out.println("Invalid");
    }
    public static void mulFraction(Fraction x, Fraction y){
        if (x.b!=0 && y.b!=0) {
            Fraction mul = new Fraction(x.a*y.a,x.b*y.b);
            mul = simplify(mul);
            mul.showFraction();
        } else System.out.println("Invalid");
    }
    public static void divFraction(Fraction x, Fraction y){
        if (x.b!=0 && y.b!=0) {
            Fraction div = new Fraction(x.a*y.b,x.b*y.a);
            div = simplify(div);
            div.showFraction();
        } else System.out.println("Invalid");
    }


}
