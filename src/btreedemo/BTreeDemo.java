/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btreedemo;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;

public class BTreeDemo 
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner( System.in );
		int n,n2,temp;
		System.out.print("Enter the t of the Tree?  ");
		n=input.nextInt();
		
        while ( n<2)
		{	
            System.out.print("Please enter a integer greater than 1 : ");
			n=input.nextInt();
		}
		BTree tree = new BTree(n);
		System.out.print("\n How many values do you want to enter?:\n  ");	
               n2 = input.nextInt();

        for ( int i=0;i< n2;i++)
		{
            System.out.print("Enter Value:");
		System.out.println(i+1);
			temp=input.nextInt();
		tree.insert(tree,temp);
		}
		int choice,k;

        boolean flag;
		flag=true;
			System.out.println("Choose 1 option from below:");
			System.out.println("1. Insert");
			System.out.println("2. Print Tree");
			System.out.println("3. Search");
			System.out.println("4. Exit");

		while (flag)
		{
			System.out.print("\nPlease enter your choice::");
			choice=input.nextInt();
			if ( choice == 4)
			{		
                System.out.printf("exiting...,\n");
			    System.exit(0);
				flag=false;
				break;
			}
            else
			{
			 	switch(choice)
			 	{
			 		case 1: 
	
                        System.out.print("How many values do you want to enter?:");
						n2=input.nextInt();

                        for ( int i=0;i< n2;i++)
						{
                            System.out.print("\nEnter Value: ");
							System.out.println(i+1);
							temp=input.nextInt();
							tree.insert(tree,temp);
                        }
                        break;

					case 2: 
						
                        tree.print(tree.root);
						System.out.println();
						break;

					case 3: 
		
                        System.out.println("What is the key you wish to search for:");
						int key2=input.nextInt();
						tree.SearchPrintNode(tree,key2);

						break;
					case 4: 
                                                 System.exit(0);
						 break;

						default: 
						System.out.println("\nPlease enter a valid choice of 1,2,3 or 4\n");
						break;
	 			}
			 }
}
	}}
