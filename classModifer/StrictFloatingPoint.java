
// The strictfp keyword ensures that floating-point calculations (like division or multiplication) are consistent across all platforms.
// Without strictfp, floating-point calculations might yield slightly different results on different platforms.

strictfp class Calculator {
    public double calculate() {
        return 10.0 / 3.0; // Ensures consistent floating-point calculation
    }
}
