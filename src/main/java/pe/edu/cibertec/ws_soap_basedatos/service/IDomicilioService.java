package pe.edu.cibertec.ws_soap_basedatos.service;

import pe.edu.cibertec.ws.objects.GetDomicilioResponse;
import pe.edu.cibertec.ws.objects.GetListDomiciliosResponse;
import pe.edu.cibertec.ws.objects.PostDomicilioResponse;
import pe.edu.cibertec.ws.objects.PostDomilicioRequest;


import java.util.List;

public interface IDomicilioService {

    GetListDomiciliosResponse obtenerDomicilios();
     GetDomicilioResponse obtenerDomicilioId(int id);
    PostDomicilioResponse guardar(PostDomilicioRequest domicilio);


}
