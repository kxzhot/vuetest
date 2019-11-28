package com.fh.api.game.mapper;

import com.fh.api.game.model.Game;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameMapper {
    void add(Game g);

    List<Game> queryList();

    void delete(Integer nid);

    Game toupdate(Integer nid);

    void update(Game g);
}
