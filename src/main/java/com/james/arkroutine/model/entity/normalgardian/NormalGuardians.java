package com.james.arkroutine.model.entity.normalgardian;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.baseenum.Tier;
import com.james.arkroutine.model.relationtable.CharAndGuardian;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"charAndGuardianList"})
public class NormalGuardians extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bossName;

    private String raidClass;

    @Enumerated
    private Tier tier;

    private Integer requiredItemLevel;

    private String expectedReward;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "normalGuardian")
    private List<CharAndGuardian> charAndGuardianList;
}
