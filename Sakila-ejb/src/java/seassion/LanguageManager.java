/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seassion;


import entities.Language;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author itmanager
 */
@Stateless
@LocalBean
public class LanguageManager implements Serializable {

    @PersistenceContext(unitName = "Sakila-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

     public List<Language> getAllLanguages() {
        Query query = em.createNamedQuery("Language.findAll");
        return query.getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     
     public Language update(Language language) {
        return em.merge(language);
    }
     
     public void delete(Language language) {
        em.remove(em.merge(language));
    }

   
}
