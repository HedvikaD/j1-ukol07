import cz.czechitas.ukol07.Kniha;
import cz.czechitas.ukol07.KnihaSluzba;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;


class KnihaSluzbaTest {

    @Test
    void testVratitSeznamKnih() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> knihy = knihaSluzba.vratitSeznamKnih();
        assertEquals(14, knihy.size());
    }

    @Test
    void testVratitPodleAutora() throws IOException {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> knihy = knihaSluzba.vratitPodleAutora("Rowling");
        assertEquals(2, knihy.size());
    }

    @Test
    void testVratitPodleRoku()  throws IOException  {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> knihy = knihaSluzba.vratitPodleRoku(1997);
        assertEquals(1, knihy.size());

    }

    @Test
    void testVratitPrazdnyNazev() {
        Kniha kniha = new Kniha();
        assertThrows(IllegalArgumentException.class, () -> kniha.setNazev(null));
    }

    @Test
    void testVratitPrazdnyAutor() {
        Kniha kniha = new Kniha();
        assertThrows(IllegalArgumentException.class, () -> kniha.setAutor(null));
    }

    @Test
    void testVratitRokVydaniPredKnihtiskem() {
        Kniha kniha = new Kniha();
        assertThrows(IllegalArgumentException.class, () -> kniha.setRokVydani(1439));
    }

}
