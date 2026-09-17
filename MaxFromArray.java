/*
    Accepts 'n' Numbers from user and Print Maximum from it...
                                                                     */

import java.io.*;
import java.util.*;

public class MaxFromArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you want to store in an Array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("****** Accepting Array Elements ******");
        for(int i=0; i<a.length; i++)
        {
            System.out.print("Enter Data: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Array => " + Arrays.toString(a));

        int max = a[0];

        for(int i=1; i<a.length; i++)
        {
            if( a[i] > max )
            {
               max = a[i];
            }
        }

        System.out.println("Maximum Element From Arrays : " + max );
    }
}