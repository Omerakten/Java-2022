package ders19;

public class ders19 {

	public static void main(String[] args) {
		int number=1;
		int reminder= number % 2;
		//System.out.println(reminder);
		
		boolean isPrime=true;
		
		if(number==1)
		{
			System.out.println("Sayı ASAL DEĞİL");
			return;
			
		}
		if(number<1)
		{
			System.out.println("Geçersiz Sayı");
			
		}
		
		for(int i=2; i<number; i++) {
			if(number % i== 0) {
			
			isPrime= false;
			}
		}
		if(isPrime) {
			
			System.out.println("Sayı Asaldır");
			
		}
		else 
		{
			System.out.println("Sayı Asal değildir");
			
			
		}
		
		
		
	}

}
