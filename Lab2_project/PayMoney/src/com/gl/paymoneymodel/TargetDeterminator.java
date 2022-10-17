package com.gl.paymoneymodel;

import java.util.Arrays;

public class TargetDeterminator {
	private int dailytarget;
	private int[] transactions;
	private boolean outcome;
	public TargetDeterminator(int targetValue, int[] transactions) {
		
		this.dailytarget = targetValue;
		this.transactions = transactions;
		this.outcome=false;
	}
public void determine(int targetValue,int[]transactions){
	int size=transactions.length;
	int tempSum=0;
	int counter=0;
	for(int i=0;i<size;i++) {
		int transactionValue=transactions[i];
		tempSum=tempSum+transactionValue;
		if(tempSum>=targetValue) {
			counter=i+1;
			outcome=true;
			break;
		}
	}
	if(outcome) {
		System.out.println(String.format("Target  %d is achieved after %d transactions--[%s]"
				,targetValue,counter,Arrays.toString(transactions)));
	}
	else {
		System.out.println(String.format("Target  %d can not be achieved--[%s]"
				,targetValue,Arrays.toString(transactions)));
	}
}
}
