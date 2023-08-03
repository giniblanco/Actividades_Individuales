package academy.atl.newsletter.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmailRepository {
    @PersistenceContext
    private EntityManager baseDeDatos;

    @Transactional
    public void guardarEmail(String emailDelUsuario){
        String consultaSql = "INSERT INTO Subscriber (email) VALUES (:paramEmail)";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail",emailDelUsuario)
                .executeUpdate();
    }


    @Transactional
    public void eliminarEmail(String emailDelUsuario) {
        String consultaSql = "DELETE FROM Subscriber WHERE email = (:paramEmail)";
        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail",emailDelUsuario)
                .executeUpdate();
    }

    @Transactional
    public List<String> traerTodosLosEmails() {
        String consultaSql = "SELECT email FROM Subscriber";
        List<String> emails = baseDeDatos.createQuery(consultaSql).getResultList();
        return emails;
    }
}
