package edu.handong.csee.java.lab13.prob1;

public class Prob1 {
	public static void main(String[] args) {
		Friend friend1 = new Friend(); // instantiate Friend
		SchoolFriend friend2 = new SchoolFriend(); // instantiate SchoolFriend
		ClassFriend friend3 = new ClassFriend(); // instantiate ClassFriend

		InstanceOf.WhatFriend(friend1); // call function to know what friend is friend1
		InstanceOf.WhatFriend(friend2); // call function to know what friend is friend2
		InstanceOf.WhatFriend(friend3); // call function to know what friend is friend3
	}

}
