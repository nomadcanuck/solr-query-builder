package eu.lmc.solr.querybuilder.component;

import eu.lmc.solr.querybuilder.component.boost_component.BoostComponent;

import java.util.LinkedHashSet;

/**
 * Created by avecherskaya on 18/04/15.
 */
public class FulltextComponent extends Component {
    private String text = "";
    private int id;
    private LinkedHashSet<BoostComponent> boostComponents;

    public void addBoostComponent(BoostComponent component){
        boostComponents.add(component);
    }

    @Override
    public ComponentType getType(){
        return ComponentType.QUERY;
    }

    @Override
    public String getQueryString(){
        String s = "";
        if (this.boostComponents!=null){
            s+="{!type=edismax ";
            for (BoostComponent c : boostComponents){
                s=s+c.getQueryString()+" ";
            }
            s+="q="+text+"}";
            return s;
        }

        else return text;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Object clone() {
        Object clone = super.clone();
        ((FulltextComponent) clone).id = maxID++;
        return clone;
    }

    public LinkedHashSet<BoostComponent> getBoostComponents() {
        return boostComponents;
    }

    public void setBoostComponents(LinkedHashSet<BoostComponent> boostComponents) {
        this.boostComponents = boostComponents;
    }

    /*
    public void setQueryParamsTo(SolrQuery sq) {
        sq.setQuery(text);
    }
    */
}

