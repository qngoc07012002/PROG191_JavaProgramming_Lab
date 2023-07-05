package Ex1;

public class Main {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(4,5);
        Fraction frac2 = new Fraction(2,3);
        Fraction.addFraction(frac1,frac2);
        Fraction.subFraction(frac1,frac2);
        Fraction.mulFraction(frac1,frac2);
        Fraction.divFraction(frac1,frac2);
        frac1.showFraction();
        frac1.showFractionDecimal();

    }
}
