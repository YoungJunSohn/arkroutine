package com.james.arkroutine.model.entity.chaosdungeon;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.baseenum.Tier;
import com.james.arkroutine.model.relationtable.CharAndChaos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ChaosDungeons extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String region;

    @Enumerated
    private Tier tier;

    private String dungeonName;

    private Integer requiredItemLevel;

    //todo 서비스 완성 후 변경할 것
    private String expectedReward;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "chaosDungeon")
    private List<CharAndChaos> charAndChaosList;
}
