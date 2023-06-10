import UMLeditor.MainFrame;
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
                MainFrame Frame = new MainFrame();
            }
        });
    }
}