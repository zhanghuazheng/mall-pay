package com.huazheng.mall.dao;

import com.huazheng.mall.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhanghuazheng
 * @title: CategoryDao
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 15:16
 */

public interface CategoryDao {
    @Select("select * from mall_category where id=#{id}")
    Category getCategoryById(@Param("id") Integer id);

    List<Category> selectCategory(@Param("id") Integer id);
}
