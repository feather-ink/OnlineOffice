package com.feather_ink.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feather_ink.server.mapper.NationMapper;
import com.feather_ink.server.pojo.Nation;
import com.feather_ink.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
