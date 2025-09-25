package com.wjf.myblog.repository;

import com.wjf.myblog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //这个注解表示这是一个数据访问层组件（可选的，但推荐加上）
public interface ArticleRepository extends JpaRepository<Article,Long> {
    // 目前不需要写任何方法！
    // JpaRepository已经提供了基本的CRUD方法
}
