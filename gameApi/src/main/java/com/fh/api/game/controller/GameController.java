package com.fh.api.game.controller;

import com.fh.api.game.commen.ServerResponse;
import com.fh.api.game.model.Game;
import com.fh.api.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "game")
public class GameController {
    @Autowired
    private GameService gameService;

    @RequestMapping(value = "add")
    @ResponseBody
    @CrossOrigin
    public ServerResponse add(Game g){
        gameService.add(g);
        return ServerResponse.success();
    }
    @RequestMapping(value = "queryList")
    @ResponseBody
    @CrossOrigin
    public ServerResponse queryList(){
        List<Game> list=gameService.queryList();
        return ServerResponse.success(list);
    }
    @RequestMapping(value = "delete")
    @ResponseBody
    @CrossOrigin
    public ServerResponse delete(Integer nid){
        gameService.delete(nid);
        return ServerResponse.success();
    }
    @RequestMapping(value = "toupdate")
    @ResponseBody
    @CrossOrigin
    public ServerResponse toupdate(Integer nid){
        Game g=gameService.toupdate(nid);
        return ServerResponse.success(g);
    }
    @RequestMapping(value = "update")
    @ResponseBody
    @CrossOrigin
    public ServerResponse update(Game g){
        gameService.update(g);
        return ServerResponse.success();
    }
}
