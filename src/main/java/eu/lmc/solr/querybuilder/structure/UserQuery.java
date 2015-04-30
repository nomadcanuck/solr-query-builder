package eu.lmc.solr.querybuilder.structure;

import org.apache.solr.client.solrj.SolrQuery;

import java.util.ArrayList;

public class UserQuery {
    //components are stored here
    private ArrayList<Component> components = new ArrayList<Component>();

    public void loadCash(){


    }

    public void addComponent(Component c){
        components.add(c);
    }

    public void removeComponent(int i){

    }

    public void removeComponent(String s){
        
    }

    //builds query and returns it
    public SolrQuery processQuery() {
        SolrQuery sq = new SolrQuery();

        for (Component c : components) {
            c.setQueryParamsTo(sq);
        }
        return sq;
    }

    public void saveQueryComponents(){
        //____save as a list_____+provide method to manage this list OR save component separately? METHOD TO EXPORT QUERY FROM DB
        for (Component c : components) {
            c.save();
        }
    }

}
