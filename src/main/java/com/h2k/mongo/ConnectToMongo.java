package com.h2k.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConnectToMongo {

	public static void main(String[] args) {
		// Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      
	      //Accessing the database 
	      MongoDatabase database = mongo.getDatabase("RishiTest");  
	      
	      //Creating a collection 
	      database.createCollection("sampleCollection"); 
	      System.out.println("Collection created successfully"); 
	      
	      mongo.close();
	   } 
	} 

