package com.ltts.DetailInfo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.DetailInfo.model.Player;
import com.ltts.DetailInfo.model.Team;

@RestController
public class DetailController {

	@Autowired
     RestTemplate rt;
	@Autowired
    RestTemplate pt;

     @RequestMapping("/teamdetail")
     public List<Team> getExternalTeam(){

    	 ResponseEntity<Team[]> response = rt.getForEntity("http://team-service/teams", Team[].class);
    	 Team[] teams =response.getBody();
    	 List<Team> lt = Arrays.asList(teams);
    	 return lt;
	 
     }
    	 
     @RequestMapping("/playerdetail")
     public List<Player> getExternalPlayer(){

    	 ResponseEntity<Player[]> response = pt.getForEntity("http://localhost:8084/players", Player[].class);
    	 Player[] player =response.getBody();
    	 List<Player> lt1 = Arrays.asList(player);
    	 return lt1;
	 
     }
}
