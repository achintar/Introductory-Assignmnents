package com.company;

/**
 * Created by achintar on 10/01/15.
 */
public class Pattern4 {
    public static void main(String[] args)
    {
        int i,j,n=3;
        for(i=1;i<=3;i++) {
            for (j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
