package com.james.arkroutine.model.entity.character;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.baseenum.Classes;
import com.james.arkroutine.model.entity.abyssraid.AbyssRaids;
import com.james.arkroutine.model.entity.eponaquest.EponaQuests;
import com.james.arkroutine.model.entity.expedition.Expeditions;
import com.james.arkroutine.model.relationtable.*;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"charAndChaosList", "charAndEponaList",
        "charAndGuardianList", "charAndAbyssDungeonList",
        "charAndCommanderRaidList", "charAndAbyssRaidsList"
})
public class Characters extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer achieveItemLevel;

    @Enumerated
    private Classes classes;


    @ManyToOne
    private Expeditions expeditions;

    //todo 1 : 카오스 던전
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
    private List<CharAndChaos> charAndChaosList;

    //todo 2 : 에포나 의뢰
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
    private List<CharAndEpona> charAndEponaList;

    //todo 3 : 가디언 토벌
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
    private List<CharAndGuardian> charAndGuardianList;

    //todo 4 : 어비스 던전
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
    private List<CharAndAbyssDungeon> charAndAbyssDungeonList;

    //todo 5 : 군단장 레이드
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
    private List<CharAndCommanderRaid> charAndCommanderRaidList;

    //todo 6 : 어비스 레이드
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "character")
    private List<CharAndAbyssRaids> charAndAbyssRaidsList;


}
