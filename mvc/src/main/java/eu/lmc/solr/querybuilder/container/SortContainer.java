package container;

import component.Component;
import component.ComponentType;
import component.FieldNameComponent;
import org.apache.solr.client.solrj.SolrQuery;

import java.util.HashSet;

/**
 * Created by avecherskaya on 30/04/15.
 */
public class SortContainer extends Container {
    private HashSet<FieldNameComponent> components;

    @Override
    public void processQuery(SolrQuery sq) {
        for (FieldNameComponent c : components){
            //sq.addSort(c.getQueryString(), c.getOrder());
            sq.addSort(SolrQuery.SortClause.asc(c.getQueryString()));
        }
    }

    @Override
    void addComponent(Component component) throws Exception {
        if (component.getType() == ComponentType.BOOST){ throw new Exception();}
        components.add((FieldNameComponent)component);
    }

    @Override
    public HashSet getComponents() {
        return components;
    }


    public void setComponents(HashSet<FieldNameComponent> components) {
        this.components = components;
    }


}
