package com.h2k.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ListOfCollection {

	public static void main(String[] args) {
		  // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("RishiTest"); 

	      System.out.println("List collections::");
	     
	      for (String name : database.listCollectionNames()) { 
	         System.out.println(name); 
	      } 

	      mongo.close();
	}

}
