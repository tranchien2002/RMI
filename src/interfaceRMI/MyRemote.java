package interfaceRMI;

import ServerRMI.StudentInfo;

import java.rmi.RemoteException;

public interface MyRemote extends java.rmi.Remote {
    String name(int id) throws RemoteException;
    String email(int id) throws RemoteException;
}
