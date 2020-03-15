package com.huazheng.mall;

import com.huazheng.mall.dao.CategoryDao;
import com.huazheng.mall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhanghuazheng
 * @title: MallApplicationTests
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 14:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallApplicationTests {
    @Resource
    private CategoryDao categoryDao;

    @Test
    public void getCategoryById(){
        Category category = categoryDao.getCategoryById(100006);
        System.out.println(category.toString());
    }

    @Test
    public void getListCategoryByParentId(){
        List<Category> categories = categoryDao.selectCategory(100001);
        for (Category categorie: categories) {
            System.out.println(categorie.toString());
        }
    }
}
