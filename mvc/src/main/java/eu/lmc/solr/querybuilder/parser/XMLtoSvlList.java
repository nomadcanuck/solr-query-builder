package parser;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.*;

//class cannot have any instances: use static method only
public class XMLtoSvlList {
    //private static XMLtoSvlList PARSER = new XMLtoSvlList();

    private XMLtoSvlList() {}

    public static svlList parseFromXML(String path){

        XStream stream = new XStream(new DomDriver());
        stream.processAnnotations(Item.class);
        stream.processAnnotations(svlList.class);


        svlList list = null;
        list = (svlList)stream.fromXML(new File(path));


        //method returns a reference to svllist of items
        return list;

        /*
        StringBuffer sb = new StringBuffer();

        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            try {
                String str;
                while ((str = in.readLine()) != null) {
                    sb.append(str);
                }

            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String content = new String();
        content = sb.toString();

        */

    }

}
