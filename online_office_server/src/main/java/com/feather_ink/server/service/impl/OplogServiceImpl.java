package com.feather_ink.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feather_ink.server.mapper.OplogMapper;
import com.feather_ink.server.pojo.Oplog;
import com.feather_ink.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
