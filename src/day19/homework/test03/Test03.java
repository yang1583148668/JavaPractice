package day19.homework.test03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class Test03 {
	private static String[] huase = new String[] {"红桃","方片","黑桃","梅花"};
	private static String[] dian = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};
	private static String[] wang = new String[] {"大王","小王"};
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < huase.length; i++) {
			for (int j = 0; j < dian.length; j++) {
				list.add(huase[i]+dian[j]);
			}
		}
		
	 list.add(wang[0]);
	 list.add(wang[1]);
	 showbyitor(list);
	 Random random = new Random();
	 ArrayList<String> one = new ArrayList<String>();
	 
	 for (int i = 0; i <11; i++) {
		one.add(list.remove(list.size()));
	}
	}
	
	
	public static void  showbyitor(Collection c) {
		Iterator iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"\t");
		}
	}
}
