package com.company;

/**
 * Created by achintar on 10/01/15.
 */
public class Pattern5 {
    public static void main(String[] args)
    {
        int i,j,k,space=3,n=3;
        for(i=1;i<=n+2;i+=2)
        {
            for(k=1;k<space;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
            space--;
        }
    }
}
