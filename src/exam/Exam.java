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

/**
 *
 * @author chesj2479
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fin = new Scanner(new FileReader("factor.txt"));
        int arnNums[] = new int[6];
        int arnFact[] = new int[4];
        for (int i = 0; i < arnNums.length; i++) {
            arnNums[i] = fin.nextInt();
            //    System.out.println(arnNums[i]);
        }
        for (int i = 0; i < arnFact.length; i++) {
            arnFact[i] = fin.nextInt();
            //   System.out.println(arnFact[i]);
        }
        for (int i = 0; i < arnFact.length; i++) {   //Loops through each factor
            for (int j = 0; j < arnNums.length; j++) {  //Loops through each of the numbers
                if (arnNums[j] % arnFact[i] == 0) {//Mods num by factor to check for whole number
                    System.out.println(arnFact[i] + " is a perfect factor of " + arnNums[j]);
                } else {
                }
            }
        }
    }
}