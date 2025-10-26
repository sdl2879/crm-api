package com.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crm.common.result.PageResult;
import com.crm.entity.Product;
import com.crm.query.ProductQuery;


public interface ProductService extends IService<Product> {


    PageResult<Product> getPage(ProductQuery query);
}