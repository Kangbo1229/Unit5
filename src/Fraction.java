/**
 * @author Boeun Kanf
 * @since Feb 2, 2020
 * This class calculates fraction by adding, subtracting, dividing, and multiplying.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * This constructor declares numerator and denominator and creates fraction.
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        int gcf = gcd(this.numerator, this.denominator);
        if ((numerator > 0 && denominator < 0) || (numerator < 0 && denominator < 0)) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        }
        this.numerator /= gcf;
        this.denominator /= gcf;
    }

    /**
     * This is a default constructor.
     */
    public Fraction(){
        this(1,1);
    }

    /**
     * Finds the greatest common factor.
     * @param m
     * @param n
     * @return
     */
    private int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    /**
     * The result of adding two fractions stores in reduced form.
     * @param f1
     * @param f2
     * @return
     */
    public static Fraction add(Fraction f1, Fraction f2){
        int nNumerator = (f1.numerator*f2.denominator)+(f1.denominator*f2.numerator);
        int nDenominator = (f1.denominator*f2.denominator);
        return new Fraction(nNumerator, nDenominator);
    }

    /**
     * The result of subtracting two fractions stored in reduced form.
     * @param f1
     * @param f2
     * @return
     */
    public static Fraction subtract(Fraction f1, Fraction f2){
        int nNumerator = (f1.numerator*f2.denominator)-(f1.denominator*f2.numerator);
        int nDenominator = (f1.denominator*f2.denominator);
        return new Fraction(nNumerator, nDenominator);
    }

    /**
     * The result of multiplying two fractions stored in reduced form.
     * @param f1
     * @param f2
     * @return
     */
    public static Fraction multiply(Fraction f1, Fraction f2){
        int nNumerator = (f1.numerator*f2.numerator);
        int nDenominator = (f1.denominator*f2.denominator);
        return new Fraction(nNumerator, nDenominator);
    }

    /**
     * The result of dividing two fractions stored in reduced  form.
     * @param f1
     * @param f2
     * @return
     */
    public static Fraction divide(Fraction f1, Fraction f2){
        int nNumerator = (f1.numerator*f2.denominator);
        int nDenominator = (f1.denominator*f2.numerator);
        return new Fraction(nNumerator, nDenominator);
    }

    /**
     * prints out the fraction with / to make it easier to see.
     * @return
     */
    public String toString(){
        return numerator+"/"+denominator;
    }


}
