package eu.lmc.solr.querybuilder.component;

/**
 * Created by avecherskaya on 18/04/15.
 */
public class FulltextComponent extends Component {
    private String text = "";
    private int id;

    @Override
    public ComponentType getType(){
        return ComponentType.QUERY;
    }

    @Override
    public String getQueryString(){
        //return "q:"+text;
        return text;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Object clone() {
        Object clone = super.clone();
        ((FulltextComponent) clone).id = maxID++;
        return clone;
    }

    /*
    public void setQueryParamsTo(SolrQuery sq) {
        sq.setQuery(text);
    }
    */
}

