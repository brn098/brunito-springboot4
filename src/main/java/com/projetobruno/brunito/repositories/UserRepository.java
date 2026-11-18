package com.projetobruno.brunito.repositories;

import org.springframework.data.repository.ListCrudRepository;
import com.projetobruno.brunito.entities.User;

public interface UserRepository extends ListCrudRepository<User, Long> {

}
