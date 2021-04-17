package com.james.arkroutine.model.relationtable;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.entity.chaosdungeon.ChaosDungeons;
import com.james.arkroutine.model.entity.character.Characters;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {""})
public class CharAndChaos extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int restGauge;

    //todo 케릭터와 연결
    @ManyToOne
    private Characters character;

    //todo 카오스던전과 연결
    @ManyToOne
    private ChaosDungeons chaosDungeon;

}
