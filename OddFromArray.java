/*
    Accept 'n' Numbers From User and Print Odd Numbers From it....
                                                                         */

import java.io.*;
import java.util.*;

public class OddFromArray
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

        System.out.print("Odd Numbers From an Array: ");
        for(int i=0; i<a.length; i++)
        {
            if( a[i]%2 == 1 )
            {
                System.out.print(a[i] + "   ");
            }
        }
        System.out.println();
    }
}