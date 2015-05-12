package container;

import component.Component;
import org.apache.solr.client.solrj.SolrQuery;

import java.util.HashSet;

public abstract class Container {
    public abstract void processQuery(SolrQuery sq);
    abstract void addComponent(Component component) throws Exception;
    public abstract HashSet getComponents();
}
