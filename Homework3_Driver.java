package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Drew Brackman
 */
public class Homework3_Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Drew Brackman\\Documents\\NetBeansProjects\\451_Homework3\\src\\mypackage\\hw3input.txt");
        Scanner scan = new Scanner(file);
        scan.nextLine();
        String seq1 = scan.nextLine();
        SuffixArray drew = new SuffixArray(seq1);
        drew.printSuffixArray();
    }
    
}
