public class DikdortgenHesap {
    public static void main(String[] args) {
        //Kenar değerleri beliirtme
        double en=4.5;
        double boy=7.9;

        //Alan Hesaplaması
        double alan=en*boy;

        //Çevre Hesaplaması
        double cevre=2*(en+boy);

        System.out.println("Alan: "+alan);
        System.out.println("Çevre: "+cevre);
    }
}
