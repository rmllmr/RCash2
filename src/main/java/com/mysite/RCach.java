package com.mysite;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuMoR on 06.03.2017.
 */
class RCach<E> {
    private Map<String, Animals> cacheValue = new HashMap<String, Animals>();
    //private Map<String, T> cacheValue = new HashMap<String, T>();
    private Map<String, Long> cacheTimeLive = new HashMap<String, Long>();

    public Animals getRCache(String keyRCache){
        checkRCache();
        long timeLive;
        long timeNow = new Date().getTime();
        if (cacheTimeLive.containsKey(keyRCache)){
            return cacheValue.get(keyRCache);
        }
        return null;
    };


    public void putRCache(String keyRCache, Animals valueRCashe, int timeLive){
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
    public RCach(){

    }
}
