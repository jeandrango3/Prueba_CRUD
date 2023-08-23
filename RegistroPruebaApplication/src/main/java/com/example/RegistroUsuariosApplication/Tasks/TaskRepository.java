//UserRepository

package com.example.RegistroUsuariosApplication.Tasks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TaskRepository extends JpaRepository<Tasks, Long> {

    Optional<Tasks> findProductsByName(String name);

}