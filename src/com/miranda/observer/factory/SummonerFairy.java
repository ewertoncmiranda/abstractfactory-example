package com.miranda.observer.factory;

import com.miranda.observer.chars.MagicianFairy;
import com.miranda.observer.enums.ElementEnum;
import com.miranda.observer.general.Characters;

public class SummonerFairy extends SummonerChars{
    @Override
    protected Characters createChar(ElementEnum element) {
        if(element.equals(ElementEnum.FAIRY)){
            return  new MagicianFairy();
        } else {
            return  null;
        }
    }
}
