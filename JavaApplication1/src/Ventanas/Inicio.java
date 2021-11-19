package Ventanas;

import Clases.DatosGraficos;
import Clases.PintanrDibujos;
import Clases.AlgoritmoDijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Team
 */
public class Inicio extends javax.swing.JFrame {

    private int Numerotope = 0;//Numero de nodos 
    
    DatosGraficos arboles = new DatosGraficos();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public Inicio() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarCaminos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        colorOrigen = new javax.swing.JLabel();
        colorDestino = new javax.swing.JLabel();
        colorNodoVisitado = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ImgMapa = new javax.swing.JLabel();
        EleccionDestino = new javax.swing.JComboBox<>();
        AyudaViajero = new javax.swing.JButton();
        BuscarCamino = new javax.swing.JButton();
        EleccionOrigen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        LateralSuperior3 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        kmRecorridos1 = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();
        kmRecorridos2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEC Maps");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1390, 729));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarCaminos.setBackground(new java.awt.Color(255, 255, 204));
        MostrarCaminos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarCaminos.setForeground(new java.awt.Color(0, 0, 204));
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 220, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorOrigen.setBackground(new java.awt.Color(51, 255, 51));
        colorOrigen.setOpaque(true);
        jPanel1.add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 20, 20));

        colorDestino.setBackground(new java.awt.Color(255, 0, 0));
        colorDestino.setOpaque(true);
        jPanel1.add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 650, 20, 20));

        colorNodoVisitado.setBackground(new java.awt.Color(0, 0, 255));
        colorNodoVisitado.setOpaque(true);
        jPanel1.add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 20, 20));

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 50, 50));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Origen ----------->");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Destino ---------->");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Nodo Recorrido ->");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 140, 30));

        ImgMapa.setIcon(new javax.swing.ImageIcon("src\\img\\Mapita.jpg"));
        ImgMapa.setMaximumSize(new java.awt.Dimension(810, 710));
        ImgMapa.setMinimumSize(new java.awt.Dimension(810, 710));
        jPanel1.add(ImgMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 840, 720));

        EleccionDestino.setBackground(new java.awt.Color(0, 153, 51));
        EleccionDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(0, 0, 153));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tour Eiffel", "Parc des Princes", "Notre-Dame", "Musée d'Orsay", "Opéra Garnier", "Arc de Triomphe", "Sacré Coeur", "République", "Cementerio Père Lachaise", "Parc de la Villette", "Place de la Nation", "Bercy", "Gare d'Austerlitz", "Stade de France", "Tour Montparnasse" }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 460, 50));

        AyudaViajero.setBackground(new java.awt.Color(0, 153, 51));
        AyudaViajero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AyudaViajero.setForeground(new java.awt.Color(51, 0, 204));
        AyudaViajero.setText("¡Ayuda al viajero!");
        AyudaViajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaViajeroActionPerformed(evt);
            }
        });
        getContentPane().add(AyudaViajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 300, 60));

        BuscarCamino.setBackground(new java.awt.Color(0, 153, 51));
        BuscarCamino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BuscarCamino.setForeground(new java.awt.Color(51, 0, 204));
        BuscarCamino.setText("Buscar Camino mas corto");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 300, 60));

        EleccionOrigen.setBackground(new java.awt.Color(0, 153, 51));
        EleccionOrigen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(0, 0, 153));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tour Eiffel", "Parc des Princes", "Notre-Dame", "Musée d'Orsay", "Opéra Garnier", "Arc de Triomphe", "Sacré Coeur", "République", "Cementerio Père Lachaise", "Parc de la Villette", "Place de la Nation", "Bercy", "Gare d'Austerlitz", "Stade de France", "Tour Montparnasse" }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 460, 50));

        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 520, 70));

        LateralSuperior3.setBackground(new java.awt.Color(255, 255, 255));
        LateralSuperior3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior3.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior3.setOpaque(true);
        getContentPane().add(LateralSuperior3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 720));

        txtDestino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Selecciona el destino:");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, 40));

        kmRecorridos.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 390, 40));

        txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("Selecciona el origen:");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 250, 40));

        kmRecorridos1.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos1.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos1.setOpaque(true);
        getContentPane().add(kmRecorridos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 140, 40));

        LateralSuperior1.setBackground(new java.awt.Color(255, 255, 255));
        LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior1.setOpaque(true);
        getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 560, 20));

        LateralSuperior2.setBackground(new java.awt.Color(255, 255, 255));
        LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior2.setText("                            Bienvenido al sistema");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 500, 30));

        kmRecorridos2.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos2.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos2.setText("          Kilometros recorridos y tiempo de llegada:");
        kmRecorridos2.setOpaque(true);
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 520, 30));

        Fondo.setBackground(new java.awt.Color(0, 153, 153));
        Fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        LateralSuperior.setBackground(new java.awt.Color(255, 255, 255));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 40, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());
        
        int Matriz[][] = {
            {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0},
            {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
        };

        double coe[][] = {
            {0, 5.7, 0, 3.3, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4.2},
            {5.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.9},
            {0, 0, 0, 2.2, 0, 0, 0, 2.9, 0, 0, 6.1, 4.4, 2.9, 0, 0},
            {3.3, 0, 2.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.3},
            {0, 0, 0, 0, 0, 3.5, 4.5, 2.8, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 3.5, 0, 4.6, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 4.5, 4.6, 0, 0, 0, 6.8, 0, 0, 0, 7.3, 0},
            {0, 0, 2.9, 0, 2.8, 0, 0, 0, 3.5, 0, 3.4, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 3.5, 0, 5.2, 3.5, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 6.8, 0, 5.2, 0, 0, 0, 0, 7.2, 0},
            {0, 0, 6.1, 0, 0, 0, 0, 3.4, 3.5, 0, 0, 2.7, 0, 0, 0},
            {0, 0, 4.4, 0, 0, 0, 0, 0, 0, 0, 2.7, 0, 0, 0, 0},
            {0, 0, 2.9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4.7},
            {0, 0, 0, 0, 0, 0, 7.3, 0, 0, 7.2, 0, 0, 0, 0, 0},
            {4.2, 3.9, 0, 3.3, 0, 0, 0, 0, 0, 0, 0, 0, 4.7, 0, 0},
        };
        double timeweight[][]={
            {0, 5.7, 0, 3.3, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4.2},
            {5.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.9},
            {0, 0, 0, 2.2, 0, 0, 0, 2.9, 0, 0, 6.1, 4.4, 2.9, 0, 0},
            {3.3, 0, 2.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.3},
            {0, 0, 0, 0, 0, 3.5, 4.5, 2.8, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 3.5, 0, 4.6, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 4.5, 4.6, 0, 0, 0, 6.8, 0, 0, 0, 7.3, 0},
            {0, 0, 2.9, 0, 2.8, 0, 0, 0, 3.5, 0, 3.4, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 3.5, 0, 5.2, 3.5, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 6.8, 0, 5.2, 0, 0, 0, 0, 7.2, 0},
            {0, 0, 6.1, 0, 0, 0, 0, 3.4, 3.5, 0, 0, 2.7, 0, 0, 0},
            {0, 0, 4.4, 0, 0, 0, 0, 0, 0, 0, 2.7, 0, 0, 0, 0},
            {0, 0, 2.9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4.7},
            {0, 0, 0, 0, 0, 0, 7.3, 0, 0, 7.2, 0, 0, 0, 0, 0},
            {4.2, 3.9, 0, 3.3, 0, 0, 0, 0, 0, 0, 0, 0, 4.7, 0, 0},

        };

        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < 15; k++) {
                double timeminutes = coe[j][k]/80 *60;
                double roundDbl = Math.round(timeminutes*100.0)/100.0;
                timeweight[j][k] = roundDbl;
        }
    }

        int xx1[] = {305, 65, 592, 425, 505, 335, 530, 660, 720, 690, 705, 750, 540, 545, 210};
        int yy1[] = {390, 550, 445, 485, 260, 250, 130, 325, 280, 190, 420, 525, 640, 38, 580};
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
      
        for (int j = 0; j < 15; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < 15; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, timeweight[j][k]);
            }
        }
        Numerotope = 15;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();

        if ("Tour Eiffel".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("Parc des Princes".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Notre-Dame".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Musée d'Orsay".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Opéra Garnier".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("Arc de Triomphe".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("Sacré Coeur".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("République".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("Cementerio Père Lachaise".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Parc de la Villette".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("Place de la Nation".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("Bercy".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("Gare d'Austerlitz".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("Stade de France".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("Tour Montparnasse".equals(nombreOrigen)) {
            origen = 14;
        }
        
        
        if ("Tour Eiffel".equals(nombreDestino)) {
            destino = 0;
        }
        if ("Parc des Princes".equals(nombreDestino)) {
            destino = 1;
        }
        if ("Notre-Dame".equals(nombreDestino)) {
            destino = 2;
        }
        if ("Musée d'Orsay".equals(nombreDestino)) {
            destino = 3;
        }
        if ("Opéra Garnier".equals(nombreDestino)) {
            destino = 4;
        }
        if ("Arc de Triomphe".equals(nombreDestino)) {
            destino = 5;
        }
        if ("Sacré Coeur".equals(nombreDestino)) {
            destino = 6;
        }
        if ("République".equals(nombreDestino)) {
            destino = 7;
        }
        if ("Cementerio Père Lachaise".equals(nombreDestino)) {
            destino = 8;
        }
        if ("Parc de la Villette".equals(nombreDestino)) {
            destino = 9;
        }
        if ("Place de la Nation".equals(nombreDestino)) {
            destino = 10;
        }
        if ("Bercy".equals(nombreDestino)) {
            destino = 11;
        }
        if ("Gare d'Austerlitz".equals(nombreDestino)) {
            destino = 12;
        }
        if ("Stade de France".equals(nombreDestino)) {
            destino = 13;
        }
        if ("Tour Montparnasse".equals(nombreDestino)) {
            destino = 14;
        }

        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
            txtKMAcumulados.setText("Intenta de nuevo!!");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("No hay ningun error :)");
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);
            double distance = Math.round((Dijkstra.getKM()*80/60)*100.0)/100.0;
            double roundDbl = Math.round(Dijkstra.getKM()*100.0)/100.0;
            kmRecorridos.setText(" "+ distance + " Km"+"         "+ roundDbl +" min");
            
        }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void AyudaViajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaViajeroActionPerformed
        new AyudaViajero().setVisible(true);
    }//GEN-LAST:event_AyudaViajeroActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AyudaViajero;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImgMapa;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior1;
    private javax.swing.JLabel LateralSuperior2;
    private javax.swing.JLabel LateralSuperior3;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel colorDestino;
    private javax.swing.JLabel colorNodoVisitado;
    private javax.swing.JLabel colorOrigen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos1;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
