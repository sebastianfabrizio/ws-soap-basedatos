//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.20 a las 09:44:54 AM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para moneda.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="moneda"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PESO"/&gt;
 *     &lt;enumeration value="SOL"/&gt;
 *     &lt;enumeration value="DOLAR"/&gt;
 *     &lt;enumeration value="EURO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "moneda")
@XmlEnum
public enum Moneda {

    PESO,
    SOL,
    DOLAR,
    EURO;

    public String value() {
        return name();
    }

    public static Moneda fromValue(String v) {
        return valueOf(v);
    }

}
