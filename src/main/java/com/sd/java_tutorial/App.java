package com.sd.java_tutorial;

import java.sql.Connection;

import com.sd.java_tutorial.dp.builder.Player;
import com.sd.java_tutorial.dp.singletone.DBConnection;

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
    }
}
