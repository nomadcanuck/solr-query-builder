package eu.lmc.solr.querybuilder.container;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.solr.client.solrj.SolrQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avecherskaya on 05/05/15.
 */
public class UserQuery {
    //SINGLETON
    //contains FilterQuery, SortQuery, BoostQuery
    //when users clicks run or save

    private List<Container> containers = new ArrayList<Container>();

    //builds and returns query
    public SolrQuery query(){
        SolrQuery sq = new SolrQuery();
        for (Container c : containers){
            c.processQuery(sq);
        }
        return sq;
    }

    //saves list of containers
    //saves CONTAINER object to db
    public void save(){

        XStream xstream = new XStream(new DomDriver());
        String xml = xstream.toXML(this);
        //send xml to db ??????
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }
}
