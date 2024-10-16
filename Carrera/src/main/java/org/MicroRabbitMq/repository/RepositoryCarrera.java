package org.MicroRabbitMq.repository;

import org.MicroRabbitMq.model.Carrera;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCarrera extends JpaRepository<Carrera, Long> {
     Page<Carrera> findAll( Pageable pageable);
}
