package com.miranda.observer;

import com.miranda.observer.enums.ElementEnum;
import com.miranda.observer.factory.SummonerChars;
import com.miranda.observer.factory.SummonerFairy;
import com.miranda.observer.factory.SummonerFire;
import com.miranda.observer.factory.SummonerIce;
import com.miranda.observer.general.Characters;

public class Main {

    public static void main(String[] args) {

        SummonerChars summon = new SummonerFairy();
        Characters character = summon.summonChar(ElementEnum.FAIRY);
        System.out.println(character.callChar());

        summon = new SummonerFire();
        character = summon.summonChar(ElementEnum.FIRE);
        System.out.println(character.callChar());

        summon = new SummonerIce();
        character = summon.summonChar(ElementEnum.ICE);
        System.out.println(character.callChar());


	}
}
