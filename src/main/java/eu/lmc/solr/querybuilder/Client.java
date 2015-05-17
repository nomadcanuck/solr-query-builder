package eu.lmc.solr.querybuilder;

public class Client {

    /*
    public static void main(String[] args) throws IOException, SolrServerException {

        SolrClient client = new HttpSolrClient("http://localhost:8983/solr/jds");

        SolrQuery query = new SolrQuery();
        //query.setQuery("title:delnik valid_from:*");
        //query.addSort("salarymax", SolrQuery.ORDER.desc);


        //query.setRequestHandler("/browse");
        //HOW TO EXPORT QUERY FROM DB ??? and manage it?

        query.setParam("fq","profese:delnik");

        try {
            QueryResponse rsp = client.query(query);
            SolrDocumentList docs = rsp.getResults();
            for (SolrDocument sd : docs) {
                System.out.println(sd);
            }

        } catch (SolrServerException e) {
            e.printStackTrace();
        }



    }
    */
}