package pe.edu.cibertec.ws_soap_basedatos.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws.objects.GetDomicilioResponse;
import pe.edu.cibertec.ws.objects.GetListDomiciliosResponse;
import pe.edu.cibertec.ws.objects.PostDomicilioResponse;
import pe.edu.cibertec.ws.objects.PostDomilicioRequest;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;
import pe.edu.cibertec.ws_soap_basedatos.repository.DomilicioRepository;
import pe.edu.cibertec.ws_soap_basedatos.util.convert.DomicilioConvert;

import java.util.List;


@RequiredArgsConstructor
@Service
public class DomilicioService implements IDomicilioService{

    private final DomilicioRepository repository;
    private final DomicilioConvert domicilioConvert;

    @Override
    public GetListDomiciliosResponse obtenerDomicilios() {
        GetListDomiciliosResponse response = new GetListDomiciliosResponse();
        response.getListdomicilios().addAll(
                domicilioConvert.convertDomicilioSoapList(
                        repository.findAll()
                )
        );
        return response;
    }

    @Override
    public GetDomicilioResponse obtenerDomicilioId(int id) {
        GetDomicilioResponse response = new GetDomicilioResponse();
        Domicilio domicilio = repository.findById(id).orElse(null);
        if (domicilio != null) {
            response.setDomicilio(domicilioConvert.convertDomicilioSoap(domicilio));
        }
        return response;
    }

    @Override
    public PostDomicilioResponse guardar(PostDomilicioRequest domicilio) {
        PostDomicilioResponse response = new PostDomicilioResponse();
        Domicilio nuevoDomilicio = repository.save(domicilioConvert.convertDomicilioBD(domicilio.getDomicilio()));

    response.setDomicilio(
            domicilioConvert.convertDomicilioSoap(nuevoDomilicio));
    return response;
    }
}
