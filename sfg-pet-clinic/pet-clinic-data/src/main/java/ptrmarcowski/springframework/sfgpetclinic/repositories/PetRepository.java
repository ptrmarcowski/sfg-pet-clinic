package ptrmarcowski.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ptrmarcowski.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
