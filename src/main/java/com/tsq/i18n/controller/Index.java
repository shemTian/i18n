package com.tsq.i18n.controller;

import com.tsq.i18n.common.I18N;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianshunqian
 * 创建时间 2019/4/25 15:19
 **/
@RestController
public class Index {

    @Autowired
    private I18N i18N;
    @RequestMapping(path = {"index","/","index.htm","index.html"})
    public String getMessage() {
        return i18N.getMessage("welcome.key", new Object[]{});
    }
    @RequestMapping(path = {"i18n/{user}"})
    public String getMessage(@PathVariable("user") String user) {
        return i18N.getMessage("welcome.key.user", new Object[]{user,"第二个参数"});
    }
}
