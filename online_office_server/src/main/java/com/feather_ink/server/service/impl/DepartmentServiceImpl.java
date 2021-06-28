package com.feather_ink.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feather_ink.server.mapper.DepartmentMapper;
import com.feather_ink.server.pojo.Department;
import com.feather_ink.server.service.IDepartmentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author feather_ink
 * @since 2021-06-28
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
