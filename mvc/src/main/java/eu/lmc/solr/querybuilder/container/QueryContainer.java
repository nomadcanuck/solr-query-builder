package container;

import component.Component;
import component.ComponentType;
import org.apache.solr.client.solrj.SolrQuery;

import java.util.HashSet;

/**
 * Created by avecherskaya on 05/05/15.
 */
public class QueryContainer extends Container {
    private HashSet<Component> components;

    @Override
    public void processQuery(SolrQuery solrQuery) {
        for (Component c : components){
            solrQuery.setQuery(c.getQueryString());
        }
    }

    @Override
    void addComponent(Component component) throws Exception {
        if (component.getType() != ComponentType.QUERY) {
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
