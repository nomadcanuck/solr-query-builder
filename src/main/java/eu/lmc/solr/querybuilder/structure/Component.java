package eu.lmc.solr.querybuilder.structure;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.solr.client.solrj.SolrQuery;

/**
 * Created by avecherskaya on 15/04/15.
 */
public abstract class Component implements Cloneable{

    public abstract void setQueryParamsTo(SolrQuery sq);

    //saves SINGLE object to db
    public void save(){
        XStream xstream = new XStream(new DomDriver());
        String xml = xstream.toXML(this);
        //send xml to db ??????
    }

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
