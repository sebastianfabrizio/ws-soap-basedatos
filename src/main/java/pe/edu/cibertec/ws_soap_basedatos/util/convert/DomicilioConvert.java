package pe.edu.cibertec.ws_soap_basedatos.util.convert;


import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Domiliciosoap;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;

import java.util.ArrayList;
import java.util.List;


//convertiremos el objeto
@Component
public class DomicilioConvert {

    public Domicilio convertDomicilioBD(Domiliciosoap domiciliosoap) {
        Domicilio domicilio = new Domicilio();
        domicilio.setIddomicilio(domiciliosoap.getId());
        domicilio.setDescdomicilio(domiciliosoap.getDescripcion());
        domicilio.setNrodomilicio(domiciliosoap.getNumero());
        domicilio.setRefdomicilio(domiciliosoap.getReferencia());
        return domicilio;
    }

    public Domiliciosoap convertDomicilioSoap(Domicilio domicilio) {
        Domiliciosoap domiciliosoap = new Domiliciosoap();
        domiciliosoap.setId(domicilio.getIddomicilio());
        domiciliosoap.setDescripcion(domicilio.getDescdomicilio());
        domiciliosoap.setNumero(domicilio.getNrodomilicio());
        domiciliosoap.setReferencia(domicilio.getRefdomicilio());
        return domiciliosoap;
    }


    public List<Domicilio> convertDomicilioBdList(List<Domiliciosoap> domiciliosoap) {
        List<Domicilio> domicilios = new ArrayList<Domicilio>();
        for(Domiliciosoap domicilio : domiciliosoap) {
            domicilios.add(convertDomicilioBD(domicilio));
        }
        return domicilios;
    }

    public List<Domiliciosoap> convertDomicilioSoapList(List<Domicilio> domicilios) {
        List<Domiliciosoap> domiliciosoaps = new ArrayList<Domiliciosoap>();
        for(Domicilio domicilio : domicilios) {
            domiliciosoaps.add(convertDomicilioSoap(domicilio));
        }
        return domiliciosoaps;
    }


}
