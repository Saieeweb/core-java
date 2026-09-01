package pratice;

public class Loop5 {

	public static void main(String[] args) {
int num=1;
int counter=0;

   while (num<=100)
   {
	   if (num%3==0 || num%5==0 || num%7==0)
   
   {
		   counter++;
   System.out.println(num);
	}

   num++;
   }
   System.out.println("THE COUNT VALUE");
System.out.println(counter);

}
}