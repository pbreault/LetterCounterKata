package com.philippebreault.kata;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {


    private final Map<Character,Integer> mappings;

    public WordCounter(String string) {
        if(string == null) {
            throw new NullPointerException("the string can not be null");
        }

        mappings = new HashMap<Character, Integer>();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            addOccurrenceOf(character);
        }
    }

    public void printAll(){
        for (Character character : mappings.keySet()){
            System.out.println(character + ": " + getCountOf(character));
        }
    }

    public int getCountOf(Character character) {
        Integer count = mappings.get(character);
        if(count == null)
            return 0;
        else
            return mappings.get(character);
    }



    private void addOccurrenceOf(char character){
        if(!mappings.containsKey(character))
            mappings.put(character, 0);

        int previousCount = mappings.get(character);
        mappings.put(character, previousCount+1);
    }


    
    public static void main(String[] args){
        WordCounter wordCounter = new WordCounter("The quick brown fox jumps over the lazy dog");
        
        System.out.println("a: " + wordCounter.getCountOf('a')); // a: 1
        System.out.println("o: " + wordCounter.getCountOf('o')); // o: 4

        wordCounter.printAll();

        /*
        Will return the following:
            T: 1
            f: 1
            g: 1
            d: 1
             : 8
            e: 3
            b: 1
            c: 1
            a: 1
            n: 1
            o: 4
            l: 1
            m: 1
            j: 1
            k: 1
            h: 2
            i: 1
            w: 1
            v: 1
            u: 2
            t: 1
            s: 1
            r: 2
            q: 1
            p: 1
            z: 1
            y: 1
            x: 1

         */
    }

}
