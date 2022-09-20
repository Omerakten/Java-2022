import java.util.Scanner;
public class TestProject {


	/**
	 *
	 * @author Muharrem AÇIKGÖZ
	 * @author Ömer Faruk AKTAN
	 * @author Ýsimsiz Kahramanlar...
	 * 
	 */


	    public static void main(String[] args) {
	        /*
	        begin
	         */

	        Scanner scan = new Scanner(System.in);
	        System.out.println("		---------------------------------------------------");
	        System.out.println("		      NE KADAR HAYATSIZSIN TESTÝNE HOÞGELDÝN! ");
	        System.out.println("		---------------------------------------------------");
	        int skor = 0;
	        //String[][] testSorulari = new String[8][2];
	        String[] sorular = {"		A-Cinsiyetinizi seçiniz",
	            "		B- Yaþýnýzý Seçiniz",
	            "		C-Hangisini Daha Çok Seviyorsun?",
	            "		D- Kötü Alýþkanlýklarýn Var mý?",
	            "		E- En Sevdiðin Þarký Türü",
	            "		F- Moralin Bozuk Olduðunda Ne Yaparsýn ?",
	            "		D- Tatilde ne yapmayý tercih edersin ?",
	            "		G- Sevgilin Varmý ?"
	        };
	        int secenekler[] = {2, 4, 4, 3, 3, 3, 3, 3};
	        String[] cevaplar = {"		1-Erkek",
	            "		2-Kadýn",
	            "		1- 18 altý",
	            "		2- 18-35",
	            "		3- 35-40",
	            "		4- 40+",
	            "		1- Sinemaya Gitmek",
	            "		2- Arkadaþlarla vakit geçirmek",
	            "		3- Oyun Oynamak",
	            "		4- Evde Boþ Boþ Oturmak",
	            "		1- Yok",
	            "		2- Sigara",
	            "		3- Alkol",
	            "		1- Pop",
	            "		2- Arabesk",
	            "		3- Metal",
	            "		1- Kafamý daðýtmak için biþeyler yaparým",
	            "		2- Aðlarým",
	            "		3- Efkarlý Müzikler dinlerim ve bolca alkol alýrým",
	            "		1- Arkadaþlarýmla kampa giderim",
	            "		2- Festivale Giderim",
	            "		3- Evde oturup oyun oynarým",
	            "		1- Var",
	            "		2- Yok",
	            "		3- Ýstemiyorum"
	        };
	        // Cevaplarý tutmak için dizi oluþturduk. 1-SoruId 2-Cevap

	        int[] testCevaplar = new int[8];
	        int toplam=0;	
	        int secim = 0;
	        int sayac = 0;
	        for (int i = 0; i < 8; i++) {
	            System.out.println(sorular[i]);
	            for (int j = 0; j < secenekler[i]; j++) {
	            	  System.out.println("");
	  	            System.out.println("		---------------------------------------------------");
	                System.out.print(cevaplar[sayac] + "  ");
	                sayac++;
	            }
	            System.out.println("");
	            System.out.println("		---------------------------------------------------");
	            do {
	                secim = scan.nextInt();
	                
	                if(secim==1)
	                {
	                	toplam+=5;
	                }
	                else if(secim==2)
	                {
	                	toplam+=10;
	                }
	                else if(secim==3)
	                {
	                	toplam+=20;
	                }
	                else if(secim==4)
	                {
	                	toplam+=30;
	                }
	            } 
	            while ((secim < 1) | (secim > secenekler[i]));
	            
	            testCevaplar[i] = secim;
	        }

	       /* for (int i : testCevaplar) {
	            System.out.println(i);
	        }*/
	        System.out.println("		Toplam puanýnýz: "+toplam);
	        if(toplam>0 && toplam<=40)
            {
	            System.out.println("		---------------------------------------------------");
            	System.out.println("		0-40 arasý: Hayatýnýz gayet Güzel. :)");
                System.out.println("		---------------------------------------------------");
            }
	        if(toplam>40 && toplam<=80)
            {
	            System.out.println("		---------------------------------------------------");
            	System.out.println("		40-80 arasý: Ýyi durumdasýn ama dikkat et. ");
                System.out.println("		---------------------------------------------------");
            }
	        if(toplam>80 && toplam<=150)
            {
	            System.out.println("		---------------------------------------------------");
	        	System.out.println("		80-150 arasý: Yýkýlmadým ayaktayým ");
	            System.out.println("		---------------------------------------------------");
            }	       
	        if(toplam>150 && toplam<=300)
            {
	            System.out.println("		---------------------------------------------------");
	        	System.out.println("		Hayatsýzým ben :( ");
	            System.out.println("		---------------------------------------------------");
            }
	     
	    }
	
	
	
	
	
	
	
	
	
	
	
}
