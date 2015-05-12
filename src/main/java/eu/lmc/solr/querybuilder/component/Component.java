package eu.lmc.solr.querybuilder.component;

/**
 * Created by avecherskaya on 15/04/15.
 */
public abstract class Component implements Cloneable{

    public static int maxID = 0;

    //public abstract void setQueryParamsTo(SolrQuery sq);
    public abstract String getQueryString();

    public abstract int getId();

    public abstract ComponentType getType();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
