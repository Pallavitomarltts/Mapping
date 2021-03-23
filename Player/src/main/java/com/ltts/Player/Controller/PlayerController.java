package com.ltts.Player.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Player.Dao.PlayerDao;
import com.ltts.Player.Model.Player;

@RestController
public class PlayerController {
	@Autowired
	PlayerDao pd;
	
	@GetMapping("/players")
	public List<Player>getPlayer()
	{
		return pd.getAllPlayer();
	}

}
