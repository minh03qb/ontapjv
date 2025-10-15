public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World! ");
        System.out.println("I will print on the same line.");
        System.out.println(3 + 3);
        System.out.println(2 * 5);
        final String name = "Alice";
        // name = "Bob"; // This would cause a compile-time error
        int age = 30;
        char grade = 'A';// single quotes for char
        float height = 5.7f;
        boolean isStudent = false;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
        // Invalid identifiers:
        // int 2ndNumber = 5; // Cannot start with a digit
        // int my var = 10; // Cannot contain spaces
        // int int = 20; // Cannot use reserved keywords
        int x = 5;
        int y = 6;
        // co the khoi tao la [int x=5, y=6; ] ap dung trong truong hop nhieu bien cung
        // kieu du lieu
        /*
         * neu cac gia tri bang nhau thi co the khai bao nhu sau:
         * int x,y,z
         * x=y=z=5;
         */
        System.out.println("The sum is " + x + y); // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);// A
        System.out.println(myVar2);// B
        System.out.println(myVar3);// C

        // Default values
        var myNum = 5; // int
        var myDouble = 9.98; // double
        var myChar = 'D'; // char
        var myBoolean = true; // boolean
        var myString = "Hello"; // String
        System.out.println("myNum: " + myNum);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myChar: " + myChar);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myString: " + myString);
    }
}

/*
 * byte Stores whole numbers from -128 to 127
 * short Stores whole numbers from -32,768 to 32,767
 * int Stores whole numbers from -2,147,483,648 to 2,147,483,647
 * long Stores whole numbers from -9,223,372,036,854,775,808
 * to9,223,372,036,854,775,807
 * float Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
 * double Stores fractional numbers. Sufficient for storing 15 to 16 decimal
 * digits
 * boolean Stores true or false values
 * char Stores a single character/letter or ASCII values
 */