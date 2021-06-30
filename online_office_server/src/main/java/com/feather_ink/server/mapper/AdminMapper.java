package com.feather_ink.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feather_ink.server.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author feather_ink
 * @since 2021-06-28
 */

@Repository
public interface AdminMapper extends BaseMapper<Admin> {

    //List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);

}
