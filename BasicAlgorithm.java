public class BasicAlgorithm{
	public static void main(String[] args){
		int a = 3;
		System.out.println("Angka yang dimasukkan: " + a);

		for (int i=1; i<=3; i++){
			System.out.println(a + " " + i + " " + a*i);
		}

		System.out.println("==========================");
		System.out.println("Dalam Array Multi Dimensi :");

		for (int k = 0; k<1 ; k++) {
			for (int i=1; i<=3; i++){
				System.out.print("["+a + "," + i + "," + a*i+"]");
			}
		}	

	}
}