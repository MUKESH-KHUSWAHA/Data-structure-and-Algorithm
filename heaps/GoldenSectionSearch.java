public class GoldenSectionSearch {
    // Define the golden ratio constant
    private static final double GR = .618;

    // Function to find minimum for
    public static double f(double x) {
        return x * x + 2 * x;
    }

    // Golden Section Search algorithm
    public static double goldenSectionSearch(double a, double b, double tol) {
        double c = b - GR * (b - a); // Compute first test point
        System.out.println(c);
        System.out.println();
        double d = a + GR * (b - a); // Compute second test point
        System.out.println(d);

        
        while (Math.abs(c - d) > tol) {
            if (f(c) < f(d)) {
                b = d;
            } else {
                a = c;
            }
            
            c = b - GR * (b - a); // Recalculate c
            System.out.println(c);
            System.out.println();
            d = a + GR * (b - a); // Recalculate d
            System.out.println(d);
        }
        
        // The interval [a, b] should be very small now
        return (b + a) / 2;
    }

    public static void main(String[] args) {
        double a = -3; // Start of the interval
        double b = 4;  // End of the interval
        double tol = .0005; // Tolerance level for precision

        // Perform the golden section search
        double minimum = goldenSectionSearch(a, b, tol);
        System.out.println("The minimum value is at x = " + minimum);
        System.out.println("The minimum value of the function is f(x) = " + f(minimum));
    }
}
