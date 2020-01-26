package com.sparta.engineering50.thanu.java;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                int length;
                Scanner input = new Scanner(System.in);
                System.out.println("How many numbers?");
                length = input.nextInt();
                int[] names = new int[length];
                for(int counter = 0; counter < length; counter++){
                    System.out.println("Enter interger "+(counter+1));
                    names[counter] = Integer.parseInt(input.next());
                }
               // input.close();
        System.out.println("Your array is:" + Arrays.toString(names));
        System.out.println("Which sort method would you like to use?");
        System.out.println("Enter 1 for BubbleSort");
        System.out.println("Enter 2 for Merge Array");
        System.out.println("Enter 3 for Binary Tree");
        int switchCase =  input.nextInt();
        switch(switchCase) {
            case 1 :
                System.out.println("Bubble Sort Selected");
                BubbleSort.sorting(names);
                break;
            case 2 :
                System.out.println("Merge Sort Selected");
                System.out.println(Arrays.toString(MergeSort.Merge_sort(names, length)));
                break;
            case 3 :
                System.out.println("Binary Tree Selected");
                SortSortBinaryTree binaryTree = new SortSortBinaryTree(names);
                System.out.println(Arrays.toString(binaryTree.getSortedTree()));

            default :
                System.out.println("Invalid");
        }
    }

}


