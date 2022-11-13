package cheese22.shelter.service;

import cheese22.shelter.domain.Dog;
import cheese22.shelter.repository.DogRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class DogService {
    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    /**
     * Sign up
     */
    public Long join(Dog dog) {
        // Check if the name is already in the repository
        validateDuplicateMember(dog);

        dogRepository.save(dog);
        return dog.getDog_id();
    }

    private void validateDuplicateMember(Dog dog) {
        dogRepository.findByName(dog.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("The user already exists");
                });
    }

    /**
     * Find all members
     */
    public List<Dog> findDogs() {
        return dogRepository.findAll();
    }

    /**
     * Find an user by Id
     */
    public Optional<Dog> findOne(Long dog_id) {
        return dogRepository.findById(dog_id);
    }
}
