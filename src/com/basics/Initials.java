package com.basics;

public class Initials {
    public static void main(String[] args) {

//        System.out.println("**        ***    ****                        ****  ");
//        System.out.println("**      ***      ** **                      ** **  ");
//        System.out.println("**    ***        **   **                  **   **  ");
//        System.out.println("**  ***          **     **              **     **  ");
//        System.out.println("*****            **       **          **       **  ");
//        System.out.println("**  ***          **         **      **         **  ");
//        System.out.println("**    ***        **           **  **           **  ");
//        System.out.println("**      ***      **             **             **  ");
//        System.out.println("**        ***    **                            **   ");
//        System.out.println();
        int rows = 9; // Number of rows in the pattern

         for(int i = 4; i>=1; i--)
        {
            System.out.print("**");
            for(int j = 1; j<=i; j++)
            {
                if(j!=i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("**");
                }
            }
            System.out.println();
        }
        for(int i = 1; i<=4; i++)
        {
            System.out.print("**");
            for(int j = 1; j<=i; j++)
            {
                if(j==i)
                {
                    System.out.print("**");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}






