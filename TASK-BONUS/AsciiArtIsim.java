public class AsciiArtIsim {

    public static void main(String[] args) {

        // "K" harfi
        String[] K = {
                "K   K",
                "K  K ",
                "K K  ",
                "K  K ",
                "K   K"
        };

        // "E" harfi
        String[] E = {
                "EEEEE",
                "E    ",
                "EEEEE",
                "E    ",
                "EEEEE"
        };

        // "R" harfi
        String[] R = {
                "RRRR ",
                "R   R",
                "RRRR ",
                "R R  ",
                "R  R "
        };

        // "M" harfi
        String[] M = {
                "M   M",
                "MM MM",
                "M M M",
                "M   M",
                "M   M"
        };

        // Her harf, 5 satır yüksekliğindedir.
        int height = K.length;

        System.out.println("Kerem");
        System.out.println("-----");

        // Satır satır tüm harfleri yan yana yazdır
        for (int i = 0; i < height; i++) {
            // Harflerin dize dizilerinden ilgili satırları al ve aralarında boşluk bırakarak birleştir
            System.out.println(K[i] + "  " + E[i] + "  " + R[i] + "  " + E[i] + "  " + M[i]);
        }
    }
}

