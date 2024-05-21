package Tprmiavecfabrique.Reverse.Server;


import java.rmi.*;
import java.rmi.server.*;
public class FabReverseImpl extends UnicastRemoteObject implements
FabReverseInterface {
public FabReverseImpl() throws RemoteException {};
public ReverseInterface newReverse() throws RemoteException {
return new Reverse(); } }

