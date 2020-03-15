package com.huazheng.mall.dao;

import com.huazheng.mall.MallApplicationTests;
import com.huazheng.mall.pojo.Category;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhanghuazheng
 * @title: CategoryDaoTest
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 15:33
 */
public class CategoryDaoTest extends MallApplicationTests {
    @Resource
    private CategoryDao categoryDao;
    @Test
    public void getCategoryById() {
    }

    @Test
    public void selectCategory() {
        List<Category> categories = categoryDao.selectCategory(100001);
        for (Category categorie: categories) {
            System.out.println(categorie.toString());
        }
    }
}