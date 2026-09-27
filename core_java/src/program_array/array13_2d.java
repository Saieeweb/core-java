package program_array;

public class array13_2d {

	public static void main(String[] args) {
		 int[][] numbers = {
		            {10, 15, 22},
		            {31, 40, 55},
		            {60, 71, 80}
		        };

		        int counter = 0;
		        int sum = 0;
		      
		

		    for(int i = 0; i < numbers.length; i++) {
		            for(int j = 0; j < numbers[i].length; j++) {

		                if(numbers[i][j] % 2 == 0) {
		                    counter++;
		                    sum = sum + numbers[i][j];
		                }
		            }
		        }

		        System.out.println("Even numbers count = " + counter);
		        System.out.println("Even numbers sum = " + sum);
		    }
		}

		