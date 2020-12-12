package com.cxl.basic.platform.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cxl.basic.platform.entity.UserInfo;
import com.cxl.basic.platform.form.ListUserForm;
import com.cxl.basic.platform.vo.UserVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.naming.Name;
import java.util.List;

/**
 * @author Administrator
 */
@Repository
public  interface UserInfoMapper extends BaseMapper<UserInfo> {

    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
    @Select("SELECT id,nickname,username,birthday FROM `user` WHERE `status`= #{status} LIMIT #{current},#{size}")
    List<UserVo> listUser(ListUserForm listUserForm);

}
