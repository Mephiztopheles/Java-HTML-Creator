package wtf.mephiztopheles.html;

public class TableData extends Element {

    public TableData(Node child) {
        append(child);
    }

    public TableData(String text) {
        super(text);
    }


    @Override
    public String getName() {
        return "td";
    }
}
