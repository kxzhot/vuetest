package com.fh.api.game.service;

import com.fh.api.game.model.Game;

import java.util.List;

public interface GameService {
    void add(Game g);

    List<Game> queryList();

    void delete(Integer nid);

    Game toupdate(Integer nid);

    void update(Game g);
}
