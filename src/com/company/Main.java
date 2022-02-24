package com.company;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        String string = "Mads Kristian Pedersen";
        char ch = 'K';

        Main main = new Main();

        main.starBlock(8, 5);
    }
    public int findIndexOf(String string, char ch)
    {
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == ch)
            {
                return i;
            }
        }
        return -1;
    }
    public String reverseString(String string)
    {
        String newString = "";
        for (int i = string.length(); i > 0; i--)
        {
            newString += string.substring(i-1, i);
        }
        return newString;
    }
    public String mockifyString(String string)
    {
        String newString = "";
        for (int i = 0; i < string.length(); i++)
        {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 3);

            if (randomNumber == 1)
            {
                newString += string.substring(i, i+1).toLowerCase();
            }
            else
            {
                newString += string.substring(i, i+1).toUpperCase();
            }
        }
        return newString;
    }
    public void printMultiplicationTable()
    {
        int a;
        int b;
        for (a = 1; a <= 10; a++)
        {
            if (a == 2)
            {
                System.out.printf("----+------------------------------------%n");
            }
            for (b = 1; b <= 10; b++)
            {
                if (b == 2)
                {
                    System.out.printf("|");
                }
                int aB = a*b;
                System.out.printf("%3d ", aB);
            }
            System.out.printf("%n");
        }
    }
    public void starBlock(int width, int height)
    {
        for (int i = 0; i <= height-1; i++)
        {
            for (int j = 0; j <= width-1; j++)
            {
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
}
