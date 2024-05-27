/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

import java.util.Arrays;

/**
 *
 * @author Drew Brackman
 */
public class SuffixArray {
    private String s;   //DNA sequence
    private String[] strings;
    private int[] SA;
    private int n;
    
    public SuffixArray(String s)
    {
        this.s = s + "$";       //append $ to the DNA sequence
        n = this.s.length();
        SA = new int[n];
        strings = new String[n];
        computeSuffixArray();
    }
    
    private void computeSuffixArray()
    {
        for(int i = 0; i < n; i++)
        {
            strings[i] = s.substring(i);
        }
        
        Arrays.sort(strings);
        
        for(int i = 0; i < n; i++)
        {
            SA[i] = n - strings[i].length() + 1;
        }
    }
    
    public void printSuffixArray()
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println("SA[" + (i + 1) + "] = " + SA[i]);
        }
    }
}
