package app;

import lib.Calculator;

public class GooCalc extends Calculator{

	
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum+=a[i];
		}
		
		return sum/a.length;
	}

	public static void main(String[] args) {
	      Calculator c = new GooCalc();
		
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(5,2));
		System.out.println(c.average(new int[] {4,5,6,7}));
	}

}
