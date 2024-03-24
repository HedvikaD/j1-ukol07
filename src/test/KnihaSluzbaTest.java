package cz.czechitas.ukol07;

import cz.czechitas.ukol07.Kniha;
import cz.czechitas.ukol07.KnihaSluzba;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class KnihaSluzbaTest {

    @Test
    void testVratitSeznamKnih() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> knihy = knihaSluzba.vratitSeznamKnih();
        assertEquals(10, knihy.size());
    }

    @Test
    void testVratitPodleAutora() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> knihy = knihaSluzba.vratitPodleAutora("Rowling");
        assertEquals(2, knihy.size());
    }

    @Test
    void testVratitPodleRoku() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> knihy = knihaSluzba.vratitPodleRoku(1997);
        assertEquals(1, knihy.size());
    }

}
