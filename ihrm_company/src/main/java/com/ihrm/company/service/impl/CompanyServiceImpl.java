package com.ihrm.company.service.impl;

import com.ihrm.common.utils.IdWorker;
import com.ihrm.domain.company.Company;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Ykj
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private IdWorker idWorker;
    /**
     * 根据企业id查询企业信息
     *
     * @param id
     * @return
     */
    @Override
    public Company findCompanyById(String id) {
        Company company = companyDao.findById(id).get();
        return company;
    }
    
    /**
     * 添加企业
     *
     * @param company
     * @return
     */
    @Override
    public Company add(Company company) {
        company.setId(idWorker.nextId()+"");
        company.setCreateTime(new Date());
        company.setState(1);
        company.setAuditState("0");
        company.setBalance(0d);
        return companyDao.save(company);
    }
    
    /**
     * 更新企业信息
     *
     * @param company
     */
    @Override
    public Company update(Company company) {
        return companyDao.save(company);
    }
    
    /**
     * 根据id删除企业
     *
     * @param id
     */
    @Override
    public void deleteById(String id) {
    companyDao.deleteById(id);
    }
    
    /**
     * 查询苏哦有企业信息
     *
     * @return
     */
    @Override
    public List<Company> findAll() {
//        int i = 1/0;
        return companyDao.findAll();
    }
}
