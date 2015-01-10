package com.company;

/**
 * Created by achintar on 10/01/15.
 */
public class Program7 {
    public void fizzbuzz()
    {
        int i=1;
        while(i<=100)
        {
            if(i%15 == 0)
                System.out.println("FIZZBUZZ");
            else if(i%5 == 0)
                System.out.println("BUZZ");
            else if(i%3 == 0)
                System.out.println("FIZZ");
            else
                System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args)
    {
        new Program7().fizzbuzz();
    }
}
