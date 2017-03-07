package com.mysite;

import org.junit.Test;
/**
 * Created by user on 07.03.2017.
 */
public class RCacheTest {
    @Test
    public void getRCache() throws Exception {
        RCache testRChache = new RCache();
        testRChache.putRCache("1", 7, 200);

        for (Integer i = 1; i < 1000; i++){
            testRChache.putRCache(i.toString(), new Dog(), 100);
        }

        testRChache.getRCache("2");

    }

    @Test
    public void putRCache() throws Exception {
        RCache testRChache = new RCache();
        testRChache.putRCache("1", 7, 200);
        testRChache.putRCache("2", new Dog(), 1);

    }

}