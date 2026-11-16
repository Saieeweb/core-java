package mock_practice;

public class single1 {

	public static void main(String[] args) {
		Stud first = new Stud();
		first.setmarks(67);
		System.out.println(first.getmarks());
	}
}
	
		
		class Stud{
			private int marks;
			public void setmarks (int m) {
				if (m>=0 && m<=95) {
					marks = m;
				}
			}
			public int getmarks() {
				return marks;
			}
		}
	


