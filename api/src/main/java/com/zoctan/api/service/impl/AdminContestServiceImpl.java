package com.zoctan.api.service.impl;

import com.zoctan.api.core.service.AbstractService;
import com.zoctan.api.mapper.AdminContestMapper;
import com.zoctan.api.model.AdminContest;
import com.zoctan.api.service.AdminContestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Zoctan
 * @date 2018/5/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AdminContestServiceImpl extends AbstractService<AdminContest> implements AdminContestService {
    @Resource
    private AdminContestMapper adminContestMapper;

}
