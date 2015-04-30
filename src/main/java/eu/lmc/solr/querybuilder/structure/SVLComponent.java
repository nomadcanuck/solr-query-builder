package eu.lmc.solr.querybuilder.structure;

import org.apache.solr.client.solrj.SolrQuery;
import eu.lmc.solr.querybuilder.parser.XMLtoSvlList;
import eu.lmc.solr.querybuilder.parser.svlList;

public class SVLComponent extends Component {
    private String field = "";
    private int id ;
    //e.g. "2012"
    private int xmlName;

    public String getField() {
        return this.field;
    }

    public int getId() {
        return this.id;
    }

    public int getXmlName() {
        return this.xmlName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setXmlName(int xmlName) {
        this.xmlName = xmlName;
    }

    public svlList loadItemsFromXML(){
        svlList list = XMLtoSvlList.parseFromXML("directory/" + Integer.toString(xmlName)+".xml");
        return list;
    }

    @Override
    public void setQueryParamsTo(SolrQuery sq) {
        sq.addFilterQuery(field + ":" + id);
    }


}
