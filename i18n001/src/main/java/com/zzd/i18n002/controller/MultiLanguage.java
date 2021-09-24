package com.zzd.i18n002.controller;

import com.zzd.i18n002.util.LocalUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzd
 * @version v1.0.0
 * @date 2021/9/24 9:13
 * @description 多语言
 */
@RestController
public class MultiLanguage {

    @GetMapping("/getmsg")
    public String language() {

        String message = LocalUtil.get("user.appname");  //调用
        return message;
    }
}
