package Adobe;

public class SetPrograms{
	public void AdobeAllApp(){
		
		AdobeAllPrograms adobal =new AdobeAllPrograms();
		adobal.setProgramName_al("Tüm Programlar");
		adobal.setDescription_al("------------------------------------------------------------\n"+
				 "Ýþletmeniz veya departmanýnýz için Adobe Photoshop,Illustrator,"
				+"\nInDesign, Premiere Pro ve Acrobat Pro gibi uygulamalarý"
				+"\nsatýn alarak bir yönetim konsoluna eriþin ve tüm cihazlar"
				+"\n üzerindeki varlýklarýnýzý anýnda eþitleyin."
				+"\n------------------------------------------------------------");
		adobal.setMonthPrice_al("Aylýk:425TL");
		adobal.setYearPrice_al("Yýllýk:5.100TL");
		adobal.setContents_al(
				"------------------------------------------------------------\n"
				+ "Ekipler Ýçin Creative Cloud'daki iþ özellikleri:\r\n"	
				+ "\r\n"
				+ "Merkezi yönetim araçlarý:\r\n"
				+ "Web tabanlý ve kullanýmý kolay Admin Console ile\r\n"
				+ "uygulamalarý daðýtýn, ürünleri ve kullanýcýlarý yönetin.\r\n"
				+ "\r\n"
				+ "Teknik destek:\r\n"
				+ "Yaratýcý ekibinizin ilerlemesine yardýmcý olmak için 7/24\r\n"
				+ "geliþmiþ teknik destekten ve kullanýcý baþýna yýlda iki kez\r\n"
				+ "Bire Bir Uzman Oturumu'ndan yararlanýn.\r\n"
				+ "\r\n"
				+ "Creative Cloud Kütüphaneleri:\r\n"
				+ "Ekibiniz, uygulamalar ile cihazlar arasýnda yaratýcý\r\n"
				+ "varlýklarý paylaþabilir ve varlýklarý eþitleyebilir.\r\n"
				+ "\r\n"
				+ "Adobe Talent'ta sýnýrsýz iþ ilaný yayýnlama:\r\n"
				+ "Gönderileriniz Behance'te milyonlarca yaratýcý\r\n"
				+ "profesyonele ulaþýr.\r\n"
				+ "\r\n"
				+ "Popüler uygulamalarla entegrasyon:\r\n"
				+ "Ekibinizin günlük olarak kullandýðý Slack, Microsoft Teams\r\n"
				+ "ve diðer üretkenlik uygulamalarý ile birlikte çalýþýr.\r\n"
				+ "\r\n"
				+ "Depolama:\r\n"
				+ "Kullanýcý baþýna 1 TB bulut depolama alaný.\r\n"	
				+"\n------------------------------------------------------------");
		
		
		
		System.out.println(adobal.getProgramName_al());
		System.out.println(adobal.getDescription_al());
		System.out.println(adobal.getMonthPrice_al());
		System.out.println(adobal.getYearPrice_al());
		System.out.println(adobal.getContents_al());
		
		
	}
	
