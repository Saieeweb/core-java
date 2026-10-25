package OOPS;

public class encapulation7 {

	public static void main(String[] args) {
		movie s=new movie();
		s.setNam("pink");
		s.setP(400);
		System.out.println("name:"+s.getName());
		System.out.println("price:"+s.getprice());

	}
}

class movie{
	private int price=500;
	
	public void setP(int price) {
		if(price>0) {
			System.out.println("price is in bughet");
		}else {
			System.out.println("not in bughet");
		}
		}
	private String name="red";
	public void setNam(String name) {
		if (name.equals("red")) {
			System.out.println("watch movie");
		}else {
			System.out.println("not watching");
		}
	}
	public int getprice() {
		return price;
	}
		
public String getName() {
	return name;
		}
		
	}
	
	
		
        