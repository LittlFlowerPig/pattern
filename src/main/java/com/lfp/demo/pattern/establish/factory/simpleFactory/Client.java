package com.lfp.demo.pattern.establish.factory.simpleFactory;

/**
 * Title:
 * Project: fp-pattern
 * Description:
 * Date: 2017-11-15
 * Copyright: Copyright (c) 2020
 * Company: 北京中科院软件中心有限公司 (SEC)
 *
 * @author ZhuTao
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        EntityQuery query = QueryFactory.factory("HQL");
        query.formatEqual("code", "code");
        query.formatLike("name","name");
        System.out.println(query.getQuerys());

        query = QueryFactory.factory("SQL");
        query.formatEqual("code", "code");
        query.formatLike("name","name");
        System.out.println(query.getQuerys());
    }

}
