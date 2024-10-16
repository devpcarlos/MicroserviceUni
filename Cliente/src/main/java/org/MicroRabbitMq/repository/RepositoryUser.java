package org.MicroRabbitMq.repository;

import org.MicroRabbitMq.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User, Long> {
    Page findAll(Pageable pageable);
}
