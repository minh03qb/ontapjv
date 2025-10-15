public class libMath {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        double sqrt = Math.sqrt(16);
        double power = Math.pow(2, 3);
        double absValue = Math.abs(-5.5);
        double roundValue = Math.round(5.5);
        double ceilValue = Math.ceil(5.1);
        double floorValue = Math.floor(5.9);
        double randomValue = Math.random(); // Returns a value between 0.0 and 1.0

        System.out.println("Max: " + max); // Max: 10
        System.out.println("Min: " + min); // Min: 5
        System.out.println("Square Root: " + sqrt); // Square Root: 4.0
        System.out.println("Power: " + power); // Power: 8.0
        System.out.println("Random Value: " + randomValue); // Random Value: e.g., 0.123456789
        System.out.println("Absolute Value: " + absValue); // Absolute Value: 5.5
        System.out.println("Rounded Value: " + roundValue); // Rounded Value: 6.0
        System.out.println("Ceiling Value: " + ceilValue); // Ceiling Value:
        System.out.println("Floor Value: " + floorValue); // Floor Value: 5.0

    }

}
