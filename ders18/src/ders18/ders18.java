package ders18;

public class ders18 {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));
		for (String kelime : mesaj.split("")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

	}

}
