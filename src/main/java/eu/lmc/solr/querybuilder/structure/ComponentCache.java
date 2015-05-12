package eu.lmc.solr.querybuilder.structure;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by avecherskaya on 24/04/15.
 */



public class ComponentCache {

    @Resource(name = "cache")
    private HashMap<Integer, Component> cache;

    public HashMap<Integer, Component> getCache() {
        return cache;
    }

    public void setCache(HashMap<Integer, Component> cache) {
        this.cache = cache;
    }

    /*
    public static Component getComponent() {
        Component cachedComponent = cache.get();
        return (Component) cachedComponent.clone();
    }

    public static void loadCash(){

        SVLComponent idbrand = new SVLComponent(212,"idbrand");
        cache.put(idbrand.getXmlName(), idbrand);

    }

    private static void iterate(Component c){
        while (){
            cache.put()
        }
    }

    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("Beans.xml"));
        SVLComponent obj = (SVLComponent) factory.getBean("");

    }
    */
}
