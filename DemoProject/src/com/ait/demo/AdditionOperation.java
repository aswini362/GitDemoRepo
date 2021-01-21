package com.ait.demo;

public class AdditionOperation {
  public int add(int a,int b) {
	  return a+b;
  }
	public static void main(String[] args) {
	AdditionOperation op=new AdditionOperation();
	System.out.println(op.add(10, 20));
	System.out.println(op.add(23, 45));

	}

}
