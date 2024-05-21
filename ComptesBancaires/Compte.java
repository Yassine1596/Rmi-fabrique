import java.rmi.*;
import java.rmi.server.*;
public class Compte extends UnicastRemoteObject implements CompteInterface
{
	private double solde;
	public Compte() throws RemoteException
	{
		super();
		solde=0; 
        }
	public void crediter(double montant) throws RemoteException
	{
		solde=solde+montant; 
	}
	public void debiter(double montant) throws RemoteException
	{
		solde=solde-montant; 
        }
	public double lire_solde() throws RemoteException
	{
		return solde; 
	}
}
