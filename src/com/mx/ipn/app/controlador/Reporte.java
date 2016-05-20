/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ipn.app.controlador;

import com.mx.ipn.app.modelo.squirrel.Alumno;
import com.mx.ipn.app.modelo.squirrel.Categoria;
import com.mx.ipn.app.modelo.squirrel.Escuela;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hyper
 */
public class Reporte {

    private static String ARCHIVO_ALUMNO = "alumnos.txt";
    private static String ARCHIVO_CATEGORIA = "categorias.txt";
    private static String ARCHIVO_ESCUELAS = "ecuelas.txt";

    public static void crear(ArrayList<Escuela> escuelas, ArrayList<Categoria> categorias, ArrayList<Alumno> alumnos) {
        try{
            PrintWriter alumnosFile = new PrintWriter(ARCHIVO_ALUMNO);
            PrintWriter escuelasFile = new PrintWriter(ARCHIVO_ESCUELAS);
            PrintWriter categoriasFile = new PrintWriter(ARCHIVO_CATEGORIA);    
            for (Alumno alumno : alumnos) {
                alumnosFile.println(alumno.toString());
            }
            for (Categoria categoria : categorias) {
                categoriasFile.println(categoria.toString());
            }
            for (Escuela escuela : escuelas) {
                escuelasFile.println(escuela.toString());
            }
            alumnosFile.close();
            categoriasFile.close();
            escuelasFile.close();
            Desktop.getDesktop().open(new File(ARCHIVO_ALUMNO));
            Desktop.getDesktop().open(new File(ARCHIVO_CATEGORIA));
            Desktop.getDesktop().open(new File(ARCHIVO_ESCUELAS));
        } catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado " + ex);
        } catch (IOException ex) {
            System.err.println("Error no se pudo abrir el archivo");
        }
    }
    
}
