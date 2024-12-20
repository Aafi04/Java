// 1. Write a program to declare and initialize variables of all primitive data types and print
// their values.

/*
 * public class Data_Types_and_Variables { static int a = 10; static float b = 10.5f; static double
 * c = 10.02020d; static long d = 65432154; static byte e = 12; static char f = 'A'; static String g
 * = "Aafi"; static boolean h = true;
 * 
 * public static void main(String[] args) { System.out.println("Integer: " + a);
 * System.out.println("Float: " + b); System.out.println("Double: " + c);
 * System.out.println("Long: " + d); System.out.println("Byte: " + e); System.out.println("Char: " +
 * f); System.out.println("String: " + g); System.out.println("Boolean: " + h); } }
 */


// *********************************************************************************************
// *********************************************************************************************


// 2. Create a program to swap the values of two variables using a third variable.

/*
 * public class Data_Types_and_Variables { public static void main(String[] args) { int a = 10; int
 * b = 20; System.out.println("Value of a before swap: " + a + " and value of b before swap: " + b);
 * int c = a; a = b; b = c; System.out.println("Value of a after swap: " + a +
 * " and value of b after swap: " + b); } }
 */



// *********************************************************************************************
// *********************************************************************************************


// 3.Write a program to demonstrate typecasting by converting a double to an int and an int to a
// byte.


/*
 * public class Data_Types_and_Variables { public static void main(String[] args) { double a = 10.5;
 * int b = (int) a; System.out.println("Double to int: " + b); int c = 10; byte d = (byte) c;
 * System.out.println("Int to byte: " + d); } }
 */


// *********************************************************************************************
// *********************************************************************************************

// 4.Create a program to check if a given number is within the range of a byte data type.

/*
 * public class Data_Types_and_Variables { public static void main(String[] args) { int a = 128; if
 * (a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE) {
 * System.out.println("The number is within the range of byte data type."); } else {
 * System.out.println("The number is not within the range of byte data type."); } } }
 */


// *********************************************************************************************
// *********************************************************************************************

// 5.Write a program to calculate the area of a circle. Use double for the radius and area.


/*
 * public class Data_Types_and_Variables { public static void main(String[] args) { double radius =
 * 10.5; double area = Math.PI * radius * radius; System.out.println("Area of the circle is: " +
 * area); } }
 */


// *********************************************************************************************
// *********************************************************************************************

// print hello world


public class Data_Types_and_Variables {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
