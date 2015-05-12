package component;

import java.util.ArrayList;

/**
 * Created by avecherskaya on 24/04/15.
 */



public class ComponentCache {

    private ArrayList<Component> cache;

    public ArrayList<Component> getCache() {
        return cache;
    }

    public void setCache(ArrayList<Component> cache) {
        this.cache = cache;
    }

    public Component getComponent(int key) {
        Component cachedComponent = cache.get(key);
        return (Component) cachedComponent.clone();
    }


    /*
    private HashMap<Integer, Component> cache;

    public HashMap<Integer, Component> getCache() {
        return cache;
    }

    public void setCache(HashMap<Integer,Component> cache) {
        this.cache = cache;
    }

    public Component getComponent(int key) {
        Component cachedComponent = cache.get(key);
        return (Component) cachedComponent.clone();
    }

    */
}
