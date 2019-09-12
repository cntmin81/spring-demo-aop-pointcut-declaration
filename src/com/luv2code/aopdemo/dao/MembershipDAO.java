package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addSillyMember() {
		System.out.println(getClass() + ": DO SOME STUFF : ADDING AN ACCOUNT");
		return true;
	}

	public void goToSleep() {
		System.out.println(getClass() + ": go to sleep");
	}
}
