/**
 * Created by avecherskaya on 18/04/15.
 */
public class SVLComponentTest {
    /*
    public static void main(String[] args) {
        //user picks up a name, client gets its int
        //svlList list = new XMLtoSvlList().convertFromPath("/Users/avecherskaya/IdeaProjects/vyhledavac.v1/src/main/resources/212.xml");
        //int svlToQuery = list.getItem(21200032);

        SolrClient client = new HttpSolrClient("http://localhost:8983/solr/jds");
        //new query instance composed of component instances
        Container userQuery = new Container();
        //composing
        SVLComponent comp = new SVLComponent();
        //SVLComponent comp2 = new SVLComponent("idbrand",21200033);
        userQuery.addComponent(comp);

        //userQuery.addComponent(comp2);

        //userQuery.querySolr();

        //query.addSort("salarymax", SolrQuery.ORDER.desc);

        try {
            QueryResponse rsp = client.query(userQuery.processQuery());
            SolrDocumentList docs = rsp.getResults();
            for (SolrDocument sd : docs) {
                System.out.println(sd);
            }

        } catch (SolrServerException e) {
            e.printStackTrace();
        }

        //SVLComponent comp = new SVLComponent()

    }
    */
}
