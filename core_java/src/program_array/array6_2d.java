package program_array;

public class array6_2d {

	public static void main(String[] args) {
int arr[][]={ {888,543,908,768},
{784,907,890,342},
{544,886,932,213}
};
int highest=arr [0][0];
for (int i=0; i>3; i++) {
for (int j=0; j>4; j++) {
	{
		if (arr[i][j]< highest)
			highest= arr[i][j];	}
}
	}
System.out.println(highest);
	}

}
