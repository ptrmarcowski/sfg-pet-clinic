package ptrmarcowski.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ptrmarcowski.springframework.sfgpetclinic.model.Owner;
import ptrmarcowski.springframework.sfgpetclinic.model.Pet;
import ptrmarcowski.springframework.sfgpetclinic.model.PetType;
import ptrmarcowski.springframework.sfgpetclinic.model.Vet;
import ptrmarcowski.springframework.sfgpetclinic.services.OwnerService;
import ptrmarcowski.springframework.sfgpetclinic.services.PetTypeService;
import ptrmarcowski.springframework.sfgpetclinic.services.VetService;
import ptrmarcowski.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import ptrmarcowski.springframework.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("123141243431");
		
		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("123141243431");
		
		Pet fionasCat = new Pet();
		fionasCat.setName("Just Cat");
		fionasCat.setOwner(owner2);
		fionasCat.setPetType(savedCatPetType);
		fionasCat.setBirthDate(LocalDate.now());
		owner2.getPets().add(fionasCat);
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
	}

	
}
