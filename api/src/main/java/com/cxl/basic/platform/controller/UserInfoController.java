package com.cxl.basic.platform.controller;

import com.cxl.basic.platform.enums.ResultEnum;
import com.cxl.basic.platform.form.AddUserForm;
import com.cxl.basic.platform.service.IUserInfoService;
import com.cxl.basic.platform.utils.ResultVoUtil;
import com.cxl.basic.platform.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cxl
 * @description 用户信息curd
 * @date 2020/11/12 0012
 */
@RestController
@Api(tags = "用户")
@AllArgsConstructor
@RequestMapping("/user")
public class UserInfoController {

    private IUserInfoService userService;

    /**
     * 添加用户
     * @param userForm 表单数据
     * @return 成功或者失败
     */
    @ApiOperation("添加用户")
    @PostMapping("/addUser")
    public ResultVo addUser(@Validated @RequestBody AddUserForm userForm){
        if(userService.addUser(userForm)){
            return ResultVoUtil.success();
        }else{
            return ResultVoUtil.error(ResultEnum.ADD_ERROR);
        }
    }
}
