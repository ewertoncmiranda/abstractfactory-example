package com.miranda.observer.factory;

import com.miranda.observer.chars.IceMagician;
import com.miranda.observer.enums.ElementEnum;
import com.miranda.observer.general.Characters;

public class SummonerIce extends  SummonerChars{

    @Override
    protected Characters createChar(ElementEnum element) {
        if(element.equals(ElementEnum.ICE)){
            return new IceMagician();
        } else return null;
    }
}
