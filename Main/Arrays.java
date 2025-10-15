public class Arrays {
    public static void main(String[] args) {
        // Declare an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Declare with new keyword
        // int[] numbers = new int[]{10, 20, 30, 40, 50};
        // Or
        // int[] numbers = new int[5];
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;

        // String[] fruits = {"Apple", "Banana", "Cherry"};

        // Accessing array elements
        System.out.println("First element: " + numbers[0]); // 10
        System.out.println("Second element: " + numbers[1]); // 20

        // Modifying array elements
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]); // 35

        // Array length
        System.out.println("Array length: " + numbers.length); // 5

        // Looping through an array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using enhanced for loop
        System.out.println("Array elements using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Multidimensional array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Element at row 2, column 3: " + matrix[1][2]); // 6
    }
}
