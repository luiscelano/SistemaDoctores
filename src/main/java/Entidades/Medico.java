package Entidades;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luis Eduardo Alvarado Celano
 * Carnet: 0900-20-7376
 * Ing. en Sistemas
 */
public class Medico {

    /**
     * @return codigo medico
     */
    public Integer getlIntCodigo() {
        return lIntCodigo;
    }

    /**
     * @param lIntCodigo es asignado al codigo medico
     */
    public void setlIntCodigo(Integer lIntCodigo) {
        this.lIntCodigo = lIntCodigo;
    }

    /**
     * @return especialidad del medico
     */
    public String getlStrEspecialidad() {
        return lStrEspecialidad;
    }

    /**
     * @param lStrEspecialidad es asignado a la especialidad del medico
     */
    public void setlStrEspecialidad(String lStrEspecialidad) {
        this.lStrEspecialidad = lStrEspecialidad;
    }

    /**
     * @return disponibilidad del medico
     */
    public String getlStrDisponibilidad() {
        return lStrDisponibilidad;
    }

    /**
     * @param lStrDisponibilidad es asignado a la disponibilidad del medico
     */
    public void setlStrDisponibilidad(String lStrDisponibilidad) {
        this.lStrDisponibilidad = lStrDisponibilidad;
    }

    /**
     * @return Primer nombre del medico
     */
    public String getlStrPrimerNombre() {
        return lStrPrimerNombre;
    }

    /**
     * @param lStrPrimerNombre es asignado al primer nombre del medico
     */
    public void setlStrPrimerNombre(String lStrPrimerNombre) {
        this.lStrPrimerNombre = lStrPrimerNombre;
    }

    /**
     * @return Segundo nombre del medico
     */
    public String getlStrSegundoNombre() {
        return lStrSegundoNombre;
    }

    /**
     * @param lStrSegundoNombre es asignado al segundo nombre del medico
     */
    public void setlStrSegundoNombre(String lStrSegundoNombre) {
        this.lStrSegundoNombre = lStrSegundoNombre;
    }

    /**
     * @return Primer apellido del medico
     */
    public String getlStrPrimerApellido() {
        return lStrPrimerApellido;
    }

    /**
     * @param lStrPrimerApellido es asignado al primer apellido del medico
     */
    public void setlStrPrimerApellido(String lStrPrimerApellido) {
        this.lStrPrimerApellido = lStrPrimerApellido;
    }

    /**
     * @return Segundo apellido del medico
     */
    public String getlStrSegundoApellido() {
        return lStrSegundoApellido;
    }

    /**
     * @param lStrSegundoApellido es asignado al segundo apellido del medico
     */
    public void setlStrSegundoApellido(String lStrSegundoApellido) {
        this.lStrSegundoApellido = lStrSegundoApellido;
    }

    /**
     * @return Celular del medico
     */
    public Long getlLongCelular() {
        return lLongCelular;
    }

    /**
     * @param lLongCelular es asignado al celular del medico
     */
    public void setlLongCelular(Long lLongCelular) {
        this.lLongCelular = lLongCelular;
    }

    /**
     * @return Telefono del medico
     */
    public Long getlLongTelefono() {
        return lLongTelefono;
    }

    /**
     * @param lLongTelefono es asignado al telefono del medico
     */
    public void setlLongTelefono(Long lLongTelefono) {
        this.lLongTelefono = lLongTelefono;
    }

    /**
     * @return Hora de entrada del medico
     */
    public String getlStrHoraEntrada() {
        return lStrHoraEntrada;
    }

    /**
     * @param lStrHoraEntrada asigna la hora de entrada del medico
     */
    public void setlStrHoraEntrada(String lStrHoraEntrada) {
        this.lStrHoraEntrada = lStrHoraEntrada;
    }

    /**
     * @return Hora de salida del medico
     */
    public String getlStrHoraSalida() {
        return lStrHoraSalida;
    }

