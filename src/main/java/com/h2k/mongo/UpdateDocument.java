package com.h2k.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class UpdateDocument {

	public static void main(String[] args) {
		  // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("RishiTest"); 

	      // Retrieving a collection
	      MongoCollection<Document> collection = database.getCollection("sampleCollection"); 
	      System.out.println("Collection sampleCollection selected successfully");
	      
	      // Check out where clauses in Filters
	      collection.updateOne(Filters.eq("id", 1), new Document("$set", new Document("likes", 1000)));
	      System.out.println("Updating Likes from 100 to 1000");
      
	      mongo.close();

	}

}
