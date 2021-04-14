package tdear.project.trip.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class CommunityGroup {


    @Id @GeneratedValue
    @Column(name = "community_group_Id")
    private Long id;
    private String communityGroupName;

    @OneToMany(mappedBy = "communityGroup")
    private List<UserCommunityGroup> userCommunityGroupList = new ArrayList<UserCommunityGroup>();

}
