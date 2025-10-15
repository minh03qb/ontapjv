public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World! ");
        System.out.println("I will print on the same line.");
        System.out.println(3 + 3);
        System.out.println(2 * 5);
        final String name = "Alice";
        // name = "Bob"; // This would cause a compile-time error
        int age = 30;
        char grade = 'A';
        float height = 5.7f;
        boolean isStudent = false;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);

        int x = 5;
        int y = 6;
        // co the khoi tao la int x=5, y=6; ap dung trong truong hop nhieu bien cung
        // kieu du lieu
        /*
         * neu cac gia tri bang nhau thi co the khai bao nhu sau:
         * int x,y,z
         * x=y=z=5;
         */
        System.out.println("The sum is " + x + y); // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11
    }
}