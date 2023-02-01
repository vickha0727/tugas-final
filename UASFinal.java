
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pkgfinal;

/**
 *
 * @author DYNABOOK
 */
public class UASFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=2;j++)
                {
                    if(j==1)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                for(int j=1;j<=6;j++)
                {
                    if(j==6)
                    System.out.print("  ");
                    else if(j==1||j==n||i==1||i==3||i==n)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                for(int j=1;j<=9;j++)
                {
                    if(j==i||j+i==10)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
    
        }
