package gui;

import component.Component;
import component.ComponentCache;
import container.FilterContainer;
import container.UserQuery;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by avecherskaya on 09/05/15.
 */
public class LeftList extends JPanel {

    JList list;
    DefaultListModel<Component> model;

    public LeftList(ComponentCache componentCache) {

        setLayout(new BorderLayout());
        model = new DefaultListModel<Component>();
        for (Component c : componentCache.getCache()){
            model.addElement(c);
        }

        list = new JList(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);
        JScrollPane pane = new JScrollPane(list);
        pane.setPreferredSize(new Dimension(200, 200));
        add(pane);
    }

    public JList getList() {
        return list;
    }

    public static void main(String[] args) {
        ComponentCache componentCache;
        UserQuery userQuery;
        final FilterContainer filterContainer;
        //QueryContainer queryContainer;

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("mvc/web/WEB-INF/test-config.xml");
        componentCache = (ComponentCache) applicationContext.getBean("componentCache");
        userQuery = (UserQuery) applicationContext.getBean("userQuery");
        filterContainer = (FilterContainer) applicationContext.getBean("filterContainer");
        //queryContainer = (QueryContainer) applicationContext.getBean("queryContainer");

        /*
        System.out.println(componentCache.getCache().get(0).toString());
        SVLComponent idbrand = (SVLComponent) applicationContext.getBean("idbrand");
        System.out.println(idbrand.toString());
        */


        JFrame frame = new JFrame("Lists");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final LeftList leftList = new LeftList(componentCache);
        RightList rightList = new RightList(filterContainer);
        JButton button = new JButton();
        button.setText(">>");
        button.setSize(new Dimension(50, 50));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Component component = (Component) leftList.getList().getSelectedValue();
                try {
                    filterContainer.addComponent(component);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });



        frame.setSize(500, 200);
        frame.getContentPane().add(leftList, BorderLayout.WEST);
        frame.getContentPane().add(rightList, BorderLayout.EAST);

        JPanel panel = new JPanel();
        panel.setSize(100, 200);
        panel.add(button);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        //frame.pack();
        frame.setVisible(true);


    }

}
