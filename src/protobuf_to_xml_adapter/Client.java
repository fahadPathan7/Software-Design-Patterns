package protobuf_to_xml_adapter;

public class Client {
    public static void main(String[] args) {
        JSON json = new JSON("json data");
        Adapter adapter = new JsonToXmlAdapter(json);
        XML xml = adapter.convert(json);


        Protobuf protobuf = new Protobuf("protobuf data");
        adapter = new ProtobufToXmlAdapter(protobuf);
        xml = adapter.convert(protobuf);
    }
}
