package tdear.project.trip.repository;

import org.hibernate.persister.entity.EntityPersister;
import org.springframework.stereotype.Repository;
import tdear.project.trip.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(User user) { em.persist(user);}

    public User findOne(Long id) { return em.find(User.class , id);}

    /*
    public List<User> findByname(String name){
    }
    */
}
