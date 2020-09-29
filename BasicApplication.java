import java.util.Scanner;

public class BasicApplication{
	public static void main(String[] args){
        String jawab;

        String teksAwal, teksKebalikan = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan kalimat untuk pengecekan palindrome:");
        teksAwal = in.nextLine().toLowerCase();

        String tandaBaca[] = {".", ",", " ", "?", "!", "@", "#", "$", "%", "^", "&", "*", "_", "-", "+", "+", "|", ">", "<", "~", "`","'"};
        int jml = tandaBaca.length;
        for (int i = 0; i < jml; i++) {
            teksAwal = teksAwal.replace(tandaBaca[i], "");
        }

        int ukuran = teksAwal.length();
        for (int i = ukuran - 1; i >= 0; i--) {
            teksKebalikan += teksAwal.charAt(i);
        }
            
        if (teksAwal.equalsIgnoreCase(teksKebalikan)) {
            System.out.println("Kalimat Tersebut adalah Palindrome");
        } else {
            System.out.println("Kalimat Tersebut Bukan Palindrome");
        }
	}
}