package com.mpp.fly.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author wuxinjie
 */
public class LRUCacheV1 extends LinkedHashMap {

    private final int DEFAULE_SIZE;

    public LRUCacheV1(int size){
        super((int)Math.ceil(size/0.75) + 1, 0.75f, true);
        DEFAULE_SIZE = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > DEFAULE_SIZE;
    }
}
