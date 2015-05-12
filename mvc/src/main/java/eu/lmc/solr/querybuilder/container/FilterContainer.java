package container;

import component.Component;
import component.ComponentType;
import org.apache.solr.client.solrj.SolrQuery;

import java.util.HashSet;

/**
 * Created by avecherskaya on 30/04/15.
 */
public class FilterContainer extends Container {

    private HashSet<Component> components;

    @Override
    public void processQuery(SolrQuery solrQuery) {

        for (Component c : components) {
            solrQuery.addFilterQuery(c.getQueryString());
        }
    }

    @Override
    public void addComponent(Component component) throws Exception {
        if (component.getType() != ComponentType.QUERY) {
            throw new Exception();
        }
        components.add(component);
    }

    @Override
    public HashSet<Component> getComponents() {
        return components;
    }

    public void setComponents(HashSet<Component> components) {
        this.components = components;
    }
}

