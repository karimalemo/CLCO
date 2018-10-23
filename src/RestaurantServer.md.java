/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantrmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;


public class RestaurantServer {
 

    public static void main(String[] args) throws RemoteException,NotBoundException{
        /*
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculator", new CalculatorRmi());
            System.out.println("Server is Running");
        } catch (Exception e) {
             System.out.println("Server nt connected "+e);
        }*/
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculator", new RestaurantRmi());
            System.out.println("Server is Running");
        
    }
}


