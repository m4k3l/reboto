package server.user.rest.mapper;

import org.mapstruct.Mapper;
import server.user.entity.Role;
import server.user.rest.resource.RoleResource;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleResource map(Role role);

    List<RoleResource> map(List<Role> roleList);

    Role map(RoleResource resource);
}
