package com.springproject.myhome.service;

import com.springproject.myhome.model.Board;
import com.springproject.myhome.model.User;
import com.springproject.myhome.repository.BoardRepository;
import com.springproject.myhome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
