package tdear.project.trip.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Setter @Getter
public class UserCommunityGroup {

    @Id @GeneratedValue
    @Column(name = "user_community_group_id")
    private Long id;


    @ManyToOne(fetch = LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "community_group_Id")
    private CommunityGroup communityGroup;


}
