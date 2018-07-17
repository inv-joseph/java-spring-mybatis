package com.hibernate.sprinboot.HibernateSpringBoot.Service;

import java.util.List;
import com.hibernate.sprinboot.HibernateSpringBoot.Model.Article;

public interface IArticleService {
	List<Article> getAllArticles();
    Article getArticleById(int articleId);
    boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
}
