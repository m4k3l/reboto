package server.user.rest.mapper;

import org.mapstruct.Mapper;
import server.user.entity.OrgUnit;
import server.user.rest.resource.OrgUnitResource;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrgUnitMapper {

    OrgUnitResource map(OrgUnit orgUnit);

    List<OrgUnitResource> map(List<OrgUnit> orgUnitList);

    OrgUnit map(OrgUnitResource orgUnitResource);
}
