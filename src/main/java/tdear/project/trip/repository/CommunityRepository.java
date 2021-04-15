package tdear.project.trip.repository;

import org.springframework.stereotype.Repository;
import tdear.project.trip.domain.CommunityGroup;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CommunityRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(CommunityGroup communityGroup){ em.persist(communityGroup);}

    public CommunityGroup findOne(Long id) { return em.find(CommunityGroup.class, id);}

    /* public List<CommunityGroup> findAll(){} */
}
