package eu.lmc.solr.querybuilder.component;

import org.apache.solr.client.solrj.SolrQuery;

import java.util.Set;

/**
 * Created by avecherskaya on 05/05/15.
 */
public class FieldNameComponent extends Component{

    private String fieldName;
    private int id;
    private SolrQuery.ORDER order;

    private final SolrQuery.ORDER[] orderFields = {SolrQuery.ORDER.desc,SolrQuery.ORDER.asc};
    private Set<String> fieldNames;

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setOrder(int i){
         this.order = orderFields[i];
    }

    public SolrQuery.ORDER getOrder(){
        return order;
    }

    public void setFieldNames(Set<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    @Override
    public String getQueryString() {
        return fieldName;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.SORT;
    }

    @Override
    public Object clone() {
        Object clone = super.clone();
        ((FieldNameComponent) clone).id = maxID++;
        return clone;
    }
}
