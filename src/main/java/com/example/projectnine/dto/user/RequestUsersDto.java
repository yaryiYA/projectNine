package com.example.projectnine.dto.user;

import com.example.projectnine.dto.AbstractRequestDto;
import com.example.projectnine.dto.role.RequestRoleDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.projectnine.entity.Users} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RequestUsersDto extends AbstractRequestDto implements Serializable {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final RequestRoleDto role;
    private final String login;
    private final String password;
}