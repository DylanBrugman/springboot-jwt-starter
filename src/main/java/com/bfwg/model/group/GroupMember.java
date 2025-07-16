package com.bfwg.model.group;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@NoArgsConstructor
@Data
@Entity
@Table(name = "group_member")
public class GroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long groupId;
    private long userId;
    private Instant createdAt;
    private Instant updatedAt;

    public GroupMember(long groupId, long userId) {
        this.groupId = groupId;
        this.userId = userId;
    }
}
