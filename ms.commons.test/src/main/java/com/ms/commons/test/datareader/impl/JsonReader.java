/*
 * Copyright 2011-2016 ZXC.com All right reserved. This software is the confidential and proprietary information of
 * ZXC.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with ZXC.com.
 */
package com.ms.commons.test.datareader.impl;

import com.ms.commons.test.datareader.AbstractDataReader;
import com.ms.commons.test.memorydb.MemoryDatabase;

/**
 * @author zxc Apr 13, 2013 11:36:27 PM
 */
public class JsonReader extends AbstractDataReader {

    public String defaultExt() {
        return ".json";
    }

    @Override
    protected MemoryDatabase internalRead(String resourceName) {
        return JsonReaderUtil.readJson(resourceName);
    }
}
