package protobuf_to_xml_adapter;

public class ProtobufToXmlAdapter implements Adapter {
    private Protobuf protobuf;

    public ProtobufToXmlAdapter(Protobuf protobuf){
        this.protobuf = protobuf;
    }
    @Override
    public XML convert(Object type) {
        return this.protobuf.convertToXML();
    }

}