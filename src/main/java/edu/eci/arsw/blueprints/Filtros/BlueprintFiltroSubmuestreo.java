/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.Filtros;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import java.util.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author laura
 */
//@Service
//@Component("BlueprintFiltroSubmuestreo")
public class BlueprintFiltroSubmuestreo implements BlueprintsFiltro {

    @Override
    public Blueprint filtrarBlueprint(Blueprint pl) throws BlueprintFiltroException {
        List<Point> ps= pl.getPoints();int j=0;
        List<Point> psnew=new ArrayList<>();
        for (Point p : ps) {
            if (j!=2) {
                psnew.add(p);
                j++;
            }
            else{
                j = 0;
            }
        }
        pl.setPoints(psnew);
        return pl;
    }

    @Override
    public Set<Blueprint> filtrarBlueprints(Set<Blueprint> pls) throws BlueprintFiltroException {
        for (Blueprint bp : pls) {
            List<Point> ps = bp.getPoints();int j = 0;
            List<Point> psnew = new ArrayList<>();
            for (Point p : ps) {
                if (j != 2) {
                    psnew.add(p);
                    j++;
                } else {
                    j = 0;
                }
            }
            bp.setPoints(psnew);
        }
        return pls;
    }

}
