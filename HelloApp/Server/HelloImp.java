package Tprmiavecfabrique.HelloApp.Server;

import java.rmi.*;
import java.rmi.server.*;
public class HelloImp extends UnicastRemoteObject implements HelloInterface
{
  String message;
  public HelloImp(String msg) throws RemoteException
  {
   message=msg;
  }
  public String say() throws RemoteException
  {
   return message;
  }
}
