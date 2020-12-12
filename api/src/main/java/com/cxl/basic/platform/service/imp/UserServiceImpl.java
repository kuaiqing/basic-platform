package com.cxl.basic.platform.service.imp;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cxl.basic.platform.dao.UserInfoMapper;
import com.cxl.basic.platform.entity.UserInfo;
import com.cxl.basic.platform.form.AddUserForm;
import com.cxl.basic.platform.service.IUserInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author cxl
 * @description
 * @date 2020/11/12 0012
 */
@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {


    @Override
    public boolean addUser(AddUserForm userForm) {
        return false;
    }
}
