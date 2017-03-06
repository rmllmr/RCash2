package com.mysite;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuMoR on 06.03.2017.
 */
class RCach {
    private Map<String, Integer> cachValue = new HashMap<String, Integer>();
    private Map<String, Long> cachTimeLive = new HashMap<String, Long>();

    public Integer getRCach(String keyRCach){
        long timeLive;
        long timeNow = new Date().getTime();
        if (cachTimeLive.containsKey(keyRCach)){
            timeLive = cachTimeLive.get(keyRCach);
            if (timeLive < timeNow){
              return cachValue.get(keyRCach);
            }else{
              return -1;
            }
        }else{
            return -1;
        }
    };


    public void putRCach(String keyRCach, Integer valueRCash, Integer timeLive){



    }

    public RCach(){

    }
}
