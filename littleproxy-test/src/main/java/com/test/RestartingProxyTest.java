package com.test;

import org.littleshoot.proxy.HttpProxyServer;
import org.littleshoot.proxy.impl.DefaultHttpProxyServer;

/**
 * Hello world!
 *
 */
public class RestartingProxyTest 
{
    public static void main( String[] args )
    {
     
    	for (int i=1; i<25; i++){
    		System.out.println("Start-stop proxy. Iteration: "+i);
    		HttpProxyServer server =
        		    DefaultHttpProxyServer.bootstrap()
        		        .withPort(8080)
        		        .start();
        	server.stop();
    	}
  	
    	
    	System.out.println( "Done!" );
    }
}
