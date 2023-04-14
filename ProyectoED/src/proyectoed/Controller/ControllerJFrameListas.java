/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoed.Controller;

//Eventos del teclado y mouse que se hacen en la GUI.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Importante para que el controller logre manejar la parte gráfica.
import proyectoed.View.JFrameListas;

//Importante para utilizar los datos.
import proyectoed.Model.Datos;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ControllerJFrameListas implements ActionListener {
    
    private JFrameListas formulario;

    //Declarar variable para el manejo de la lista.
    private ManejaLista listado;
    
    public ControllerJFrameListas(JFrameListas frm) {
        //Se asigna la referencia del formulario a manejar.
        this.formulario = frm;

        //Importante instanciar el manejador.
        this.listado = new ManejaLista();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Datos temp = null;
        
        switch (e.getActionCommand()) {
            case "Crear":
                //Instanciar los datos.
                temp = new Datos();

                //Se rellena el objeto con los datos de la interfaz.
                temp.SetNumero(this.formulario.GetNumero());
                temp.SetCedula(this.formulario.GetCedula());
                temp.SetNombreCompleto(this.formulario.GetNombreCompleto());
                temp.SetDescripcion(this.formulario.GetDescripcion());
                temp.SetNombreTarea(this.formulario.GetNombreTarea());
                temp.SetEstado(this.formulario.GetEstado());
                temp.SetPrioridad(this.formulario.GetPrioridad());

                //Se almacenan los datos en la lista.
                this.listado.Crear(temp);

                //Se notifica al usuario.
                JOptionPane.showMessageDialog(null, "**Tarea creada correctamente**");

                //Se limpia la pantalla.
                this.formulario.LimpiarPantalla();
                
                break;
            
            case "Consultar":
                //Se consulta el número de lista almacenada.
                temp = this.listado.Consultar(this.formulario.GetNumero());

                //Se debe de llenar el front-end con los datos del objeto.
                this.formulario.SetCedula(temp.GetCedula());
                this.formulario.SetNombreCompleto(temp.GetNombreCompleto());
                this.formulario.SetDescripcion(temp.GetDescripcion());
                this.formulario.SetNombreTarea(temp.GetNombreTarea());
                this.formulario.SetEstado(temp.GetEstado());
                this.formulario.SetPrioridad(temp.GetPrioridad());
                
                JOptionPane.showMessageDialog(null, "**Datos desplegados**");
                
                break;
            
            case "Modificar":
                //Instanciar los datos.
                temp = new Datos();

                //Se debe de rellenar con los nuevos datos a nivel de front-end.
                temp.SetNumero(this.formulario.GetNumero());
                temp.SetCedula(this.formulario.GetCedula());
                temp.SetNombreCompleto(this.formulario.GetNombreCompleto());
                temp.SetDescripcion(this.formulario.GetDescripcion());
                temp.SetNombreTarea(this.formulario.GetNombreTarea());
                temp.SetEstado(this.formulario.GetEstado());
                temp.SetPrioridad(this.formulario.GetPrioridad());
                
                this.listado.Modificar(temp);
                this.formulario.LimpiarPantalla();
                
                JOptionPane.showMessageDialog(null, "**Tarea modificada correctamente**");
                
                break;
            
            case "Eliminar":
                //Instanciar los datos.
                temp = new Datos();

                //Se rellena el objeto con los datos de la interfaz.
                temp.SetNumero(this.formulario.GetNumero());
                temp.SetCedula(this.formulario.GetCedula());
                temp.SetNombreCompleto(this.formulario.GetNombreCompleto());
                temp.SetDescripcion(this.formulario.GetDescripcion());
                temp.SetNombreTarea(this.formulario.GetNombreTarea());
                temp.SetEstado(this.formulario.GetEstado());
                temp.SetPrioridad(this.formulario.GetPrioridad());
                
                this.listado.Eliminar(temp);
                this.formulario.LimpiarPantalla();
                
                JOptionPane.showMessageDialog(null, "**Tarea eliminada correctamente**");
                
                break;
            
            case "Limpiar":
                this.formulario.LimpiarPantalla();
                break;
            
            case "Lista por estados":
                //Se consulta el número de lista almacenada.
                String[] opciones = {"Completadas", "En progreso", "Canceladas"};
                
                int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "**Lista por estados**", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
                this.listado.consultarEstado(seleccion);
                
                break;
                
            case "Lista por prioridad":
                //Se consulta el número de lista almacenada.
                String[] opciones2 = {"Alta", "Media", "Baja"};
                
                int seleccion2 = JOptionPane.showOptionDialog(null, "Selecciona una opción", "**Lista por prioridad**", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones2, opciones2[0]);
                this.listado.consultarPrioridad(seleccion2);
                
                break;
                
        }
        
    }
    
}
