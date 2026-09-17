/*
    Accept 'n' Numbers From user and Display numbers those Divisible by 5 and 7.....
                                                                                 */

import java.io.*;
import java.util.*;

public class  DivisibleBy5And7
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many numbers you want to store : ");
        int n = Integer.parseInt(br.readLine());

        int a[] = new int[n];

        System.out.println("***** Accepting Array Elements *****");
        for(int i=0; i<a.length; i++)
        {
            System.out.print("Enter Data: ");
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Array => " + Arrays.toString(a));

        System.out.print("Numbers those are Divisible by 5 And 7 are : ");
        for(int i=0; i<a.length; i++)
        {
            if( a[i]%5 == 0 && a[i]%7 == 0 )
            {
                System.out.print(a[i] + "    ");
            }
        }

        System.out.println();
    }
}

