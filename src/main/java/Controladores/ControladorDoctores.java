package Controladores;

import Entidades.Medico;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Eduardo Alvarado Celano
 * Carnet: 0900-20-7376
 * Ing. en Sistemas
 */
public class ControladorDoctores {
    
    /**
     * Agrega un nuevo doctor al registro
     * @param medico Datos del medico a registrar
     */
    public void CrearDoctor(Medico medico) {
        try {
            DatabaseService server = new DatabaseService();
            System.out.println(medico.getInsertQuery());
            server.query(medico.getInsertQuery());
            JOptionPane.showMessageDialog(null, "Medico guardado correctamente!");
        } catch (Exception e) {
            System.err.println(e.toString());
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    /**
    * Obtiene todos los medicos registrados
    */
    public DefaultTableModel verDoctores() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CODIGO");
        model.addColumn("ESPECIALIDAD");
        model.addColumn("DISPONIBILIDAD");
        model.addColumn("PRIMER NOMBRE");
        model.addColumn("SEGUNDO NOMBRE");
        model.addColumn("PRIMER APELLIDO");
        model.addColumn("SEGUNDO APELLIDO");
        model.addColumn("CELULAR");
        model.addColumn("TELEFONO");
        model.addColumn("HORA ENTRADA");
        model.addColumn("HORA SALIDA");
        model.addColumn("TURNOS MAXIMOS");
        model.addColumn("SEXO");
        try {
            DatabaseService server = new DatabaseService();
            String query = "SELECT * FROM MEDICOS";
            
            ResultSet response = server.query(query); //hace el llamado a la tabla
            System.out.println(response);
            while(response.next()) {
                Medico medico = new Medico();
                medico.setLine(response); //guarda los datos en la entidad
                model.addRow(medico.getTableRow()); // obtiene el objeto de la entidad y lo asigna al modelo de la tabla
            }
            return model;
        } catch (Exception e) {
            throw new Error(e.toString());
        }
    }
}
