package com.prospect.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prospect.manager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si nécessaire
}
