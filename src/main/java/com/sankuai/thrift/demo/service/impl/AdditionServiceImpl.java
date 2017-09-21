package com.sankuai.thrift.demo.service.impl;

import com.sankuai.thrift.demo.service.AdditionService;
import org.apache.thrift.TException;

/**
 * Created by xdt on 2017/9/20.
 */
public class AdditionServiceImpl implements AdditionService.Iface {

    public AdditionServiceImpl () {

    }
    @Override
    public int add(int n1, int n2) throws TException {
        return n1+n2;
    }
}
