/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface RestaurantInterface extends Remote {
    public int add( int x,int y, int z)throws RemoteException;
            
    
}
