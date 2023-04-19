package Concurrency;

public class Random {
	
	public static void main(String[] args)

	{

	Random rand = new Random();

	int[] arr = new int[200000000];

	for (int i = 0; i < arr.length; i++) {

	arr[i] = rand.nextInt(10) + 1;

	}

	long start = System.currentTimeMillis();

	System.out.println(Summary.sum(arr));

	System.out.println("Single: " + (System.currentTimeMillis() - start));

	start = System.currentTimeMillis();

	System.out.println(Summary.parallelSum(arr));

	System.out.println("Parallel: " + (System.currentTimeMillis() - start));

	}

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


}
	
	


