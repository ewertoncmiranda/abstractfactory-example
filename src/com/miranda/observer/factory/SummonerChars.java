package com.miranda.observer.factory;

import com.miranda.observer.enums.ElementEnum;
import com.miranda.observer.general.Characters;

public abstract class SummonerChars {

    public Characters summonChar(ElementEnum element){
        return createChar(element);
    }

    protected  abstract  Characters createChar(ElementEnum element);

}
