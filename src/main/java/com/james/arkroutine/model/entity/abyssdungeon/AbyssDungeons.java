package com.james.arkroutine.model.entity.abyssdungeon;

import com.james.arkroutine.model.baseenum.Tier;
import com.james.arkroutine.model.relationtable.CharAndAbyssDungeon;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"charAndAbyssDungeon"})
public class AbyssDungeons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated
    private Tier tier;

    private String region;

    private Integer requiredItemLevel;

    private Integer limitRewardLevel;

    private String expectedReward;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "abyssDungeon")
    private List<CharAndAbyssDungeon> charAndAbyssDungeon;
}
