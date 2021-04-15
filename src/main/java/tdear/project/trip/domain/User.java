package tdear.project.trip.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class User {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String userId;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    @Enumerated
    private UserSe userSe;

    private LocalDateTime registDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserCommunityGroup> userCommunityGroupList = new ArrayList<UserCommunityGroup>();
}
