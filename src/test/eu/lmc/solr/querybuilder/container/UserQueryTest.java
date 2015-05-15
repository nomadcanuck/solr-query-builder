package eu.lmc.solr.querybuilder.container;

import eu.lmc.solr.querybuilder.component.Component;
import eu.lmc.solr.querybuilder.component.ComponentCache;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;

import static org.junit.Assert.assertEquals;


/**
 * Created by avecherskaya on 07/05/15.
 */
public class UserQueryTest {

    ComponentCache componentCache;
    UserQuery userQuery;
    eu.lmc.solr.querybuilder.container.FilterContainer filterContainer;

    JList list;
    DefaultListModel model;
    DefaultListModel model2;

    @Before
    public void setUp(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/test-config.xml");
        componentCache = (ComponentCache) applicationContext.getBean("componentCache");
        userQuery = (UserQuery) applicationContext.getBean("userQuery");
        filterContainer = (FilterContainer) applicationContext.getBean("filterContainer");
    }


    @Test
    public void testQuery() throws Exception {
    }

    @Test
    public void testGetContainers() throws Exception {

        model = new DefaultListModel();
        model = new DefaultListModel();

        for (Container c : userQuery.getContainers()){
            model.addElement(c);
        }

        for (Component c : componentCache.getCache()) {
            model2.addElement(c);
        }


        /*
        list = new JList(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);

        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(250, 80));
        */
        assertEquals(model2.firstElement(), componentCache.getComponent(0));
        assertEquals(model.get(0),filterContainer);

    }

}