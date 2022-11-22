package com.pack1;

public class Autounboxing
{
void meth1()
{
 
 System.out.println("Implenting Auto-Unboxing");
 Integer ival1=new Integer(100);
 int x=ival1.intValue();
 
 System.out.println("Integer WCO value:"+ival1);
 System.out.println("int PDT value:"+x);
 System.out.println("------------------------");
 
 Character cval1=new Character('A');
 char c=cval1.charValue();
 System.out.println("Character WCO value:"+cval1);
 System.out.println("char PDT value:"+c);
 System.out.println("------------------");
 
 Boolean bval1=new Boolean("TRuE");
 boolean flag=bval1.booleanValue();
 System.out.println("Boolean WCO value:"+bval1);
 System.out.println("boolean PDT value:"+flag);
}
public static void main(String[] args) 
{
	Autounboxing aobj=new Autounboxing();
	aobj.meth1();
}
}



