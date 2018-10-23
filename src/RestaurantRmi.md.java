/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Acer
 */
public class RestaurantRmi  extends UnicastRemoteObject implements RestaurantInterface{
    public RestaurantRmi() throws RemoteException 
    {
        int x,y,z;
    }
    public int add(int x , int y,int z)throws RemoteException
    {
        return x+y+z;
    }
}
 