package component;

/**
 * Created by avecherskaya on 15/04/15.
 */
public class GeoSearchComponent extends Component {

    private int id;

    public GeoSearchComponent(){
        this.id = maxID++;
    }

    @Override
    public String getQueryString() {
        return null;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public ComponentType getType(){
        return ComponentType.QUERY;
    }
}
