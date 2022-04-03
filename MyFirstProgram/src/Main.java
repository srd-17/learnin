import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.util.Random;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
//basic input and output and operations same as c++
//		double x;
//		double y;
//		double z;
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the values of x and y :");
//		x=scanner.nextDouble();
//		y=scanner.nextDouble();
//		z=Math.sqrt(x*x+y*y);
//		System.out.println("Hypo is:"+z);
//		scanner.close();
		
		
//Generating Random Numbers
//		Random random=new Random();
//		int x=random.nextInt(6)+1;
//		double y=random.nextDouble();
//		boolean z=random.nextBoolean();
//		System.out.println(x);
		
//Conditional Statement in java
//		int z;
//		z=scanner.nextInt();
//		if(z>50)
//			System.out.println("Enjoy your life...!!");
//		else if(z>18)
//			System.out.println("Work Hard boy!!!...");
//		else
//			System.out.println("Go to School KId...!!");

//Switch Case Conditional
//		String Day="Wed";
//		switch(Day){
//			case("Mon"):System.out.println("Monday it is");
//			break;
//			case("Tue"):System.out.println("Tueday it is");
//			break;
//			case("Wed"):System.out.println("Wednesday it is");
//			break;
//			default:System.out.println("Weekend it is");
//		}
		
//Logical Operators in JAVA
//		&&-and
//		||-or
//		!-not
		
		
// Arrays in JAVA
//		String[] cars= {"porche","JLR","TATA"};
//		int[] arr=new int[n][m];
//		System.out.println(cars[0]);
//		String[] cars=new String[10];
		
//String Methods
//		String str="SRD";
//		Char z=str.charAt(2);
//		boolean z=str.equalsIgnoreCase("srd");
//		String z=str.toLowerCase();
//		String z=str.toUpperCase();
//		int z=str.indexOf('S');
//		System.out.println(z);
//		and many more replace(,),trim(),isEmpty();
		
//wrapper class
//		wrapper class = provides a way to use primitive data types as reference datatypes
//		reference data types contain useful methods
//		can be used with collections(ArrayList)
//       autoboxing = the automatic conversion that the java compiler makes between the 
//		primitive types and their corresponding object wrapper class
//      unboxing = reverse of autoboxing
		
//ArrayList
//	Arraylist = a resizable array /same as vector in c++	
//		store reference datatypes
//		ArrayList<String> sub=new ArrayList<String>();
//		sub.add("CN");
//		sub.add("ITC");
//		sub.add("DC");
//		for(int i=0;i<sub.size();i++)
//			System.out.println(sub.get(i));
//	    sub.set(1,"FPE");
//		sub.remove(0);
//		sub.clear();
//		for(int i=0;i<sub.size();i++)
//			System.out.println(sub.get(i));
		
//2D array list
//		ArrayList<String> backeryList = new ArrayList<String>();
//		 backeryList.add("egg");
//		 backeryList.add("milk");
//		 backeryList.add("banana");
//		 ArrayList<String> groceryList = new ArrayList<String>();
//		 groceryList.add("sugar");
//		 ArrayList<ArrayList<String>> List=new ArrayList<ArrayList<String>>();
//		 List.add(backeryList);
//		 List.add(groceryList);
//		 System.out.println(List);
//	}

//For-each Loop
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		for(int i=10;i>0;i--)
//		    arr.add(i);
//		for(int x:arr)
//			System.out.println(x);
	
	
	
//method==function in C++
//		hello("srd");
//		hello("srd");
//	System.out.println(sum(1000,1000));

//Overloaded Methods==methods with same name but different arguments
//		System.out.println(add(2,3,4));
//		System.out.println(add(2,3,4,5));
//		System.out.println(add(2,3,4,5,6));
		
//printf()==same as C printf
//		%[flags][precision][width][conversion-character]
//		System.out.printf("hey!!! r u there",22);
//		String str="Sharad";
//		int age=20;
//		char name='S';
//		boolean stud=true;
//		double balance=13412.50648347493;
//		System.out.printf("%c",name);
//		System.out.printf("%d",age);
//		System.out.printf("%s",str);
//		System.out.printf("%f",balance);
//		System.out.printf("%b",stud);

//[width]
//		minimum number of characters to be written as output
//		System.out.printf("Hey!...%-20s",str);
//		//- for width in right 
//		System.out.printf("Hey!...%20s",str);
//		//+ for right

//[precesion]
//		sets number of digitsw for precesion for floating point numbers
//		System.out.printf("%.3f",balance);
		
//[flags]
//		adds an effect to output based on the flag add to format specifier
//		- : left justify
//		+ : output a plus(+) or minus(-) sign for numeric value
//		0 : numeric values are zero padded
//		, : comma gruping separator if num is >1000
	
//final keyword==const in c++
//		final double PI=3.14159;
	
//		OOPS
//		object = an instance of a class that may contain attributes and methods
//      example:(phone,desk,computer)
		
		
//toString() = special method that all objects inherit,
//				that returns a string that "textually reprents"/address of an object
//				can be used both implicitly and explicitly
//		Car myCar=new Car();
//		System.out.println(myCar.toString());
//		System.out.println(myCar);
	
//static = modifier A single copy of a variable/method is created and shared
//          the class owns the static member
	 	
//Inheritence 
	
//Access Modifiers

//Abstraction
		
//Encapsulation  
//		attributes of class will be hidden or private,
//		can be accessed only through methods(getters,setters)
//		good practice to make attributes private unless its neede to make them public/protected
		
//interface
//		a template that can be applied to a class
//		similar to inherotence , but specifies what a class has/must do,
//		classes can apply more than one interfacde,inheritence is limited to 1 superclass
//		Rabbit rabbit=new Rabbit();
//		rabbit.flee();
//		Hawk hawk = new Hawk();
//		hawk.hunt();
//		Fish fish = new Fish();
//		fish.flee();
//		fish.hunt();
		 
//	Polymorphism
//		greek word for poly-"many",morph-"form"
//		ability of an object to identify as more than one type
		
//Exception Handling
//		try {
//			
//		}
//		catch(Exception e) {
//			
//		}
		
//file
//		An abstract representation of a file and directory pathnames
//		File file=new File("test.txt");
//		System.out.println(file.isFile());
//		System.out.println(file.getPath());
//		if(file.exists()){
//			System.out.println("Yehhh!:0");
//		}else {
//			System.out.println("Nahh!!;)");
//		} 
//		try {
//			    FileWriter writer = new FileWriter("test.txt");
//				writer.write("Roses are red \nViolets are blue \nlets Rock!!");
//			}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		try {
//			FileWriter writer = new FileWriter("test.txt");
//			writer.write("Roses are red\nViolets are Blue\n---By SRD");
//			writer.append("\nwhats app!!--");
//			writer.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			FileReader reader= new FileReader("test.txt");
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		File file=new File("test.wav");
		try {
			AudioInputStream audiostream=AudioSystem.getAudioInputStream(file);
		} catch (UnsupportedAudioFileException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	//method==function in C++
//	static void hello(String name) {
//		System.out.println("Hey.....!"+name);
//	}
//	static int sum(int a,int b) {
//		return a+b;
//	}
	
//Overloaded Methods==methods with same name but different arguments
//    static int add(int a,int b,int c) {
//    	return a+b+c;
//    }
//    static int add(int a,int b,int c,int d) {
//    	return a+b+c+d;
//    }
//    static int add(int a,int b,int c,int d,int e) {
//    	return a+b+c+d+e;
//    }
}
