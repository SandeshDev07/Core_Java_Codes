/*
    Accept 2-D Array and Print It 
                                        */

import java.io.*;
import java.util.*;

public class TwoDArrayDemo
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Rows:  ");
        int m = sc.nextInt();

        System.out.print("Enter thr number of Columns");
        int n = sc.nextInt();

        int a[][] = new int[m][n];

        System.out.println("****** Accepting Array Elements ******");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)      //for each row, we have to iterate through all the columns
            {
                System.out.print("Enter Data: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("***** Matrix *****");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}