package day15_Forloop;

import day12_Scanner.ScannerPractice;

import java.util.Scanner;

public class StartWithX {

    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word= new Scanner(System.in).next(); //xcodex

        if(word.charAt(0)== 'x'){
           word= word.replaceFirst("x", "a"); //"acodex"
        }

        System.out.println(word);

    }
}
