package ders19;

public class ders19 {

	public static void main(String[] args) {
		int number=1;
		int reminder= number % 2;
		//System.out.println(reminder);
		
		boolean isPrime=true;
		
		if(number==1)
		{
			System.out.println("Say� ASAL DE��L");
			return;
			
		}
		if(number<1)
		{
			System.out.println("Ge�ersiz Say�");
			
		}
		
		for(int i=2; i<number; i++) {
			if(number % i== 0) {
			
			isPrime= false;
			}
		}
		if(isPrime) {
			
			System.out.println("Say� Asald�r");
			
		}
		else 
		{
			System.out.println("Say� Asal de�ildir");
			
			
		}
		
		
		
	}

}
