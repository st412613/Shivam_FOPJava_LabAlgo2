package com.gl.paymoneyoperation;

import java.util.Scanner;

import com.gl.paymoneymodel.TargetDeterminator;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int[]array;
        int size;
        size=sc.nextInt();
        array=new int[size];
        System.out.println("enter the values of array");
        for(int i=0;i<size;i++) {
        	array[i]=sc.nextInt();
        }
        System.out.println("enter the total no of targets that needs to be achieved");

        int Target=sc.nextInt();
        while(Target--!=0) {
        System.out.println("enter the value of target");
        int targetValue=sc.nextInt();
        TargetDeterminator target=new TargetDeterminator(targetValue, array);
        target.determine(targetValue, array);
	}

}
}