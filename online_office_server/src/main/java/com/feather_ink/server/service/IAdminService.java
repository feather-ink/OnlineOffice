package com.feather_ink.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.feather_ink.server.pojo.Admin;
import com.feather_ink.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author feather_ink
 * @since 2021-06-28
 */
public interface IAdminService extends IService<Admin> {

    RespBean login(String username, String password, HttpServletRequest request);

    Admin getAdminByUserName(String username);
}
