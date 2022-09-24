package Adobe;
import java.util.Scanner;
public class SetBuy {

	public void setBuy(){
		Scanner scan = new Scanner(System.in);
		Buy setbuy =new Buy();
	
		int islem;
		System.out.println("Plan Seçiniz:"); //Þuan bir iþlevi yok geliþtirilebilir
		System.out.println("1- Aylýk:132TL");
		System.out.println("2- Yýllýk:1.584TL");
		islem=scan.nextInt();
		
		System.out.println("1- Satýn al");
		System.out.println("2- Ýptal et");
		islem=scan.nextInt();
		
		
		if(islem==1) {
			System.out.println("Kredi kartý üzerindeki ismi giriniz:");
			setbuy.setCreditCardOwnerName(scan.next());
			System.out.println("Kredi kartý numarasýný giriniz:");
			setbuy.setCreditCardNumber(scan.next());
			System.out.println("Geçerlilik tarihini yazýnýz:");
			setbuy.setCreditCardDate(scan.next());
			System.out.println("Güvenlik numarasýný giriniz:");
			setbuy.setCreditCardSecurityNumber(scan.next());
			
			System.out.println("Kredi Kartý Sahibi:\n"+setbuy.getCreditCardOwnerName());
			System.out.println("Kredi Kartý Numarasý:\n"+setbuy.getCreditCardNumber());
			System.out.println("Kredi Kartý Tarihi:\n"+setbuy.getCreditCardDate());
			System.out.println("Kredi Kartý Güvenlik No:\n"+setbuy.getCreditCardSecurityNumber());
			System.out.println("--------------------------------------------------");
			System.out.println("Onaylýyormusunuz?");
			System.out.println("1-Onaylýyorum");
			System.out.println("2-Onaylamýyorum");
			int onay;
			onay=scan.nextInt();
			if(onay==1) {
				System.out.println("Ýsleminiz onaylandý");
				System.out.println("Sipariþiniz oluþturuldu");
			}
			else {
				System.out.println("Ýsleminiz iptal edildi.");
				System.exit(1);			
			}
			
		}
		else if(islem==2) {
			System.out.println("Ýptal edilmiþtir");
			System.exit(1);
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
