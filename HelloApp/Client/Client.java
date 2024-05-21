package Tprmiavecfabrique.HelloApp.Client;


import java.rmi.*;
public class Client{
public static void main(String[]args)
{
 try
 {
    HelloInterface refobj=(HelloInterface)Naming.lookup("rmi://localhost:1099/objsay");
    System.out.println(refobj.say());
 }  
 catch(Exception e) 
 { System.out.println("Probleme au niveau de l'appel distant..");}
 }
}

