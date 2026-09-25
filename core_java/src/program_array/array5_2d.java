package program_array;

public class array5_2d {

	public static void main(String[] args) {
int arr[][]= {{67,98,90},
{78,66,55},
{45,33,42}
	};
int lowest=arr[0][0];

for (int i=0; i<3; i++) {
	for(int j=0; j<3; j++){
	{
	if (arr[i][j]< lowest) 
		lowest= arr[i][j];
	}
	}
	}
System.out.println(lowest);
	}

}
