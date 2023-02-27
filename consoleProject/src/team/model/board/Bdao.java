package team.model.board;

import team.start;
import team.model.Dao;

public class Bdao extends Dao {
	
	private static Bdao bdao = new Bdao();
	private Bdao() {}
	public static Bdao getInstance() { return bdao; }  
}
