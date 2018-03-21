package wtf.mephiztopheles.html;

import java.util.HashMap;
import java.util.Map;

public abstract class SingleTag extends Tag {


    public final static BR BR = new BR();
    public final static HR HR = new HR();

    private Map<String, String> attributes = new HashMap<>();

    @Override
    public Node getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setText(String text) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setHtml(String html) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setAttribute(String attribute, String value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void append(Node node) {
        throw new UnsupportedOperationException();
    }

    public void remove(Node node) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void build(StringBuilder stringBuilder) {
        buildStartTag(stringBuilder, attributes);
    }

    private static class BR extends SingleTag {

        @Override
        public String getName() {
            return "br";
        }
    }


    private static class HR extends SingleTag {

        @Override
        public String getName() {
            return "hr";
        }
    }

}
