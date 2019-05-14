import java.util.*;
import java.io.*;

class Hashmap{

	String name;
	int age;

	Hashmap(String name,int age, String subj){
		this.name = name;
		this.age = age;	
	}

	Hashmap<String, Integer> map = new Hashmap<>();

	map.put("Ananya",20);
	map.put("Caroline",22);
	map.put("Sarah",24);


	for(String i: map.keySet()){
		System.out.println("My name is " +  i + " and my age is  " + capitalCities.get(i));
	}




}