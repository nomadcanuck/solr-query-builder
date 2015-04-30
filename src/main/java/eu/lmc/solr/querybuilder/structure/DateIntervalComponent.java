package eu.lmc.solr.querybuilder.structure;

import org.apache.solr.client.solrj.SolrQuery;

import java.time.LocalDate;

import static org.apache.solr.common.util.DateUtil.getThreadLocalDateFormat;

/**
 * Created by avecherskaya on 15/04/15.
 */
public class DateIntervalComponent extends Component {
    private LocalDate localDateFrom;
    private LocalDate localDateTo;

    public DateIntervalComponent(LocalDate localDateFrom, LocalDate localDateTo) {
        this.localDateFrom = localDateFrom;
        this.localDateTo = localDateTo;
    }

    @Override
    public void setQueryParamsTo(SolrQuery sq) {
        String from = (localDateFrom == null) ? "*" : getThreadLocalDateFormat().format(localDateFrom);
        String to = (localDateTo == null) ? "*" : getThreadLocalDateFormat().format(localDateTo);
        sq.addFilterQuery("valid_from:["+from+" TO "+to+"]");
    }
}
