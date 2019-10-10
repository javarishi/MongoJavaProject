package com.h2k.mongo;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class SelectingCollection {

	public static void main(String[] args) {
		// Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      
	      //Accessing the database 
	      MongoDatabase database = mongo.getDatabase("RishiTest");  
	      
	      //Creating a collection 
	      database.createCollection("testNewCollection"); 
	      System.out.println("Collection created successfully"); 
	      
	   // Retieving a collection
	      MongoCollection<Document> collection = database.getCollection("test"); 
	      if(collection != null) {
	    	  System.out.println("Collection myCollection selected successfully");
	      }
	      
	      mongo.close();
	   }

}
