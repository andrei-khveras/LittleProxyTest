package com.test;

import org.littleshoot.proxy.HttpProxyServer;
import org.littleshoot.proxy.impl.DefaultHttpProxyServer;

public class RestartingProxyTest 
{
    public static void main( String[] args )
    {
     
    	for (int i=1; i<25; i++){
    		System.out.println("Start proxy. Iteration: "+i);
    		HttpProxyServer server =
        		    DefaultHttpProxyServer.bootstrap()
        		        .withPort(8080)
        		        .start();
    		System.out.println("Proxy started. Stopping proxy. Iteration: "+i);
        	server.stop();
        	System.out.println("Proxy stopped. Iteration: "+i);
    	}
    	
    	System.out.println( "Done!" );
    }
}
