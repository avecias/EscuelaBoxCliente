package com.mx.ipn.app.vista;

import com.mx.ipn.app.controlador.Cliente;
import com.mx.ipn.app.controlador.Reporte;
import com.mx.ipn.app.controlador.Ver;
import com.mx.ipn.app.modelo.entidades.Usuario;
import com.mx.ipn.app.modelo.squirrel.Alumno;
import com.mx.ipn.app.modelo.squirrel.Categoria;
import com.mx.ipn.app.modelo.squirrel.Escuela;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private ArrayList<Usuario> usuarios;
    private Usuario usuario;
    private Cliente cliente;
    private final ArrayList<Escuela> escuelas;
    private final ArrayList<Alumno> alumnos;
    private final ArrayList<Categoria> categorias;

    public Principal(ArrayList<Usuario> usuarios, Usuario usuario) {
        initComponents();
        this.usuarios = usuarios;
        this.usuario = usuario;
        cliente = new Cliente(3030, "localhost");
        escuelas = cliente.pedirEscuelas();
        alumnos = cliente.pedirAlumnos();
        categorias = cliente.pedirCaregorias();
        Ver.todasEscuelas(tablaEscuelas, escuelas);
        Ver.todosAlumnos(tablaAlumno, alumnos);
        Ver.todasCategorias(tablaCategoria, categorias);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        ventanaInterna = new javax.swing.JInternalFrame();
        panelPrincipal = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        tabEscuela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEscuelas = new javax.swing.JTable();
        agregarEscuela = new javax.swing.JButton();
        borrarEscuela = new javax.swing.JButton();
        actualizarEscuela = new javax.swing.JButton();
        refrescarAlumno = new javax.swing.JButton();
        tabCategoria = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCategoria = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        botonRefrescarCategoria = new javax.swing.JButton();
        tabAlumno = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAlumno = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        tabCompetidor = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCompetidor = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        tabPelea = new javax.swing.JPanel();
        menuBarra = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuRelogin = new javax.swing.JMenuItem();
        menuMisDatos = new javax.swing.JMenuItem();
        menuReporte = new javax.swing.JMenu();
        menuHacerReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Base de Datos");
        setResizable(false);

        escritorio.setName("des"); // NOI18N
        escritorio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                escritorioventanCerrada(evt);
            }
        });

        ventanaInterna.setClosable(true);
        ventanaInterna.setIconifiable(true);
        ventanaInterna.setMaximizable(true);
        ventanaInterna.setResizable(true);
        ventanaInterna.setTitle("Manejador");
        ventanaInterna.setAutoscrolls(true);
        ventanaInterna.setDoubleBuffered(true);
        ventanaInterna.setName("principal"); // NOI18N
        ventanaInterna.setVisible(true);

        tabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });

        tablaEscuelas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEscuelas);

        agregarEscuela.setText("Agregar");
        agregarEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEscuelaActionPerformed(evt);
            }
        });

        borrarEscuela.setText("Borrar");
        borrarEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarEscuelaActionPerformed(evt);
            }
        });

        actualizarEscuela.setText("Actualizar");
        actualizarEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarEscuelaActionPerformed(evt);
            }
        });

        refrescarAlumno.setText("Refrescar");
        refrescarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabEscuelaLayout = new javax.swing.GroupLayout(tabEscuela);
        tabEscuela.setLayout(tabEscuelaLayout);
        tabEscuelaLayout.setHorizontalGroup(
            tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabEscuelaLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEscuelaLayout.createSequentialGroup()
                        .addComponent(agregarEscuela)
                        .addGap(45, 45, 45)
                        .addComponent(borrarEscuela)
                        .addGap(84, 84, 84)
                        .addComponent(actualizarEscuela)
                        .addGap(56, 56, 56)
                        .addComponent(refrescarAlumno))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        tabEscuelaLayout.setVerticalGroup(
            tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabEscuelaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarEscuela)
                    .addComponent(borrarEscuela)
                    .addComponent(actualizarEscuela)
                    .addComponent(refrescarAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        tabs.addTab("Escuela", tabEscuela);

        tablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaCategoria);

        jButton5.setText("Agregar");

        jButton6.setText("Borrar");

        jButton7.setText("Actualizar");

        botonRefrescarCategoria.setText("Refrescar");
        botonRefrescarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefrescarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCategoriaLayout = new javax.swing.GroupLayout(tabCategoria);
        tabCategoria.setLayout(tabCategoriaLayout);
        tabCategoriaLayout.setHorizontalGroup(
            tabCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCategoriaLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(tabCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCategoriaLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(45, 45, 45)
                        .addComponent(jButton6)
                        .addGap(84, 84, 84)
                        .addComponent(jButton7)
                        .addGap(56, 56, 56)
                        .addComponent(botonRefrescarCategoria))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        tabCategoriaLayout.setVerticalGroup(
            tabCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCategoriaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tabCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(botonRefrescarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        tabs.addTab("Categoria", tabCategoria);

        tablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaAlumno);

        jButton9.setText("Agregar");

        jButton10.setText("Borrar");

        jButton11.setText("Actualizar");

        jButton12.setText("Refrescar");

        javax.swing.GroupLayout tabAlumnoLayout = new javax.swing.GroupLayout(tabAlumno);
        tabAlumno.setLayout(tabAlumnoLayout);
        tabAlumnoLayout.setHorizontalGroup(
            tabAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAlumnoLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(tabAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabAlumnoLayout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(45, 45, 45)
                        .addComponent(jButton10)
                        .addGap(84, 84, 84)
                        .addComponent(jButton11)
                        .addGap(56, 56, 56)
                        .addComponent(jButton12))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        tabAlumnoLayout.setVerticalGroup(
            tabAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAlumnoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tabAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        tabs.addTab("Alumno", tabAlumno);

        tablaCompetidor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaCompetidor);

        jButton13.setText("Agregar");

        jButton14.setText("Borrar");

        jButton15.setText("Actualizar");

        jButton16.setText("Refrescar");

        javax.swing.GroupLayout tabCompetidorLayout = new javax.swing.GroupLayout(tabCompetidor);
        tabCompetidor.setLayout(tabCompetidorLayout);
        tabCompetidorLayout.setHorizontalGroup(
            tabCompetidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCompetidorLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(tabCompetidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCompetidorLayout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(45, 45, 45)
                        .addComponent(jButton14)
                        .addGap(84, 84, 84)
                        .addComponent(jButton15)
                        .addGap(56, 56, 56)
                        .addComponent(jButton16))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        tabCompetidorLayout.setVerticalGroup(
            tabCompetidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCompetidorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tabCompetidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        tabs.addTab("Competidor", tabCompetidor);

        javax.swing.GroupLayout tabPeleaLayout = new javax.swing.GroupLayout(tabPelea);
        tabPelea.setLayout(tabPeleaLayout);
        tabPeleaLayout.setHorizontalGroup(
            tabPeleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );
        tabPeleaLayout.setVerticalGroup(
            tabPeleaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        tabs.addTab("Pelea", tabPelea);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaInternaLayout = new javax.swing.GroupLayout(ventanaInterna.getContentPane());
        ventanaInterna.getContentPane().setLayout(ventanaInternaLayout);
        ventanaInternaLayout.setHorizontalGroup(
            ventanaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaInternaLayout.setVerticalGroup(
            ventanaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        escritorio.setLayer(ventanaInterna, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(ventanaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ventanaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        menuArchivo.setText("Archivo");

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalir(evt);
            }
        });
        menuArchivo.add(menuSalir);

        menuBarra.add(menuArchivo);

        menuUsuario.setText("Usuario");

        menuRelogin.setText("Relogin");
        menuRelogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relogin(evt);
            }
        });
        menuUsuario.add(menuRelogin);

        menuMisDatos.setText("Mis datos");
        menuMisDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMisDatos(evt);
            }
        });
        menuUsuario.add(menuMisDatos);

        menuBarra.add(menuUsuario);

        menuReporte.setText("Reporte");

        menuHacerReporte.setText("Hacer Reporte");
        menuHacerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHacerReporteActionPerformed(evt);
            }
        });
        menuReporte.add(menuHacerReporte);

        menuBarra.add(menuReporte);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalir
        // Salir de aplicacion
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_menuSalir

    private void relogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relogin
        // Iniciar con un nuevo usuario
        Login login = new Login(usuarios);
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_relogin

    private void menuMisDatos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMisDatos
        // Ver datos del usuario
        JOptionPane.showMessageDialog(null, usuario.toString());
    }//GEN-LAST:event_menuMisDatos

    private void escritorioventanCerrada(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_escritorioventanCerrada
        // TODO add your handling code here:
    }//GEN-LAST:event_escritorioventanCerrada

    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
        // TODO add your handling code here:
        System.out.println(tabs.getSelectedIndex());
    }//GEN-LAST:event_click

    private void agregarEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEscuelaActionPerformed
        // TODO add your handling code here:
        EscuelaForm form = new EscuelaForm(cliente);
        form.setVisible(true);
    }//GEN-LAST:event_agregarEscuelaActionPerformed

    private void actualizarEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarEscuelaActionPerformed
        // TODO add your handling code here:
        if(tablaEscuelas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione un elemento de la tabla");
        }
        else{
            EscuelaForm form = new EscuelaForm(cliente,escuelas.get(tablaEscuelas.getSelectedRow()));
            form.setVisible(true);
        }
    }//GEN-LAST:event_actualizarEscuelaActionPerformed

    private void refrescarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarAlumnoActionPerformed
        // TODO add your handling code here:
        Ver.todasEscuelas(tablaEscuelas, escuelas);
    }//GEN-LAST:event_refrescarAlumnoActionPerformed

    private void borrarEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarEscuelaActionPerformed
        // TODO add your handling code here:
        if(tablaEscuelas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione un elemento de la tabla");
        }
        else{
            if(cliente.pedirEliminarEscuela(escuelas.get(tablaEscuelas.getSelectedRow()))){
                JOptionPane.showMessageDialog(null, "Exito al borrar");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al borrar");
            }
        }
    }//GEN-LAST:event_borrarEscuelaActionPerformed

    private void botonRefrescarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefrescarCategoriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botonRefrescarCategoriaActionPerformed

    private void menuHacerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHacerReporteActionPerformed
        // TODO add your handling code here:
        Reporte.crear(escuelas,categorias,alumnos);
    }//GEN-LAST:event_menuHacerReporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarEscuela;
    private javax.swing.JButton agregarEscuela;
    private javax.swing.JButton borrarEscuela;
    private javax.swing.JButton botonRefrescarCategoria;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuHacerReporte;
    private javax.swing.JMenuItem menuMisDatos;
    private javax.swing.JMenuItem menuRelogin;
    private javax.swing.JMenu menuReporte;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton refrescarAlumno;
    private javax.swing.JPanel tabAlumno;
    private javax.swing.JPanel tabCategoria;
    private javax.swing.JPanel tabCompetidor;
    private javax.swing.JPanel tabEscuela;
    private javax.swing.JPanel tabPelea;
    private javax.swing.JTable tablaAlumno;
    private javax.swing.JTable tablaCategoria;
    private javax.swing.JTable tablaCompetidor;
    private javax.swing.JTable tablaEscuelas;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JInternalFrame ventanaInterna;
    // End of variables declaration//GEN-END:variables

}
