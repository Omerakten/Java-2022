import java.util.Scanner;
public class TestProject {


	/**
	 *
	 * @author Muharrem A�IKG�Z
	 * @author �mer Faruk AKTAN
	 * @author �simsiz Kahramanlar...
	 * 
	 */


	    public static void main(String[] args) {
	        /*
	        begin
	         */

	        Scanner scan = new Scanner(System.in);
	        System.out.println("		---------------------------------------------------");
	        System.out.println("		      NE KADAR HAYATSIZSIN TEST�NE HO�GELD�N! ");
	        System.out.println("		---------------------------------------------------");
	        int skor = 0;
	        //String[][] testSorulari = new String[8][2];
	        String[] sorular = {"		A-Cinsiyetinizi se�iniz",
	            "		B- Ya��n�z� Se�iniz",
	            "		C-Hangisini Daha �ok Seviyorsun?",
	            "		D- K�t� Al��kanl�klar�n Var m�?",
	            "		E- En Sevdi�in �ark� T�r�",
	            "		F- Moralin Bozuk Oldu�unda Ne Yapars�n ?",
	            "		D- Tatilde ne yapmay� tercih edersin ?",
	            "		G- Sevgilin Varm� ?"
	        };
	        int secenekler[] = {2, 4, 4, 3, 3, 3, 3, 3};
	        String[] cevaplar = {"		1-Erkek",
	            "		2-Kad�n",
	            "		1- 18 alt�",
	            "		2- 18-35",
	            "		3- 35-40",
	            "		4- 40+",
	            "		1- Sinemaya Gitmek",
	            "		2- Arkada�larla vakit ge�irmek",
	            "		3- Oyun Oynamak",
	            "		4- Evde Bo� Bo� Oturmak",
	            "		1- Yok",
	            "		2- Sigara",
	            "		3- Alkol",
	            "		1- Pop",
	            "		2- Arabesk",
	            "		3- Metal",
	            "		1- Kafam� da��tmak i�in bi�eyler yapar�m",
	            "		2- A�lar�m",
	            "		3- Efkarl� M�zikler dinlerim ve bolca alkol al�r�m",
	            "		1- Arkada�lar�mla kampa giderim",
	            "		2- Festivale Giderim",
	            "		3- Evde oturup oyun oynar�m",
	            "		1- Var",
	            "		2- Yok",
	            "		3- �stemiyorum"
	        };
	        // Cevaplar� tutmak i�in dizi olu�turduk. 1-SoruId 2-Cevap

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
	        System.out.println("		Toplam puan�n�z: "+toplam);
	        if(toplam>0 && toplam<=40)
            {
	            System.out.println("		---------------------------------------------------");
            	System.out.println("		0-40 aras�: Hayat�n�z gayet G�zel. :)");
                System.out.println("		---------------------------------------------------");
            }
	        if(toplam>40 && toplam<=80)
            {
	            System.out.println("		---------------------------------------------------");
            	System.out.println("		40-80 aras�: �yi durumdas�n ama dikkat et. ");
                System.out.println("		---------------------------------------------------");
            }
	        if(toplam>80 && toplam<=150)
            {
	            System.out.println("		---------------------------------------------------");
	        	System.out.println("		80-150 aras�: Y�k�lmad�m ayaktay�m ");
	            System.out.println("		---------------------------------------------------");
            }	       
	        if(toplam>150 && toplam<=300)
            {
	            System.out.println("		---------------------------------------------------");
	        	System.out.println("		Hayats�z�m ben :( ");
	            System.out.println("		---------------------------------------------------");
            }
	     
	    }
	
	
	
	
	
	
	
	
	
	
	
}
