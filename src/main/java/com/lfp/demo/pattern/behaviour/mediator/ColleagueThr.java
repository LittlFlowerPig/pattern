package com.lfp.demo.pattern.behaviour.mediator;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-20
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class ColleagueThr extends Colleague {

    public ColleagueThr(Mediator mediator) {
        super(mediator);
    }

    public void operation(){
        getMediator().changed(this);
    }

}
