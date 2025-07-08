package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homepage;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int x=7;
        int y=9;

        if( x == y )                                          // check the two number equals
        {
            System.out.println("X is equal to y");            //yes , print this line
        }
        else if ( ( x != y ) && ( x > y ) )                  // check if not equals and X is Greater than y
        {
            System.out.println("X is not equal to y");      // print Two lines
            System.out.println("X is Greater than y");

        }
        else if ( ( x != y ) && ( x <y ) )                 //check if not equals and X is less than y
        {
            System.out.println("X is not equal to y");    // print Two lines
            System.out.println("X is less than y");

        }

        //another code by using nested if

        if( x == y )                                          // check the two number equals
        {
            System.out.println("X is equal to y");            //yes , print this line
        }
        else                                                  //no , check if x not equal y
        {
            System.out.println("X is not equal to y");        //print this line
            if ( x > y )                                      //check if X is Greater than y
            {
                System.out.println("X is Greater than y");    //yes print this line
            }
            else                                             //no , check if x < y
            {
                System.out.println("X is less than y");     //yes print this line
            }
        }
    }
}
