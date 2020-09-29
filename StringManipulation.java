public class StringManipulation{
	public static void main(String[] args){
		Boolean cek = true;
		String aturan = "Burger Fries Chicken Pizza Sandwich Onionrings Milkshake Coke";
		String input = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza";
		String urutan = aturan.toLowerCase();

		String[] kata = urutan.split("\\s");

		String bagian1 = kata[0];
        String bagian2 = kata[1];
        String bagian3 = kata[2];
        String bagian4 = kata[3];
        String bagian5 = kata[4];
        String bagian6 = kata[5];
        String bagian7 = kata[6];
        String bagian8 = kata[7];

		System.out.println("Kalimat yang diinputkan: ");
		System.out.println(input);

		System.out.println("Menjadi: ");
		System.out.println(bagian1 + " " + bagian2 + " " + bagian3 + " " + bagian4 + " " + bagian4 + " " + bagian4 + " " + bagian5 + " " + bagian7 + " " + bagian7 + " " + bagian8);
	}
}