package org.test;
public class Hello {
public static void main(String[] args) {
	
	int num[]=new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	//num[2]=300;
	System.out.println(num[2]);
	int len=num.length;
	System.out.println(len);
	for(int i=1;i<num.length-1;i++)
		System.out.println(num[i]);
}
}

