package parcial1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CargaDDJJIngresoFertilizante {
    
    static String [][] fertilizantesPermitidos = {
        {"101", "UREA", "BS"},
        {"102", "SULFATO AMONICO", "BS"},
        {"103", "NITRATO AMONICO", "BS"},
        {"104", "NITRATO DE CALCIO", "BS"},
        {"105", "SUPERFOSFATO SIMPLE", "BD"},
        {"106", "SUPERFOSFATO TRIPLE", "BD"},
        {"107", "NITRATO AMONICO", "BS"},
        {"108", "CLORURO DE POTASIO", "BD"},
        {"109", "SULFATO DE POTASIO", "BS"},
        {"110", "NITROGENO LIQUIDO", "BD"}
    };
    
    static DDJJIngresoFertilizante ddjj = new DDJJIngresoFertilizante();
    static double total = 0;
  
    public static void main(String[] args) {
        
        //Scanner entrada = new Scanner(System.in);      
        
      
        System.out.print("Ingrese la razón social: ");
        ddjj.setEmpresa(validarEmpresa());
        
        System.out.print("Ingrese el CUIT: ");
        ddjj.setCuitEmpresa(validarCuit());
        
        System.out.print("Ingrese el año de la declaración: ");
        ddjj.setAnioDeclaracion(validarAnio());
        
        System.out.print("Ingrese el mes de la declaración: ");
        ddjj.setMesDeclaracion(validarMes(ddjj.getAnioDeclaracion()));
        
        System.out.println("Ingrese la información de los fertilizantes a declarar:");
        ingresarFertilizantes();
        
        imprimir();
        
    }
        
    public static String validarEmpresa() {
            
        Scanner entrada = new Scanner(System.in);
        String empresa = entrada.nextLine();
        
        while(empresa.length()==0) {                
            System.out.print("Por favor ingrese un nombre válido: ");
            empresa = entrada.nextLine();
        }
            
        return empresa;
            
    }
    
    public static long validarCuit() {
        
        Scanner entrada = new Scanner(System.in);
        long cuit = entrada.nextLong();
        
        while(String.valueOf(cuit).length()!=11) {                
            System.out.print("Por favor ingrese un CUIT válido: ");
            cuit = entrada.nextLong();
        }
            
        return cuit;
        
    }
    
    public static int validarAnio() {
        
        Scanner entrada = new Scanner(System.in);
        int anio = entrada.nextInt();
        Date fecha = new Date();
                     //System.out.println(fecha.getYear()+1900);
        while(anio > fecha.getYear()+1900) {
            System.out.print("Año incorrecto. Ingrese un año válido: ");
            anio = entrada.nextInt();                
            }
        
        return anio;
        
    }
    
    public static int validarMes(int anio) {
        
        Scanner entrada = new Scanner(System.in);
        int mes = entrada.nextInt();
        Date fecha = new Date();
        
        if(anio == fecha.getYear()+1900) {
            while(mes >= fecha.getMonth()+1) {
                System.out.print("Mes incorrecto. Ingrese un año válido: ");
                mes = entrada.nextInt();   
            } 
        }
        
        return mes;
        
    }
    
    public static int validarCodigo() {
        
        Scanner entrada = new Scanner(System.in);
        boolean codigoCorrecto = false;
        int posCodigo = 0;
        
        System.out.print("Ingrese el código de producto: ");
        String codigo = entrada.nextLine();
        
        while(!codigoCorrecto) {
            for(int i=0; i<10; i++) {
                if(codigo.equals(fertilizantesPermitidos[i][0])) {
                    codigoCorrecto = true;
                    posCodigo = i;
                    break;
                }
            }
            if(!codigoCorrecto) {
                System.out.print("Código incorrecto.Intente de nuevo: ");
                codigo = entrada.nextLine();
            }
        }
        
        return posCodigo;
        
    }
        
    public static void ingresarFertilizantes() {
    
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        double subtotal;
        double valor;
        String salida;
        
        while(true) {
            
            DDJJFertilizanteIngresoDetalle detallesFert = new DDJJFertilizanteIngresoDetalle();
            int fertilizante = validarCodigo();
            detallesFert.setCodigo(fertilizantesPermitidos[fertilizante][0]);
            detallesFert.setNombre(fertilizantesPermitidos[fertilizante][1]);
            detallesFert.setTipoEnvase(fertilizantesPermitidos[fertilizante][2]);
            
            System.out.print("Ingrese la capacidad del envase: ");
            detallesFert.setCapacidadEnvase(entrada.nextDouble());
            
            System.out.print("Ingrese la cantidad de envases: ");
            detallesFert.setCantidad(entrada.nextInt());
            
            if(fertilizantesPermitidos[fertilizante][2].equals("BD")) {
           
                subtotal = detallesFert.getCantidad() * 12;
                detallesFert.setSubtotal(subtotal);
                total += subtotal;
                
            } else {
                
                while(detallesFert.getCapacidadEnvase() != 5 && detallesFert.getCapacidadEnvase() != 10 && detallesFert.getCapacidadEnvase() != 25 && detallesFert.getCapacidadEnvase() != 50) {
                    System.out.print("Ingrese la capacidad correcta (5, 10, 25 ó 50 Kg): ");
                    detallesFert.setCapacidadEnvase(entrada.nextDouble());
                }
                
                valor = detallesFert.getCapacidadEnvase();
                
                if(valor == 5) {
                    subtotal = 5 * detallesFert.getCantidad();
                    detallesFert.setSubtotal(subtotal);
                    total += subtotal;
                } else if(valor == 10) {
                        subtotal = 8 * detallesFert.getCantidad();
                        detallesFert.setSubtotal(subtotal);
                        total += subtotal;
                } else if(valor == 25) {
                        subtotal = 20 * detallesFert.getCantidad();
                        detallesFert.setSubtotal(subtotal);
                        total += subtotal;
                } else if(valor == 50) {
                        subtotal = 36 * detallesFert.getCantidad();
                        detallesFert.setSubtotal(subtotal);
                        total += subtotal;
                }
                
            }
            
            ddjj.addFertilizante(detallesFert);
            
            System.out.print("¿Desea agregar otro fertilizante? (S para contibuar) ");
                salida = entradaStr.nextLine();
                
                if(!salida.equalsIgnoreCase("S")) {
                    break;
                }
                
        }

    }
    
    private static String completarConEspacios(String cadena){
        
        int cantidadEspacios = 20 - cadena.length();
        
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        
        return cadena;
    }
    
    public static void imprimir() {
        
        System.out.println("-------------------- DECLARACIÓN JURADA --------------------\n");
        System.out.println("Nombre de la empresa: " + ddjj.getEmpresa());
        System.out.println("CUIT: " + ddjj.getCuitEmpresa());
        System.out.println("Mes: " + ddjj.getMesDeclaracion());
        System.out.println("Año: " + ddjj.getAnioDeclaracion());
        System.out.println("");
        System.out.println("DETALLE FERTILIZANTES:");
        System.out.println(completarConEspacios("Código") + "\t" + completarConEspacios("Nombre") + "\t" +
                completarConEspacios("Tipo envase") +  "\t" + completarConEspacios("Capacidad") + "\t" +
                completarConEspacios("Cantidad") + "\t" + completarConEspacios("Subtotal"));
        
        for(int i=0; i<ddjj.getDetallesFertilizantes().size(); i++) {
            
            System.out.println(completarConEspacios(ddjj.getDetallesFertilizantes().get(i).getCodigo()) + "\t" +
                    completarConEspacios(ddjj.getDetallesFertilizantes().get(i).getNombre()) + "\t" +
                    completarConEspacios(ddjj.getDetallesFertilizantes().get(i).getTipoEnvase()) + "\t" +
                    completarConEspacios(Double.toString(ddjj.getDetallesFertilizantes().get(i).getCapacidadEnvase())) + "\t" +
                    completarConEspacios(Integer.toString(ddjj.getDetallesFertilizantes().get(i).getCantidad())) + "\t" +
                    completarConEspacios(Double.toString(ddjj.getDetallesFertilizantes().get(i).getSubtotal())));
            //System.out.println("\n");
        }
        
        System.out.println("Total: " + total);
    }
    
}
