package com.ltts.Team.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ltts.Team.Dao.TeamDao;
import com.ltts.Team.Model.Team;

@RestController
public class TeamController {
   @Autowired
   TeamDao td;
   
//	@RequestMapping("/teams")
	@GetMapping("/teams")
	public List<Team> getTeams()
	{
		return td.getAllTeam();
	}
}
