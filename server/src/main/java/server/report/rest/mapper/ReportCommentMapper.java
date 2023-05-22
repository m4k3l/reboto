package server.report.rest.mapper;

import org.mapstruct.Mapper;
import server.report.entity.ReportComment;
import server.report.rest.resource.ReportCommentResource;
import server.user.entity.AppUser;
import server.user.rest.mapper.AppUserMapper;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {ReportDataMapper.class, AppUserMapper.class})
public interface ReportCommentMapper {

    ReportCommentResource map(ReportComment reportComment);

    List<ReportCommentResource> map(List<ReportComment> reportCommentList);

    default String mapAppUserToString(AppUser user) {
        return user.getFirstName() + " " + user.getLastName();
    }

    ReportComment map(ReportCommentResource resource);


}
