
import java.awt.*;
import java.awt.event.*;

public class Max3 extends Frame implements ActionListener {
    TextField t1, t2, t3, tResult;
    Label l1, l2, l3, lMax;
    Button bFindMax;

    public Max3() {
        setLayout(new FlowLayout());

        l1 = new Label("Number 1");
        l2 = new Label("Number 2");
        l3 = new Label("Number 3");
        lMax = new Label("Maximum");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        tResult = new TextField(10);
        tResult.setEditable(false);

        bFindMax = new Button("Find Max");

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(bFindMax);
        add(lMax); add(tResult);

        bFindMax.addActionListener(this);

        setTitle("Find Maximum of Three Numbers");
        setSize(250, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ac) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int n3 = Integer.parseInt(t3.getText());
        int max = Math.max(n1, Math.max(n2, n3));
        tResult.setText(String.valueOf(max));
    }

    public static void main(String[] args) {
        new Max3();
    }
}