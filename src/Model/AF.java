/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DEIRY
 */
public class AF {

    public static Estado unirTransiciones(Estado estado, int simbolo) {
        Estado nuevaTran = new Estado();
        Iterator<Estado> iter = estado.getListDatos().iterator();
        Estado auxTran;
        while (iter.hasNext()) {
            Estado node = iter.next();
            auxTran = node.getTransicion(simbolo);
            if (auxTran != null) {
                if (nuevaTran.getId() == 0 && auxTran.getTamDatos() == 1) {
                    nuevaTran = auxTran;
                } else {
                    nuevaTran.addEstado(auxTran);
                }
            }
        }
        return nuevaTran;
    }

    public static Estado unionEstados(Estado this1, Estado estado2) {
        Estado estadoU = new Estado();
        if (this1.isEstadoAcep() || estado2.isEstadoAcep()) {
            estadoU.setEstadoAcep(true);
        }

        estadoU.addListData(this1);
        estadoU.addListData(estado2);

        return estadoU;
    }

    public static boolean perteneceA(ArrayList<Estado> estadosfinal, Estado nuevoE) {
        int idList = nuevoE.getId();

        for (int i = 0; i < estadosfinal.size(); i++) {
            Estado est = estadosfinal.get(i);
            if (est.getId() == idList) {
                return true;
            }
        }
        return false;
    }

    public static Estado igualEstado(ArrayList<Estado> estadosfinal, int nuevoE) {
        Estado est;
        for (int i = 0; i < estadosfinal.size(); i++) {
            est = estadosfinal.get(i);
            if (est.getId() == nuevoE) {
                return est;
            }
        }
        return null;
    }

    public static int buscarEstadoInicial(ArrayList<Estado> estados) {

        for (Estado estado : estados) {
            if (estado.isEstadoInicial()) {
                return estado.getPosEstado();
            }
        }

        return 0;
    }

    public static void igualTransiciones(ArrayList<Estado> estados, int simbolos) {
        Estado estadoList;
        for (Estado estado : estados) {
            for (int i = 0; i < simbolos; i++) {
                estadoList = estado.getTransicion(i);

                if (estadoList != null) {
                    estadoList = AF.igualEstado(estados, estadoList.getId());
                    if (estadoList != null) {
                        estado.setTransicion(estadoList, i);
                    }

                }

            }
        }

    }
    
    public static void imprimirVector(int[]vec){
    
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]+",");
        }
    }
}
