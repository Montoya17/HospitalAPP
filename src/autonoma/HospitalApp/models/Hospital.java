/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * se crea la clase hospital
 *
 * @author solis
 * @since 31/03/2025
 */
//////Atributos
public class Hospital {

    /**
     * se crean los atributos atributo nombre del hospital
     */
    private String nombre;
    /**
     * atributo dreccion, se refiere a la direccion del hospital
     */
    private String direccion;
    /**
     * atributo telefono, se refiere al numero del telefono del hospital
     */
    private String telefono;
    /**
     * atributo logo, se refiere al logo del hospital
     */
    private String logo;

    /**
     * el atributo presuspuesto, se refiere al presupuesto del hospital
     */
    private double presupuesto;

    /*
    el atributo metaVentasAnual, se refiere al as metas que tiene el hopital anualmente
     */
    private double metaVentasAnual;

    /*
    el atributo fechaFundacion, se refiere a la fechadefundacion
     */
    private double fechaFundacion;

    /*
    el atributo estado se refiere al estado de lhospital(si esta en quiebra o no)
     */
    private String estado;

    /*
    el atributo latitud, se refiere a la latitud del hospital
     */
    private double latitud;

    private double longitud;

    /*se refiere al gerente que tiene el hospital
     */
    private Gerente gerente;

    /*
    se listan los empleados del hospital para poder hacer algunos metodos 
     */
    private List<Empleado> empleados = new ArrayList<>();
    /**
     * se listan los apcientes del hospital
     */
    private List<Paciente> pacientes = new ArrayList<>();
    
    

    

    ////////////////////////////////////////////////////////////////////////////
    // Atributos
    private ArrayList<Hospital> hospital;

    private Escritor escritor;

    public Hospital() {
        this.hospital = new ArrayList<>();
        escritor = new EscritorArchivoTextoPlano("Hospital.txt");
    }


    /*
    Se crean los metodos constructores de dichos atributos
     */
    public Hospital(String nombre, String direccion, String telefono, String logo, double presupuesto, double presupuestoInical,
            double metaVentasAnual, double fechaFundacion, String estado, double latitud, double longitud, Gerente gerente, Gerente Gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuestoInical;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estado = "Activo";
        this.latitud = latitud;
        this.longitud = longitud;
        this.gerente = gerente;

    }

    public Hospital(String nombre) {
        this.nombre = nombre;
    }

    public Hospital(String hospital_San_José_St_Bonaventure, String calle_123_Manizales, String e2r3, String logopng, int i, int i0, String string, double d, double d0, Gerente gerente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /*
    se hace el metodo de editar la informacion del hospital
     */
    public void editarInformacion(String nombre, String direccion, String telefono, String logo, double presupuesto, double metaVentasAnual,
            double fechaFundacion, String estado, double latitud, double longitud, Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estado = "Activo";
        this.latitud = latitud;
        this.longitud = longitud;
        this.gerente = gerente;
        this.empleados = new ArrayList<>();
        System.out.println("La informacion del hospital fue cambiada correctamente.");
    }

    /*
    se hace el metodo para mostrar la inofrmacion de los atributos 
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Meta de ventas anual: " + metaVentasAnual);
        System.out.println("Fecha de fundación: " + fechaFundacion);

        System.out.println("Localización: Latitud " + latitud + ", Longitud " + longitud);
        System.out.println("Gerente: " + gerente.getNombre());
    }

    /**
     * se crea el metodo Reducir presupuesto this.presupuesto <0 se refiere Si
     * el presupuesto queda negativo, cambia a en quiebra @param monto
     */
    public void reducirPresupuesto(double monto) {
        this.presupuesto -= monto;
        if (this.presupuesto < 0) {
            this.presupuesto = Math.abs(this.presupuesto);
            this.estado = "En quiebra";
            System.out.println("¡El hospital ha entrado en quiebra!");
        }
    }

    /**
     * se crea la clase aumentarPresupuesto, para el hospital
     *
     * @param monto
     */
    public void aumentarPresupuesto(double monto) {
        this.presupuesto += monto;
        System.out.println("Presupuesto aaumento Correctamente.  Nuevo presupuesto: $" + this.presupuesto);
    }

    /**
     *
     * @param valor se hace el metodo regiustarPatrocinio, si el hospital se
     * encuentra en quiebra
     */
    public void registrarPatrocinio(double valor) {
        if (estado.equals("En quiebra") && valor >= Math.abs(presupuesto)) {
            this.presupuesto += valor;
            cambiarEstado("Activo");
            System.out.println("¡Patrocinio registrado exitosamente! El hospital ha salido de quiebra.");
        } else {
            System.out.println(" El patrocinio no es suficiente para salir de la quiebra, o el hospital no está en quiebra.");
        }
    }

    /**
     * se hace el metodo agregar empleado para agregar empleado al hospital
     *
     * @param empleado
     * @return
     */
    public boolean agregarEmpleado(Empleado empleado) {
        return empleados.add(empleado);
    }
    
    /**
     * se agrega un empleado l area de salud
     * @param empleado 
     */

    public void agregarEmpleadoSalud(EmpleadoSalud empleado) {
        empleados.add(empleado);
    }
    
    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
   
    }

