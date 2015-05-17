package eu.lmc.solr.querybuilder.wicket;

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
    //contains ArrayList<Component>
    private ComponentCache componentCache;

    @Override
    public Class<? extends Page> getHomePage() {
        return Index.class;
    }

    @Override
    protected void init(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/test-config.xml");
        componentCache = (ComponentCache) applicationContext.getBean("componentCache");
    }

    @Override
    public SolrSession newSession(Request request, Response response) {
        return new SolrSession(request);
    }

    public ComponentCache getComponentCache(){
        return componentCache;
    }

}
