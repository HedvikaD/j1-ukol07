package cz.czechitas.ukol07;

public class Kniha {
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null) {
            throw new IllegalArgumentException("Jméno autora nesmí být prázdné.");
        }
        this.autor = autor;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        if (nazev == null) {
            throw new IllegalArgumentException("Název knihy nesmí být prázdný.");
        }
        this.nazev = nazev;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        if (rokVydani < 1440) {
            throw new IllegalArgumentException("Rok vydání nesmí být starší, než je vynález knihtisku.");
        }
        this.rokVydani = rokVydani;
    }

    private String autor;
        private String nazev;
        private int rokVydani;





}
