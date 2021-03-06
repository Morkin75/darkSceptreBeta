/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dark;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author manueljesusgarcialopez
 */
public class VentanaInicio extends javax.swing.JFrame {

    //Array de casillas del mapa
    public JLabel[][] casillasMapa;
    public JSeparator separador3;
    
    //Graphics cuadrado = null;
    BufferedImage cuadrado;
    
    //El modelo de la tabla de Acciones
    DefaultTableModel acciones = new DefaultTableModel();
    
    int posMapaX, posMapaY;
    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio() {
        initComponents();
        
        //Casilla seleccionada del mapa
        posMapaX = 0;
        posMapaY = 0;
        
        //getGraphics().drawLine(10, 10, 200, 200);
        //repaint();
        
        //Inicializamos el separador
        separador3 = new JSeparator();
        
        cuadrado = new BufferedImage(20, 20, BufferedImage.TYPE_INT_RGB);
        
        //Creamos el mapa
        casillasMapa = new JLabel[32][16];
        //Inicializamos los JLabel
        inicializarMapa();
        //Rellenamos los JLabel
        rellenarMapa();
        
        //Indicamos el color del separador
        separador1.setBackground(Color.BLUE);
        separador2.setOpaque(true);
        separador2.setBackground(Color.BLUE);
        separador2.setOrientation(SwingConstants.VERTICAL);
        //System.out.println(separador2.getLocation().x);
        //System.out.println(separador2.getLocation().y);
        //System.out.println(separador2.getSize().toString());
        
        separador2.setSize(12, 255);
        separador2.setLocation(606, 400);
        //separador3.setSize(1, 255);
        
        System.out.println(separador2.getLocation().x);
        System.out.println(separador2.getLocation().y);
        System.out.println(separador2.getSize().toString());
        //jTabbedPane1.add("Hola", jScrollMapa);
        
        //Preparamos el modelo de la tabla de Acciones
        acciones.addColumn("Número");
        acciones.addColumn("Acción");
        acciones.addColumn("Descripción");
        
        //Dark.con.mostrarAcciones();
        
        //Aquí va el texto con la información de cada opción seleccionada
        this.jTextInfo.setBackground(Color.CYAN);
        this.jTextInfo.setText("Aquí va el texto con la información de cada opción seleccionada");
        
    }
    
    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollMapa = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        jScrollJuego = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollInfo = new javax.swing.JScrollPane();
        jTextInfo = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(20, 20));
        setName("miFrame"); // NOI18N

        jScrollMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollMapaMousePressed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1056, 530));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jScrollMapa.setViewportView(jPanel1);

        separador1.setOpaque(true);

        separador2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jScrollJuego.setName("jScrollJuego"); // NOI18N

        jTabbedPane1.setName(""); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fuerza", "Velocidad", "Energia", "Agilidad", "Vida", "Oro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("Personajes", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane1.addTab("Dominios", jScrollPane3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jTabbedPane1.addTab("Objetos", jScrollPane4);

        jTable5.setModel(acciones);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable5MousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jTabbedPane1.addTab("Acciones", jScrollPane5);

        jScrollJuego.setViewportView(jTabbedPane1);
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        jTextInfo.setFocusable(false);
        jScrollInfo.setViewportView(jTextInfo);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollMapaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollMapaMousePressed
        System.out.println("Pulsado:" + jPanel1.getMousePosition().toString() + " - " 
                + jPanel1.getMousePosition().x + ":" + jPanel1.getMousePosition().y);
        posMapaX = jPanel1.getMousePosition().x/33;
        posMapaY = jPanel1.getMousePosition().y/33;
        System.out.println("Casilla: "+ posMapaX + "," + posMapaY);
                //.getMousePosition().toString());
                
        System.out.println("Label 0,0 está en: " + casillasMapa[0][0].getLocation().toString());
        //Cambiamos de color la casilla marcada
        limpiarMapa();
        casillasMapa[posMapaX][posMapaY].setBackground(Color.CYAN);
    }//GEN-LAST:event_jScrollMapaMousePressed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        System.out.println(" " + jTable5.getSelectedRow());
    }//GEN-LAST:event_jTable2MousePressed

    private void jTable5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MousePressed
        System.out.println(" " + jTable5.getSelectedRow());
        jTextInfo.setText(" " + String.valueOf(acciones.getValueAt(jTable5.getSelectedRow(), 2)));
    }//GEN-LAST:event_jTable5MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollInfo;
    public javax.swing.JScrollPane jScrollJuego;
    public javax.swing.JScrollPane jScrollMapa;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable2;
    public javax.swing.JTable jTable3;
    public javax.swing.JTable jTable4;
    public javax.swing.JTable jTable5;
    public javax.swing.JTextPane jTextInfo;
    public javax.swing.JSeparator separador1;
    public javax.swing.JSeparator separador2;
    // End of variables declaration//GEN-END:variables

    public void inicializarMapa() {
    
        for(int x=0;x<32;x++) {
            for(int y=0;y<16;y++) {
                casillasMapa[x][y] = new JLabel("Label"+x+""+y);
                casillasMapa[x][y].setHorizontalAlignment(CENTER);
                casillasMapa[x][y].setForeground(Color.RED);
                casillasMapa[x][y].setOpaque(true);
                casillasMapa[x][y].setBackground(Color.LIGHT_GRAY);//
                //casillasMapa[x][y].setBorder();
            }
        }
    }
    
    public void limpiarMapa() {
        for(int x=0;x<32;x++) {
            for(int y=0;y<16;y++) {
                casillasMapa[x][y].setBackground(Color.LIGHT_GRAY);
            }
        }
    }
    
    public void rellenarMapa() {
    
        for(int x=0;x<32;x++) {
            for(int y=0;y<16;y++) {
                //casillasMapa[x][y] = null;
                casillasMapa[x][y].setText(""+x+""+y);
                casillasMapa[x][y].setSize(32, 32);
                casillasMapa[x][y].setLocation(x+(32*x), y+(32*y));
                
                
                
                //Añadimos las casillas al mapa-jPanel1
                jPanel1.add(casillasMapa[x][y]);
            }
        }
        
        
    }

}
