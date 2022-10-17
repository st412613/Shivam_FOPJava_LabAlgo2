package com.gl.traveller.model;

public class DenominationCalculator {
	private int[] denominations;
	private int paymentAmount;
	private boolean outcome;

	public DenominationCalculator(int[] denominations, int paymentAmount) {
		this.denominations = denominations;
		this.paymentAmount = paymentAmount;
		this.outcome = false;
	}

	public void denominationCalculator(int[] denominations, int paymentAmount) {
		StringBuilder result = new StringBuilder();
		int temAmount = paymentAmount;
		int size = denominations.length;
		int index = 0;
		for (int i = 0; i < size; i++) {
			index = i;
			int denominationValue = denominations[i];
			int remainder = temAmount % denominationValue;
			int quotient = temAmount / denominationValue;
			if (quotient != 0) {
				result.append(String.format("%d:%d", denominationValue, quotient));
				result.append(System.getProperty("line.separator"));
				temAmount = remainder;
			}
			if (remainder == 0) {
				outcome = true;
				break;
			}
		}
			if (outcome) {
				System.out.println("Your payment approach in order to"
						+ " give min no of notes will be");
				System.out.println(result);
			} else {
				System.out.println("failure");
			}
		}
	}

