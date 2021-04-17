package com.james.arkroutine.model.relationtable;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.baseenum.Tier;
import com.james.arkroutine.model.entity.character.Characters;
import com.james.arkroutine.model.entity.commanderraid.CommanderRaids;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CharAndCommanderRaid extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated
    private Tier tier;

    private Integer requiredItemLevel;

    private String expectedReward;

    @ManyToOne
    private Characters character;

    @ManyToOne
    private CommanderRaids commanderRaids;

}
