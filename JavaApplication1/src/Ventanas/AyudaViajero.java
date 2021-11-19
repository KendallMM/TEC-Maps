package Ventanas;

import java.util.Collections;

/**
 *
 * @author Team
 */
public class AyudaViajero extends javax.swing.JFrame {

    public AyudaViajero() {
        initComponents();
        String lugares[]= {"Tour Eiffel", "Parc des Princes", "Notre-Dame", "Musée d'Orsay", "Opéra Garnier", "Arc de Triomphe", "Sacré Coeur", "République", "Cementerio Père Lachaise", "Parc de la Villette", "Place de la Nation", "Bercy", "Gare d'Austerlitz", "Stade de France", "Tour Montparnasse" };
             for(int j=0;j<14;j++) {
                 for(int i=0;i<14-j;i++) {
                     if (lugares[i].compareTo(lugares[i+1])>0) {
                         String aux;
                         aux=lugares[i];
                         lugares[i]=lugares[i+1];
                         lugares[i+1]=aux;
                     }
                 }
             } 
        EleccionLugar.setModel(new javax.swing.DefaultComboBoxModel<>(lugares));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonSalir = new javax.swing.JButton();
        show = new javax.swing.JButton();
        EleccionLugar = new javax.swing.JComboBox<>();
        LateralSuperior3 = new javax.swing.JLabel();
        interes1 = new javax.swing.JLabel();
        gasolinera = new javax.swing.JLabel();
        restaurant = new javax.swing.JLabel();
        gas = new javax.swing.JLabel();
        rest = new javax.swing.JLabel();
        LI3 = new javax.swing.JLabel();
        numHab = new javax.swing.JLabel();
        habitantes = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        LI1 = new javax.swing.JLabel();
        LI2 = new javax.swing.JLabel();
        fondillo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEC Maps");
        setBackground(new java.awt.Color(153, 255, 255));
        setMaximumSize(new java.awt.Dimension(550, 720));
        setMinimumSize(new java.awt.Dimension(550, 720));
        setPreferredSize(new java.awt.Dimension(550, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 50, 50));

        show.setBackground(new java.awt.Color(0, 204, 255));
        show.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show.setForeground(new java.awt.Color(51, 0, 204));
        show.setText("Mostrar información");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 300, 60));

        EleccionLugar.setBackground(new java.awt.Color(153, 255, 255));
        EleccionLugar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionLugar.setForeground(new java.awt.Color(0, 0, 153));
        EleccionLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tour Eiffel", "Parc des Princes", "Notre-Dame", "Musée d'Orsay", "Opéra Garnier", "Arc de Triomphe", "Sacré Coeur", "République", "Cementerio Père Lachaise", "Parc de la Villette", "Place de la Nation", "Bercy", "Gare d'Austerlitz", "Stade de France", "Tour Montparnasse" }));
        EleccionLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionLugarActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 460, 50));

        LateralSuperior3.setBackground(new java.awt.Color(153, 255, 255));
        LateralSuperior3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior3.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior3.setOpaque(true);
        getContentPane().add(LateralSuperior3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 720));

        interes1.setBackground(new java.awt.Color(153, 255, 255));
        interes1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        interes1.setForeground(new java.awt.Color(0, 0, 0));
        interes1.setText("Lugares de interes:");
        interes1.setOpaque(true);
        getContentPane().add(interes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 480, 60));

        gasolinera.setBackground(new java.awt.Color(153, 255, 255));
        gasolinera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gasolinera.setForeground(new java.awt.Color(0, 0, 0));
        gasolinera.setText("Gasolinera cercana:");
        gasolinera.setOpaque(true);
        getContentPane().add(gasolinera, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 480, 60));

        restaurant.setBackground(new java.awt.Color(153, 255, 255));
        restaurant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        restaurant.setForeground(new java.awt.Color(0, 0, 0));
        restaurant.setText("Restaurante cercano más importante:");
        restaurant.setOpaque(true);
        getContentPane().add(restaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 480, 60));

        gas.setBackground(new java.awt.Color(153, 255, 255));
        gas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gas.setForeground(new java.awt.Color(0, 0, 153));
        gas.setText("...............");
        gas.setOpaque(true);
        getContentPane().add(gas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 480, 60));

        rest.setBackground(new java.awt.Color(153, 255, 255));
        rest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rest.setForeground(new java.awt.Color(0, 0, 153));
        rest.setText("...............");
        rest.setOpaque(true);
        getContentPane().add(rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 480, 60));

        LI3.setBackground(new java.awt.Color(153, 255, 255));
        LI3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LI3.setForeground(new java.awt.Color(0, 0, 153));
        LI3.setText("...............");
        LI3.setOpaque(true);
        getContentPane().add(LI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 480, 60));

        numHab.setBackground(new java.awt.Color(153, 255, 255));
        numHab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numHab.setForeground(new java.awt.Color(0, 0, 153));
        numHab.setText("...............");
        numHab.setOpaque(true);
        getContentPane().add(numHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 390, 60));

        habitantes.setBackground(new java.awt.Color(153, 255, 255));
        habitantes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        habitantes.setForeground(new java.awt.Color(0, 0, 0));
        habitantes.setText("Habitantes:");
        habitantes.setOpaque(true);
        getContentPane().add(habitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 60));

        txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(0, 0, 0));
        txtOrigen.setText("Selecciona el lugar:");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 250, 40));

        LateralSuperior1.setBackground(new java.awt.Color(153, 255, 255));
        LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior1.setOpaque(true);
        getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 560, 20));

        LateralSuperior2.setBackground(new java.awt.Color(153, 255, 255));
        LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior2.setText("                            ¡Ayuda al viajero!");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 500, 30));

        LateralSuperior.setBackground(new java.awt.Color(153, 255, 255));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 40, 720));

        LI1.setBackground(new java.awt.Color(153, 255, 255));
        LI1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LI1.setForeground(new java.awt.Color(0, 0, 153));
        LI1.setText("...............");
        LI1.setOpaque(true);
        getContentPane().add(LI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 480, 60));

        LI2.setBackground(new java.awt.Color(153, 255, 255));
        LI2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LI2.setForeground(new java.awt.Color(0, 0, 153));
        LI2.setText("...............");
        LI2.setOpaque(true);
        getContentPane().add(LI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 480, 60));

        fondillo.setBackground(new java.awt.Color(153, 255, 255));
        fondillo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fondillo.setForeground(new java.awt.Color(0, 0, 153));
        fondillo.setOpaque(true);
        getContentPane().add(fondillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 550, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EleccionLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionLugarActionPerformed

    }//GEN-LAST:event_EleccionLugarActionPerformed

    
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        String nombreOrigen;
        nombreOrigen = (String) EleccionLugar.getSelectedItem();

        if ("Tour Eiffel".equals(nombreOrigen)) {
            numHab.setText("230.000 personas");
            LI1.setText("☼Musée du quai Branly-Jaques Chirac");
            LI2.setText("☼Hótel Mercuere Paris Centre Tour Eiffel");
            LI3.setText("☼Champ de Mars");
            rest.setText("☼58 Tour Eiffel Restaurant");
            gas.setText("☼Station BP, cerca del Musée de L'Homme");
        }
        if ("Parc des Princes".equals(nombreOrigen)) {
            numHab.setText("146.666 personas");
            LI1.setText("☼Aquaboulevard parc aquatique");
            LI2.setText("☼Centre Commercial Passage");
            LI3.setText("☼Statue de la Liberté Paris");
            rest.setText("☼Au Chalet de Boulogne");
            gas.setText("☼Station BP Paris Versailles");
        }
        if ("Notre-Dame".equals(nombreOrigen)) {
            numHab.setText("387.456 personas");
            LI1.setText("☼La Conciergiere");
            LI2.setText("☼Saint-Jacques Tower");
            LI3.setText("☼Musée Carnavalet");
            rest.setText("☼Comme Chai Toi");
            gas.setText("☼GLC Carburant");
        }
        if ("Musée d'Orsay".equals(nombreOrigen)) {
            numHab.setText("72.380 personas");
            LI1.setText("☼Pont des Arts");
            LI2.setText("☼Musée national Eugene Delacroix");
            LI3.setText("☼Esplnade des Invalides");
            rest.setText("☼La Bonne Excuse");
            gas.setText("☼TotalEnergies");
        }
        if ("Opéra Garnier".equals(nombreOrigen)) {
            numHab.setText("423.874 personas");
            LI1.setText("☼Musée Grévin");
            LI2.setText("☼Le Manoir de Paris");
            LI3.setText("☼Libertino");
            rest.setText("☼The Family");
            gas.setText("☼TotalEnergies");
        }
        if ("Arc de Triomphe".equals(nombreOrigen)) {
            numHab.setText("189.347 personas");
            LI1.setText("☼Jardin d'Acclimatation");
            LI2.setText("☼Musée Jaquemart-André");
            LI3.setText("☼Palais Galliera");
            rest.setText("☼McDonald's");
            gas.setText("☼Station Service Eni");
        }
        if ("Sacré Coeur".equals(nombreOrigen)) {
            numHab.setText("102.321 personas");
            LI1.setText("☼E.Lecrelc CLICHY");
            LI2.setText("☼Le Millénaire");
            LI3.setText("☼Epinettes");
            rest.setText("☼Le Jardin d'en Face");
            gas.setText("☼Avia");
        }
        if ("République".equals(nombreOrigen)) {
            numHab.setText("156.342 personas");
            LI1.setText("☼Musée des Arts et Métiers");
            LI2.setText("☼Musée du Chocolat");
            LI3.setText("☼Bourse de Commerce-Pinault Collection");
            rest.setText("☼La Petite Rose des Sables");
            gas.setText("☼Avia");
        }
        if ("Cementerio Père Lachaise".equals(nombreOrigen)) {
            numHab.setText("40.402 personas");
            LI1.setText("☼L'Atelier des Lumieres");
            LI2.setText("☼Parc de Belleville");
            LI3.setText("☼Parc des Buttes-Chaumont");
            rest.setText("☼Saporo");
            gas.setText("☼Avia");
        }
        if ("Parc de la Villette".equals(nombreOrigen)) {
            numHab.setText("72.350 personas");
            LI1.setText("☼Mairie des Lilas");
            LI2.setText("☼Pantin");
            LI3.setText("☼Thaddaeus Ropac Pantin");
            rest.setText("☼Matsuba");
            gas.setText("☼Avia");
        }
        if ("Place de la Nation".equals(nombreOrigen)) {
            numHab.setText("71.320 personas");
            LI1.setText("☼Le Centre Pompidou");
            LI2.setText("☼Place de la Bastille");
            LI3.setText("☼Coulée verte René-Dumont");
            rest.setText("☼Madito");
            gas.setText("☼TotalEnergies");
        }
        if ("Bercy".equals(nombreOrigen)) {
            numHab.setText("62.345 personas");
            LI1.setText("☼Parc Zoologique de Paris");
            LI2.setText("☼Les Pavillons de Bercu-Musée des Arst Forains");
            LI3.setText("☼Leroy Merlin Ivry-sur-Seine");
            rest.setText("☼L’Auberge Aveyronnaise");
            gas.setText("☼TotalEnergies");
        }
        if ("Gare d'Austerlitz".equals(nombreOrigen)) {
            numHab.setText("97.586 personas");
            LI1.setText("☼Bibliothéque Francois-Mitterrand");
            LI2.setText("☼Panthéon");
            LI3.setText("☼Les Catacombes de Paris");
            rest.setText("☼Les Crêpes de Louis-Marie");
            gas.setText("☼ESSO EXPRESS LYON RAPEE");
        }
        if ("Stade de France".equals(nombreOrigen)) {
            numHab.setText("32.899 personas");
            LI1.setText("☼Musée de l'Air et de l'Espace");
            LI2.setText("☼Saint-Denis");
            LI3.setText("☼Casino Barriere");
            rest.setText("☼Zack Restaurant");
            gas.setText("☼TotalEnergies");
        }
        if ("Tour Montparnasse".equals(nombreOrigen)) {
            numHab.setText("114.712 personas");
            LI1.setText("☼Montparnasse Rive Gauche");
            LI2.setText("☼Redlight");
            LI3.setText("☼Gaumont Parnasse");
            rest.setText("☼Le Ciel de Paris Restaurant");
            gas.setText("☼Station BP Paris Montparnasse");
        }

    }//GEN-LAST:event_showActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();       
    }//GEN-LAST:event_BotonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> EleccionLugar;
    private javax.swing.JLabel LI1;
    private javax.swing.JLabel LI2;
    private javax.swing.JLabel LI3;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior1;
    private javax.swing.JLabel LateralSuperior2;
    private javax.swing.JLabel LateralSuperior3;
    private javax.swing.JLabel fondillo;
    private javax.swing.JLabel gas;
    private javax.swing.JLabel gasolinera;
    private javax.swing.JLabel habitantes;
    private javax.swing.JLabel interes1;
    private javax.swing.JLabel numHab;
    private javax.swing.JLabel rest;
    private javax.swing.JLabel restaurant;
    private javax.swing.JButton show;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
