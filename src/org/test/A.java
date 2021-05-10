package org.test;

public class A extends B{
	public A() {
		//this("JAVA");
		super(14);
		System.out.println("Default const...");
		}
//		 public A(int id) {
//		//this(3456.5678f);
//		System.out.println(id);
//		}
//		public A(String name) {
//		this(12);
//		System.out.println(name);
//
//		}
//		public A(float sal) {
//			this(40000);
//		System.out.println(sal);
//		}
		public static void main(String[] args) {
		A a = new A();
}}
