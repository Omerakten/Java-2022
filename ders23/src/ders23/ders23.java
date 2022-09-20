package ders23;

public class ders23 {

	public static void main(String[] args) {
		
		int [] sayilar= new int[] {1,2,5,7,9,0};
		
		int aranacak=6;
		boolean kontrol=false;
		for (int sayi: sayilar ) {
			
			if(sayi==aranacak) {
				
				kontrol=true;
				break;
				
			}
						
		}
		if (kontrol) {
			System.out.println("Sayý mevcuttur");
		}
		else {
			System.out.println("Sayý mevcut deðildir");
		}

	}

}
