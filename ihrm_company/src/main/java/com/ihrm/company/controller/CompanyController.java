package com.ihrm.company.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.domain.company.Company;
import com.ihrm.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin //解决跨域问题
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    
    @PostMapping("/add")
    public Result add( Company company){
        companyService.add(company);
        return Result.SUCCESS();
    }
    
    @PutMapping("/update/{id}")
    public Result update(@PathVariable("id") String id, Company company){
        Company one = companyService.findCompanyById(id);
        one.setName(company.getName());
        one.setRemarks(company.getRemarks());
        one.setState(company.getState());
        one.setAuditState(company.getAuditState());
        companyService.update(company);
        return Result.SUCCESS();
    }
    
    @DeleteMapping("/delete/{id}")
    //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable("id") String id){
        companyService.deleteById(id);
        return Result.SUCCESS();
    }
    @PostMapping("/findById/{id}")
    public Result findById(@PathVariable("id") String id){
        companyService.findCompanyById(id);
        return  new Result(ResultCode.SUCCESS);
    }
    
    @GetMapping
    public Result findAll(){
        companyService.findAll();
        return new Result(ResultCode.SUCCESS);
    }
}

