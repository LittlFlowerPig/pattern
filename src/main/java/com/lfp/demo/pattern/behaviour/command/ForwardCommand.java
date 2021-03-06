package com.lfp.demo.pattern.behaviour.command;

/**
 * Title:
 * Description:
 * Project: lfp-pattern
 * Date: 2017-12-18
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class ForwardCommand implements Command<Object> {

    private Receiver receiver;

    public ForwardCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Object execute(Object param) {
        return receiver.forward(param);
    }

}
