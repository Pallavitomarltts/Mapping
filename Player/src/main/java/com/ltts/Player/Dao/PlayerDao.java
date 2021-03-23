package com.ltts.Player.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Player.Model.Player;

@Repository
public class PlayerDao {

	public List<Player> getAllPlayer(){
		List<Player> li =new ArrayList<Player>();
		li.add(new Player(1,"Virat","RCB"));
		li.add(new Player(2,"Dhoni","CSK"));
		li.add(new Player(1,"Rohit","RR"));
		return li;
	}
}
