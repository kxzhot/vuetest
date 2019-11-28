package com.fh.api.game.service;

import com.fh.api.game.mapper.GameMapper;
import com.fh.api.game.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GameServiceimpl implements  GameService{
    @Autowired
    private GameMapper gameMapper;

    @Override
    public void add(Game g) {
        g.setD_showtime(new Date());
        gameMapper.add(g);
    }

    @Override
    public List<Game> queryList() {
        return gameMapper.queryList();
    }

    @Override
    public void delete(Integer nid) {
        gameMapper.delete(nid);
    }

    @Override
    public Game toupdate(Integer nid) {
        return gameMapper.toupdate(nid);
    }

    @Override
    public void update(Game g) {
        gameMapper.update(g);
    }
}
