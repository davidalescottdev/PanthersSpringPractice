package com.david.test.david1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImplementation implements PlayerService {
    private List<Player> players = new ArrayList<>();

    @Override
    public List<Player> getAllPlayers() {
        return players;
    }

    @Override
    public Player getPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null; 
    }

    @Override
    public Player createPlayer(Player player) {
        player.setId(players.size() + 1);
        players.add(player);
        return player;
    }

    @Override
    public Player updatePlayer(int id, Player player) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == id) {
                player.setId(id);
                players.set(i, player);
                return player;
            }
        }
        return null;
    }

    @Override
    public void deletePlayer(int id) {
        players.removeIf(player -> player.getId() == id);
    }
}
