package com.tale.service;

import com.tale.dto.*;
import com.tale.model.Comments;
import com.tale.model.Contents;
import com.tale.model.Users;

import java.awt.*;
import java.util.List;

/**
 * 站点服务
 *
 * Created by biezhi on 2017/2/23.
 */
public interface SiteService {

    /**
     * 初始化站点
     *
     * @param users
     * @param jdbcConf
     */
    void initSite(Users users, JdbcConf jdbcConf);

    /**
     * 最新收到的评论
     *
     * @param limit
     * @return
     */
    List<Comments> recentComments(int limit);

    /**
     * 根据类型获取文章列表
     *
     * @param type  最新,随机
     * @param limit 获取条数
     * @return
     */
    List<Contents> getContens(String type, int limit);

    /**
     * 获取后台统计数据
     *
     * @return
     */
    Statistics getStatistics();

    /**
     * 查询文章归档
     *
     * @return
     */
    List<Archive> getArchives();

    /**
     * 查询一条评论
     * @param coid
     * @return
     */
    Comments getComment(Integer coid);

    /**
     * 系统备份
     * @param bk_type
     * @param bk_path
     * @param fmt
     * @return
     */
    BackResponse backup(String bk_type, String bk_path, String fmt) throws Exception;

    /**
     * 获取分类/标签列表
     * @return
     */
    List<MetaDto> getMetas(String seachType, String type, int limit);

    /**
     * 清楚缓存
     * @param key
     */
    void cleanCache(String key);

}
