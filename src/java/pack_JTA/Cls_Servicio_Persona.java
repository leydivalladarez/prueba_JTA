package pack_JTA;

import pack_JTA.cls_persona;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
@LocalBean
public class Cls_Servicio_Persona {

    @PersistenceContext
    private EntityManager em;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void insertar(cls_persona personaA, cls_persona personaB) {
        em.persist(personaA);
        em.persist(personaB);
    }
}
