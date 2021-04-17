package com.james.arkroutine.model.entity.abyssraid;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.relationtable.CharAndAbyssRaids;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"charAndAbyssRaidsList"})
public class AbyssRaids extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String raidBossName;

    private String phase;

    private Integer requiredItemLevel;

    private Integer limitRewardLevel;

    private String expectedReward;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "abyssRaids")
    private List<CharAndAbyssRaids> charAndAbyssRaidsList;
}
