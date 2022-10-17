package com.gl.traveller.calculator;

import java.util.Scanner;

import com.gl.traveller.model.DenominationCalculator;
import com.gl.traveller.model.Sort;
//driver class
public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of currency denominations");
			int size;
			size = sc.nextInt();
			System.out.println("enter the currency denominations value\r\n"
					+ "");
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
			}
			System.out.println("enter the amount you want to pay");
			int paymentAmount = sc.nextInt();
			Sort sort=new Sort();
			sort.sort(size, array);
			DenominationCalculator dc = new DenominationCalculator(array, paymentAmount);
			
			dc.denominationCalculator(array, paymentAmount);

		}
	
	

	}


