
package g2vjovi;

import ModeloBD.*;
import ModeloUML.*;
import VentanasAdmin.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class G2vJovi {

    
    private static Administracion tAdministracion;
    private static Logistica tLogistica;
    private static Centro cCentro;
    private static ArrayList <Trabajador> listaT;
    private static ArrayList <Centro> listaC;
    private static VentanaAdministracion vAdministracion;
    private static VentanaLogistica vLogistica;
    private static NuevoTrabajador vNuevoTrabajador;
    private static ModificarTrabajador vModificarTrabajador;
    private static NuevoCentro vNuevoCentro;
    private static ModificarCentro vModificarCentro;
    private static BuscarTrabajadorPK vBuscarTrabPk;
    private static BuscarCentroPK vBuscarCentroPk;
    private static BuscarCentro vBuscarCentro;
    private static BuscarTrabajador vBuscarTrabajador;
    private static NuevoParte vNuevoParte;
    private static TrabajadorBD bdTrabajador = new TrabajadorBD();
    private static CentroBD bdCentro = new CentroBD();
    private static ArrayList<Salida>listaDeSalidas;
    
    public static void main(String[] args) {
        listaDeSalidas=new ArrayList();
        //abrirVentanaAdministracion();
        abrirVentanaLogistica();
    }
    public static void abrirVentanaAdministracion(){
        vAdministracion = new VentanaAdministracion();
        vAdministracion.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        vAdministracion.setVisible(true);
    }
    public static void cerrarVentanaAdministracion(){
        vAdministracion.dispose();
        System.exit(0);
    }
    public static void disposeBuscarTrabPk(String tipoVentana,ArrayList pTrabajador){
        switch (tipoVentana){
            case "altat":{
                listaC =bdCentro.consultaCentro();
                vNuevoTrabajador =new NuevoTrabajador(new javax.swing.JFrame(), true,listaC);
                vNuevoTrabajador.setVisible(true);
                vBuscarTrabPk.setVisible(false);
                break;
            }
            case "modt":{
                listaC =bdCentro.consultaCentro();
                vModificarTrabajador =new ModificarTrabajador(new javax.swing.JFrame(), true,pTrabajador,listaC);
                vModificarTrabajador.setVisible(true);
                vBuscarTrabPk.dispose();
                break;
            }
            case "bajat":{
                vBuscarTrabPk.setVisible(false);
                break;
            }
        }
    }  
    public static void disposeBuscarCentroPk(String tipoVentana,ArrayList pCentro){
        switch (tipoVentana){
            case "altac":{
                vNuevoCentro=new NuevoCentro(new javax.swing.JFrame(), true);
                vNuevoCentro.setVisible(true);
                vBuscarCentroPk.setVisible(false);
                break;
            }
            case "modc":{
                vModificarCentro =new ModificarCentro(new javax.swing.JFrame(), true,pCentro);
                vModificarCentro.setVisible(true);
                vBuscarCentroPk.dispose();
                break;
            }
            case "bajac":{
                vBuscarCentroPk.setVisible(false);
                break;
            }
        }
    }
    public static void abrirVentanaCrearTrabajador(){
        vBuscarTrabPk =new BuscarTrabajadorPK(new javax.swing.JFrame(), true,"altat");
        vBuscarTrabPk.setVisible(true);
    }
    public static void abrirVentanaCrearCentro(){
        vBuscarCentroPk =new BuscarCentroPK(new javax.swing.JFrame(), true,"altac");
        vBuscarCentroPk.setVisible(true);
    }
    public static void abrirVentanaModificarTrabajador(){
        vBuscarTrabPk =new BuscarTrabajadorPK(new javax.swing.JFrame(), true,"modt");
        vBuscarTrabPk.setVisible(true);
    }
    public static void abrirVentanaModificarCentro(){
        vBuscarCentroPk =new BuscarCentroPK(new javax.swing.JFrame(), true,"modc");
        vBuscarCentroPk.setVisible(true);
    }
    public static void abrirVentanaBorrarTrabajador(){
        vBuscarTrabPk =new BuscarTrabajadorPK(new javax.swing.JFrame(), true,"bajat");
        vBuscarTrabPk.setVisible(true);
    }
    public static void abrirVentanaBorrarCentro(){
        vBuscarCentroPk =new BuscarCentroPK(new javax.swing.JFrame(), true,"bajac");
        vBuscarCentroPk.setVisible(true);
    }
    public static void cerrarVentanaCrearTrabajador(){
        vNuevoTrabajador.dispose();
    }
    public static void cerrarVentanaCrearCentro(){
        vNuevoCentro.dispose();
    }
    public static void cerrarVentanaModificarCentro(){
        vModificarCentro.dispose();
    }
    public static void cerrarVentanaModificarTrabajador(){
        vModificarTrabajador.dispose();
    }
    public static void cerrarAltaBajaModificacionCentro(String tipoVentana){
        switch (tipoVentana){
            case "altac":{
                vNuevoCentro.dispose();
                vBuscarCentroPk.dispose();
                break;
            }
            case "modc":{
                vModificarCentro.dispose();
                vBuscarCentroPk.dispose();
                break;
            }
            case "bajac":{
                vBuscarCentroPk.dispose();
                break;
            }
        }
    }
    public static void cerrarAltaBajaModificacionTrabajador(String tipoVentana){
        switch (tipoVentana){
            case "altat":{
                vNuevoTrabajador.dispose();
                vBuscarTrabPk.dispose();
                break;
            }
            case "modt":{
                vModificarTrabajador.dispose();
                vBuscarTrabPk.dispose();
                break;
            }
            case "bajat":{
                vBuscarTrabPk.dispose();
                break;
            }
        }
    }
    public static Centro centroC(){
        cCentro = new Centro();
        return cCentro;
    }
    public static Administracion trabajadorAdministracion(){
        tAdministracion = new Administracion();
        return tAdministracion;
    }
    public static Logistica trabajadorLogistica(){
        tLogistica = new Logistica();
        return tLogistica;
    }
    public static void abrirVentanaBuscarTrabajador(){
        vBuscarTrabajador = new BuscarTrabajador(new javax.swing.JFrame(), true);
        vBuscarTrabajador.setVisible(true);
    }
    public static void cerrarVentanaBuscarTrabajador(){
        vBuscarTrabajador.dispose();
    }
    public static void abrirVentanaBuscarCentro(){
        vBuscarCentro = new BuscarCentro(new javax.swing.JFrame(), true);
        vBuscarCentro.setVisible(true);
    }
    public static void cerrarVentanaBuscarCentro(){
        vBuscarCentro.dispose();
    }
    public String ejecutarconsultas(String vdni){
        String cadena =bdTrabajador.consultas(vdni);
        return cadena;
    }
    public ArrayList ejecutarconsultaNombreC(String vnombre){
        listaT =bdTrabajador.consultaNombre(vnombre);
        return listaT;
    }
    public ArrayList ejecutarconsultasPk(String vdni){
        listaT =bdTrabajador.consultaPk(vdni);
        return listaT;
    }
    public ArrayList ejecutarconsultasPkc(String vnombreC){
        listaC =bdCentro.consultaPk(vnombreC);
        return listaC;
    }
    public void ProcEliminarTrabajador(String vdni){
        bdTrabajador.eliminarTrabajador(vdni);
    }
    public void ProcEliminarCentro(String vnombreC){
        bdCentro.eliminarCentro(vnombreC);
    }
    public void procUpdateTrabajador(String vdni,Trabajador t,String nombreCentro){
        bdTrabajador.updateTrabajador(vdni,t,nombreCentro);
    }
    public void procUpdateCentro(String vnombreC,Centro c){
        bdCentro.updateCentro(vnombreC,c);
    }
    public void procInsertTrabajador(Trabajador t){
        bdTrabajador.insertTrabajador(t);
    }
    public void procInsertCentro(Centro c){
        bdCentro.insertCentro(c);
    }
    public ArrayList procConsultaCentro(){
        listaC =bdCentro.consultaCentro();
        return listaC;
    }
    
    public static void abrirVentanaLogistica(){
        vLogistica=new VentanaLogistica ();
        vLogistica.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        vLogistica.setVisible(true);
    }
    public static void abrirVentanaCreacionPartes(){
        vNuevoParte=new NuevoParte(vLogistica, true);
        vNuevoParte.setVisible(true);
  
    }
    public static void cerrarVentanaCreacionPartes(){
        
        vNuevoParte.dispose();
        
        
    }
    public static void registrarSalidas(String alba, String hini, String hlleg){
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:mm");
        
        LocalTime hI=LocalTime.parse(hini, dtf);
        LocalTime hLL=LocalTime.parse(hlleg, dtf);
        
        
        Salida s =new Salida (alba,hI,hLL);
        listaDeSalidas.add(s);
        
    }
    public static String verListaDeSalidasRegistradas(){
        
        String listaSal="LISTA DE LAS SALIDAS REGISTRADAS EN EL PARTE"
                       +"\n==================================================";
        
        int cont=1;
        
        for (int i=0;i<listaDeSalidas.size();i++){
 
            listaSal+="\n"+cont+":  NºALBARAN:  "+listaDeSalidas.get(i).getAlbaran()+"  H. SALIDA:  "+listaDeSalidas.get(i).getHoraSalida()+"  H. LLEGADA:  "+listaDeSalidas.get(i).getHoraLLegada();
            cont++;
        }

        return listaSal;
    }
    public static Integer numeroDeSalidasRegistradasHastaELMomento(){

        return listaDeSalidas.size();
        
    }
    public static void borrarSalidaDelRegistro(String pos){
        
        int index=Integer.parseInt(pos);
        index--;
        listaDeSalidas.remove(index);

    }
}