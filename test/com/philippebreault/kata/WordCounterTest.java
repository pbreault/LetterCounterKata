package com.philippebreault.kata;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WordCounterTest{

    @Test
    public void canCountNumbersOfLetters() throws Exception {
        String string = "abcd abc";
        
        WordCounter wc = new WordCounter(string);

        assertEquals(2, wc.getCountOf('a') );
        assertEquals(1, wc.getCountOf('d') );
        assertEquals(0, wc.getCountOf('z'));
    }

    @Test(expected = NullPointerException.class)
    public void throwsExceptionIfNullStringIsPassed() {
        //  should throw an exception
        new WordCounter(null);
    }

    @Test
    public void shouldWorkWithEmptyStrings() {
        WordCounter wordCounter = new WordCounter("");

        assertEquals(0, wordCounter.getCountOf('a'));
    }
}
