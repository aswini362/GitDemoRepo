package com.ait.test;

import java.util.Date;

public class CurrentDateAndTime {
public Date getSysDate() {
	return new Date();
}
public static void main(String[] args) {
	CurrentDateAndTime u=new CurrentDateAndTime();
	System.out.println(u.getSysDate());
	System.out.println("show current date time::"+u.getSysDate());
}
}
