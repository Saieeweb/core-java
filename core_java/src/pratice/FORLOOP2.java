package pratice;

public class FORLOOP2 {

	public static void main(String[] args) {
int num=467;
boolean flag=false;
       for(int i=2;i<=455;i++)
       {
    	   if(num%i==0) 
    	   {
    		   flag=true;
    	   }
       }
       if(!flag)
       {
    	   System.out.println("PRIME");
       }
       else {
    	   System.out.println("COMPOSITE");   
	}
	}

}
