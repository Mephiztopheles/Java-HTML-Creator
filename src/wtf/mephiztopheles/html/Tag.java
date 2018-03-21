package wtf.mephiztopheles.html;

import java.util.Map;

public abstract class Tag implements Node {

    protected void buildStartTag(StringBuilder stringBuilder, Map<String, String> attributes) {

        stringBuilder.append('<');
        stringBuilder.append(getName());

        if (attributes != null && !attributes.isEmpty()) {


            for (Map.Entry<String, String> entry : attributes.entrySet()) {

                stringBuilder.append(' ');
                stringBuilder.append(entry.getKey());
                stringBuilder.append('=');
                stringBuilder.append('"');
                stringBuilder.append(entry.getValue());
                stringBuilder.append('"');
            }
        }

        stringBuilder.append('>');
    }

    protected void buildEndTag(StringBuilder stringBuilder) {

        stringBuilder.append('<');
        stringBuilder.append('/');
        stringBuilder.append(getName());
        stringBuilder.append('>');
    }
}
