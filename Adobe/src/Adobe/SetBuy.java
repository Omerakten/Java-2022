package Adobe;
import java.util.Scanner;
public class SetBuy {

	public void setBuy(){
		Scanner scan = new Scanner(System.in);
		Buy setbuy =new Buy();
	
		int islem;
		System.out.println("Plan Se�iniz:"); //�uan bir i�levi yok geli�tirilebilir
		System.out.println("1- Ayl�k:132TL");
		System.out.println("2- Y�ll�k:1.584TL");
		islem=scan.nextInt();
		
		System.out.println("1- Sat�n al");
		System.out.println("2- �ptal et");
		islem=scan.nextInt();
		
		
		if(islem==1) {
			System.out.println("Kredi kart� �zerindeki ismi giriniz:");
			setbuy.setCreditCardOwnerName(scan.next());
			System.out.println("Kredi kart� numaras�n� giriniz:");
			setbuy.setCreditCardNumber(scan.next());
			System.out.println("Ge�erlilik tarihini yaz�n�z:");
			setbuy.setCreditCardDate(scan.next());
			System.out.println("G�venlik numaras�n� giriniz:");
			setbuy.setCreditCardSecurityNumber(scan.next());
			
			System.out.println("Kredi Kart� Sahibi:\n"+setbuy.getCreditCardOwnerName());
			System.out.println("Kredi Kart� Numaras�:\n"+setbuy.getCreditCardNumber());
			System.out.println("Kredi Kart� Tarihi:\n"+setbuy.getCreditCardDate());
			System.out.println("Kredi Kart� G�venlik No:\n"+setbuy.getCreditCardSecurityNumber());
			System.out.println("--------------------------------------------------");
			System.out.println("Onayl�yormusunuz?");
			System.out.println("1-Onayl�yorum");
			System.out.println("2-Onaylam�yorum");
			int onay;
			onay=scan.nextInt();
			if(onay==1) {
				System.out.println("�sleminiz onayland�");
				System.out.println("Sipari�iniz olu�turuldu");
			}
			else {
				System.out.println("�sleminiz iptal edildi.");
				System.exit(1);			
			}
			
		}
		else if(islem==2) {
			System.out.println("�ptal edilmi�tir");
			System.exit(1);
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
