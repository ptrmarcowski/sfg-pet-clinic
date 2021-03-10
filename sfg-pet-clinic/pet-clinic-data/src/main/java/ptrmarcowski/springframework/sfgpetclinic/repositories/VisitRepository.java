package ptrmarcowski.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ptrmarcowski.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
