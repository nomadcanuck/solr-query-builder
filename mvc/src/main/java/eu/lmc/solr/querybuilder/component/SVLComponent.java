package component;

import parser.XMLtoSvlList;
import parser.svlList;

import java.util.HashSet;

public class SVLComponent extends Component {
    private String field = "";
    private HashSet<Integer> svlId = new HashSet<Integer>();
    //e.g. "2012"
    private int xmlName;
    private int id;

    public String getField() {
        return this.field;
    }

    public int getId() {
        return this.id;
    }

    public int getXmlName() {
        return this.xmlName;
    }

    public void addSvlId(int svlid) {
        this.svlId.add(svlid);
    }

    public void removeSvlId(int svlid){
        this.svlId.remove(svlid);
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setXmlName(int xmlName) {
        this.xmlName = xmlName;
    }

    public svlList loadItemsFromXML(){
        svlList list = XMLtoSvlList.parseFromXML("mvc/src/main/resources/"+Integer.toString(xmlName)+".xml");
        return list;
    }

    @Override
    public String getQueryString(){
        String s = "";
        for (Integer i : svlId){
            s+=" "+i;
        }
        return field+":"+s;
    }

    @Override
    public ComponentType getType(){
        return ComponentType.QUERY;
    }

    /*
    public void setQueryParamsTo(SolrQuery sq) {
        sq.addFilterQuery(field + ":" + svlid);
    }
    */

    @Override
    public Object clone() {
        Object clone = super.clone();
        ((SVLComponent) clone).id = maxID++;
        return clone;
    }
}
