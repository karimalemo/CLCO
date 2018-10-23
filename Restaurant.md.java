/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Restaurant  extends UnicastRemoteObject {
    public Restaurant()throws RemoteException {
        int x,y,z;
    }
    public int add (int x,int y , int z) throws RemoteException{
        return x+y+z;
    }
    
    
    
    
    
    
    public static void main(String[]args){
        

    }
}   