package com.springproject.myhome.repository;

import com.springproject.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// <> 안에는 model/Board 파일 명
public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title, String content);
}
