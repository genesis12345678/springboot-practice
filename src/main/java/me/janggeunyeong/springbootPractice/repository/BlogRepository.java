package me.janggeunyeong.springbootPractice.repository;

import me.janggeunyeong.springbootPractice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
