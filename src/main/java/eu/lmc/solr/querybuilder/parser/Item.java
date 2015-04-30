package eu.lmc.solr.querybuilder.parser;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

@XStreamAlias("item")
@XStreamConverter(value=ToAttributedValueConverter.class, strings={"name"})
public class Item {

    @XStreamAsAttribute
    private int id;

    @XStreamAlias("item")
    private String name;
    //constructor
    public Item(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}

