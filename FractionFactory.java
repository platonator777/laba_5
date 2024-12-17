public class FractionFactory {
    public static FractionInterface createFraction(int numerator, int denominator) {
        return new CachedFractionDecorator(new Fraction(numerator, denominator));
    }
}