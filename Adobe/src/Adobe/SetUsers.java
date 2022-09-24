package Adobe;

import java.util.Scanner;

public class SetUsers {

	public void inUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Durumunuzu se�iniz");
		System.out.println("1- Bireysel \n2- Kurumsal");

		IndividualUsers individualUser = new IndividualUsers();
		individualUser.setInId("31233123");
		CorporateUsers corporateuser = new CorporateUsers();
		corporateuser.setCoId("312545142");
		User user1 = new User();
		int islem;
		islem = scan.nextInt();

		switch (islem) {

		case 1:

			System.out.println("Kullan�c� Ad�n�z� Giriniz");
			user1.setUserName(scan.next());
			System.out.println("Parolan�z� giriniz");
			user1.setPassword(scan.next());
			System.out.println("Ya��n�z� Giriniz");
			user1.setAge(scan.next());
			System.out.println("Tc kimlik numaran�z� giriniz:");
			individualUser.setUserNumber(scan.next());

			System.out.println("-------------------------");
			System.out.println("B�REYSEL HESABINIZ");
			System.out.println("-------------------------");
			System.out.println("�d:" + individualUser.getInId());
			System.out.println("Tc:" + individualUser.getUserNumber());
			System.out.println("Kullan�c� ad�:" + user1.getUserName());
			System.out.println("�ifre:" + user1.getPassword());
			System.out.println("Ya�:" + user1.getAge());
			break;

		case 2:

			System.out.println("�irket ad�n�z� giriniz:");
			corporateuser.setCompanyName(scan.next());
			System.out.println("�irket Sahibi:");
			corporateuser.setCompanyOwner(scan.next());
			System.out.println("Vergi numaran�z� giriniz: ");
			corporateuser.setTaxNumber(scan.next());
			System.out.println("-------------------------");
			System.out.println("KURUMSAL HESABINIZ");
			System.out.println("-------------------------");
			System.out.println("�irket id:" + corporateuser.getCoId());
			System.out.println("�irket ad�:" + corporateuser.getCompanyName());
			System.out.println("�irket Sahibi:" + corporateuser.getCompanyOwner());
			System.out.println("Vergi numaras�:" + corporateuser.getTaxNumber());
			break;

		}

		
		SetPrograms programs= new SetPrograms();
		SetBuy sb = new SetBuy();
		if (islem == 1) {
			System.out.println("-------------------------");
			System.out.println("Bireysel Kullan�c�lar");
			System.out.println("-------------------------");
			System.out.println("Program detay� ve sipari� i�in se�im yap�n");
			System.out.println("1- Adobe Photoshop"
					+"\n2- Adobe �llustrator"
					+"\n3- Adobe Lightroom"
					+"\n4- Adobe Premier Pro"
					+"\n5- Adobe After Effect"
					+"\n6- Adobe �nDesign");
			islem=scan.nextInt();
			
			switch(islem) {
			case 1: 
				programs.adobPs();
				sb.setBuy();
				break;
			case 2:
				programs.adobAi();
				sb.setBuy();
				break;
			case 3:
				programs.adobLr();
				sb.setBuy();
				break;
			case 4:
				programs.adobPr();
				sb.setBuy();
				break;
			case 5:
				programs.adobAe();
				sb.setBuy();
				break;
			case 6:
				programs.adobIn();
				sb.setBuy();
				break;
			}
			
		} 
		else if (islem == 2) {
			System.out.println("-------------------------");
			System.out.println("Kurumsal Kullan�c�lar");
			System.out.println("-------------------------");
			programs.AdobeAllApp();
			sb.setBuy();
			
			
		}
		
		
		
		
		
		
		
	}

}
