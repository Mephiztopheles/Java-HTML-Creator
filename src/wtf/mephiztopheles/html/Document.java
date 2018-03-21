package wtf.mephiztopheles.html;

import java.util.HashMap;
import java.util.Map;

public class Document {

    private final Node html;
    private final Map<String, Map<String, String>> style = new HashMap<>();

    public Document(Node html) {
        this.html = html;
    }

    public void setStyle(String declaration, String key, String value) {
        Map<String, String> definitions = style.get(declaration);

        if (definitions == null) {
            definitions = new HashMap<>();
            style.put(declaration, definitions);
        }

        definitions.put(key, value);
    }

    public String build() {

        StringBuilder sb = new StringBuilder();
        Node firstChild = html.getChild(0);

        if (firstChild instanceof Head)
            firstChild.append(new Style(style));
        html.build(sb);

        return sb.toString();
    }
}
