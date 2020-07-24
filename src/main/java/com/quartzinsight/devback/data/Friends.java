package com.quartzinsight.devback.data;

import java.util.ArrayList;
import java.util.List;

public class Friends {

	public List<Name> friends ;
	
	public Friends() {
		friends = new ArrayList<Name>() ;
	}
	public void addNewFriend(String newFriend) {
		friends.add(new Name(newFriend));
	}
}
