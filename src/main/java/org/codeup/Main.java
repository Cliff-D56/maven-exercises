package org.codeup;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter Something ");
        String hi1 = hi.nextLine();
        if (StringUtils.isNumeric(hi1)){
            System.out.println("User entered a number");
        }else {
            System.out.println("User entered a word");
        }
        System.out.println(StringUtils.swapCase(hi1));
        System.out.println(StringUtils.reverse(hi1));

    }
}