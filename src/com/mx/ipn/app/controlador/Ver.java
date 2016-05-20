
package com.mx.ipn.app.controlador;

import com.mx.ipn.app.modelo.squirrel.Alumno;
import com.mx.ipn.app.modelo.squirrel.Categoria;
import com.mx.ipn.app.modelo.squirrel.Escuela;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ver {
    
    public static void todosAlumnos(JTable tabla, ArrayList<Alumno> alumnos){
        Object[] nombres = {"idAlumno","nombre","paterno","materno","boleta","idEscuela","IdCategoria"};
        DefaultTableModel modelo = new DefaultTableModel(nombres, alumnos.size());
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            modelo.setValueAt(alumno.getIdalumno(), i, 0);
            modelo.setValueAt(alumno.getNombre(), i, 1);
            modelo.setValueAt(alumno.getPaterno(), i, 2);
            modelo.setValueAt(alumno.getMaterno(), i, 3);
            modelo.setValueAt(alumno.getBoleta(), i, 4);
            modelo.setValueAt(alumno.getIdescuela(), i, 5);
            modelo.setValueAt(alumno.getIdcategoria(), i, 6);
        }
        tabla.setModel(modelo);
    }
    
    public static void todasEscuelas(JTable tabla, ArrayList<Escuela> escuelas){
        Object[] nombres = {"idEscuela","nombre"};
        DefaultTableModel modelo = new DefaultTableModel(nombres, escuelas.size());
        for (int i = 0; i < escuelas.size(); i++) {
            Escuela escuela = escuelas.get(i);
            modelo.setValueAt(escuela.getIdescuela(), i, 0);
            modelo.setValueAt(escuela.getNombre(), i, 1);
        }
        tabla.setModel(modelo);
    }

    public static void todasCategorias(JTable tabla, ArrayList<Categoria> categorias) {
        Object[] nombres = {"idCategoria","nombre","rango"};
        DefaultTableModel modelo = new DefaultTableModel(nombres, categorias.size());
        for (int i = 0; i < categorias.size(); i++) {
            Categoria categoria = categorias.get(i);
            modelo.setValueAt(categoria.getIdcategoria(), i, 0);
            modelo.setValueAt(categoria.getNombre(), i, 1);
            modelo.setValueAt(categoria.getRango(), i, 2);
        }
        tabla.setModel(modelo);
    }
}
