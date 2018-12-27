package com.boonya.springcloud.beans.base;

import java.util.List;

/**
 * mybatis基础mapper接口类
 *
 * @packge com.wlyd.fmcgwms.util.base.BaseMapper
 * @date 2016年4月28日 下午2:22:02
 * @author pengjunlin
 * @comment 添加注释
 * @update
 */
public interface BaseMapper<T, PK extends java.io.Serializable> {

    // -----------mybatis自动生成代码对应的方法名---------
    /**
     * 根据实体主键ID查询对象
     *
     * @MethodName: selectByPrimaryKey
     * @Description:
     * @param modelPK
     * @return
     * @throws
     */
    T selectByPrimaryKey(PK modelPK);

    /**
     * 根据实体主键ID删除对象
     *
     * @MethodName: deleteByPrimaryKey
     * @Description:
     * @param modelPK
     * @return
     * @throws
     */
    Integer deleteByPrimaryKey(PK modelPK);

    /**
     * 选择性地插入实体对象
     *
     * @MethodName: insertSelective
     * @Description:
     * @param model
     * @return
     * @throws
     */
    Integer insertSelective(T model);

    /**
     * 插入实体对象
     *
     * @MethodName: insert
     * @Description:
     * @param model
     * @return
     * @throws
     */
    Integer insert(T model);

    /**
     * 选择性地更新实体对象
     *
     * @MethodName: updateByPrimaryKeySelective
     * @Description:
     * @param model
     * @return
     * @throws
     */
    Integer updateByPrimaryKeySelective(T model);

    /**
     * 根据主键更新实体对象
     *
     * @MethodName: updateByPrimaryKey
     * @Description:
     * @param modelPK
     * @return
     * @throws
     */
    Integer updateByPrimaryKey(PK modelPK);

}
