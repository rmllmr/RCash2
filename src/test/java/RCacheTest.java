package com.mysite;

import org.junit.Test;
/**
 * Created by user on 07.03.2017.
 */
public class RCacheTest {
    @Test
    public void get() throws Exception {
        RCache testRChache = new RCache();
        testRChache.put("1", 7, 200);

        for (Integer i = 1; i < 1000; i++){
            testRChache.put(i.toString(), new Dog(), 100);
        }

        testRChache.get("2");

    }

    @Test
    public void put() throws Exception {
        RCache testRChache = new RCache();
        testRChache.put("1", 7, 200);
        testRChache.put("2", new Dog(), 1);

    }

}