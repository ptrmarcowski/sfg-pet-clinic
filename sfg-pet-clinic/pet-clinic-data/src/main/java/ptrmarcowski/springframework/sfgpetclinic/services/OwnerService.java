package ptrmarcowski.springframework.sfgpetclinic.services;

import ptrmarcowski.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
	
}
