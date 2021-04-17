package com.james.arkroutine.model.entity.commanderraid;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.baseenum.Tier;
import com.james.arkroutine.model.relationtable.CharAndCommanderRaid;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"charAndCommanderRaidList"})
public class CommanderRaids extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commanderName;

    @Enumerated
    private Tier tier;

    private Integer requiredItemLevel;

    private String expectedReward;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commanderRaids")
    private List<CharAndCommanderRaid> charAndCommanderRaidList;
}
