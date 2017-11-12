package cn.com.xhengz.weframe.common.persistence;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by xhengz on 2017/11/8.
 */
public interface IBaseDAO<T> extends Mapper<T> {

    /**
     * 调用数据库函数 返回指定 对象
     */
    public T queryForObjectByByFunction() throws Exception;

    /**
     * 调用数据库函数 查询结果是 List<Entity>
     */
    public List<T> queryForListByFunction() throws Exception;

    /**
     * 调用数据库存储过程 返回指定 对象
     */
    public T queryForObjectByProc() throws Exception;

    /**
     * 调用数据库存储过程 返回指定 对象
     */
    public List<T> queryForListByProc() throws Exception;

    /**
     * 执行 call 操作,执行存储过程,和数据库函数
     */
    public Object executeCallBack() throws Exception;
}
