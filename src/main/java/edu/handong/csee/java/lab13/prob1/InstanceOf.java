package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	public static void WhatFriend(Friend friend) {
		if(friend instanceof ClassFriend)
			((ClassFriend) friend).classFriend(); // if friend is classFriend, call classFriend()
		else if(friend instanceof SchoolFriend)
			((SchoolFriend) friend).schoolFriend(); // if friend is schoolFriend, call schoolFriend()
		
		else friend.JustFriend();  // if friend is Friend, call just Friend()
	}

}
