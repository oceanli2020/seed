package com.lihaiyang.seed.base.controller;

import com.lihaiyang.seed.base.core.result.Result;
import com.lihaiyang.seed.base.dto.LoginInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * login入口
 *
 * @author : [ocean]
 * @createTime : [2022/7/23 22:10]
 */
@RestController("/v1")
public class LoginController {

    /**
     * login
     *
     * @param  loginInDTO 登录请求体
     * @return result
     */
    @PostMapping({"/login"})
    public Result login(@RequestBody LoginInDTO loginInDTO) {
        String username = loginInDTO.getUsername();
        String password = loginInDTO.getPassword();
        return Result.ofSuccess(null);
    }
}

