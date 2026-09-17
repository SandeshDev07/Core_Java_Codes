/*
    Accept 'n' Numbers From User and Display Array in Reverse Order...
                                                                            */

import java.io.*;
import java.util.*;

public class ReverseAnArray
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

        System.out.print("Array in Reverse Order => ");

        for(int i=a.length-1; i>=0; i--)
        {
            System.out.print(a[i] + "  ");
        }

        System.out.println();

    }
}