package Tprmiavecfabrique.HelloApp.Server;


import java.rmi.*;
import java.rmi.server.*;

public class HelloServer
{
public static void main(String arg[])
	{
		try
		{
			Naming.rebind("objsay",new HelloImp("Hi ! From the Server.."));
			System.out.println("Le serveur est pret");
        }
	    catch(Exception e)
	    {
			System.out.println("Le serveur est en panne");
	    }
	
    }
	
}

