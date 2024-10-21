package oop.tem2.main;

import java.sql.SQLException;
import java.util.List;

import oop.tema2.dao.RubiksCubeDao;
import oop.tema2.rubiksCube.RubiksCube;

public class Main {

	public static void main(String[] args) throws SQLException {

		List<RubiksCube> rCubes = RubiksCubeDao.getRubiksCube();
		System.out.println("Lista cuburi");
		for (RubiksCube rc : rCubes) {
			System.out.println(rc);
		}
		
		System.out.println("\n===============\n");
		
		RubiksCube newRc = new RubiksCube("MoYO",250.25,3,"Magnetic");
		int rowsAffected = RubiksCubeDao.creatRubiksCube(newRc);
		System.out.println("A new rubikscube was created : numbers of rows affected " + rowsAffected);
		
		
		System.out.println("\n===============\n");
		
//		RubiksCube rcBYID = RubiksCubeDao.getRCByID(2);
//		System.out.println("Searched Rubiks Cube :" + rcBYID);
//		
//		System.out.println("\n===============\n");

//		int rcDelete = RubiksCubeDao.deletRubiksCube(2);
//		System.out.println("rows affected :" + rcDelete);
//		
//		System.out.println("\n===============\n");

		RubiksCube rcToUpdate = new RubiksCube(1,"Ivy Cube",22.3,5,"fast");
		int rcUpdate = RubiksCubeDao.updateRubiksCube(rcToUpdate);
		System.out.println("Updated rows :" + rcUpdate);
		RubiksCube rc = RubiksCubeDao.getRCByID(rcToUpdate.getId());
		System.out.println("Update Rubkis Cube :" + rc);
		
		

	}

}
