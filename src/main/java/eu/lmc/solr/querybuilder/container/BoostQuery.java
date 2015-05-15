package eu.lmc.solr.querybuilder.container;

import eu.lmc.solr.querybuilder.component.Component;
import eu.lmc.solr.querybuilder.component.ComponentType;
import org.apache.solr.client.solrj.SolrQuery;

import java.util.HashSet;

/**
 * Created by avecherskaya on 30/04/15.
 */
public class BoostQuery extends Container {
    private HashSet<Component> components;

    @Override
    public void processQuery(SolrQuery sq) {
        sq.setParam("deftype", "edismax");

    }

    @Override
    void addComponent(Component component) throws Exception {
        if (component.getType() != ComponentType.BOOST) {
            throw new Exception();
        }
        components.add(component);
    }

    @Override
    public HashSet getComponents() {
        return components;
    }

    public void setComponents(HashSet<Component> components) {
        this.components = components;
    }
}
