package com.exmple.rssfeed.viewModel;

import android.databinding.BaseObservable;
import android.view.View;

import com.exmple.rssfeed.Utils.LoggerService;
import com.exmple.rssfeed.model.ArticleModel;

/**
 * Created by Quentin on 14/01/2017.
 */

public class ArticleViewModel extends BaseObservable {

    private ArticleModel article;

    public ArticleViewModel(ArticleModel article) {
        this.article = article;
    }

    public String getTitle() {
        return article.Title;
    }

    public String getAuthor() {
        return article.Author;
    }

    public String getText() {
        return article.Text;
    }

    public synchronized void onClickArticle(View view) {
        LoggerService.Log(this.getClass().getName(), "ON CLICK ARTICLE");
    }

    public synchronized void onClickAuthor(View view) {
        LoggerService.Log(this.getClass().getName(), "ON CLICK AUTHOR");
    }
}