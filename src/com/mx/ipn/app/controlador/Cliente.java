package com.mx.ipn.app.controlador;

import com.mx.ipn.app.modelo.entidades.Peticion;
import com.mx.ipn.app.modelo.squirrel.Alumno;
import com.mx.ipn.app.modelo.squirrel.Categoria;
import com.mx.ipn.app.modelo.squirrel.Escuela;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Cliente {

    private Socket socket;
    private ObjectOutputStream salida;
    private ObjectInputStream entrada;
    private Integer puerto;
    private String ip;

    public Cliente(Integer puerto, String ip) {
        this.puerto = puerto;
        this.ip = ip;
    }

    public ArrayList<Escuela> pedirEscuelas() {
        ArrayList<Escuela> escuelas = new ArrayList<>();
        try {
            Peticion peticion = new Peticion("escuela", "todo", null);
            socket = new Socket(ip, puerto);
            salida = new ObjectOutputStream(socket.getOutputStream());
            entrada = new ObjectInputStream(socket.getInputStream());
            salida.writeObject(peticion);
            escuelas = (ArrayList<Escuela>) entrada.readObject();
        } catch (IOException ex) {
            System.err.println("Error de entrada o salida " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Clase no encontrada " + ex);
        }
        liberar();
        return escuelas;
    }

    public boolean pedirAgregarEscuela(Escuela escuela) {
        boolean res = false;
        try {
            Peticion peticion = new Peticion("escuela", "crear", escuela);
            socket = new Socket(ip, puerto);
            salida = new ObjectOutputStream(socket.getOutputStream());
            entrada = new ObjectInputStream(socket.getInputStream());
            salida.writeObject(peticion);
            res = entrada.readBoolean();
        } catch (IOException ex) {
            System.err.println("Error de entrada o salida " + ex);
        }
        liberar();
        return res;
    }

    public boolean pedirActualizarEscuela(Escuela escuela) {
        boolean res = false;
        try {
            Peticion peticion = new Peticion("escuela", "actualizar", escuela);
            socket = new Socket(ip, puerto);
            salida = new ObjectOutputStream(socket.getOutputStream());
            entrada = new ObjectInputStream(socket.getInputStream());
            salida.writeObject(peticion);
            res = entrada.readBoolean();
        } catch (IOException ex) {
            System.err.println("Error al actualizar " + ex);
        }
        liberar();
        return res;
    }

    public boolean pedirEliminarEscuela(Escuela escuela) {
        boolean res = false;
        try {
            Peticion peticion = new Peticion("escuela", "borrar", escuela);
            socket = new Socket(ip, puerto);
            salida = new ObjectOutputStream(socket.getOutputStream());
            entrada = new ObjectInputStream(socket.getInputStream());
            salida.writeObject(peticion);
            res = entrada.readBoolean();
        } catch (IOException ex) {
            System.err.println("Error de entrada o salida " + ex);
        }
        liberar();
        return res;
    }

    private void liberar() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            if (salida != null) {
                salida.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException ex) {
            System.err.println("Error al liberar un recursos " + ex);
        }
    }

    public ArrayList<Alumno> pedirAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            Peticion peticion = new Peticion("alumno", "todo", null);
            socket = new Socket(ip, puerto);
            salida = new ObjectOutputStream(socket.getOutputStream());
            entrada = new ObjectInputStream(socket.getInputStream());
            salida.writeObject(peticion);
            alumnos = (ArrayList<Alumno>) entrada.readObject();
        } catch (IOException ex) {
            System.err.println("Error de entrada o salida " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Clase no encontrada " + ex);
        }
        liberar();
        return alumnos;
    }

    public ArrayList<Categoria> pedirCaregorias() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        try {
            Peticion peticion = new Peticion("categoria", "todo", null);
            socket = new Socket(ip, puerto);
            salida = new ObjectOutputStream(socket.getOutputStream());
            entrada = new ObjectInputStream(socket.getInputStream());
            salida.writeObject(peticion);
            categorias = (ArrayList<Categoria>) entrada.readObject();
        } catch (IOException ex) {
            System.err.println("Error de entrada o salida " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Clase no encontrada " + ex);
        }
        liberar();
        return categorias;
    }

}
