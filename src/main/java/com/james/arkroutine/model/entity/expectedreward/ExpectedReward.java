package com.james.arkroutine.model.entity.expectedreward;

import com.james.arkroutine.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExpectedReward extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String siling;

    private String fragment;

    private String demolitionStone;

    private String protectionStone;

    private String equipment;

    private String accessory;

    private String abilityStone;

    private String penetrationStone;

    private String bossRushTicket;

    private String cubeTicket;

    private String runeStone;

    private String battleSealBook;

    private String classSealBook;

    private String cardPack;

}
