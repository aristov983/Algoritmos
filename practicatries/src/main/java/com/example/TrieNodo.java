package com.example;

import java.util.HashMap;
import java.util.Map;

public class TrieNodo {
    Map<Character, TrieNodo> hijos = new HashMap<>();
    boolean esPalabra = false;
}
