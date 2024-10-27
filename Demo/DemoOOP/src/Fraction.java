
public class Fraction {

    private int numerator;
    private int denominator;

    //Constructor
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction fraction) {
        if (fraction == null) {
            throw new IllegalArgumentException("fraction is null");
        }
        this.numerator = fraction.getNumerator();
        this.denominator = fraction.getDenominator();
    }

    //Getter and Setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        this.denominator = denominator;
    }

    //Methods
    public Fraction add(Fraction fraction) {

        if (fraction == null) {
            throw new IllegalArgumentException("fraction is null");
        }

        int numerator = (this.getNumerator() * fraction.getDenominator())
                + (fraction.getNumerator() * this.getDenominator());
        int denominator = fraction.getDenominator() * this.getDenominator();

        Fraction result = new Fraction(numerator, denominator);
        result.reducer();
        return result;
    }

    public Fraction sub(Fraction fraction) {

        if (fraction == null) {
            throw new IllegalArgumentException("fraction is null");
        }
        int numerator = (this.getNumerator() * fraction.getDenominator())
                - (fraction.getNumerator() * this.getDenominator());
        int denominator = fraction.getDenominator() * this.getDenominator();

        Fraction result = new Fraction(numerator, denominator);
        result.reducer();

        return result;
    }

    public Fraction mul(Fraction fraction) {

        if (fraction == null) {
            throw new IllegalArgumentException("fraction is null");
        }
        int numerator = this.getNumerator() * fraction.getNumerator();
        int denominator = fraction.getDenominator() * this.getDenominator();

        Fraction result = new Fraction(numerator, denominator);
        result.reducer();

        return result;
    }

    public Fraction div(Fraction fraction) {

        if (fraction == null) {
            throw new IllegalArgumentException("fraction is null");
        }
        if (fraction.getNumerator() == 0) {
            throw new IllegalArgumentException("fraction is zero");
        }
        int numerator = this.getNumerator() * fraction.getDenominator();
        int denominator = this.getDenominator() * fraction.getNumerator();

        Fraction result = new Fraction(numerator, denominator);
        result.reducer();

        return result;
    }

    public void reducer() {
        int i = greatestCommonFactor(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }

    @Override
    public String toString() {
        return "Fraction{" + numerator
                + "/" + denominator + '}';
    }

    private int greatestCommonFactor(int a, int b) {
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        System.out.println("fr " + fr.toString());
        fr.setNumerator(2);
        Fraction copy = new Fraction(fr);
        System.out.println("copy " + fr.toString());
    }
}
