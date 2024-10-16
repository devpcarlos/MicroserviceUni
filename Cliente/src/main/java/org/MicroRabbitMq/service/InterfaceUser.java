package org.MicroRabbitMq.service;

import org.MicroRabbitMq.dto.DtoUser;
import org.MicroRabbitMq.model.User;
import org.springframework.data.domain.Page;

public interface InterfaceUser {
    void save(DtoUser dtoUser);
    void update(Long id, DtoUser dtoUser);
    void delete(Long id);
    User findById(Long id);
    Page<DtoUser> findAll(int page, int size);
}
