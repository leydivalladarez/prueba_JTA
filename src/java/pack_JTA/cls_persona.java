package pack_JTA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class cls_persona {

    @Id
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
