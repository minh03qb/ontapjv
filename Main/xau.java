public class xau {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // .length() trả về độ dài của chuỗi
        System.out.println("The length of the txt string is: " + txt.length());// 26

        // .toLowerCase() chuyển chuỗi thành chữ thường
        System.out.println(txt.toLowerCase());

        // .toUpperCase() chuyển chuỗi thành chữ hoa
        System.out.println(txt.toUpperCase());

        // .indexOf() trả về vị trí của ký tự đầu tiên được tìm thấy trong chuỗi
        System.out.println(txt.indexOf("R")); // Outputs 17

        // .charAt() trả về ký tự tại vị trí được chỉ định trong chuỗi
        System.out.println(txt.charAt(0));

        String txt1 = "Hello";
        String txt2 = "Hell3";
        // .equals() so sánh hai chuỗi có giống nhau hay không
        System.out.println(txt1.equals(txt2));// false

        // .trim() loại bỏ khoảng trắng ở đầu và cuối chuỗi
        String txt3 = "       Hello World!       ";
        System.out.println(txt3.trim());

        // .concat() nối hai chuỗi lại với nhau
        String txt4 = "Hello";
        String txt5 = "World";
        System.out.println(txt4.concat(txt5));// HelloWorld

        // số + chuỗi
        int num = 5;
        String txt6 = "20";
        System.out.println(num + txt6);// 520

        // cách chuỗi chứa "",'',\ bằng cách sử dụng ký tự thoát \
        String txt7 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt7);
        String txt8 = "It   \'s a beautiful day.";
        System.out.println(txt8);
        String txt9 = "The file is located at C:\\Users\\Public.";
        System.out.println(txt9);
    }
}
