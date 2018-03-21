package wtf.mephiztopheles.html;

import java.util.Map;

public class Style extends Element {


    private final Map<String, Map<String, String>> style;

    public Style(Map<String, Map<String, String>> style) {
        this.style = style;
    }

    @Override
    public String getName() {
        return "style";
    }

    @Override
    public void build(StringBuilder stringBuilder) {


        buildStartTag(stringBuilder, null);

        for (Map.Entry<String, Map<String, String>> declarationEntry : style.entrySet()) {

            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(declarationEntry.getKey());
            stringBuilder.append('{');

            for (Map.Entry<String, String> styleEntry : declarationEntry.getValue().entrySet()) {

                stringBuilder.append(System.lineSeparator());
                stringBuilder.append(styleEntry.getKey());
                stringBuilder.append(':');
                stringBuilder.append(styleEntry.getValue());
                stringBuilder.append(';');
            }

            stringBuilder.append(System.lineSeparator());
            stringBuilder.append('}');
        }

        stringBuilder.append(System.lineSeparator());
        buildEndTag(stringBuilder);
    }
}