        public boolean agregarPaciente(Paciente p) {
            return this. pacientes.add(p);
        }



    
    

    /**
     * se crea el metodo mostarEmpleados, para que podamos ver los empleados
     * activos
     */
    public void mostarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e.obtenerInformacion());
        }
    }

    /**
     * se hace el metodo leerdesdearchivo para obtner la informacion del archivo
     *
     * @param ruta
     * @since 10042025
     *
     */
    public void LeerDesdeArchivo(String ruta) {
        Lector lector = new LectorArchivoTextoPlano();
        try {
            ArrayList<String> archivo = lector.leer(ruta);

            // Validamos que haya suficientes líneas
            if (archivo.size() >= 13) {
                /**
                 * otenemos la informacion de cada atributo y la posicion
                 */
                this.nombre = archivo.get(0);
                this.direccion = archivo.get(1);
                this.telefono = archivo.get(2);
                this.logo = archivo.get(3);
                this.presupuesto = Double.parseDouble(archivo.get(4));
                this.metaVentasAnual = Double.parseDouble(archivo.get(5));
                this.fechaFundacion = Double.parseDouble(archivo.get(6));
                this.latitud = Double.parseDouble(archivo.get(7));
                this.longitud = Double.parseDouble(archivo.get(8));
                this.estado = archivo.get(9);

                /**
                 * fatos el gerente
                 */
                String nombreGerente = archivo.get(10);
                String documentoGerente = archivo.get(11);
                int edadGerente = Integer.parseInt(archivo.get(12));
                String carreraGerente = archivo.get(13);

                this.gerente = new Gerente(nombreGerente, documentoGerente, edadGerente, carreraGerente);
            } else {
                System.out.println("El archivo no contiene suficientes líneas.");
            }

        } catch (IOException | NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Error al leer archivo del hospital: " + e.getMessage());
        }

    }
    
    /**
     * creamos el metodo guardarempleado salud para guardarlo en un archobp
     * @param emp
     * @param ruta 
     */

       public void guardarEmpleadoSalud(EmpleadoSalud emp, String ruta) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true))) {
        writer.write(emp.getNombre() + ";" +
                     emp.getId()+ ";" +
                     emp.getEdad() + ";" +
                     emp.getSalarioBase() + ";" +
                     emp.getEspecialidad() + ";" +
                     emp.getHorasTrabajadas());
        writer.newLine();
    } catch (IOException e) {
        System.out.println("Error al guardar el empleado: " + e.getMessage());
    }
}



    /*
    se hacen metodos getter and setters para dichos atributos
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.hospital = hospital;
    }

    public Escritor getEscritor() {
        return escritor;
    }

    public void setEscritor(Escritor escritor) {
        this.escritor = escritor;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public double getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(double fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void editarInformacion(String hospital_San_José_Renovado, String avenida_Principal_Manizales, String string, String nuevo_logopng, int i, int i0, String string0, boolean b, double d, double d0, Gerente gerente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean enQuiebra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void cambiarEstado(String activo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void registrarVenta(Double precioVenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
