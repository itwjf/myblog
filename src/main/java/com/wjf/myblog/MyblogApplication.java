package com.wjf.myblog;

import com.wjf.myblog.entity.Article;
import com.wjf.myblog.repository.ArticleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan("com.wjf.myblog.entity")
//@EnableJpaRepositories("com.wjf.myblog.repository")
public class MyblogApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyblogApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ArticleRepository articleRepository){
		return args -> {
			Article article = new Article("测试标题","这是一篇测试文章的内容");
			articleRepository.save(article);


			System.out.println("所有文章列表：");
			articleRepository.findAll().forEach(System.out::println);

		};
	}
}
