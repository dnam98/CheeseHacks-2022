package cheese22.shelter.repository;

import cheese22.shelter.domain.Dog;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class DogRepository {
    private final EntityManager em;

    public DogRepository(EntityManager em) {
        this.em = em;
    }

    public Dog save(Dog dog) {
        em.persist(dog);
        return dog;
    }

    public Optional<Dog> findById(Long dog_id) {
        Dog dog = em.find(Dog.class, dog_id);
        return Optional.ofNullable(dog);
    }

    public List<Dog> findAll() {
        return em.createQuery("select m from Member m", Dog.class)
                .getResultList();
    }

    public Optional<Dog> findByName(String name) {

    List<Dog> result = em.createQuery("select m from Member m where m.name = :name", Dog.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }
}
