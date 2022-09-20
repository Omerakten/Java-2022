import java.util.Scanner;
import java.util.Random;

public class KelimeOyunu {
public static void main(String[] args ) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kelime Oyununa hoþgeldiniz ! ");
		System.out.println("----------------------------");
		System.out.println("Zar atmak için 1 e basýn !");

		String[] harfler = { "A", "B", "C", "Ç", "D", "E", "F", "G", "H", "I", "Ý", "J", "K", "L", "M", "N", "O", "Ö",
				"P", "R", "S", "Þ", "T", "U", "Ü", "V", "Y", "Z" };

		int harfSayi = 0;
		String cevap;
		int zar = 0;
		
		boolean karar = false;
		while (!karar) {
			try {
				zar = scan.nextInt();
				karar=true;
			}catch (Exception e) {
				
				System.err.println("1 e basman lazýmdý.");
				scan.nextLine();
			}
		}

		if (zar == 1) {

			Random r = new Random();
			harfSayi = r.nextInt(harfler.length);

			// System.out.println(harfSayi); // KONTROL AMAÇLI BURDA
		}
		String harf = "";
		System.out.println("");
		for (int i = 0; i < harfler.length; i++) {
			if (harfSayi == i) {
				System.out.println("Gelen harf: " + harfler[i]);
				harf = harfler[i];
				System.out.println("");

				System.out.println("---------------------------------------------------");
				System.out.println("Sorularý gelen harf ile baþlayarak cevaplayýnýz!");
			}

		}

		String[] sorular = { "Soru 1: Adýn ne? ", "Soru 2: Nerelisin? ", "Soru 3: Nerde yaþýyosun? ",
				"Soru 4: Kaç yaþýndasýn?", "Soru 5: Çalýþýyomusun ?", "Soru 6: Okuyor musun ?",
				"Soru 7: Kaç Kardeþsin var?", "Soru 8: Boþ zamanlarýnda neler yaparsýn ?", "Soru 9: Sevgilin var mý? ",
				"Soru 10: Ne tür müzikler dinlersin ?"

		};

		int hak = 3;
		
		
		for (int i = 0; i < sorular.length; i++) {
			System.out.println(sorular[i]);
	
			cevap = scan.next();
			cevap = cevap.toUpperCase();

			if (cevap.startsWith(harf)) {
				
			} else {
				hak--;
				System.out.println(hak + " hakkýnýz kaldý.");
				if (hak == 0) {
					System.out.println("Cevap hakkýnýz bitti.");
					System.exit(1);
				}
				i--;
			}
			
		}
		
		System.out.println("OYUN BÝTTÝ!");
		

	}
	
	
	
	
}
