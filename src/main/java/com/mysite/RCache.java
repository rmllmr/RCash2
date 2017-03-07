package com.mysite;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuMoR on 06.03.2017.
 */
class RCache<E> {
    private Map<String, E> cacheValue = new HashMap<String, E>();
    private Map<String, Long> cacheTimeLive = new HashMap<String, Long>();

    public E getRCache(String keyRCache){
        checkRCache();
        if (cacheTimeLive.containsKey(keyRCache)){
            return cacheValue.get(keyRCache);
        }
        return null;
    };


    public void putRCache(String keyRCache, E valueRCashe, int timeLive){
        checkRCache();
        if (timeLive > 0) {
            long timeLiveToCache = timeLive * 1000 + System.currentTimeMillis();
            cacheValue.put(keyRCache, valueRCashe);
            cacheTimeLive.put(keyRCache, timeLiveToCache);
        }
    }

    private void checkRCache(){
        long timeNow = System.currentTimeMillis();
        for (String rElementCache: cacheTimeLive.keySet()
                ) {
            if (cacheTimeLive.get(rElementCache) < timeNow){
                cacheTimeLive.remove(rElementCache);
                cacheValue.remove(rElementCache);
            }
        }

    }
    public RCache(){

    }
}
