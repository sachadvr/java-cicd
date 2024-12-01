package fr.anthonyquere.tpcd2024.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleJpaRepository articleJpaRepository;

    public Optional<ArticleEntity> getArticleByName(String name) {
        return articleJpaRepository.findById(name);
    }

    public void saveArticle(String name) {
        articleJpaRepository.save(
                new ArticleEntity(name)
        );
    }
}
