package com.huazheng.mall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhanghuazheng
 * @title: Category
 * @projectName mall-pay
 * @description: TODO
 * @date 2020/3/15 14:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {
    private Integer id;
    private Integer parentId;
    private Integer status;
    private String name;
    private Integer sortOrder;
    private Date createTime;
    private Date updateTime;

}
