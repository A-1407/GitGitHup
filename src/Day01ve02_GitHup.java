public class Day01ve02_GitHup {
    public static void main(String[] args) {

        /*
        1] git init --> Local repo olusturmak icin yani .git ile klasorumuzun icindeki dosyalari
        iliskilendirmek icin kullanilir

        2} git add . --> working spac'den yani (yerel depomuzdan) staging areá'ya (commitlemek icin beklenen yer)
        gonderir

        3} git status --> working  space'deki ve staging area'daki durumu gosterir

        4} git commit -m "mesaj" --> staging area'dan commit store gondermek icin kullanilir
        (commit yani versiyon yani surum olusturmus oluruz)

        5} git push -> Uzak repo'ya - GitHup'a gonderdigimiz komut
        Yalniz git push komudunu direk kullanmak istersek bir Kez;
                       git remote add origin adress
                       git push -u origin master
        Not;Bu iki komutu tek seferde kullandiktan sonra ikinci commitlerim icin bir defa
        sadece --git push--

        Not; git log --oneline --> Commitlerdeki yani versiyonlarimdaki durumunu gosterir
        01Furkan

        6} git pull --> Remote(yani uzaktaki depo) dosyalari guncellemek icin kullanilir

        7} git branch {isim} yeni branch olusturmamiza yarar

        8} git branh mevcut branch'leri gormemizi saglar

        9} git branch -m "isim" Branchïmizin ismini degisrmeye yarar

        10} git branch -d "isim" branchí siler

        11} git checkout "isim" branchí aktif hale getirir

        12} git merge "isim"  iki branch birlestirir.
         */
        System.out.println("GitHup'da Ogrendim");

        System.out.println("Branch 1.Deneme ");

        System.out.println("Mäster 1.Deneme ");

        System.out.println("Branch 2.Deneme ");
        
    }
}
