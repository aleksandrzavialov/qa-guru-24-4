package ru.azavialov;

public class Operators {
    public static void main(String[] args) {
        //Int values - 4 bytes
        //int arithmetic actions = - + - * / % ++ --
        int int1 = 12;
        int int2 = 2147483635;
        System.out.println("Maximum of int is " + (int1 + int2));
        System.out.println("Minimum of int is " + (int1 - 2147483660L));
        System.out.println("Overflow of int is when value is bigger than 2147483647 " + (2147483647 + 1) +
                " or less than -2147483648 " + (int2 - 2 * int2 - 14));
        int int3 = int1;
        int1 /= 5;
        System.out.println("After integer (and shorthand) division float part 0.4 is gone: " + int1);
        System.out.println("Integer values can be represented in binary and hex forms: HEX -  " + 0x1a + " or binary: "
                + 0b110);
        System.out.println("It is possible to obtain remainder by using % operator: " + int3 % 5);
        System.out.println("You can use pre form of unary operator (action first) like: " + --int2);
        System.out.println("Or you can use post form of unary operator (action last) like: " + int2++ + ". " +
                "In this case value is incremented after logging. Final value is: " + int2);
        System.out.println("You can use wrapper classes to work with primitive like with objects: " +
                (Integer.parseInt("500") - 2));

        //int compare and logic operators
        System.out.println("Comparing int values produce boolean result: " + (4 < 43));
        System.out.println("It possible to combine logic operators to compare integer values: " +
                ((4 < 43) && (5 == 23)));
        System.out.println("You can user non - strict checking or check inequity: " +
                ((5 != 5) || (5 >= 5)));
        System.out.println("Logic and compare operators can be used inside ternary operators as well: " +
                (4 > 2 && 3 >= 34 ? "BothGreaterOrEqual" : "AtLeastOneIsLess"));

        //Double values - 8bytes
        double double1 = 6.0;
        System.out.println("Double values allow to store float part so '/' operator will return proper number 1.5: " +
                (double1 / 4));
        System.out.println("All arithmetic operations available for int can be used for double as well: " + (++double1 +
                (7 - double1) * 3.4) / 3);
        double double2 = 6 / 4;
        System.out.println("Deleting int by int cannot produce double, float part will be deleted. " + double2 +
                " so add float part at least to one of operands: " + 6.0 / 4);
        double double3 = 2.5;
        int int4 = 5;
        double3 *= 14 * int4 * 1.1;
        System.out.println("You can operate int values inside double: " + double3);
        System.out.println("You can convert double to int with deleting float part: " + (int) (double3));
        System.out.println("");

        System.out.println("It is possible to get infinity for double when deleting by int zero: " + 2d / 0d +
                " or by double zero: " + 24 / 0.0 + ". Literal d is used to specify a double");
        System.out.println("Also it is possible to get NaN when working with infinity values: " + (0.0 / 0.0));
        System.out.println("Or you can get infinity while violating ranges. Double values can range from -1.7E308 " +
                "to 1.7E308: " + (1.79E+308 * 10));
        System.out.println("You can user wrapper functions like in int: " + Double.isNaN(double3));


        //Other number primitives - byte - 1 byte (-128 to +127), short -2 bytes (-32_768 to +32_767), long - 8 bytes
        // (-9E18 to +9E18) - all three without float part and float - 4 bytes
        System.out.println("To specify long or float you should add L and F literals to discreet them from " +
                "default int and double types accordingly: " + 223456214457L + " and " + 1.2F);
        //If several types are used in one expression, all values are converted into biggest format, e.g. byte to int
        byte byte1 = 4;
        int int5 = 123;
        System.out.println("Result will have int type: " + (byte1 + int5));
        System.out.println("Int formats (byte, short, int, long) will be converted to float/double if " +
                "float/double are used in expression. " +
                "Float is converted to double if double is in the expression: " + (int5 + byte1 + 23.45F / 1123.456));
        int short1 = (45 + Integer.MAX_VALUE);
        System.out.println("All int formats by default converted to int so it may be necessary to manually " +
                "convert to target format (Overflow can cause wrong results): " + short1);

        //Symbol type - char. 2 bytes with no sign, so stores values from 0 to 65535 which are Unicode code symbols.
        // Can be set in different formats
        char char1 = 'B';
        char char2 = 66;
        char char3 = 0x42;
        char char4 = 0x0042;
        char char5 = '\u0042';

        System.out.println(char1 + " " + char2 + " " + char3 + " " + char4 + " " + char5);
        System.out.println("Number can be converted to char: " + (char) 67);

        //boolean types - contain either true or false. Are used in logical operations
        boolean boolTrue = true;
        boolean boolFalse = false;
        System.out.println(boolTrue && boolFalse);

        //String actions - instanceof can be applied to reference types only
        System.out.println("Type of String can be checked: " + ("I am test string" instanceof String));


    }
}
