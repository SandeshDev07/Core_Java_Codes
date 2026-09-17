/*
    Accept 'n' Numbers From user and Print Count of Even and Odd Numbers .....
                                                                                 */

import java.io.*;
import java.util.*;

public class CntOfEvenAndOddNums
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

        int evenCnt = 0;
        int oddCnt = 0;

        for(int i=0; i<a.length; i++)
        {
            if( a[i]%2 == 0)
            {
                evenCnt++;
            }
            else
            {
                oddCnt++;
            }
        }

        System.out.println("Count of Even Numbers => " + evenCnt);
        System.out.println("Count of Odd Numbers => " + oddCnt);
    }
}