package com.sd.java_tutorial;

import java.sql.Connection;

import com.sd.java_tutorial.dp.behavioral.cor.Designations;
import com.sd.java_tutorial.dp.behavioral.cor.OfferLetter;
import com.sd.java_tutorial.dp.behavioral.cor.handler.DeliveryManager;
import com.sd.java_tutorial.dp.behavioral.cor.handler.DevelopmentManager;
import com.sd.java_tutorial.dp.behavioral.cor.handler.OperationDirector;
import com.sd.java_tutorial.dp.creational.builder.Player;
import com.sd.java_tutorial.dp.creational.singletone.DBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);
        
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime2);
        if(runtime2 == runtime)
        {
        	System.out.println("They are same.");
        }*/
    	
    	DBConnection conn = DBConnection.getInstance();
    	System.out.println(conn);
    	Connection connection = conn.getConnection();
    	
    	if(connection != null)
    		System.err.println("Connection is established.");
    	
    	Player.Builder builder = new Player.Builder();
    	builder.playerName("Sapan Desai").gender("Male").skinColor("dark")
    			.hairColor("brown").hairStyle("normal");
    	
    	Player player = builder.buildPlayer();
    	System.out.println(player.getName());
    	System.out.println(player.getGender());
    	System.out.println(player.getSkinColor());
    	System.out.println(player.getHairColor());
    	System.out.println(player.getHairStyle());
    	
    	OfferLetter ol1 = new OfferLetter("Shreya Desai", Designations.HPEL);
    	OfferLetter ol2 = new OfferLetter("Asshish Pandhre", Designations.SR_SOFTWARE_TESTER);
    	OfferLetter ol3 = new OfferLetter("Sapan Desai", Designations.TEAM_LEAD);
    	
    	OperationDirector od = new OperationDirector();
    	
    	DevelopmentManager devManager = new DevelopmentManager();
    	devManager.setSuccessor(od);
    	
    	DeliveryManager dm = new DeliveryManager();
    	dm.setSuccessor(devManager);
    	
    	devManager.handleRequest(ol3);
    	dm.handleRequest(ol2);
    	dm.handleRequest(ol1);
    	
    	
    	
    	
    }
}
