    import java.awt.ActionEven;
    import java.awt.ActionListner;

public class Graphics extends JPanel implements ActionListener{
    private Timer t new (100, this);
    public String state;
    t.start();
    state = "START";

    private Snake s;
    private Food f;

    Private Game g;

    public Graphics() {
        t.start();
    }

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

            }
    @Override
    public void actionPerformed(actionEvent e){
        repaint();
    }

}
