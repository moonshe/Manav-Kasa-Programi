package test;

import java.util.Scanner;

public class KodluyoruzOdev2 {

	public static void main(String[] args) {
		
			
			double armut= 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, kilo, toplamUcret;

			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Armut ka� kilogram?");
			kilo = input.nextDouble();
			armut*=kilo;
			
			System.out.println("Elma ka� kilogram?");
			kilo = input.nextDouble();
			elma*=kilo;
			
			System.out.println("Domates ka� kilogram?");
			kilo = input.nextDouble();
			domates*=kilo;
			
			System.out.println("Muz ka� kilogram?");
			kilo = input.nextDouble();
			muz*=kilo;
			
			System.out.println("Patl�can ka� kilogram?");
			kilo = input.nextDouble();
			patlican*=kilo;
			
			toplamUcret = elma + armut + domates + muz + patlican;
			System.out.println("�denecek toplam para: " + toplamUcret);


		}

	}
