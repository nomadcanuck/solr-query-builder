import component.ComponentCache;
import component.SVLComponent;
import container.FilterContainer;
import container.UserQuery;
import org.apache.solr.client.solrj.SolrQuery;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by avecherskaya on 30/04/15.
 */
public class BigTest {

    ComponentCache componentCache;
    UserQuery userQuery;
    FilterContainer filterContainer;

    @Before
    public void setUp(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/test-config.xml");
        componentCache = (ComponentCache) applicationContext.getBean("componentCache");
        userQuery = (UserQuery) applicationContext.getBean("userQuery");
        filterContainer = (FilterContainer) applicationContext.getBean("filterContainer");


    }

    @Test
    public void testSetQueryParamsTo() throws Exception {

        SVLComponent c1 = (SVLComponent) componentCache.getComponent(2011);
        SVLComponent c2 = (SVLComponent) componentCache.getComponent(212);

        c1.addSvlId(201100026);
        c2.addSvlId(21200032);

        filterContainer.addComponent(c1);
        filterContainer.addComponent(c2);

        SolrQuery sq = userQuery.query();

        System.out.println(sq.toString());
        //assertArrayEquals(sq.getFilterQueries(), new String[]{"idprofession:201100026", "idbrand:21200032"});
    }

}
