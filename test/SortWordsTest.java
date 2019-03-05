package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {

    SortWords obj;
    @Before
    public void setUp() throws Exception {
        SortWords obj = new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        SortWords obj = null;
    }

    @Test
    public void wordSort() {
        String s1 = "ac b ccd sde tba zsw";
        String arr1[] = s1.split(" ");
        assertArrayEquals(arr1 ,obj.wordSort("b ac tba sde zsw ccd"));

        String s2 = "happy he is so";
        String arr2[] = s2.split(" ");
        assertArrayEquals(arr2 ,obj.wordSort("he is so happy"));

        String s3 = "a abhishek banka guy is lazy";
        String arr3[] = s3.split(" ");
        assertArrayEquals(arr3 ,obj.wordSort("abhishek banka is a lazy guy"));

    }
}
