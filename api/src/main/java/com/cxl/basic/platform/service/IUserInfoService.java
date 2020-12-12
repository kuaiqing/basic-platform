package com.cxl.basic.platform.service;

import com.baomidou.mybatisplus.service.IService;
import com.cxl.basic.platform.entity.UserInfo;
import com.cxl.basic.platform.form.AddUserForm;

/**
 * @author Administrator
 */
public interface IUserInfoService extends IService<UserInfo> {

    /**
     * 添加用户
     * @param userForm 表单数据
     * @return true 或者 false
     */
    boolean addUser(AddUserForm userForm);
}
