package com.company;

/**
 * Created by achintar on 10/01/15.
 */
public class Pattern6 {
    public static void main(String[] args)
    {
        int i,j,k,n=3,space=n,c=-1;
        for(i=1;i<=n+2;i++)
        {
            if(i!=3) {
                if(i<3)
                {
                    c+=2;
                    space--;
                }
                else
                {
                    c-=2;
                    space++;
                }
                for(k=1;k<=space;k++)
                    System.out.print(" ");
                for(j=1;j<=c;j++)
                    System.out.print("*");
            }
            else {
                System.out.print("Bill");
                c += 2;
                space--;
            }
            System.out.println();
        }
    }
}
