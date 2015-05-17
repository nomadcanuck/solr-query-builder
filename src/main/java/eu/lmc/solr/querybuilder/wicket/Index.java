package eu.lmc.solr.querybuilder.wicket;

import eu.lmc.solr.querybuilder.component.Component;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

/**
 * Created by avecherskaya on 17/05/15.
 */
public class Index extends SolrWebPage {

    public Index(){
        add(new ListView<Component>("componentCache", getComponentCache().getCache()) {
            @Override
            protected void populateItem(ListItem<Component> listItem) {
                listItem.add(new Label("componentCacheItems", listItem.getModel()));
            }
        });

        /*
        add(new ListView<Container>("userQuery",getUserQuery().getContainers()) {
            @Override
            protected void populateItem(ListView<Component> userQueryContainer) {
                userQueryContainer.add(new ListItem<Component>("queryItem",userQueryContainer.getModel()));
            }
        });
        */
    }
}
