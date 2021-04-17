package com.james.arkroutine.model.relationtable;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.entity.character.Characters;
import com.james.arkroutine.model.entity.eponaquest.EponaQuests;
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
public class CharAndEpona extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer restGauge;

    private Integer remainingNumberOfCompletions;

    @ManyToOne
    private Characters character;

    @ManyToOne
    private EponaQuests eponaQuest;
}
