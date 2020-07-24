package com.quartzinsight.devback.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.quartzinsight.devback.data.Friends;
import com.quartzinsight.devback.data.Games;

public class JsonUtils {

	private static GsonBuilder builder = new GsonBuilder() ; 


	/**
	 * @param games
	 * @return
	 */
	public static String gamesToHtml(Games games) {

		builder.setPrettyPrinting();
		Gson gson = builder.create();

		
		return gson.toJson(games).replaceAll("\n", "<br>").replaceAll(" ", "&nbsp;");

	}


	
	
	/**
	 * @param friends
	 * @return
	 */
	public static String friendsToHtml(Friends friends) {

		builder.setPrettyPrinting();
		Gson gson = builder.create();

		
		return gson.toJson(friends).replaceAll("\n", "<br>").replaceAll(" ", "&nbsp;");

	}



}
