/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Restaurantserver {
      public static void main(String[] args) throws RemoteException,NotBoundException{
        
        try {
            Registry r = java.rmi.registry.LocateRegistry(1099);
            r.rebind("Restaurant", new RestaurantRmi());
            
        } catch (Exception e) {
            
        }        
        }
        
        
        }
        
  

  
        
      