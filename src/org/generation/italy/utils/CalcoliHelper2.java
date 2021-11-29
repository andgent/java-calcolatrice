package org.generation.italy.utils;

public class CalcoliHelper2{

	
	CalcoliHelper2() {
	}
		
		public static int somma(int x, int y) {
			return x+y;
		}
		public double somma (double x, double y)
		    {
		    return x+y;
		    }
		
		
		public static int differenza (int x, int y) {
			int differenza;
			if(x > y) {
				differenza = x - y;}
			else { 
				differenza = y - x;}
			return differenza;
		} 
		
		public static double differenza (double x, double y) {
			double differenza;
			if(x > y) {
				differenza = x - y;}
			else { 
				differenza = y - x;}
			return differenza;
		} 
		
		public static int multiply (int x, int y) {
			return x * y;
		}
		public static double multiply (double x, double y) {
			return x * y;
		}
		
		public static int modulo (int x) {
			if(x < 0) {
				x = -x;
			}
			return x;
		}
		public static double modulo (double x) {
			if(x < 0) {
				x = -x;
			}
			return x;
		}
		public static int minore(int x, int y){
			int minore = 0;
			if(x < y) {
				minore = x;}
			else if (y < x) {
				minore = y;}
			else {
				System.out.println("Numeri uguali");
			}
			 return minore;
		}
		public static double minore(double x, double y){
			double minore = 0;
			if(x < y) {
				minore = x;}
			else if (y < x) {
				minore = y;}
			else {
				System.out.println("Numeri uguali");
			}
			 return minore;
		}
		public static int maggiore (int x, int y) {
			int maggiore = 0;
			if(x < y) {
				maggiore = y;}
			else if (y < x) {
				maggiore = x;}
			 return maggiore;
		}
		public static double maggiore (double x, double y) {
			double maggiore = 0;
			if(x < y) {
				maggiore = y;}
			else if (y < x) {
				maggiore = x;}
			 return maggiore;
		}
		}

		
		

