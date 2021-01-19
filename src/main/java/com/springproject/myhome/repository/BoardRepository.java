package com.springproject.myhome.repository;

import com.springproject.myhome.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// <> 안에는 model/Board 파일 명
public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title, String content);

    // 검색기능을 위한
    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);
}
