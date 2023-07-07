import javax.swing.*;

public class form {
    private JButton cargarButton;
    private JButton guardarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public static void main(String[] args){
        JFrame frame = new JFrame("HolaMundo");
        frame.setContentPane(new HolaMundo().root);
    }


}
