package eu.lmc.solr.querybuilder.component.boost_component;

import java.util.HashSet;

/**
 * Created by avecherskaya on 12/05/15.
 */
public class BoostCache {
    private HashSet<BoostFunction> boostCache;

    public HashSet<BoostFunction> getBoostCache() {
        return boostCache;
    }

    public void setBoostCache(HashSet<BoostFunction> boostCache) {
        this.boostCache = boostCache;
    }
}
