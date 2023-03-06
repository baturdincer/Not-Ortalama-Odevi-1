import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("\nMatemetik notunuz : ");
        mat =inp.nextInt();

        System.out.print("\nFizik notunuz : ");
        fizik =inp.nextInt();

        System.out.print("\nKimya notunuz : ");
        kimya =inp.nextInt();

        System.out.print("\nTurkce notunuz : ");
        turkce =inp.nextInt();

        System.out.print("\nTarih notunuz : ");
        tarih =inp.nextInt();

        System.out.print("\nMuzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : "+ sonuc);

        boolean kosul = sonuc >= 60;
        String str  = kosul ? "Sınıfı gecti" : "Sınıfta kaldı";
        System.out.println(str);
    }
}