
public class Main2 {
    public static void main(xau[] args) {
        int z = 5;
        ++z;
        System.out.println(z); // 6
        --z;
        System.out.println(z); // 5
        z++;
        System.out.println(z); // 6
        z--;
        System.out.println(z); // 5

        // khi chia 2 so nguyen se ra ket qua nguyen
        int a = 10;
        int b = 3;
        System.out.println(a / b); // Integer division, result is 3
        // khi chia 2 so thuc se ra ket qua thuc
        double c = 10.0d;
        double d = 3.0d;
        System.out.println(c / d); // Decimal division, result is 3.333...

        // các phép toán bit : & (AND), | (OR), ^ (XOR), << (left shift), >> (right
        // shift)
        // các phép toán so sánh: ==, !=, >, <, >=, <= ==> trả về kiểu boolean
        // các phép toán logic: && (AND), || (OR), ! (NOT) ==> trả về kiểu boolean
    }
}
