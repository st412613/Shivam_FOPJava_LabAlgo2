package com.gl.traveller.model;

public class Sort {
	public void sort(int size, int[] denomination) {
		int temp;
		// bubble sort
		for (int i = 0; i < size; i++) {

			for (int j = 1; j < size - i; j++) {

				if (denomination[j] > denomination[j - 1]) {
					temp = denomination[j - 1];
					denomination[j - 1] = denomination[j];
					denomination[j] = temp;

				}
			}
		}
	}
}


	