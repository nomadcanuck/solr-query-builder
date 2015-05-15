package eu.lmc.solr.querybuilder.component.boost_component;

import eu.lmc.solr.querybuilder.component.Component;
import eu.lmc.solr.querybuilder.component.ComponentType;

/**
 * Created by avecherskaya on 12/05/15.
 */
public class BoostComponent extends Component {
    //one boost component can have only one field pf/ps
    private PfBoostFunction pf;
    private PsBoostFunction ps;

    private int tie;
    private int mm;

    private void setPf(PfBoostFunction boostFunction){
        this.pf = boostFunction;
    }
    private void setPs(PsBoostFunction boostFunction){
        this.ps = boostFunction;
    }

    @Override
    public String getQueryString() {
        String s = "";
        if (pf!=null) s+="pf="+pf.getBoost()+" ";
        if (ps!=null) s+="ps="+ps.getBoost()+" ";
        return s;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public ComponentType getType() {
        return null;
    }
}
