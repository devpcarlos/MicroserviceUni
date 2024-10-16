package org.MicroRabbitMq.mapper;

import org.MicroRabbitMq.dto.DtoUser;
import org.MicroRabbitMq.model.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {

    //Converting dto object into entity object
    public User toUser (DtoUser dtoUser) {
        return User.builder()
                .nombre(dtoUser.getNombre())
                .apellido(dtoUser.getApellido())
                .edad(dtoUser.getFechaNacimiento())
                .build();
    }

    // Converting entity object into dto object
    public DtoUser toDto(User user) {
        return DtoUser.builder()
                .nombre(user.getNombre())
                .apellido(user.getApellido())
                .fechaNacimiento(user.getEdad())
                .build();
    }

    public List<DtoUser> toDto(List<User> users) {
        return users.stream()
                .map(user->DtoUser.builder()
                        .nombre(user.getNombre())
                        .apellido(user.getApellido())
                        .fechaNacimiento(user.getEdad())
                        .build())
                .toList();

    }

    public Page<DtoUser> toDto(Page<User> userPage) {
        return userPage.map(user->toDto(user));
    }
}