	public void adobPs()// bu alan içi herþeyi çalýþtýrýyor
	{
		AdobePhotoshop adobps = new AdobePhotoshop();
		adobps.setProgramName_ps("Photoshop");
		adobps.setDescription_ps("------------------------------------------------------------\n"+
				"Dünyanýn en iyi görüntüleme ve grafik tasarým yazýlýmý,"
				+"\nfotoðraf düzenleme ve birleþtirmeden dijital boyamaya,"
				+"\nanimasyondan grafik tasarýma kadar her türlü yaratýcý "
				+"\nprojenin merkezinde yer alýyor. Photoshop, Masaüstü ve iPad'de"
				+ "\nfikirlere hayat veriyor."
				+"\n------------------------------------------------------------");
		adobps.setMonthPrice_ps("Aylýk:132TL");
		adobps.setYearPrice_ps("Yýllýk:1.584TL");
		adobps.setContents_ps("------------------------------------------------------------\n"
				+ "Þunlar için önerilir:\r\n"				
				+ "Fotoðraf düzenleme\r\n"
				+ "Kompozit oluþturma\r\n"
				+ "Çizim ve boyama\r\n"
				+ "Grafik tasarým"
				+"\n------------------------------------------------------------");
		adobps.setExtras_ps("Ekstralar:\r\n"
				+ "100 GB bulut depolama alaný\r\n"
				+ "Adým adým eðitimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son özelliklere eriþim"
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
		adobai.setProgramName_ai("Ýllustrator");
		adobai.setDescription_ai("------------------------------------------------------------\n"+
				"Sektörde bir standart haline gelmiþ vektör grafiði"
				+"\nuygulamasý;baský, web, video ve mobil için logo, simge, çizim,"
				+"\ntipografi ve illüstrasyonlar oluþturmanýza olanak saðlar."
				+"\nMasaüstü veya iPad'de vizyonunuzu hayata geçirin."
				+"\n------------------------------------------------------------");
		adobai.setMonthPrice_ai("Aylýk:132TL");
		adobai.setYearPrice_ai("Yýllýk:1.584TL");
		adobai.setContents_ai("------------------------------------------------------------\n"+
				"Þunlar için önerilir:\r\n"
				+ "Ýllüstrasyon\r\n"
				+ "Çizim ve boyama\r\n"
				+ "Tipografi\r\n"
				+ "Grafik tasarým"
				+"\n------------------------------------------------------------");
		adobai.setExtras_ai("Ekstralar:\r\n"
				+ "100 GB bulut depolama alaný\r\n"
				+ "Adým adým eðitimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son özelliklere eriþim"
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
				"Fotoðraf tutkunlarýna yönelik bulut tabanlý bir"
				+"\nhizmet olan Lightroom, fotoðraflarýnýzý masaüstü, mobil ve"
				+"\nweb'de düzenlemek, organize etmek, saklamak ve paylaþmak için"
				+"\nihtiyacýnýz olan her þeyi sunar."
				+"\n------------------------------------------------------------");
		adoblr.setMonthPrice_lr("Aylýk:132TL");
		adoblr.setYearPrice_lr("Yýllýk:1.584TL");
		adoblr.setContents_lr("------------------------------------------------------------\n"+
				"Þunlar için önerilir:\r\n"
				+ "Fotoðraf yönetimi\r\n"
				+ "Fotoðraf düzenleme"
				+"\n------------------------------------------------------------");
		adoblr.setExtras_lr("Ekstralar:\r\n"
				+ "100 GB bulut depolama alaný\r\n"
				+ "Adým adým eðitimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son özelliklere eriþim"
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
				"Film, TV ve web için önde gelen video düzenleme yazýlýmýna"
				+"\nsahip olun. Yaratýcý araçlar, diðer Adobe uygulamalarý"
				+"\nve hizmetleri ile entegrasyon ve Adobe Sensei'nin gücü;"
				+"\nçekimlerinizi tek bir kesintisiz iþ akýþý içinde harika"
				+"\nfilmlere ve videolara dönüþtürmenize yardýmcý olur."
				+"\n------------------------------------------------------------");
		adobpr.setMonthPrice_pr("Aylýk:132TL");
		adobpr.setYearPrice_pr("Yýllýk:1.584TL");
		adobpr.setContents_pr("------------------------------------------------------------\n"+
				"Þunlar için önerilir:\r\n"
				+ "Video düzenleme\r\n"
				+ "Video prodüksiyonu"
				+"\n------------------------------------------------------------");
		adobpr.setExtras_pr("Ekstralar:\r\n"
				+ "100 GB bulut depolama alaný\r\n"
				+ "Adým adým eðitimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son özelliklere eriþim"
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
				"Sinematik filmler, tanýtýmlar ve geçiþler oluþturun."
				+"\nYangýn çýkarýn veya yaðmur yaðdýrýn. Bir logo veya karakteri"
				+"\nanimasyonla hareket ettirin. Sektör standartlarýnda animasyon ve"
				+"\nyaratýcý kompozisyon uygulamasý ile her türlü fikrinize hareket"
				+"\nkazandýrabilirsiniz. "
				+"\n------------------------------------------------------------");
		adobae.setMonthPrice_ae("Aylýk:132TL");
		adobae.setYearPrice_ae("Yýllýk:1.584TL");
		adobae.setContents_ae("------------------------------------------------------------\n"+
				"Þunlar için önerilir:\r\n"
				+ "Görsel efektler\r\n"
				+ "Hareketli grafikler\r\n"
				+ "Kullanýcý arabirimi ve kullanýcý deneyimi tasarýmý"
				+"\n------------------------------------------------------------");
		adobae.setExtras_ae("Ekstralar:\r\n"
				+ "100 GB bulut depolama alaný\r\n"
				+ "Adým adým eðitimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son özelliklere eriþim"
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
		adobin.setProgramName_in("Ýndesign");
		adobin.setDescription_in("------------------------------------------------------------\n"+
				"Sektörde önde gelen sayfa tasarýmý ve mizanpaj uygulamasý,"
				+"\nbasýlý ve dijital medya için harika belgeler oluþturmanýzý"
				+"\nön kontrollerini yapmanýzý ve yayýnlamanýzý saðlar. Poster,"
				+"\nkitap, dijital dergi,e-kitap, etkileþimli PDF ve daha pek "
				+"\nçok içerik oluþturmak için ihtiyacýnýz olan her þeye sahip olun."
				+"\n------------------------------------------------------------");
		adobin.setMonthPrice_in("Aylýk:132TL");
		adobin.setYearPrice_in("Yýllýk:1.584TL");
		adobin.setContents_in("------------------------------------------------------------\n"+
				"Þunlar için önerilir:\r\n"
				+ "Sayfa mizanpajý\r\n"
				+ "Baský tasarýmý"
				+"\n------------------------------------------------------------");
		adobin.setExtras_in("Ekstralar:\r\n"
				+ "100 GB bulut depolama alaný\r\n"
				+ "Adým adým eðitimler\r\n"
				+ "Adobe Express\r\n"
				+ "Adobe Portfolio\r\n"
				+ "Adobe Fonts\r\n"
				+ "Behance\r\n"
				+ "Creative Cloud Libraries\r\n"
				+ "En son özelliklere eriþim"
				+"\n------------------------------------------------------------");
		
		System.out.println(adobin.getProgramName_in());
		System.out.println(adobin.getDescription_in());
		System.out.println(adobin.getMonthPrice_in());
		System.out.println(adobin.getYearPrice_in());
		System.out.println(adobin.getContents_in());
		System.out.println(adobin.getExtras_in());		
	}
	
	
	
	
	
}
