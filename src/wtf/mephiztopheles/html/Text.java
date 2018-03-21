package wtf.mephiztopheles.html;

public class Text extends Element {

    public Text(String text) {
        setText(text);
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void build(StringBuilder stringBuilder) {

        if (text != null)
            stringBuilder.append(text);
    }
}
