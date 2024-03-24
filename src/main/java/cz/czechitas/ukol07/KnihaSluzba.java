package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import java.io.InputStream;

public class KnihaSluzba {

    private List<Kniha> SeznamKnih;

    public KnihaSluzba() throws IOException {
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            ObjectMapper objectMapper = new ObjectMapper();
            SeznamKnih = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});
        }
    }

    public List<Kniha> vratitSeznamKnih() {
        return SeznamKnih;
    }

    public List<Kniha> vratitPodleAutora(String autor) {
        return SeznamKnih.stream()
                .filter(kniha -> kniha.getAutor().toLowerCase().contains(autor.toLowerCase()))
                .toList();
    }

    public List<Kniha> vratitPodleRoku(int rok) {
        return SeznamKnih.stream()
                .filter(kniha -> kniha.getRokVydani() == rok)
                .toList();
    }
}
