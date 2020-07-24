package com.quartzinsight.devback;


import com.quartzinsight.devback.data.*;
import com.quartzinsight.devback.utils.JsonUtils;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class Controller {

	public Controller() {
		
		Spark.port(8080);
		
	//////////////AUTHENTIFICATION///////////////

		// TODO 
//		Spark.before("/api/store/games", new SecurityFilter(new MyConfigFactory(null, null).build(), "user"));
		
	////////////////////////////////////////////
		
		Spark.get("/api/store/games", new Route() {
			
			public Object handle(Request request, Response response) throws Exception {
				// TODO Auto-generated method stub
				
				Games store = new Games();
				store.addNewGame("Zelda");
				store.addNewGame("Spiderman");
				store.addNewGame("Anno 1800");
				store.addNewGame("Frostpunk");
				
				return  JsonUtils.gamesToHtml(store);
			}
		});
		
		Spark.get("/api/library/games", new Route() {
			
			public Object handle(Request request, Response response) throws Exception {
				// TODO Auto-generated method stub
				
				Games library = new Games();
				library.addNewGame("Call of Duty");
				library.addNewGame("Battlefield");
				library.addNewGame("Homeworld");
				library.addNewGame("Max Payne");
				
				return JsonUtils.gamesToHtml(library);
			}
		});
		
		Spark.get("/api/friends", new Route() {
			
			public Object handle(Request request, Response response) throws Exception {
				// TODO Auto-generated method stub
				
				Friends friends = new Friends();
				friends.addNewFriend("Kratos");
				friends.addNewFriend("Atreus");
				friends.addNewFriend("Thanos");
				friends.addNewFriend("Minerva");
				
				return JsonUtils.friendsToHtml(friends);
			}
		});
		
		Spark.get("/api/test", new Route() {
			
			public Object handle(Request request, Response response) throws Exception {
				// TODO Auto-generated method stub
				
				return "test";
			}
		});
		
		

		
	}

	
}