package ptrmarcowski.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ptrmarcowski.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
