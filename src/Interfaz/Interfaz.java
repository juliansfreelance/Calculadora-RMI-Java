/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author AriasCookie
 */
public class Interfaz extends UnicastRemoteObject implements InterfazRMI{
    public Interfaz() throws RemoteException{
        super();
    }
    
    @Override
    public double sumar(double n1, double n2) throws RemoteException{
        
        return n1 + n2;
        
    }
    
    @Override
    public double restar(double n1, double n2) throws RemoteException{
        
        return n1 - n2;
        
    }

    @Override
    public double multiplicar(double n1, double n2) throws RemoteException {
        return n1 * n2;
    }

    @Override
    public double dividir(double n1, double n2) throws RemoteException {
        return n1 / n2;
    }

}