package Moneta;

import java.security.SecureRandom;

public class Moneta {
    private final int liczbaStron;
    private final SecureRandom random;

    public Moneta() {
        liczbaStron = 2;
        random = new SecureRandom();
    }

    public String rzut() {
        int i = random.nextInt(liczbaStron);
        switch (i) {
            case 0:
                return "Orzeł";
            case 1:
                return "Reszka";
            default:
                return "";
        }
    }
}
