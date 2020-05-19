package com.atldy.domain;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author shkstart
 * @create 2020-05-18 10:35
 * id parent_id`, `name`, `status`, `sort_order`, `create_time`, `update_time
 */

@Data
public class Category implements Serializable {

    private Integer id;
    private Integer parentId;
    private  String name;
    private Integer status;
    private Integer sortOrder;
    private Date createTime;
    private Date updateTime;

}
