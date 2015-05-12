package parser;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;


@XStreamAlias("svlList")
public class svlList {
    @XStreamImplicit
    private ArrayList<Item> list = new ArrayList<Item>();

    public ArrayList getList(svlList sl){
        return sl.list;
    }

    public Item getItem(int key) {
        for (Item i : list) {
            if (i.getId() == key) return i;
        }
        return null;
    }

    public void addItem(Item item){
        list.add(item);
    }


}