package program_array;

public class array8_2d {

	public static void main(String[] args) {
		int[] numbers = {1078, 158, 2276, 310, 640, 855};

        int counter = 0;
        int sum= 0;

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 == 0) {
                counter++;
                sum=sum+numbers[i];
            }
        }

        System.out.println("Even numbers = " + counter);
        System.out.println("sum of numbers="+ sum);
    
	}

}
