package br.inatel.cdg.test;

import filas.Fila;
import musicas.Musica;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilaTest {

    @Test
    public void testeFilaSize(){
        Fila<Musica> fila = new Fila<>();
        Musica m1 = new Musica("Bohemian Rhapsody", "5:55");
        Musica m2 = new Musica("Hotel California", "6:30");
        fila.enfileirar(m1);
        fila.enfileirar(m2);
        assertEquals(2, fila.size());
    }

    @Test
    public void testeFilaVazia(){
        Fila<Musica> fila = new Fila<>();
        assertTrue(fila.filaVazia());
    }

    @Test
    public void testeEnfileirar(){
        Fila<Musica> fila = new Fila<>();
        Musica m1 = new Musica("Bohemian Rhapsody", "5:55");
        Musica m2 = new Musica("Hotel California", "6:30");
        fila.enfileirar(m1);
        fila.enfileirar(m2);
        assertEquals(m2, fila.getMusica(1));
    }

    @Test
    public void testeRemoverFila(){
        Fila<Musica> fila = new Fila<>();
        Musica m1 = new Musica("Bohemian Rhapsody", "5:55");
        Musica m2 = new Musica("Hotel California", "6:30");
        fila.enfileirar(m1);
        fila.enfileirar(m2);
        fila.removerFila();
        assertEquals(1, fila.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testeFilaRemoverFilaException(){
        Fila<Musica> fila = new Fila<>();
        fila.removerFila();
    }

    @Test
    public void testeFilaRetorno(){
        Fila<Musica> fila = new Fila<>();
        Musica m1 = new Musica("Bohemian Rhapsody", "5:55");
        fila.enfileirar(m1);
        Musica retorno = fila.removerFila();

        assertEquals(m1, retorno);
    }
}
