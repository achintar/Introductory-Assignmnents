package com.company;

/**
 * Created by achintar on 10/01/15.
 */
public class PrimeFactors {

    public static void main(String[] args){

        int n=30;
        new PrimeFactors().checkFactors(n);
    }

    private void checkFactors(int temp) {

        int i;
        for(i=1;i<=temp;i++) {
            if(temp%i == 0)
                primeNumberCheck(i);
        }
    }

    private void primeNumberCheck(int i) {
        int j,c=0;
        for(j=1;j<=i;j++)
            if (i % j == 0) c++;
        if(c==2)
            System.out.print(i+" ");
    }
}
