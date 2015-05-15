package eu.lmc.solr.querybuilder.component.boost_component;

/**
 * Created by avecherskaya on 12/05/15.
 */
public abstract class BoostFunction {
    public String getBoost(){
        return null;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
