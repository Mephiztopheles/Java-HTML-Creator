package wtf.mephiztopheles.html;

public class TableRow extends Element {


    public TableRow(Node... nodes) {

        for (Node node : nodes)
            append(node);
    }

    @Override
    public String getName() {
        return "tr";
    }
}
