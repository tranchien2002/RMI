package ServerRMI;

import interfaceRMI.MyRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Student extends UnicastRemoteObject implements MyRemote {
    StudentInfo info1 = new StudentInfo(1, "tuan anh", "piggy@gmail.com");
    StudentInfo info2 = new StudentInfo(2, "chu chien", "cc@gmail.com");

    ArrayList<StudentInfo> listInfo = new ArrayList<StudentInfo>();
    protected Student() throws RemoteException {
        listInfo.add(info1);
        listInfo.add(info2);
    }



    @Override
    public String name(int id) throws RemoteException {
        Student students = new Student();
        System.out.println(students.listInfo.size());
        if(students.listInfo.size() < id ){
            return "Khong tim thay";
        }
        return students.listInfo.get(id - 1).getName();
    }

    @Override
    public String email(int id) throws RemoteException {
        Student students = new Student();
        if(students.listInfo.size() < id){
            return "Khong tim thay";
        }
        return students.listInfo.get(id - 1).getEmail();
    }
}