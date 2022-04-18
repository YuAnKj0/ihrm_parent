package com.ihrm.company.service;

import com.ihrm.domain.company.Company;

import java.util.List;

/**
 * @author Ykj
 */
public interface CompanyService {
    /**
     * 根据企业id查询企业信息
     * @param id
     * @return
     */
    public Company findCompanyById(String id);
    
    /**
     * 添加企业
     * @param company
     * @return
     */
    public Company add(Company company);
    /**
     * 更新企业信息
     */

    
    public Company update(Company company);
    
    /**
     * 根据id删除企业
     * @param id
     */
    public void deleteById(String id);
    
    /**
     * 查询苏哦有企业信息
     * @return
     */
    public List<Company> findAll();
    
}
