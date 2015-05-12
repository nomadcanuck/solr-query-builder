package container;

import component.ComponentCache;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by avecherskaya on 07/05/15.
 */
public class UserQueryTest {

    ComponentCache componentCache;
    UserQuery userQuery;
    FilterContainer filterContainer;

    JList list;
    DefaultListModel model;

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