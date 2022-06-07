package org.zgy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.zgy.entity.InfOrganization;
import org.zgy.dao.InfOrganizationRepository;
import org.zgy.service.InfOriganizationService;

import java.util.List;

/**
 * @title: InfOriganizationServiceImpl
 * @Author ZhangGuanYi
 * @Date: 2022/6/7 16:00
 * @Version 1.0
 */
public class InfOriganizationServiceImpl implements InfOriganizationService {
    @Autowired
    private InfOrganizationRepository infOrganizationRepository;
    @Override
    public void covertNameToPinyin() {
        List<InfOrganization> infOrganizationList = infOrganizationRepository.findAll();
        infOrganizationList

    }
}
