package wtf.mephiztopheles.html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Element extends Tag {

    protected List<Node> children = new ArrayList<>();
    protected String text;
    protected String html;
    private Map<String, String> attributes = new HashMap<>();

    public Element(){

    }

    public Element(String text) {
        setText(text);
    }

    @Override
    public Node getChild(int index) {
        return children.get(index);
    }

    @Override
    public void setText(String text) {

        this.text = text;
        html = null;
        children.clear();
    }

    @Override
    public void setHtml(String html) {

        this.html = html;
        text = null;
        children.clear();
    }

    @Override
    public void setAttribute(String attribute, String value) {
        attributes.put(attribute, value);
    }

    @Override
    public void append(Node node) {

        if (node == null)
            return;

        if (!(node instanceof SingleTag) && children.contains(node))
            remove(node);

        children.add(node);
    }

    @Override
    public void remove(Node node) {
        children.remove(node);
    }

    public void clear() {
        children.clear();
    }

    @Override
    public void build(StringBuilder stringBuilder) {

        buildStartTag(stringBuilder, attributes);

        if (text != null)
            stringBuilder.append(text);
        else if (html != null)
            stringBuilder.append(html);
        else
            for (Node node : children)
                node.build(stringBuilder);

        buildEndTag(stringBuilder);
    }
}
