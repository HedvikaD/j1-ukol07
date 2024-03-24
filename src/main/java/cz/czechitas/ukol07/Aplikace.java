package cz.czechitas.ukol07;

import java.util.List;
import java.io.IOException;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {

    public static void main(String[] args) throws IOException{
        KnihaSluzba knihaSluzba = new KnihaSluzba();

        List<Kniha> SeznamKnih = knihaSluzba.vratitSeznamKnih();
        System.out.println("celkový počet knih v naší malé databázi: " + SeznamKnih.size());

        List<Kniha> knihyPodleAutora = knihaSluzba.vratitPodleAutora("Karel Čapek");
        System.out.println("Knihy, které napsal Karel Čapek: ");
        for (Kniha kniha : knihyPodleAutora) {
            System.out.println(kniha.getNazev());
        }

        List<Kniha> knihyPodleRoku = knihaSluzba.vratitPodleRoku(1845);
        for (Kniha kniha : knihyPodleRoku) {
            System.out.println("Knihy vydané poprvé v roce 1845 " +kniha.getAutor() + ": " +kniha.getNazev());}

    }

}
