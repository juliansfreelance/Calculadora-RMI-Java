/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author AriasCookie
 */
public interface InterfazRMI extends Remote{
    public double sumar(double n1, double n2) throws RemoteException;
    public double restar(double n1, double n2) throws RemoteException;
    public double multiplicar(double n1, double n2) throws RemoteException;
    public double dividir(double n1, double n2) throws RemoteException;
}
