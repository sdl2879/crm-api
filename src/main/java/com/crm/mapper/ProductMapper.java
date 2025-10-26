package com.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.crm.entity.Product;
import org.apache.ibatis.annotations.Param;

/**
 * 商品Mapper接口（继承MyBatis-Plus的BaseMapper，无需手动写基本CRUD）
 */
public interface ProductMapper extends BaseMapper<Product> {

    /**
     * 带条件的分页查询
     * @param page 分页参数（页码、每页条数）
     * @param name 商品名称（模糊搜索）
     * @param status 商品状态（0-初始化，1-上架，2-下架）
     * @return 分页结果
     */
    IPage<Product> selectProductByPage(
            Page<Product> page,
            @Param("name") String name,
            @Param("status") Byte status
    );
}