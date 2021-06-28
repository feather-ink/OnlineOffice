package com.feather_ink.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feather_ink.server.mapper.MailLogMapper;
import com.feather_ink.server.pojo.MailLog;
import com.feather_ink.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
