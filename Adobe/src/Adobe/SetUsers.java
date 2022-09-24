package Adobe;

import java.util.Scanner;

public class SetUsers {

	public void inUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Durumunuzu seçiniz");
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

			System.out.println("Kullanýcý Adýnýzý Giriniz");
			user1.setUserName(scan.next());
			System.out.println("Parolanýzý giriniz");
			user1.setPassword(scan.next());
			System.out.println("Yaþýnýzý Giriniz");
			user1.setAge(scan.next());
			System.out.println("Tc kimlik numaranýzý giriniz:");
			individualUser.setUserNumber(scan.next());

			System.out.println("-------------------------");
			System.out.println("BÝREYSEL HESABINIZ");
			System.out.println("-------------------------");
			System.out.println("Ýd:" + individualUser.getInId());
			System.out.println("Tc:" + individualUser.getUserNumber());
			System.out.println("Kullanýcý adý:" + user1.getUserName());
			System.out.println("Þifre:" + user1.getPassword());
			System.out.println("Yaþ:" + user1.getAge());
			break;

		case 2:

			System.out.println("Þirket adýnýzý giriniz:");
			corporateuser.setCompanyName(scan.next());
			System.out.println("Þirket Sahibi:");
			corporateuser.setCompanyOwner(scan.next());
			System.out.println("Vergi numaranýzý giriniz: ");
			corporateuser.setTaxNumber(scan.next());
			System.out.println("-------------------------");
			System.out.println("KURUMSAL HESABINIZ");
			System.out.println("-------------------------");
			System.out.println("Þirket id:" + corporateuser.getCoId());
			System.out.println("Þirket adý:" + corporateuser.getCompanyName());
			System.out.println("Þirket Sahibi:" + corporateuser.getCompanyOwner());
			System.out.println("Vergi numarasý:" + corporateuser.getTaxNumber());
			break;

		}

		
		SetPrograms programs= new SetPrograms();
		SetBuy sb = new SetBuy();
		if (islem == 1) {
			System.out.println("-------------------------");
			System.out.println("Bireysel Kullanýcýlar");
			System.out.println("-------------------------");
			System.out.println("Program detayý ve sipariþ için seçim yapýn");
			System.out.println("1- Adobe Photoshop"
					+"\n2- Adobe Ýllustrator"
					+"\n3- Adobe Lightroom"
					+"\n4- Adobe Premier Pro"
					+"\n5- Adobe After Effect"
					+"\n6- Adobe ÝnDesign");
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
			System.out.println("Kurumsal Kullanýcýlar");
			System.out.println("-------------------------");
			programs.AdobeAllApp();
			sb.setBuy();
			
			
		}
		
		
		
		
		
		
		
	}

}
