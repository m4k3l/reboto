package server.report.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import server.report.entity.ReportData;
import server.report.rest.resource.ReportDataResource;
import server.user.entity.OrgUnit;
import server.user.entity.OrgUnitType;
import server.user.entity.Role;
import server.user.entity.RoleType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ReportDataMapper {

    @Mapping(target = "toDate", expression = "java(calculateToDate(reportData.getFromDate()))")
    ReportDataResource map(ReportData reportData);

    List<ReportDataResource> map(List<ReportData> reportDataList);

    ReportData map(ReportDataResource resource);

    default LocalDate calculateToDate(LocalDate fromDate) {
        return fromDate.plusDays(6);
    }

    default String mapRoleToString(Role role) {
        return role.getName().toString();
    }

    default String mapOrgUnitToString(OrgUnit orgUnit) {
        return orgUnit.getUnitName().toString();
    }

    default OrgUnit mapStringToOrgUnit(String orgUnitString) {
        OrgUnit orgUnit = new OrgUnit();
        orgUnit.setUnitName(OrgUnitType.valueOf(orgUnitString));
        return orgUnit;
    }

    default Role mapStringToRole(String roleString) {
        Role role = new Role();
        role.setName(RoleType.valueOf(roleString));
        return role;
    }
}
