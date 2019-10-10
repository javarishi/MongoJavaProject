package com.h2k.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DeletingDocuments {

	public static void main(String[] args) {
		  // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 

	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("RishiTest"); 

	      // Retrieving a collection
	      MongoCollection<Document> collection = database.getCollection("sampleCollection"); 
	      System.out.println("Collection sampleCollection selected successfully");
	      
	      // Check out where clauses in Filters
	      collection.deleteOne(Filters.eq("id", 2));
	      System.out.println("Document with ID 2 - selected successfully");
	      
	      // Check the collection again
	      for (Document cur : collection.find()) {
	    	    System.out.println(cur.toJson());
	    	}

	      mongo.close();
	}

}
