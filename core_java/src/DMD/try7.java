package DMD;

public class try7 {

	public static void main(String[] args) {
int arr[]= {10,20,30,40,50};
try {
	System.out.println(arr[10]);
}
catch (ArrayIndexOutOfBoundsException ar) {
	System.out.println("****");
}
System.out.println("ALL DONE");
	}

}
