public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();

    }

    public static void sayiBulmaca() {

        int[] sayilar = new int[]{1, 2, 3, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varmi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varmi = true;
                break;

            }
        }
        if (varmi) {
            mesajVer("sayı mevcuttur  " + aranacak);
        } else {
            mesajVer("sayı mevcut değildir.  " + aranacak );
        }

    }

    public static void mesajVer(String mesaj){

        System.out.println( mesaj  );
    }




}