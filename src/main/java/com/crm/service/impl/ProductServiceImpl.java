package com.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.crm.common.result.PageResult;
import com.crm.entity.Product;
import com.crm.mapper.ProductMapper;
import com.crm.query.ProductQuery;
import com.crm.service.ProductService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
        implements ProductService {

    @Override
    public PageResult<Product> getPage(ProductQuery query) {
        Page<Product> page = new Page<>(query.getPage(), query.getPage());

        LambdaQueryWrapper<Product> wrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(query.getName())) {
            wrapper.like(Product::getName, query.getName());
        }
        if (query.getStatus() != null) {
            wrapper.eq(Product::getStatus, query.getStatus());
        }

        Page<Product> result = baseMapper.selectPage(page, wrapper);
        return new PageResult<>(result.getRecords(), result.getTotal());
    }
}