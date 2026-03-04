import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gestion implements ActionListener {
    private JTextField funcion;

    public Gestion(JTextField funcion) {
        this.funcion = funcion;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String f = funcion.getText().trim();
            Expression exp = new ExpressionBuilder(f)
                .variable("x")
                .build();
                exp.setVariable("x", 2);
            double resultado = exp.evaluate();
            JOptionPane.showMessageDialog(null, "El resultado de evaluar la función es: " + resultado);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al evaluar la función.", null, JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
