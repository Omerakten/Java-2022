package Adobe;

public class SetPrograms{
	public void AdobeAllApp(){
		
		AdobeAllPrograms adobal =new AdobeAllPrograms();
		adobal.setProgramName_al("T�m Programlar");
		adobal.setDescription_al("------------------------------------------------------------\n"+
				 "��letmeniz veya departman�n�z i�in Adobe Photoshop,Illustrator,"
				+"\nInDesign, Premiere Pro ve Acrobat Pro gibi uygulamalar�"
				+"\nsat�n alarak bir y�netim konsoluna eri�in ve t�m cihazlar"
				+"\n �zerindeki varl�klar�n�z� an�nda e�itleyin."
				+"\n------------------------------------------------------------");
		adobal.setMonthPrice_al("Ayl�k:425TL");
		adobal.setYearPrice_al("Y�ll�k:5.100TL");
		adobal.setContents_al(
				"------------------------------------------------------------\n"
				+ "Ekipler ��in Creative Cloud'daki i� �zellikleri:\r\n"	
				+ "\r\n"
				+ "Merkezi y�netim ara�lar�:\r\n"
				+ "Web tabanl� ve kullan�m� kolay Admin Console ile\r\n"
				+ "uygulamalar� da��t�n, �r�nleri ve kullan�c�lar� y�netin.\r\n"
				+ "\r\n"
				+ "Teknik destek:\r\n"
				+ "Yarat�c� ekibinizin ilerlemesine yard�mc� olmak i�in 7/24\r\n"
				+ "geli�mi� teknik destekten ve kullan�c� ba��na y�lda iki kez\r\n"
				+ "Bire Bir Uzman Oturumu'ndan yararlan�n.\r\n"
				+ "\r\n"
				+ "Creative Cloud K�t�phaneleri:\r\n"
				+ "Ekibiniz, uygulamalar ile cihazlar aras�nda yarat�c�\r\n"
				+ "varl�klar� payla�abilir ve varl�klar� e�itleyebilir.\r\n"
				+ "\r\n"
				+ "Adobe Talent'ta s�n�rs�z i� ilan� yay�nlama:\r\n"
				+ "G�nderileriniz Behance'te milyonlarca yarat�c�\r\n"
				+ "profesyonele ula��r.\r\n"
				+ "\r\n"
				+ "Pop�ler uygulamalarla entegrasyon:\r\n"
				+ "Ekibinizin g�nl�k olarak kulland��� Slack, Microsoft Teams\r\n"
				+ "ve di�er �retkenlik uygulamalar� ile birlikte �al���r.\r\n"
				+ "\r\n"
				+ "Depolama:\r\n"
				+ "Kullan�c� ba��na 1 TB bulut depolama alan�.\r\n"	
				+"\n------------------------------------------------------------");
		
		
		
		System.out.println(adobal.getProgramName_al());
		System.out.println(adobal.getDescription_al());
		System.out.println(adobal.getMonthPrice_al());
		System.out.println(adobal.getYearPrice_al());
		System.out.println(adobal.getContents_al());
		
		
	}
	
