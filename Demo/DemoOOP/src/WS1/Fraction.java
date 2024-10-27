package WS1;

public class Fraction {

    private int numerator = 0;
    private int denominator = 1;

    //Constructor
    public Fraction() {
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
        this.denominator = denominator;
    }

    //Methods
    public static Fraction add(Fraction fraction1, Fraction fraction2) {

        if (fraction1 == null || fraction2 == null) {
            return null;
        }

        int numerator = (fraction1.getNumerator() * fraction2.getDenominator())
                + (fraction2.getNumerator() * fraction1.getDenominator());
        int denominator = fraction1.getDenominator() * fraction2.getDenominator();

        Fraction result = new Fraction(numerator, denominator);
        result.reducer();
        return result;
    }

    public static Fraction sub(Fraction fraction1, Fraction fraction2) {

        if (fraction1 == null || fraction2 == null) {
            return null;
        }
        int numerator = (fraction1.getNumerator() * fraction2.getDenominator())
                - (fraction2.getNumerator() * fraction1.getDenominator());
        int denominator = fraction1.getDenominator() * fraction2.getDenominator();

        Fraction result = new Fraction(numerator, denominator);
        result.reducer();

        return result;
    }

    public static Fraction mul(Fraction fraction1, Fraction fraction2) {

        if (fraction1 == null || fraction2 == null) {
            return null;
        }
        int numerator = fraction1.getNumerator() * fraction2.getNumerator();
        int denominator = fraction2.getDenominator() * fraction1.getDenominator();

        Fraction result = new Fraction(numerator, denominator);
        result.reducer();

        return result;
    }

    public static Fraction div(Fraction fraction1, Fraction fraction2) {

        if (fraction1 == null || fraction2 == null) {
            return null;
        }
        if (fraction2.getNumerator() == 0) {
            return null;
        }
        int numerator = fraction1.getNumerator() * fraction2.getDenominator();
        int denominator = fraction1.getDenominator() * fraction2.getNumerator();

        Fraction result = new Fraction(numerator, denominator);
        result.reducer();

        return result;
    }

    public static boolean compare(Fraction fraction1, Fraction fraction2) {

        if (fraction1 == null || fraction2 == null) {
            return false;
        }
       
        fraction1.reducer();
        fraction2.reducer();
        return (fraction1.getNumerator() == fraction1.getNumerator())
                && (fraction1.getDenominator() == fraction2.getDenominator());
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

    public void reducer() {
        int i = greatestCommonFactor(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }

    public Fraction inverse() {
        if (numerator == 0) {
            return null;
        }
        Fraction result = new Fraction(denominator, numerator);
        return result;
    }

    @Override
    public String toString() {
        return "Fraction{" + numerator
                + "/" + denominator + '}';
    }
}
