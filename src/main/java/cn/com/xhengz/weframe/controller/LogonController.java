package cn.com.xhengz.weframe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/11/8.
 */
@Controller
@RequestMapping("/logon")
public class LogonController {

    @RequestMapping("/do")
    @ResponseBody
    public String logon() {
        return "logon Success";
    }
}
