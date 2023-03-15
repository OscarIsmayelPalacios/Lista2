
import Controladores.ListasController;
import Modelos.ListaModel;
import Vistas.frmListas;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frmListas VistaListas = new frmListas(null, true);
        ListaModel modeloVistas = new ListaModel();
        ListasController controladorLista = new ListasController(VistaListas, modeloVistas);
        
    }
    
}
