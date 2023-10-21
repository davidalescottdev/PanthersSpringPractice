package com.david.test.david1;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PlayerService {
    List<Player> getAllPlayers();
    Player getPlayerById(int id);
    Player createPlayer(Player player);
    Player updatePlayer(int id, Player player);
    void deletePlayer(int id);
}
