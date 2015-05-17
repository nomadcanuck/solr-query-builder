package eu.lmc.solr.querybuilder;

import eu.lmc.solr.querybuilder.component.ComponentCache;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by avecherskaya on 16/05/15.
 */
public class SolrSearchApplication extends WebApplication {
    private ComponentCache componentCache;

    @Override
    public Class<? extends Page> getHomePage() {
        return Index.class;
    }

    public void init(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/test-config.xml");
        componentCache = (ComponentCache) applicationContext.getBean("componentCache");
    }

    @Override
    public SolrSession newSession(Request request, Response response) {
        return new SolrSession(request);
    }

}
