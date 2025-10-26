package com.crm.controller;

import com.crm.common.result.PageResult;
import com.crm.common.result.Result;
import com.crm.entity.Product;
import com.crm.query.ProductQuery;
import com.crm.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "商品管理")
@RestController
@RequestMapping("product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("page")
    @Operation(summary = "分页查询")
    public Result<PageResult<Product>> getPage(@RequestBody @Validated ProductQuery query) {
        return Result.ok(productService.getPage(query));
    }
}