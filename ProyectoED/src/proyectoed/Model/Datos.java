/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoed.Model;

public class Datos {

    private String Numero, Cedula, NombreCompleto, Descripcion, NombreTarea;
    private int Estado, Prioridad;

    public void SetEstado(int ID) {
        this.Estado = ID;
    }

    public int GetEstado() {
        return this.Estado;
    }
    
    public void SetPrioridad(int ID) {
        this.Prioridad = ID;
    }

    public int GetPrioridad() {
        return this.Prioridad;
    }
    
    public void SetNumero(String valor) {
        this.Numero = valor;
    }

    public String GetNumero() {
        return this.Numero;
    }

    public void SetCedula(String Ced) {
        this.Cedula = Ced;
    }

    public String GetCedula() {
        return this.Cedula;
    }

    public void SetNombreCompleto(String nomb) {
        this.NombreCompleto = nomb;
    }

    public String GetNombreCompleto() {
        return this.NombreCompleto;
    }
    
    public void SetDescripcion(String desc) {
        this.Descripcion = desc;
    }

    public String GetDescripcion() {
        return this.Descripcion;
    }
    
    public void SetNombreTarea(String nombtarea) {
        this.NombreTarea = nombtarea;
    }

    public String GetNombreTarea() {
        return this.NombreTarea;
    }
    
}
