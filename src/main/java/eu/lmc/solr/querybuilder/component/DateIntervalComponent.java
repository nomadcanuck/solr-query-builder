package eu.lmc.solr.querybuilder.component;

import java.time.LocalDate;

import static org.apache.solr.common.util.DateUtil.getThreadLocalDateFormat;

/**
 * Created by avecherskaya on 15/04/15.
 */
public class DateIntervalComponent extends Component {
    private LocalDate localDateFrom;
    private LocalDate localDateTo;
    private int id;

    @Override
    public Object clone() {
        Object clone = super.clone();
        ((DateIntervalComponent) clone).id = maxID++;
        return clone;
    }

    @Override
    public ComponentType getType(){
        return ComponentType.QUERY;
    }

    //indexing
    @Override
    public int getId(){
        return id;
    }

    @Override
    public String getQueryString(){
        String from = (localDateFrom == null) ? "*" : getThreadLocalDateFormat().format(localDateFrom);
        String to = (localDateTo == null) ? "*" : getThreadLocalDateFormat().format(localDateTo);
        return "valid_from:["+from+" TO "+to+"]";
    }

    /*
    public void setQueryParamsTo(SolrQuery sq) {
        String from = (localDateFrom == null) ? "*" : getThreadLocalDateFormat().format(localDateFrom);
        String to = (localDateTo == null) ? "*" : getThreadLocalDateFormat().format(localDateTo);
        sq.addFilterQuery("valid_from:["+from+" TO "+to+"]");
    }
    */
}
