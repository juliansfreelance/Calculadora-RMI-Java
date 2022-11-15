package Interfaz;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Interfaz extends UnicastRemoteObject implements InterfazRMI {

    public Interfaz() throws RemoteException {
        super();
    }

    @Override
    public double sumar(double n1, double n2) throws RemoteException {
        return n1 + n2;
        
    }

    @Override
    public double restar(double n1, double n2) throws RemoteException {
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
