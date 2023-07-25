import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class miprimerSelects extends javax.swing.JFrame{
    private JPanel Jpanel;
    private JLabel txt_id;
    private JLabel TXT_NOMBRE;
    private JLabel txt_edad;
    private JLabel txt_ciudad;
    private JLabel txt_Correo;
    private JButton boton_query;
    static final String DB_URL = "jdbc:mysql://localhost/Poo_estu";
    static final String USER = "root";
    static final String PASS = "root_bas3";
    static final String QUERY = "Select * from Estudiantes";

    public JPanel getJpanel() {
        return Jpanel;
    }

    public void setJpanel(JPanel jpanel) {
        Jpanel = jpanel;
    }

    public JLabel getTxt_id() {
        return txt_id;
    }

    public void setTxt_id(JLabel txt_id) {
        this.txt_id = txt_id;
    }

    public JLabel getTXT_NOMBRE() {
        return TXT_NOMBRE;
    }

    public void setTXT_NOMBRE(JLabel TXT_NOMBRE) {
        this.TXT_NOMBRE = TXT_NOMBRE;
    }

    public JLabel getTxt_edad() {
        return txt_edad;
    }

    public void setTxt_edad(JLabel txt_edad) {
        this.txt_edad = txt_edad;
    }

    public JLabel getTxt_ciudad() {
        return txt_ciudad;
    }

    public void setTxt_ciudad(JLabel txt_ciudad) {
        this.txt_ciudad = txt_ciudad;
    }

    public JLabel getTxt_Correo() {
        return txt_Correo;
    }

    public void setTxt_Correo(JLabel txt_Correo) {
        this.txt_Correo = txt_Correo;
    }

    public JButton getBoton_query() {
        return boton_query;
    }

    public void setBoton_query(JButton boton_query) {
        this.boton_query = boton_query;
    }

    public static void main(String[] args) {
    public miprimerSelects() {
        boton_query.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(QUERY);
                ) {
                } catch (SQLException e) {
                    throw new RuntimeException(e);

                }
            }
try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
        ) {
            } catch (SQLException e)

            {
                throw new RuntimeException(e);

            }
        });
        JFrame frame = new JFrame("DATABASE");
        frame.setContentPane(new miprimerSelects().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
    }
}

