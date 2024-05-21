import java.rmi.*;
public class CompteClient {
public static void main (String [] args) {
    try{
		CompteInterface cpt = (CompteInterface)
		Naming.lookup("rmi://localhost:1099/MonCompte");
		cpt.crediter(1000);
	        cpt.debiter(100);
                System.out.println ("solde courant = " + cpt.lire_solde() );
       }
     catch (Exception e) {
                System.out.println ("Erreur d'acces a l'objet distant.");
                System.out.println (e.toString());
                         }
}
}
