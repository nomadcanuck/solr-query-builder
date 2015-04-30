package eu.lmc.solr.querybuilder.structure;

import org.apache.solr.client.solrj.SolrQuery;

/**
 * Created by avecherskaya on 18/04/15.
 */
public class FulltextComponent extends Component {
    private String text = "";

    public FulltextComponent(String text) {
        this.text = text;
    }

    @Override
    public void setQueryParamsTo(SolrQuery sq) {
        sq.setQuery(text);
    }
}

