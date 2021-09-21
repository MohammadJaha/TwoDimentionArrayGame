/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDimentionArrayGame;

import java.util.Scanner;

/**
 *
 * @author Mohammad_Jaha
 */
public class TwoDimentionArrayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Dimentions of the board: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int arr[][]=new int[x][y];
        System.out.println("Enter the Values of the Board("+x*y+" Numbers):");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++)
                arr[i][j]=sc.nextInt();
        }
        System.out.println("\nThe Dimentions of the Board are: "+x+"*"+y);
        System.out.println("The Values of the Board:");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.print("\nThe Minimum Numbers from Start (Top Left) to Destination (Lower Right) are: [ "+arr[0][0]+" ");
        int sum=arr[0][0];
        for (int i=0,j=0;;){
            if(i<x-1&&j<y-1){
                if(arr[i+1][j]<=arr[i][j+1]){
                    sum=sum+arr[i+1][j];
                    System.out.print(arr[i+1][j]+" ");
                    i++;
                }
                else{
                    sum=sum+arr[i][j+1];
                    System.out.print(arr[i][j+1]+" ");
                    j++;
                }
            }
            else if(i<x-1&&j==y-1){
                sum=sum+arr[i+1][j];
                System.out.print(arr[i+1][j]+" ");
                i++;
            }
            else if (i==x-1&&j<y-1){
                sum=sum+arr[i][j+1];
                System.out.print(arr[i][j+1]+" ");
                j++;
            }
            else{
                break;
            }
        }
        System .out.println("]\n\nThe Minimum Total Cost is = "+sum);
    }
}
