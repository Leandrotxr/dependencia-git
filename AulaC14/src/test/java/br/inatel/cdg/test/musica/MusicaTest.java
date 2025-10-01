package br.inatel.cdg.test.musica;

import musicas.Musica;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MusicaTest {
    @Test
    void deveCriarMusicaComNomeEDuracao() {
        Musica musica = new Musica("Bohemian Rhapsody", "5:55");

        assertEquals("Bohemian Rhapsody", musica.getNome());
        assertEquals("5:55", musica.getDuracao());
    }
}
