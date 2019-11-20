package Proje.ödevi;

import java.util.*;

public class AdresTakip {

    static void listele(ArrayList<Magazalar> magaza_liste) {
        for (int i = 0; i < magaza_liste.size(); i++) {
            Magazalar x = magaza_liste.get(i);
            System.out.println("Mağaza ismi: " + x.getMagazaAdi());
            if (x.getCadde().equals("Bilgi Girilmedi")) {
                System.out.println("    Adres bilgisi girilmedi\r\n");
            } else {
                System.out.println("    Adres:");
                System.out.println("        " + "İl: " + x.getIl());
                System.out.println("        " + "İlçe: " + x.getIlçe());
                System.out.println("        " + "Mahalle: " + x.getMahalle());
                System.out.println("        " + "Cadde: " + x.getCadde());
            }
            System.out.println("    Bilgiler:");
            System.out.println("        " + "Amacı: " + x.getAmacı());
            System.out.println("        " + "Çalışma saati: " + x.getCalismaSaatleri());

        }
    }

    static void konsol_temizle() {
        System.out.println("\r\n");
    }

    static void calisan_listele(int i, ArrayList<Magazalar> magaza_liste) {
        System.out.println(magaza_liste.get(i).getMagazaAdi() + " Çalışanları:");
        for (int j = 0; j < magaza_liste.get(i).getCalisanlar_liste().size(); j++) {
            System.out.println("    " + magaza_liste.get(i).getCalisanlar_liste().get(j).getAdi() + " " + magaza_liste.get(i).getCalisanlar_liste().get(j).getSoyadi() + " :");
            System.out.println("        " + "Departmanı: " + magaza_liste.get(i).getCalisanlar_liste().get(j).getDepartmani());
            System.out.println("        " + "Maaşı: " + magaza_liste.get(i).getCalisanlar_liste().get(j).getMaasi());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Magazalar> magaza_liste = new ArrayList<Magazalar>();

        while (true) {
            System.out.println("\r\nYapmak istediğiniz işlemi seçin 'yardim' yazarak komutları görebilirsiniz :");
            String secim = scanner.nextLine();
            switch (secim) {
                case "magaza olustur":
                    konsol_temizle();
                    Magazalar secili_magaza = new Magazalar();
                    magaza_liste.add(secili_magaza);
                    System.out.println("Mağaza ismini girin:");
                    secim = scanner.nextLine();
                    secili_magaza.setMagazaAdi(secim);
                   
                    System.out.println("Mağaza amacını girin:");
                    secim = scanner.nextLine();
                    secili_magaza.setAmacı(secim);
                   
                    System.out.println("Mağaza çalışma saatini girin:");
                    secim = scanner.nextLine();
                    secili_magaza.setCalismaSaatleri(secim);
                    break;

                case "magaza listele":
                    konsol_temizle();
                    listele(magaza_liste);
                    break;

                case "magaza sil":
                    konsol_temizle();
                    System.out.println("Silmek istediğiniz mağazayı seçin:");
                    for (int i = 0; i < magaza_liste.size(); i++) {
                        System.out.println(magaza_liste.get(i).getMagazaAdi() + " / " + i);
                    }
                    secim = scanner.nextLine();
                    konsol_temizle();
                    System.out.println(magaza_liste.get(Integer.parseInt(secim)).getMagazaAdi() + " Mağazası silindi ");
                    magaza_liste.remove(Integer.parseInt(secim));

                    break;
                case "magaza bilgilerini gir":
                    konsol_temizle();
                    System.out.println("Mağaza seçin:");
                    for (int i = 0; i < magaza_liste.size(); i++) {
                        System.out.println(magaza_liste.get(i).getMagazaAdi() + " / " + i);
                    }
                    secim = scanner.nextLine();
                    int secim_int = Integer.parseInt(secim);
                  
                    System.out.println("Mağazalarınızı kurmak istediğiniz bir şehir giriniz: ");
                    secim = scanner.nextLine();
                    magaza_liste.get(secim_int).setIl(secim);
                    
                    System.out.println("Mağazalarınızı kurmak istediğiniz bir ilçe giriniz: ");
                    secim = scanner.nextLine();
                    magaza_liste.get(secim_int).setIlçe(secim);
                    
                    System.out.println("Mağazalarınızı kurmak istediğiniz bir mahalle giriniz: ");
                    secim = scanner.nextLine();
                    magaza_liste.get(secim_int).setMahalle(secim);
                    
                    System.out.println("Mağazalarınızı kurmak istediğiniz bir cadde giriniz: ");
                    secim = scanner.nextLine();
                    magaza_liste.get(secim_int).setCadde(secim);
                    break;
                case "calisan ekle":
                    konsol_temizle();
                    System.out.println("Çalışanın ekleneceği Mağazayı seçin:");
                    for (int i = 0; i < magaza_liste.size(); i++) {
                        System.out.println(magaza_liste.get(i).getMagazaAdi() + " / " + i);
                    }
                    secim = scanner.nextLine();
                    secim_int = Integer.parseInt(secim);
                    Calisanlar hafiza_calisan = new Calisanlar();
                    magaza_liste.get(secim_int).getCalisanlar_liste().add(hafiza_calisan);
                    
                    System.out.println("Çalışanın ismini girin:");
                    secim = scanner.nextLine();
                    hafiza_calisan.setAdi(secim);
                    
                    System.out.println("Çalışanın soyadını girin:");
                    secim = scanner.nextLine();
                    hafiza_calisan.setSoyadi(secim);
 
                    System.out.println("Çalışanın departmanını girin:");
                    secim = scanner.nextLine();
                    hafiza_calisan.setDepartmani(secim);
                    
                    System.out.println("Çalışanın maaşını girin:");
                    secim = scanner.nextLine();
                    hafiza_calisan.setMaasi(Integer.parseInt(secim));

                    konsol_temizle();
                    System.out.println("Çalışan " + hafiza_calisan.getAdi() + " " + magaza_liste.get(secim_int).getMagazaAdi() + " mağazasında oluşturuldu");
                    break;
                case "calisan listele":
                    konsol_temizle();
                    System.out.println("Listelemek istediğiniz mağazayı seçin:");
                    for (int i = 0; i < magaza_liste.size(); i++) {
                        System.out.println(magaza_liste.get(i).getMagazaAdi() + " / " + i);
                    }
                    secim = scanner.nextLine();
                    calisan_listele(Integer.parseInt(secim), magaza_liste);
                    break;
                case "calisan sil":
                    konsol_temizle();
                    System.out.println("mağazayı seçin:");
                    for (int i = 0; i < magaza_liste.size(); i++) {
                        System.out.println(magaza_liste.get(i).getMagazaAdi() + " / " + i);
                    }
                    secim = scanner.nextLine();

                    konsol_temizle();
                    System.out.println("silmek istediğiniz çalışanı seçin:");
                    for (int i = 0; i < magaza_liste.get(Integer.parseInt(secim)).getCalisanlar_liste().size(); i++) {
                        System.out.println(magaza_liste.get(Integer.parseInt(secim)).getCalisanlar_liste().get(i).getAdi() + " " + magaza_liste.get(Integer.parseInt(secim)).getCalisanlar_liste().get(i).getSoyadi() + " / " + i);
                    }
                    String secim_2 = scanner.nextLine();
                    secim_int = Integer.parseInt(secim_2);
                    System.out.println(magaza_liste.get(Integer.parseInt(secim)).getCalisanlar_liste().get(secim_int).getAdi() + " " + magaza_liste.get(Integer.parseInt(secim)).getCalisanlar_liste().get(secim_int).getSoyadi() + " " + magaza_liste.get(Integer.parseInt(secim)).getMagazaAdi() + " mağazasından silindi...");
                    magaza_liste.get(Integer.parseInt(secim)).getCalisanlar_liste().remove(secim_int);
                    break;
                case "yardim":
                    konsol_temizle();
                    System.out.println("Komutlar:");
                    System.out.println("    magaza olustur");
                    System.out.println("    calisan ekle");
                    System.out.println("    calisan listele");
                    System.out.println("    calisan sil");
                    System.out.println("    magaza listele");
                    System.out.println("    magaza sil");
                    System.out.println("    magaza bilgilerini gir");
                    break;

                default:
                    konsol_temizle();
                    System.out.println("Hatali komut!");
                    break;
            }
        }
    }
}
