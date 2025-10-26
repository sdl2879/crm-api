package com.crm.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.crm.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crm.vo.CustomerVO;
import com.github.yulichang.base.MPJBaseMapper;
import com.github.yulichang.wrapper.MPJLambdaWrapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author crm
 * @since 2025-10-12
 */
public interface CustomerMapper extends MPJBaseMapper<Customer> {

}