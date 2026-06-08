package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ejercicio1();
        ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1(){
        Trie t = new Trie();
        for (String p : new String[]{"bear","bell","bid","bull",
        "buy","sell","stock","stop"})
            t.insertar(p);
        System.out.println(t.buscar("bull")); // true
        System.out.println(t.buscar("be")); // false
        System.out.println(t.buscar("bet")); // false
    }

    public static void ejercicio3(){
        Trie t = new Trie();
        for (String p : new String[]{"programa","progreso","probar","prueba","casa"})
            t.insertar(p);
        System.out.println(t.autocompletar("pro")); // [probar, progreso, programa]
        System.out.println(t.autocompletar("pr"));  // [probar, progreso, programa, prueba]
        System.out.println(t.autocompletar("cas")); // [casa]
        System.out.println(t.autocompletar("xyz")); // []
    }

    public static void ejercicio2(){
        Trie t = new Trie();
        for (String p : new String[]{"bear","bell","bid","bull",
        "buy","sell","stock","stop"})
            t.insertar(p);
        System.out.println(t.empiezaCon("bu")); // true
        System.out.println(t.empiezaCon("be")); // true
        System.out.println(t.empiezaCon("stoc")); // true
        System.out.println(t.empiezaCon("sto")); // true
        System.out.println(t.empiezaCon("stops")); // false
    }
}

