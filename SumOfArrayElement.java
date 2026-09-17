/*
    Accepts 'n' numbers from users and print its Sum.....       
                                                                */

import java.io.*;
import java.util.*;

public class SumOfArrayElement
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many numbers you want to store in an Array: ");
        int n = Integer.parseInt(br.readLine());

        int a[] = new int[n];

        System.out.println("****** Accepting Array Elements ******");
        for(int i=0; i<a.length; i++)
        {
            System.out.print("Enter Data: ");
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Array => " + Arrays.toString(a));

        int sum = 0;

        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }

        System.out.println("Sum of the Array Elements : " + sum);
    }
}