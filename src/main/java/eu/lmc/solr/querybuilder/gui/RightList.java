package eu.lmc.solr.querybuilder.gui;

import container.Container;

import javax.swing.*;
import java.awt.*;

/**
 * Created by avecherskaya on 08/05/15.
 */
public class RightList extends JPanel {

    JList list;
    DefaultListModel<Container> model;

    public RightList(Container container) {
        setLayout(new BorderLayout());
        model = new DefaultListModel<Container>();
        list = new JList(model);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);
        JScrollPane pane = new JScrollPane(list);
        pane.setPreferredSize(new Dimension(200, 200));
        add(pane);
    }

/*


    public static void main(String[] args) {
        ComponentCache componentCache;
        UserQuery userQuery;
        FilterContainer filterContainer;
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/test-config.xml");
        componentCache = (ComponentCache) applicationContext.getBean("componentCache");
        userQuery = (UserQuery) applicationContext.getBean("userQuery");
        filterContainer = (FilterContainer) applicationContext.getBean("filterContainer");


        JFrame frame = new JFrame("List Model Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int i = 0;
        for (container.Container c : userQuery.getContainers()) {
            frame.getContentPane().add(new RightList(c),i++);
        }

        frame.setSize(700, 260);
        frame.setVisible(true);

    }

*/
}
