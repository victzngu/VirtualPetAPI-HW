package org.wecancodeit.virtualpet.Repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.Models.Shelter;

public interface ShelterRepository extends CrudRepository<Shelter, Long>{
    
}