package ptrmarcowski.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ptrmarcowski.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

	Owner findByLastName(String lastName);
	
}
