package eu.lmc.solr.querybuilder.wicket;

import eu.lmc.solr.querybuilder.container.UserQuery;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by avecherskaya on 16/05/15.
 */
public class SolrSession extends WebSession {
    //private QuerySession = new QuerySession();

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/test-config.xml");
    private UserQuery userQuery = (UserQuery) applicationContext.getBean("userQuery");

    public UserQuery getUserQuery() {
        return userQuery;
    }

    public SolrSession(Request request) {
        super(request);
    }
}
