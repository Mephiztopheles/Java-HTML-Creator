package wtf.mephiztopheles.html;

public interface Node {

    String getName();

    void setText(String text);

    void setHtml(String html);

    void setAttribute(String attribute, String value);

    void append(Node node);

    void remove(Node node);

    void clear();

    void build(StringBuilder stringBuilder);

    Node getChild(int index);
}