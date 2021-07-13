package com.miranda.observer.factory;

import com.miranda.observer.chars.FireWarrior;
import com.miranda.observer.enums.ElementEnum;
import com.miranda.observer.general.Characters;

public class SummonerFire extends SummonerChars {

    @Override
    protected Characters createChar(ElementEnum element) {
        if (element.equals(ElementEnum.FIRE)) {
            return new FireWarrior();
        }else {
            return null;
        }
    }
}
