package org.MicroRabbitMq.service;

import org.MicroRabbitMq.dto.DtoUser;
import org.MicroRabbitMq.mapper.UserMapper;
import org.MicroRabbitMq.model.User;
import org.MicroRabbitMq.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser implements InterfaceUser{

    @Autowired
    private RepositoryUser repoUser;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(DtoUser dtoUser) {
        repoUser.save(userMapper.toUser(dtoUser));
    }

    @Override
    public void update(Long id, DtoUser dtoUser) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public Page<DtoUser> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<User> userPage = repoUser.findAll(pageable);
        return  userMapper.toDto(userPage);
    }

}
