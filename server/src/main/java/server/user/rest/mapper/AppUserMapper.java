package server.user.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import server.user.entity.*;
import server.user.rest.resource.AppUserResource;

@Mapper(componentModel = "spring", uses = {RoleMapper.class, OrgUnitMapper.class})
public interface AppUserMapper {

    @Mapping(target = "role", source = "role.name")
    @Mapping(target = "organizationalUnit", source = "organizationalUnit.unitName")
    AppUserResource map(AppUser user);

    AppUser map(AppUserResource resource);

    default OrgUnit mapStringToOrgUnit(String unitName) {
        OrgUnit orgUnit = new OrgUnit();
        orgUnit.setUnitName(OrgUnitType.valueOf(unitName));
        return orgUnit;
    }
    default Role mapStringToRole(String role) {
        Role newRole = new Role();
        newRole.setName(RoleType.valueOf(role));
        return newRole;
    }
}
