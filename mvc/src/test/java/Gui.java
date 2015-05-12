import component.ComponentCache;
import container.FilterContainer;
import container.UserQuery;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;

/**
 * Created by avecherskaya on 08/05/15.
 */
public class Gui {
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

        model = new DefaultListModel();

        for (container.Container c : userQuery.getContainers()){
            model.addElement(c);
        }

        list = new JList(model);

    }



}
