package Clases;

import static Ventanas.Inicio.PintarFiguras;
import static Ventanas.Inicio.jPanel1;
import java.awt.Color;

/**
 *Creacion de la clase principal AlgoritmoDijkstra.
 * @author Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
 */
public class AlgoritmoDijkstra {

    private final DatosGraficos arboles;
    private int subTope;
    private Nodo Nodoauxiliar = null;
    private double auxiliarAumulado; // es un acumulado auxiliar
    private double subtotalAcomulado;
    private final Nodo nodo[];
    private final int tope;
    private int Origen;
    private final int nodoFinal;

    
       /**
 * Con esta funcion se setean los componentes del algoritmo
 * @author Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
 */ 
    
    
    public AlgoritmoDijkstra(DatosGraficos arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Nodo[tope];
        this.Origen = permanente;
        this.nodoFinal = nodoFin;

    }

    
    /**
 * Con esta funcion se obtienen los Kilometros
 * @author Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
 */ 
    
    
    public double getKM() {
        return nodo[nodoFinal].getKM();
    }
 
    /**
 *Con esta funcion se obtiene el nodo del destino final.
 * @author Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
 */
    public int getNombre() {
        return nodo[nodoFinal].getNombre();
    }

    
    /**
 *Se implementa el algoritmo de dijkstra.
 * @author Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
 */
    public void dijkstra() {
        for (int i = 0; i < tope; i++) // creacion del vector nodo del tamaño del numero de nodos pintados 
        {
            nodo[i] = new Nodo();
        }
            jPanel1.paint(jPanel1.getGraphics());
            PintarFiguras(tope, arboles);
            PintanrDibujos.seleccionNodo(jPanel1.getGraphics(), 
                    arboles.getCordeX(Origen), 
                    arboles.getCordeY(Origen), null, Color.GREEN); // pinta de color el nodo de Origen

            nodo[Origen].setVisitado(true);
            nodo[Origen].setNombre(Origen);

            do {
                subtotalAcomulado = 0;
                auxiliarAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, a la que nunca sera mayor 
                nodo[Origen].setEtiqueta(true);
                for (int j = 0; j < tope; j++) {
                    if (arboles.getmAdyacencia(j, Origen) == 1) {
                        subtotalAcomulado = nodo[Origen].getKM() + arboles.getmCoeficiente(j, Origen);
                        
                        if (subtotalAcomulado <= nodo[j].getKM() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        } else if (nodo[j].isVisitado() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        }
                    }
                }
                
                //Encontrando Camino mas corto
                for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getKM() <= auxiliarAumulado) {
                            Origen = nodo[i].getNombre();
                            auxiliarAumulado = nodo[i].getKM();
                        }
                    }
                }
                subTope++;
            } while (subTope < tope + 1);

            Nodoauxiliar = nodo[nodoFinal];
            
            //Pintando caminos recorridos
            while (Nodoauxiliar.getPredecesor() != null) {
                PintanrDibujos.pinta_Camino(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()),
                        arboles.getCordeY(Nodoauxiliar.getNombre()),
                        arboles.getCordeX(Nodoauxiliar.getPredecesor().getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);
                
                PintanrDibujos.seleccionNodo(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getNombre()), null, Color.BLUE);
                Nodoauxiliar = Nodoauxiliar.getPredecesor();
            }//fin de while Recorriendo caminos
            
            PintanrDibujos.seleccionNodo(jPanel1.getGraphics(), 
                    arboles.getCordeX(nodoFinal), 
                    arboles.getCordeY(nodoFinal), null, Color.RED);//Pintando Nodo del destino
        
    }

}
