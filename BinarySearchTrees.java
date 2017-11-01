/*
Matt Strand
Binary Search Trees
Assignment 7
 */
package binarysearchtrees;

import java.util.Scanner;

public class BinarySearchTrees {


    public static void main(String[] args) {
       boolean menu = true;
       int userChoice;
       int addValue;
       int checkValue;
       int deleteValue;
       Scanner sc = new Scanner(System.in);
       Root myRoot = new Root();
       
       while(menu){
           menuChoices();
           userChoice = sc.nextInt();
           
           if(userChoice == 1){
               System.out.print("Type to integer to be added to the tree: ");
               addValue = sc.nextInt();
               myRoot.insert(addValue);
               
           }else if(userChoice == 2){
               System.out.print("Type to integer to check if it exists in the tree: ");
               checkValue = sc.nextInt();
               
               if(myRoot.exists(checkValue) == true){
                   System.out.println("The value exists in the tree.");
               } else{
                   System.out.println("The value does not exist in the tree.");
               }
           }else if(userChoice == 3){
               myRoot.inOrder();
           }else if(userChoice == 4){
               myRoot.preOrder();
           }else if(userChoice == 5){
               myRoot.postOrder();
           }else if(userChoice == 6){
               System.out.print("Type the integer to be deleted from the tree: ");
               deleteValue = sc.nextInt();
               myRoot.delete(deleteValue);
               
           }else if(userChoice == 7){
               System.out.println("Goodbye.");
               menu = false;
           }else{
               System.out.println("Invalid Entry.");
           }
           
           
       }
    }
    
    
    public static void menuChoices(){
        System.out.println("");
        System.out.println("Binary Tree Operations: ");
        System.out.println("1. Insert");
        System.out.println("2. See if value exists in tree");
        System.out.println("3. Print the tree given InOrder Traversal");
        System.out.println("4. Print the tree given PreOrder Traversal");
        System.out.println("5. Print the tree given PostOrder Traversal");
        System.out.println("6. Delete a value from the tree");
        System.out.println("7. Exit");
        System.out.print("Type the corresponding integer of the action to be performed: ");
    }
}
