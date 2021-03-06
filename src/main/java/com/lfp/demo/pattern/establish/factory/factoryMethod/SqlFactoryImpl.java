package com.lfp.demo.pattern.establish.factory.factoryMethod;

/**
 * Title: SQL查询工厂
 * Description: 工厂实例，产出SQL查询
 * Project: lfp-pattern
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class SqlFactoryImpl implements QueryFactory {

    @Override
    public EntityQuery factory() {
        return new SqlQueryImpl();
    }

}
