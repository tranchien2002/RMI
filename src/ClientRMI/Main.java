package ClientRMI;

import interfaceRMI.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        // write your code here
        try {
            Remote lookup = Naming.lookup("rmi://localhost/info");
            MyRemote myRemote = (MyRemote) lookup;
            System.out.println("ID : ");
            Scanner scan = new Scanner( System.in );
            int id = scan.nextInt();
            String name = myRemote.name(id);
            String email = myRemote.email(id);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
