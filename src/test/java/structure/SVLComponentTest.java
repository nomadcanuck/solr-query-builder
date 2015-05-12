package java.structure;

import eu.lmc.solr.querybuilder.component.ComponentCache;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by avecherskaya on 30/04/15.
 */
public class SVLComponentTest {
    ComponentCache components;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/component-test-config.xml");
        components = (ComponentCache) applicationContext.getBean("componentCache");
    }

    @Test
    public void testLoadItemsFromXML() throws Exception {
        /*
        SVLComponent c1 = (SVLComponent) components.getComponent(2011);
        Item i = c1.loadItemsFromXML().getItem(201100006);
        assertEquals("IT analytik",i.getName());
        assertEquals(201100006, i.getId());

    }

    @Test
    public void testSetQueryParamsTo() throws Exception {

    }
    */
    }
}