
package Controladores;

import Modelos.Clientes;
import Modelos.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;


public class ListasController implements ActionListener{
    
    frmListas vistaLista;
    ListaModel modeloVistas;

    public ListasController(frmListas vistaLista, ListaModel modeloVistas) {
        this.vistaLista = vistaLista;
        this.modeloVistas = modeloVistas;
        
        //Poner a la escucha botones
        
        this.vistaLista.btnIngresarClientes.addActionListener(this);
        this.vistaLista.btnAtenderClientes.addActionListener(this);
        this.vistaLista.btnAtenderTodos.addActionListener(this);
        
        //Poner a la escuhca la Vista
        
        this.vistaLista.setLocationRelativeTo(null);
        this.vistaLista.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.vistaLista.btnIngresarClientes)
        {
            this.modeloVistas.EncolarCliente(this.vistaLista.txtApellidos.getText(), this.vistaLista.txtNombre.getText());
           
            //Trae la lista clientes desde el modelo
            Queue<Clientes>listalocal = this.modeloVistas.ListarClientes();
            
            //Mostrar los datos en el text area
            String cadena = "";
            for(Clientes ListaModel: listalocal)
            {
                cadena = cadena + ListaModel.getApellidos()+" "+ListaModel.getNombre()+"\n";
                this.vistaLista.txtListaClientes.setText(cadena);   
            }
        }
        
        if(e.getSource() == this.vistaLista.btnAtenderClientes)
        {
            
        }
    }   
}
