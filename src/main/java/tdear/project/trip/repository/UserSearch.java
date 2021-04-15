package tdear.project.trip.repository;

import lombok.Getter;
import lombok.Setter;
import tdear.project.trip.domain.UserSe;

@Getter @Setter
public class UserSearch {

    private String userName;
    private String userId;
    private UserSe userSe;
}
