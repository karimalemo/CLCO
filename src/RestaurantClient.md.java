/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantrmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class RestaurantClient {
  


    public static void main(String[] args)throws NotBoundException,MalformedURLException,RemoteException{
        Scanner sc = new Scanner(System.in);
        int x ;
        int y ;
        int z ;
            RestaurantInterface c = (RestaurantInterface)Naming.lookup("rmi://localhost:1099/Calculator");
            System.out.println("Client is connected to server");
            System.out.println("le Restaurant R1 est :\n" 
                    +"1. Qualité de la nourriture\n"
                    +"2. Qualité de la salle\n"
                    +"3. Qualité de la service\n");
                  
           //* int choice = sc.nextInt();
           //* int x,y,z = 0;
        
                System.out.println("Enter x and y and z ");
                x=sc.nextInt();
                y=sc.nextInt();
                z=sc.nextInt();
                System.out.println(c.add(x,y,z));
            
            }
           
           
            
            
        }
            
       
        
        
    