	public void adobPs()// bu alan i�i her�eyi �al��t�r�yor
	{
		AdobePhotoshop adobps = new AdobePhotoshop();
		adobps.setProgramName_ps("Photoshop");
		adobps.setDescription_ps("------------------------------------------------------------\n"+
				"D�nyan�n en iyi g�r�nt�leme ve grafik tasar�m yaz�l�m�,"
				+"\nfoto�raf d�zenleme ve birle�tirmeden dijital boyamaya,"
				+"\nanimasyondan grafik tasar�ma kadar her t�rl� yarat�c� "
				+"\nprojenin merkezinde yer al�yor. Photoshop, Masa�st� ve iPad'de"
				+ "\nfikirlere hayat veriyor."
				+"\n------------------------------------------------------------");
		adobps.setMonthPrice_ps("Ayl�k:132TL");
		adobps.setYearPrice_ps("Y�ll�k:1.584TL");
		adobps.setContents_ps("------------------------------------------------------------\n"
				+ "�unlar i�in �nerilir:\r\n"				
				+ "Foto�raf d�zenleme\r\n"
				+ "Kompozit olu�turma\r\n"
				+ "�izim ve boyama\r\n"
				+ "Grafik tasar�m"
				+"\n------------------------------------------------------------");
		adobps.setExtras_ps("Ekstralar:\r\n"
				+ "100 GB bulut depolama alan�\r\n"
				+ "Ad�m ad�m e�itimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son �zelliklere eri�im"
				+"\n------------------------------------------------------------");
		
		
		System.out.println(adobps.getProgramName_ps());
		System.out.println(adobps.getDescription_ps());
		System.out.println(adobps.getMonthPrice_ps());
		System.out.println(adobps.getYearPrice_ps());
		System.out.println(adobps.getContents_ps());
		System.out.println(adobps.getExtras_ps());
	}
	public void adobAi(){
		AdobeIllustrator adobai = new AdobeIllustrator();
		adobai.setProgramName_ai("�llustrator");
		adobai.setDescription_ai("------------------------------------------------------------\n"+
				"Sekt�rde bir standart haline gelmi� vekt�r grafi�i"
				+"\nuygulamas�;bask�, web, video ve mobil i�in logo, simge, �izim,"
				+"\ntipografi ve ill�strasyonlar olu�turman�za olanak sa�lar."
				+"\nMasa�st� veya iPad'de vizyonunuzu hayata ge�irin."
				+"\n------------------------------------------------------------");
		adobai.setMonthPrice_ai("Ayl�k:132TL");
		adobai.setYearPrice_ai("Y�ll�k:1.584TL");
		adobai.setContents_ai("------------------------------------------------------------\n"+
				"�unlar i�in �nerilir:\r\n"
				+ "�ll�strasyon\r\n"
				+ "�izim ve boyama\r\n"
				+ "Tipografi\r\n"
				+ "Grafik tasar�m"
				+"\n------------------------------------------------------------");
		adobai.setExtras_ai("Ekstralar:\r\n"
				+ "100 GB bulut depolama alan�\r\n"
				+ "Ad�m ad�m e�itimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son �zelliklere eri�im"
				+"\n------------------------------------------------------------");
		
		
		System.out.println(adobai.getProgramName_ai());
		System.out.println(adobai.getDescription_ai());
		System.out.println(adobai.getMonthPrice_ai());
		System.out.println(adobai.getYearPrice_ai());
		System.out.println(adobai.getContents_ai());
		System.out.println(adobai.getExtras_ai());
	}
	public void adobLr(){
		AdobeLightroom adoblr = new AdobeLightroom();
		adoblr.setProgramName_lr("Lightroom");
		adoblr.setDescription_lr("------------------------------------------------------------\n"+
				"Foto�raf tutkunlar�na y�nelik bulut tabanl� bir"
				+"\nhizmet olan Lightroom, foto�raflar�n�z� masa�st�, mobil ve"
				+"\nweb'de d�zenlemek, organize etmek, saklamak ve payla�mak i�in"
				+"\nihtiyac�n�z olan her �eyi sunar."
				+"\n------------------------------------------------------------");
		adoblr.setMonthPrice_lr("Ayl�k:132TL");
		adoblr.setYearPrice_lr("Y�ll�k:1.584TL");
		adoblr.setContents_lr("------------------------------------------------------------\n"+
				"�unlar i�in �nerilir:\r\n"
				+ "Foto�raf y�netimi\r\n"
				+ "Foto�raf d�zenleme"
				+"\n------------------------------------------------------------");
		adoblr.setExtras_lr("Ekstralar:\r\n"
				+ "100 GB bulut depolama alan�\r\n"
				+ "Ad�m ad�m e�itimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son �zelliklere eri�im"
				+"\n------------------------------------------------------------");
		
		
		System.out.println(adoblr.getProgramName_lr());
		System.out.println(adoblr.getDescription_lr());
		System.out.println(adoblr.getMonthPrice_lr());
		System.out.println(adoblr.getYearPrice_lr());
		System.out.println(adoblr.getContents_lr());
		System.out.println(adoblr.getExtras_lr());
	}
	public void adobPr(){
		AdobePemierpro adobpr = new AdobePemierpro();
		adobpr.setProgramName_pr("PremierPro");
		adobpr.setDescription_pr("------------------------------------------------------------\n"+
				"Film, TV ve web i�in �nde gelen video d�zenleme yaz�l�m�na"
				+"\nsahip olun. Yarat�c� ara�lar, di�er Adobe uygulamalar�"
				+"\nve hizmetleri ile entegrasyon ve Adobe Sensei'nin g�c�;"
				+"\n�ekimlerinizi tek bir kesintisiz i� ak��� i�inde harika"
				+"\nfilmlere ve videolara d�n��t�rmenize yard�mc� olur."
				+"\n------------------------------------------------------------");
		adobpr.setMonthPrice_pr("Ayl�k:132TL");
		adobpr.setYearPrice_pr("Y�ll�k:1.584TL");
		adobpr.setContents_pr("------------------------------------------------------------\n"+
				"�unlar i�in �nerilir:\r\n"
				+ "Video d�zenleme\r\n"
				+ "Video prod�ksiyonu"
				+"\n------------------------------------------------------------");
		adobpr.setExtras_pr("Ekstralar:\r\n"
				+ "100 GB bulut depolama alan�\r\n"
				+ "Ad�m ad�m e�itimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son �zelliklere eri�im"
				+"\n------------------------------------------------------------");
		
		
		System.out.println(adobpr.getProgramName_pr());
		System.out.println(adobpr.getDescription_pr());
		System.out.println(adobpr.getMonthPrice_pr());
		System.out.println(adobpr.getYearPrice_pr());
		System.out.println(adobpr.getContents_pr());
		System.out.println(adobpr.getExtras_pr());
	}
	public void adobAe(){
		AdobeAftereffect adobae = new AdobeAftereffect();
		adobae.setProgramName_ae("AfterEffect");
		adobae.setDescription_ae("------------------------------------------------------------\n"+
				"Sinematik filmler, tan�t�mlar ve ge�i�ler olu�turun."
				+"\nYang�n ��kar�n veya ya�mur ya�d�r�n. Bir logo veya karakteri"
				+"\nanimasyonla hareket ettirin. Sekt�r standartlar�nda animasyon ve"
				+"\nyarat�c� kompozisyon uygulamas� ile her t�rl� fikrinize hareket"
				+"\nkazand�rabilirsiniz. "
				+"\n------------------------------------------------------------");
		adobae.setMonthPrice_ae("Ayl�k:132TL");
		adobae.setYearPrice_ae("Y�ll�k:1.584TL");
		adobae.setContents_ae("------------------------------------------------------------\n"+
				"�unlar i�in �nerilir:\r\n"
				+ "G�rsel efektler\r\n"
				+ "Hareketli grafikler\r\n"
				+ "Kullan�c� arabirimi ve kullan�c� deneyimi tasar�m�"
				+"\n------------------------------------------------------------");
		adobae.setExtras_ae("Ekstralar:\r\n"
				+ "100 GB bulut depolama alan�\r\n"
				+ "Ad�m ad�m e�itimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son �zelliklere eri�im"
				+"\n------------------------------------------------------------");
		
		
		System.out.println(adobae.getProgramName_ae());
		System.out.println(adobae.getDescription_ae());
		System.out.println(adobae.getMonthPrice_ae());
		System.out.println(adobae.getYearPrice_ae());
		System.out.println(adobae.getContents_ae());
		System.out.println(adobae.getExtras_ae());
	}
	public void adobIn(){
		AdobeIndesign adobin = new AdobeIndesign();
		adobin.setProgramName_in("�ndesign");
		adobin.setDescription_in("------------------------------------------------------------\n"+
				"Sekt�rde �nde gelen sayfa tasar�m� ve mizanpaj uygulamas�,"
				+"\nbas�l� ve dijital medya i�in harika belgeler olu�turman�z�"
				+"\n�n kontrollerini yapman�z� ve yay�nlaman�z� sa�lar. Poster,"
				+"\nkitap, dijital dergi,e-kitap, etkile�imli PDF ve daha pek "
				+"\n�ok i�erik olu�turmak i�in ihtiyac�n�z olan her �eye sahip olun."
				+"\n------------------------------------------------------------");
		adobin.setMonthPrice_in("Ayl�k:132TL");
		adobin.setYearPrice_in("Y�ll�k:1.584TL");
		adobin.setContents_in("------------------------------------------------------------\n"+
				"�unlar i�in �nerilir:\r\n"
				+ "Sayfa mizanpaj�\r\n"
				+ "Bask� tasar�m�"
				+"\n------------------------------------------------------------");
		adobin.setExtras_in("Ekstralar:\r\n"
				+ "100 GB bulut depolama alan�\r\n"
				+ "Ad�m ad�m e�itimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son �zelliklere eri�im"
				+"\n------------------------------------------------------------");
		
		System.out.println(adobin.getProgramName_in());
		System.out.println(adobin.getDescription_in());
		System.out.println(adobin.getMonthPrice_in());
		System.out.println(adobin.getYearPrice_in());
		System.out.println(adobin.getContents_in());
		System.out.println(adobin.getExtras_in());		
	}
	
	
	
	
	
}
