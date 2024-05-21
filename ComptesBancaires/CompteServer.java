
import java.rmi.*;
import java.rmi.server.*;
public class CompteServer {
public static void main(String[] args) {
   try {
	System.out.println( "Serveur : Construction de l'implementation ");
	Compte cpt= new Compte();
	System.out.println("Objet Compte lie dans le RMIregistry");
	Naming.rebind("MonCompte", cpt);
	System.out.println("Attente des invocations des clients ...");
       }
   catch (Exception e) {
                        System.out.println("Erreur de liaison de l'objet Compte");
                        System.out.println(e.toString());
                       }

}
}

