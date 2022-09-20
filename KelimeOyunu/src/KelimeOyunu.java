import java.util.Scanner;
import java.util.Random;

public class KelimeOyunu {
public static void main(String[] args ) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kelime Oyununa ho�geldiniz ! ");
		System.out.println("----------------------------");
		System.out.println("Zar atmak i�in 1 e bas�n !");

		String[] harfler = { "A", "B", "C", "�", "D", "E", "F", "G", "H", "I", "�", "J", "K", "L", "M", "N", "O", "�",
				"P", "R", "S", "�", "T", "U", "�", "V", "Y", "Z" };

		int harfSayi = 0;
		String cevap;
		int zar = 0;
		
		boolean karar = false;
		while (!karar) {
			try {
				zar = scan.nextInt();
				karar=true;
			}catch (Exception e) {
				
				System.err.println("1 e basman laz�md�.");
				scan.nextLine();
			}
		}

		if (zar == 1) {

			Random r = new Random();
			harfSayi = r.nextInt(harfler.length);

			// System.out.println(harfSayi); // KONTROL AMA�LI BURDA
		}
		String harf = "";
		System.out.println("");
		for (int i = 0; i < harfler.length; i++) {
			if (harfSayi == i) {
				System.out.println("Gelen harf: " + harfler[i]);
				harf = harfler[i];
				System.out.println("");

				System.out.println("---------------------------------------------------");
				System.out.println("Sorular� gelen harf ile ba�layarak cevaplay�n�z!");
			}

		}

		String[] sorular = { "Soru 1: Ad�n ne? ", "Soru 2: Nerelisin? ", "Soru 3: Nerde ya��yosun? ",
				"Soru 4: Ka� ya��ndas�n?", "Soru 5: �al���yomusun ?", "Soru 6: Okuyor musun ?",
				"Soru 7: Ka� Karde�sin var?", "Soru 8: Bo� zamanlar�nda neler yapars�n ?", "Soru 9: Sevgilin var m�? ",
				"Soru 10: Ne t�r m�zikler dinlersin ?"

		};

		int hak = 3;
		
		
		for (int i = 0; i < sorular.length; i++) {
			System.out.println(sorular[i]);
	
			cevap = scan.next();
			cevap = cevap.toUpperCase();

			if (cevap.startsWith(harf)) {
				
			} else {
				hak--;
				System.out.println(hak + " hakk�n�z kald�.");
				if (hak == 0) {
					System.out.println("Cevap hakk�n�z bitti.");
					System.exit(1);
				}
				i--;
			}
			
		}
		
		System.out.println("OYUN B�TT�!");
		

	}
	
	
	
	
}
