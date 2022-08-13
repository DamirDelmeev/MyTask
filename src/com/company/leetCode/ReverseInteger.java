package com.company.leetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseIntegerObj = new ReverseInteger();
        System.out.println(reverseIntegerObj.reverse(1534236469));
    }

    public int reverse(int x) {
        String stringWithNumber = String.valueOf(new StringBuilder(String.valueOf(x)).reverse());
        boolean negative = false;

        if (stringWithNumber.charAt(stringWithNumber.length() - 1) == '-') {
            stringWithNumber = stringWithNumber.substring(0, stringWithNumber.length() - 1);
            negative = true;
        }
        if (Long.valueOf(stringWithNumber) > Integer.MAX_VALUE | Long.valueOf(stringWithNumber) < Integer.MIN_VALUE) {
            return 0;
        }
        Integer result = Integer.valueOf(stringWithNumber);

        if (negative) {
            return (-1 * result);
        }
        return result;
    }
}
/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside
the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).*/