import eu.lmc.solr.querybuilder.parser.XMLtoSvlList;
import eu.lmc.solr.querybuilder.parser.svlList;

/**
 * Created by avecherskaya on 20/04/15.
 */
public class TestParser {
    public static void main(String[] args) {
        svlList sv = XMLtoSvlList.parseFromXML("/Users/avecherskaya/IdeaProjects/vyhledavac.v1/src/main/resources/1000.xml");
        System.out.println(sv.toString());
    }
}
