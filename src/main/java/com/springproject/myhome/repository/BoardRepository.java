package com.springproject.myhome.repository;

import com.springproject.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

// <> 안에는 model/Board 파일 명
public interface BoardRepository extends JpaRepository<Board, Long> {
}
