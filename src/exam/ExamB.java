//Justin Chester
//ICS Exam Jan 27 2016
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.math.*;

/**
 *
 * @author chesj2479
 */
public class ExamB {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner fin = new Scanner(new FileReader("triangle.txt"));
        String sTri;
        double dA, dB, dC;
        for (int t = 0; t < 5; t++) {
            sTri = fin.next();
            dA = fin.nextInt();
            dB = fin.nextInt();
            dC = fin.nextInt();
            //System.out.println(sTri + " " + dA + " " + dB + " " + dC);
            if (dA == 0) {
                if (sTri.equals("A")) {
                    dA = Math.sqrt(Math.pow(dB, 2) + Math.pow(dC, 2)); 
                    System.out.println("The value of side a is " + dA);
                } else if (sTri.equals("B")) {
                    dA = Math.sqrt(Math.pow(dB, 2) - Math.pow(dC, 2));
                    System.out.println("The value of side a is " + dA);
                } else if (sTri.equals("C")) {
                    dA = Math.sqrt(Math.pow(dC, 2) - Math.pow(dB, 2));
                    System.out.println("The value of side a is " + dA);
                }
            } else if (dB == 0) {
                if (sTri.equals("A")) {
                    dB = Math.sqrt(Math.pow(dA, 2) - Math.pow(dC, 2));
                    System.out.println("The value of side b is " + dB);
                } else if (sTri.equals("B")) {
                    dB = Math.sqrt(Math.pow(dA, 2) + Math.pow(dC, 2));
                    System.out.println("The value of side b is " + dB);
                } else if (sTri.equals("C")) {
                    dB = Math.sqrt(Math.pow(dC, 2) - Math.pow(dA, 2));
                    System.out.println("The value of side b is " + dB);
                }
            } else if (dC == 0) {
                if (sTri.equals("A")) {
                    dC = Math.sqrt(Math.pow(dA, 2) - Math.pow(dB, 2));
                    System.out.println("The value of side c is " + dC);
                } else if (sTri.equals("B")) {
                    dB = Math.sqrt(Math.pow(dB, 2) - Math.pow(dA, 2));
                    System.out.println("The value of side c is " + dC);
                } else if (sTri.equals("C")) {
                    dB = Math.sqrt(Math.pow(dA, 2) + Math.pow(dB, 2));
                    System.out.println("The value of side c is " + dC);
                }
            }
        }
    }
}
