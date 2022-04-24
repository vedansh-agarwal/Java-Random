package com.vedansh;

public class AddBinaryWithoutConversion {

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }

    public static String addBinary(String astr, String bstr) {
        char a[], b[];
        if(astr.length() >= bstr.length()) {
            a = astr.toCharArray();
            b = bstr.toCharArray();
        }
        else {
            a = bstr.toCharArray();
            b = astr.toCharArray();
        }
        int lenA = a.length;
        int lenB = b.length;
        int c1 = lenA-1, c2 = lenB-1;
        char carry = '0';
        while(c2 >= 0) {
            if(a[c1] == '1' && b[c2] == '0' && carry == '1')
                a[c1] = '0';
            else if(a[c1] == '0' && b[c2] == '1' && carry == '0')
                a[c1] = '1';
            else if(a[c1] == '1' && b[c2] == '1' && carry == '0') {
                a[c1] = '0';
                carry = '1';
            }
            else if(a[c1] == '0' && b[c2] == '0' && carry == '1') {
                a[c1] = '1';
                carry = '0';
            }
            c1--;
            c2--;
        }
        while(c1 >= 0 && carry == '1') {
            if(a[c1] == '1' && carry == '1')
                a[c1] = '0';
            else if(a[c1] == '0' && carry == '1') {
                a[c1] = '1';
                carry = '0';
            }
            c1--;
        }
        if(carry == '1')
            return "1"+String.valueOf(a);
        else
            return String.valueOf(a);
    }
}
