package com.h2k.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertingDocument {

	public static void main(String[] args) {  
	      
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("RishiTest"); 

	      // Retrieving a collection
	      MongoCollection<Document> collection = database.getCollection("sampleCollection"); 
	      System.out.println("Collection sampleCollection selected successfully");

	      Document document = new Document("title", "MongoDB") 
	      .append("id", 2)
	      .append("description", "Rishiz MongoDB Test Code 1") 
	      .append("likes", 101) 
	      .append("comments", 202) 
	      .append("url", "http://www.h2kinfosys.com/mongodb/") 
	      .append("by", "Rishi");  
	      collection.insertOne(document); 
	      System.out.println("Document inserted successfully");    
	      
	      mongo.close();
	   } 

}
