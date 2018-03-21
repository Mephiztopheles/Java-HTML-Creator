package wtf.mephiztopheles.html;

public class Test {

    public static void main(String[] args) {


        Html html = new Html();

        Node head = new Head();
        Node body = new Body();
        html.append(head);
        html.append(body);


        Node text = new Font("hallo");
        body.append(text);
        text.setAttribute("color", "green");
        body.append(SingleTag.BR);
        body.append(text);

        body.append(SingleTag.BR);
        body.append(SingleTag.HR);

        Table table = new Table();
        THead thead = new THead();
        TBody tbody = new TBody();
        table.append(thead);
        table.append(tbody);


        tbody.append(new TableRow(new TableData("TD"), new TableData("TD"), new TableData("TD")));
        tbody.append(new TableRow(new TableData("TD"), new TableData("TD"), new TableData("TD")));
        tbody.append(new TableRow(new TableData("TD"), new TableData("TD"), new TableData("TD")));

        body.append(table);


        Document doc = new Document(html);

        doc.setStyle("table", "border-collapse", "collapse");
        doc.setStyle("table", "border-spacing", "0");
        doc.setStyle("table td", "border", "1px solid");

        System.out.println(doc.build());
    }
}