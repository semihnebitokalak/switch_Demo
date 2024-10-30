// Bir değişkenin değerine göre birden fazla durumu kontrol etmek için kullanılan
// bir kontrol yapısıdır. Birden fazla if-else yapısı yerine daha düzenli ve okunabilir
// bir yapı sunar. switch ifadesi sayesinde bir değişkenin
// alabileceği farklı değerler için farklı kod blokları çalıştırılabilir.
public class Main {
    public static void main(String[] args) {
        char Grade = 'A';

        switch (Grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
             case 'B':
                 System.out.println("Çok güzel : Gectiniz");
                 break;
             case 'C':
                 System.out.println("İyi : Gectiniz");
                 break;
             case 'D':
                 System.out.println("Fena degil : Gectiniz");
                 break;
             case 'F':
                 System.out.println("Malesef : Kaldiniz");
                 break;
                 default:
                     System.out.println("Geçersiz not girdiniz.");
        }
    }
}