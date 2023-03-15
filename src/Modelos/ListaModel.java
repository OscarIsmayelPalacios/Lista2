
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class ListaModel {
    
    Queue<Clientes>  ListaClientes = new LinkedList();
    
    public void EncolarCliente(String Apellido, String Nombre)
    {
        Clientes nuevoCliente = new Clientes(Apellido, Nombre);
        this.ListaClientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "Cliente Agregado A La Lista");
    }
    
    public Queue ListarClientes()
    {
        return this.ListaClientes;
    }
    
    public void Desencolar()
    {
        this.ListaClientes.poll();
    }
    
}
