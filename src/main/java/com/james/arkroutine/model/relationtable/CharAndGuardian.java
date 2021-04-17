package com.james.arkroutine.model.relationtable;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.entity.character.Characters;
import com.james.arkroutine.model.entity.normalgardian.NormalGuardians;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {})
public class CharAndGuardian extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer restGauge;

    private Integer remainingNumberOfHarvest;

    @ManyToOne
    private Characters character;

    @ManyToOne
    private NormalGuardians normalGuardian;

}
