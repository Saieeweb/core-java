package OOPS;

public class capulation3 {

	public static void main(String[] args) {
		phone first = new phone();
		first.setpass(67889);
		System.out.println(first.getpass());

	}

}
class phone{
	private int pass=567;
	public void setpass(int p) {
		if (pass==p) {
			System.out.println("open phone");
				
			
		}else {
			System.out.println("not open");
		}
	}
	public int getpass() {
		return this. pass;
	}
}
