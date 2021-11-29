package org.generation.italy.utils;

public class CalcoliHelper{
	
	static int somma;
	static double dSomma;
	static int differenza;
	static double dDifferenza;
	static int multiply;
	static double dMultiply;
	static int modulo;
	static double dModulo;
	static int minore;
	static double dMinore;
	static int maggiore;
	static double dMaggiore;
	static int potenza;
	static int x;
	static int y;
	static double z;
	static double k;

	
	private CalcoliHelper() {
			
		}
		
		public static double dSomma(double z, double k) {
			dSomma = z + k;
			return dSomma;
		}
		
		public static double dDifferenza(double z, double k) {
			if(z > k) {
				dDifferenza = k - z;}
			else { 
				dDifferenza = z - k;}
			return dDifferenza;
		} 
		public static double dMultiply (double z, double k) {
			dMultiply = z * k;
			return dMultiply;
		}
		public static double dModulo (double z) {
			if(z < 0) {
				z = -z;
			}
			return dModulo;
		}
		public static double dMinore(double z, double k){
			if(k < z) {
				dMinore = k;}
			else if (z < k) {
				dMinore = z;}
			 return minore;
		}
		public static double dMaggiore (double z, double k) {
			if(z < k) {
				dMaggiore = k;}
			else if (y < x) {
				dMaggiore = z;}
			 return dMaggiore;
		}
		
		public static int somma(int x, int y) {
			somma = x + y;
			return somma;
		}
		
		public static int differenza(int x, int y) {
			if(x > y) {
				differenza = x - y;}
			else { 
				differenza = y - x;}
			return differenza;
		} 
		public static int multiply (int x, int y) {
			multiply = x * y;
			return multiply;
		}
		public static int modulo (int x) {
			if(x < 0) {
				x = -x;
			}
			return modulo;
		}
		public static int minore(int x, int y){
			if(x < y) {
				minore = x;}
			else if (y < x) {
				minore = y;}
			 return minore;
		}
		public static int maggiore (int x, int y) {
			if(x < y) {
				maggiore = y;}
			else if (y < x) {
				maggiore = x;}
			 return maggiore;
		}
		}
	
		
		

