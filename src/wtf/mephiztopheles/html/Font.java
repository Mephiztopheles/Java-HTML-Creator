package wtf.mephiztopheles.html;

public class Font extends Element {

    @Override
    public String getName() {
        return "font";
    }

    public Font(String text) {
        setText(text);
    }
}
