package xyz.amazingxu.wxblog.service;

import xyz.amazingxu.wxblog.dto.UserContextDTO;

import java.util.List;
import java.util.Map;

/**
 * @author xuwang <121894598@qq.com>
 * @date 2018/5/23 10:25
 */
public interface IBaseService {
    /**
     * Get user context
     * @return
     */
    UserContextDTO getUserContext();

    /**
     * SQL query
     * @param sql
     * @return
     */
    List<Map> sqlQuery(String sql);

    /**
     * SQL query with parameters
     * @param sql
     * @param params
     * @return
     */
    List<Map> sqlQuery(String sql,Object[] params);
}
