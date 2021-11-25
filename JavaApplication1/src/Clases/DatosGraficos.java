package Clases;

public class DatosGraficos {

    private final double MatrizCoeficiente[][] = new double[51][51];
    private final int MatrizAdyacencia[][] = new int[51][51];
    private final int cordenadaX[] = new int[51];
    private final int cordenadaY[] = new int[51];
    private final String nombre[] = new String[51];
    private int enArbol[];

    /**
     *@author Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
     * 
     */
    public DatosGraficos() {

    }

    /**
     * Se encarga de obtener las rutas para el usuario. 
     * 
     */
    public double getmCoeficiente(int i, int j) {
        return MatrizCoeficiente[i][j];
    }
/**
     **Se encarga de obtener las rutas entre los nodos, junto a sus pesos.
     * 
     */
    public int getmAdyacencia(int i, int j) {
        return MatrizAdyacencia[i][j];
    }
/**
     * En esta clase se obtiene la coordenada x 
     * 
     */
    public int getCordeX(int i) {
        return cordenadaX[i];
    }
/**
     * En esta clase se obtiene la coordenada Y
     * 
     */
    public int getCordeY(int i) {
        return cordenadaY[i];
    }
/**
     *Establece el nombre de los nodos.
     *
     */
    public String getNombre(int i) {
        return nombre[i];
    }
/**
     *Se encarga de elegir el sitio.
     * 
     */
    public int getEnArbol(int i) {
        return enArbol[i];
    }
/**
     *Se encarga de habilitar las rutas para el usuario.
     * 
     */
    public void setmCoeficiente(int i, int j, double mCoeficiente) {
        this.MatrizCoeficiente[i][j] = mCoeficiente;
    }
/**
     *Se encarga de crear las rutas entre los nodos, junto a sus pesos.
     * 
     */
    public void setmAdyacencia(int i, int j, int mAdyacencia) {
        this.MatrizAdyacencia[i][j] = mAdyacencia;
    }
/**
     * *Se encarga de tomar la coordenada X de los nodos principales.
     * 
     */
    public void setCordeX(int i, int cordeX) {
        this.cordenadaX[i] = cordeX;
    }
/**
     *Se encarga de tomar la coordenada Y de los nodos principales.
     * 
     */
    public void setCordeY(int i, int cordeY) {
        this.cordenadaY[i] = cordeY;
    }
/**
     *Se encarga de setear el nombre
     * 
     */
    public void setNombre(int i, String nombre) {
        this.nombre[i] = nombre;
    }
/**
     *Esta funcion permite conectar los nodos principales.
     * 
     */
    public void setEnArbol(int i, int enArbol) {
        this.enArbol[i] = enArbol;
    }
/**
     *Esta funcion permite conectar los nodos principales.
     */
    public void crearEnArbol(int i) {
        enArbol = new int[i];
    }

}
