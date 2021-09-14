/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static boolean contain(int[] number, int x)
    {
        for (int n : number)
            if (n == x)
                return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int[] number = new int[100];
        int count = 0;
        int largest = 0;
        while (true)
        {
            System.out.print("Enter any number(-1 = end): ");
            int x = n.nextInt();
            if (x == -1)
                break;
            if (contain(number, x))
            {
                System.out.println("Enter a different number: ");
                continue;
            }
            number[count++] = x;
            largest = Math.max(x, largest);
        }
        System.out.println("Largest number: " + largest);
        n.close();
    }
}