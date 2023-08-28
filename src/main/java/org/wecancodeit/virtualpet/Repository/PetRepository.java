package org.wecancodeit.virtualpet.Repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.Models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
    
}