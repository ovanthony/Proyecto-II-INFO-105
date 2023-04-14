/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoed.Controller;

//Es muy importante para crear un listado de tiquetes.
import proyectoed.Model.Datos;
import java.util.LinkedList;

public class ManejaLista {

    //Declaración de variable lista.
    private LinkedList<Datos> lista;

    public ManejaLista() {
        this.lista = new LinkedList<Datos>();
    }

    //Métiodo encargado de guardar.
    public void Crear(Datos lis) {
        this.lista.add(lis);
    }

    //Método encargado de consultar la lista.
    public Datos Consultar(String numero) {
        //Variable para almacenar la información de la lista a buscar.
        Datos temp = null;

        for (Datos item : this.lista) {
            //Se valida si el número es igual al número a consultar.
            if (item.GetNumero().equals(numero)) {
                //Se almacena la lista a consultar.
                temp = item;

            }
        }
        //Se retorna la lista encontrada.
        return temp;

    }

    //Método encargado para eliminar.
    public void Eliminar(Datos lis) {
        //Se elimina el dato de la lista.
        int index = 0;

        for (Datos item : this.lista) {
            if (item.GetNumero().equals(lis.GetNumero())) {
                index = this.lista.indexOf(item);
            }
        }
        this.lista.remove(index);

    }

    //Método de modificar.
    public void Modificar(Datos lis) {
        for (Datos item : this.lista) {
            if (item.GetNumero().equals(lis.GetNumero())) {
                item.SetCedula(lis.GetCedula());
                item.SetNombreCompleto(lis.GetNombreCompleto());
                item.SetNumero(lis.GetNumero());
                item.SetDescripcion(lis.GetDescripcion());
                item.SetNombreTarea(lis.GetNombreTarea());
                item.SetEstado(lis.GetEstado());
                item.SetPrioridad(lis.GetPrioridad());

            }

        }

    }

    public Datos consultarPrioridad(int prioridad) {
        Datos temp = null;
        Object[] row2 = new Object[7];
        String opciones2 = "**Lista de tareas por prioridad**";

        for (int i = 0; i < lista.size(); i++) {
            if (prioridad == this.lista.get(i).GetPrioridad()) {
                row2[0] = this.lista.get(i).GetNumero();
                row2[1] = this.lista.get(i).GetNombreCompleto();
                row2[2] = this.lista.get(i).GetCedula();
                row2[3] = this.lista.get(i).GetNombreTarea();

                if (this.lista.get(i).GetEstado() == 0) {
                    row2[4] = "Completada";
                } else {
                    if (this.lista.get(i).GetEstado() == 1) {
                        row2[4] = "En progreso";
                    } else {
                        row2[4] = "Cancelada";
                    }
                }

                if (this.lista.get(i).GetPrioridad() == 0) {
                    row2[5] = "Alta";
                } else {
                    if (this.lista.get(i).GetPrioridad() == 1) {
                        row2[5] = "Media";
                    } else {
                        row2[5] = "Baja";
                    }
                }

                row2[6] = this.lista.get(i).GetDescripcion();

                opciones2 += "\nNúmero de tarea: " + row2[0];
                opciones2 += "\nNombre: " + row2[1];
                opciones2 += "\nCédula: " + row2[2];
                opciones2 += "\nNombre de tarea: " + row2[3];
                opciones2 += "\nEstado: " + row2[4];
                opciones2 += "\nPrioridad: " + row2[5];
                opciones2 += "\nDescrpción: " + row2[6] + "\n";

            }

        }
        for (int i = 0; i < 3; ++i) {
            System.out.println();
        }
        System.out.println(opciones2);

        return temp;
    }

    public Datos consultarEstado(int estado) {;
        Object[] row = new Object[7];
        Datos temp = null;
        String opciones = "**Lista de tareas por estado**";

        for (int i = 0; i < lista.size(); i++) {
            if (estado == this.lista.get(i).GetEstado()) {
                row[0] = this.lista.get(i).GetNumero();
                row[1] = this.lista.get(i).GetNombreCompleto();
                row[2] = this.lista.get(i).GetCedula();
                row[3] = this.lista.get(i).GetNombreTarea();

                if (this.lista.get(i).GetEstado() == 0) {
                    row[4] = "Completada";
                } else {
                    if (this.lista.get(i).GetEstado() == 1) {
                        row[4] = "En progreso";
                    } else {
                        row[4] = "Cancelada";
                    }
                }

                if (this.lista.get(i).GetPrioridad() == 0) {
                    row[5] = "Alta";
                } else {
                    if (this.lista.get(i).GetPrioridad() == 1) {
                        row[5] = "Media";
                    } else {
                        row[5] = "Baja";
                    }
                }

                row[6] = this.lista.get(i).GetDescripcion();

                opciones += "\nNúmero de tarea: " + row[0];
                opciones += "\nNombre: " + row[1];
                opciones += "\nCédula: " + row[2];
                opciones += "\nNombre de tarea: " + row[3];
                opciones += "\nEstado: " + row[4];
                opciones += "\nPrioridad: " + row[5];
                opciones += "\nDescrpción: " + row[6] + "\n";

            }

        }
        for (int i = 0; i < 3; ++i) {
            System.out.println();
        }
        System.out.println(opciones);

        return temp;
    }

}