    /**
     * @param lStrHoraSalida asigna la hora de salida del medico
     */
    public void setlStrHoraSalida(String lStrHoraSalida) {
        this.lStrHoraSalida = lStrHoraSalida;
    }

    /**
     * @return Turnos maximos del medico
     */
    public Integer getlIntTurnosMaximos() {
        return lIntTurnosMaximos;
    }

    /**
     * @param lIntTurnosMaximos asigna los turnos maximos del medico
     */
    public void setlIntTurnosMaximos(Integer lIntTurnosMaximos) {
        this.lIntTurnosMaximos = lIntTurnosMaximos;
    }

    /**
     * @return Sexo del medico
     */
    public String getlStrSexo() {
        return lStrSexo;
    }

    /**
     * @param lStrSexo asigna el sexo del medico
     */
    public void setlStrSexo(String lStrSexo) {
        this.lStrSexo = lStrSexo;
    }
    private Integer lIntCodigo;
    private String lStrEspecialidad;
    private String lStrDisponibilidad;
    private String lStrPrimerNombre;
    private String lStrSegundoNombre;
    private String lStrPrimerApellido;
    private String lStrSegundoApellido;
    private Long lLongCelular;
    private Long lLongTelefono;
    private String lStrHoraEntrada;
    private String lStrHoraSalida;
    private Integer lIntTurnosMaximos;
    private String lStrSexo;
    
     public void setLine(ResultSet response) throws SQLException {
        this.setlIntCodigo(Integer.parseInt(response.getString("CODIGO")));
        this.setlStrEspecialidad(response.getString("ESPECIALIDAD"));
        this.setlStrDisponibilidad(response.getString("DISPONIBILIDAD"));
        this.setlStrPrimerNombre(response.getString("PRIMERNOMBRE"));
        this.setlStrSegundoNombre(response.getString("SEGUNDONOMBRE"));
        this.setlStrPrimerApellido(response.getString("PRIMERAPELLIDO"));
        this.setlStrSegundoApellido(response.getString("SEGUNDOAPELLIDO"));
        this.setlLongCelular(Long.parseLong(response.getString("CELULAR")));
        this.setlLongTelefono(Long.parseLong(response.getString("TELEFONO")));
        this.setlStrHoraEntrada(response.getString("HORAENTRADA"));
        this.setlStrHoraSalida(response.getString("HORASALIDA"));
        this.setlIntTurnosMaximos(Integer.parseInt(response.getString("MAXTURNOS")));
        this.setlStrSexo(response.getString("SEXO"));
    }
    
     public Object[] getTableRow() {
         return new Object[]{
             getlIntCodigo(),
             getlStrEspecialidad(),
             getlStrDisponibilidad(),
             getlStrPrimerNombre(),
             getlStrSegundoNombre(),
             getlStrPrimerApellido(),
             getlStrSegundoApellido(),
             getlLongCelular(),
             getlLongTelefono(),
             getlStrHoraEntrada(),
             getlStrHoraSalida(),
             getlIntTurnosMaximos(),
             getlStrSexo()
         };
     }
     
    public String getInsertQuery() {
        return String.format("INSERT INTO MEDICOS(CODIGO, ESPECIALIDAD, DISPONIBILIDAD, PRIMERNOMBRE, SEGUNDONOMBRE, PRIMERAPELLIDO, SEGUNDOAPELLIDO, CELULAR, TELEFONO, HORAENTRADA, HORASALIDA, MAXTURNOS, SEXO) VALUES(%2d, '%s', '%s', '%s', '%s', '%s', '%s', %2d, %2d, '%s', '%s', %2d, '%s')"
                , lIntCodigo, lStrEspecialidad, lStrDisponibilidad, lStrPrimerNombre, lStrSegundoNombre, lStrPrimerApellido, lStrSegundoApellido, lLongCelular, lLongTelefono, lStrHoraEntrada, lStrHoraSalida, lIntTurnosMaximos, lStrSexo);
    }
}
