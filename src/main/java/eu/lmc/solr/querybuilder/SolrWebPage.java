package eu.lmc.solr.querybuilder;

import eu.lmc.solr.querybuilder.container.UserQuery;
import org.apache.wicket.markup.html.WebPage;

/**
 * Created by avecherskaya on 16/05/15.
 */
public abstract class SolrWebPage extends WebPage {

    public SolrSession getSolrSession(){
        return (SolrSession) getSession();
    }

    public UserQuery getUserQuery(){
        return (UserQuery) getSolrSession().getUserQuery();
    }
}
