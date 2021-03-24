package com.ltts.Team.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Team.Model.Team;

@Repository
public class TeamDao {

	public List<Team> getAllTeam(){
		List<Team> li =new ArrayList<Team>();
		li.add(new Team(1,"CSK","Srini"));
		li.add(new Team(2,"MI","Ambani"));
		li.add(new Team(3,"RCB","ABC"));
		return li;
	}
}
