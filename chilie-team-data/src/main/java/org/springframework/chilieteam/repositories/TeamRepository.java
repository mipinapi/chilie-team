package org.springframework.chilieteam.repositories;

import org.springframework.chilieteam.model.Team;
import org.springframework.data.repository.CrudRepository;


public interface TeamRepository extends CrudRepository<Team, Long> {

}
