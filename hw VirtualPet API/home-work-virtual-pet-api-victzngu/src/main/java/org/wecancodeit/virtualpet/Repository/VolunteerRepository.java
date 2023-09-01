package org.wecancodeit.virtualpet.Repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpet.Models.Volunteer;

public interface VolunteerRepository extends CrudRepository<Volunteer, Long> {
    
}
