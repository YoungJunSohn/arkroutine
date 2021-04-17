package com.james.arkroutine.model.baseenum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Classes {

    DESTROYER(0, "Destroyer", "디스트로이어"),
    WAR_LORD(1, "WarLord", "워로드"),
    BERSERKER(2, "Berserker", "버서커"),
    HOLY_KNIGHT(3, "Holy Knight", "홀리나이트"),
    BATTLE_MASTER(4,"Battle Master" ,"배틀마스터"),
    INFIGHTER(5, "Infighter", "인파이터"),
    SOUL_MASTER(6, "Soul Master", "기공사"),
    LANCE_MASTER(7, "Lance Master", "창술사"),
    STRIKER(8, "Striker", "스트라이커"),
    DEVIL_HUNTER(9, "Devil Hunter", "데빌헌터"),
    BLASTER(10, "Blaster", "블래스터"),
    HAWK_EYE(11, "Hawk Eye", "호크아이"),
    SCOUTER(12, "Scouter", "스카우터"),
    GUN_SLINGER(13, "Gun Slinger", "건슬링어"),
    BARD(14, "Bard", "바드"),
    SUMMONER(15, "Summoner", "서머너"),
    ARCANA(16, "Arcana", "아르카나"),
    BLADE(17, "Blade", "블레이드"),
    DEMONIC(18, "Demonic", "데모닉"),
    REAPER(19, "Reaper", "리퍼")
    ;

    private int id;
    private String classes;
    private String korName;
}
