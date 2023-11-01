package me.janggeunyeong.springbootPractice.service;

import lombok.RequiredArgsConstructor;
import me.janggeunyeong.springbootPractice.domain.Article;
import me.janggeunyeong.springbootPractice.dto.AddArticleRequest;
import me.janggeunyeong.springbootPractice.dto.UpdateArticleRequest;
import me.janggeunyeong.springbootPractice.repository.BlogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(Long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Not Found: " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Not Found : " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
