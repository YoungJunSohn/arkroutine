package com.james.arkroutine.model.entity.eponaquest;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.relationtable.CharAndEpona;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"charAndEponaList"})
public class EponaQuests extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer requiredItemLevel;

    //todo 기대보상
    private String expectedReward;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "eponaQuest")
    private List<CharAndEpona> charAndEponaList;
}
