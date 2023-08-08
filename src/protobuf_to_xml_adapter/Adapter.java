package protobuf_to_xml_adapter;

public interface Adapter<T>{
    XML convert(T type);
}