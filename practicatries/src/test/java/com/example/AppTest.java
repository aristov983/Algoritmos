package com.example;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class AppTest {

    @Test
    public void autocompletar_prefijo_pro() {
        Trie trie = new Trie();
        for (String w : new String[]{"programa", "progreso", "probar", "prueba", "casa"}) {
            trie.insertar(w);
        }
        List<String> resultado = trie.autocompletar("pro");
        assertEquals(3, resultado.size());
        assertTrue(resultado.contains("probar"));
        assertTrue(resultado.contains("progreso"));
        assertTrue(resultado.contains("programa"));
    }

    @Test
    public void autocompletar_prefijo_sin_resultados() {
        Trie trie = new Trie();
        trie.insertar("casa");
        List<String> resultado = trie.autocompletar("xyz");
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void autocompletar_prefijo_es_palabra_completa() {
        Trie trie = new Trie();
        trie.insertar("pro");
        trie.insertar("probar");
        List<String> resultado = trie.autocompletar("pro");
        assertEquals(2, resultado.size());
        assertTrue(resultado.contains("pro"));
        assertTrue(resultado.contains("probar"));
    }
}
