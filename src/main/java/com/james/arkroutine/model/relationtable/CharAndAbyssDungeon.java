package com.james.arkroutine.model.relationtable;

import com.james.arkroutine.model.BaseEntity;
import com.james.arkroutine.model.entity.abyssdungeon.AbyssDungeons;
import com.james.arkroutine.model.entity.character.Characters;
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
public class CharAndAbyssDungeon extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean cleared;

    @ManyToOne
    private Characters character;

    @ManyToOne
    private AbyssDungeons abyssDungeon;
}
