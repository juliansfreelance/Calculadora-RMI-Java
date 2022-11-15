package Interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InterfazRMI extends Remote{
    public double sumar(double n1, double n2) throws RemoteException;
    public double restar(double n1, double n2) throws RemoteException;
    public double multiplicar(double n1, double n2) throws RemoteException;
    public double dividir(double n1, double n2) throws RemoteException;
}
