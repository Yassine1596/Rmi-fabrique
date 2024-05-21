package Tprmiavecfabrique.Reverse.Server;


import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class ReverseServer {
public static void main(String[] args) {
try {
Registry registry = LocateRegistry.createRegistry(1099);
 System.out.println( "Serveur : Construction del'implementation");
FabReverseImpl fab=new FabReverseImpl();
System.out.println("Objet Fabrique lie dans le RMIregistry");
registry.rebind ("Fabrique",fab);
 System.out.println ("Serveur prêt.") ;
 System.out.println("Attente des invocations des clients ...");
 }
catch (Exception e) {
 System.out.println("Erreur de liaison de l'objet Fabrique");
 System.out.println(e.toString());}} }

