package com.quartzinsight.devback.data;

import java.util.ArrayList;
import java.util.List;

public class Games {

	public List<Name> games ;
	
	public Games() {
		games = new ArrayList<Name>();
	}
	
	public void addNewGame(String newGame) {
		games.add(new Name(newGame));
	}
}
