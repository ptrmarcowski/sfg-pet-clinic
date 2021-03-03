package ptrmarcowski.springframework.sfgpetclinic.services.map;

import java.util.Set;

import ptrmarcowski.springframework.sfgpetclinic.model.Speciality;
import ptrmarcowski.springframework.sfgpetclinic.services.SpecialtiesService;

public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}
	
}
