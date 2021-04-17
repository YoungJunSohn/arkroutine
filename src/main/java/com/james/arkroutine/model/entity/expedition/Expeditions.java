package com.james.arkroutine.model.entity.expedition;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.entity.character.Characters;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"charactersList"})
public class Expeditions extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expeditionName;

    private String email;

    private String password;

    private Boolean challengeAbyssDungeon;

    private Integer energyOfLife;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "expeditions")
    private List<Characters> charactersList;
}
