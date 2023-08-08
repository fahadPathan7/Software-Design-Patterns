package protobuf_to_xml_adapter;

public class JsonToXmlAdapter implements Adapter {

    private JSON json;

    public JsonToXmlAdapter(JSON json){
        this.json = json;
    }
    @Override
    public XML convert(Object type) {
        return this.json.convertToXML();
    }

}
