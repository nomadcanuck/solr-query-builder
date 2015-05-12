package java.container;

import eu.lmc.solr.querybuilder.component.ComponentCache;
import eu.lmc.solr.querybuilder.structure.UserQuery;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;
import java.awt.*;

/**
 * Created by avecherskaya on 07/05/15.
 */
public class UserQueryTest {

    ComponentCache componentCache;
    UserQuery userQuery;
    container.FilterContainer filterContainer;

    JList list;
    DefaultListModel model;

    @Before
    public void setUp(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/test-config.xml");
        componentCache = (ComponentCache) applicationContext.getBean("componentCache");
        userQuery = (UserQuery) applicationContext.getBean("userQuery");
        filterContainer = (container.FilterContainer) applicationContext.getBean("filterContainer");

    }


    @Test
    public void testQuery() throws Exception {
    }

    @Test
    public void testGetContainers() throws Exception {

        model = new DefaultListModel();
        for (container.Container c : userQuery.getContainers()){
            model.addElement(c);
        }

        list = new JList(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);

        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(250, 80));

        assertEquals(model.get(0),filterContainer);

    }
}