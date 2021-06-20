package testTest;

import java.lang.*;


public class reverseStringWithBuffer {


        public static void main(String[] args)
        {
            String str = "reverse string using buffer";

            // conversion from String object to StringBuffer
            StringBuffer sbr = new StringBuffer(str);
            // To reverse the string
            sbr.reverse();
            System.out.println(sbr);
        }
    }