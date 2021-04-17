package com.james.arkroutine.model.baseenum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tier {
    TIER_1(0, "티어 1"),
    TIER_2(1, "티어 2"),
    TIER_3(2, "티어 3"),
    ;

    private int id;
    private String tier;
}
