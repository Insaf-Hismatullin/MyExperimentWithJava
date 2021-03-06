package ru.Hismatullin.Ins.XOG.model;

import java.awt.Point;

public class Field {

	private static final int FIELD_SIZE = 3;

	private static final int MIN_COORDINATES = 0;
	
	private static final int MAX_COORDINATES = FIELD_SIZE;
	
	private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];
	
	public int getSize(){
		return FIELD_SIZE;
	}
	
	public Figure getFigure(final Point point){
		return field[point.x][point.y];
	}
	
	public void setFigure(final Point point, final Figure figure){
		
		
		field[point.x][point.y]= figure;
		
		
	}
	
	
	private boolean checkPoint(final Point point){
		
		return checkCoordinate(point.x) && checkCoordinate(point.y);
		
	}
	
	private boolean checkCoordinate(final int coordinate){
			return coordinate >= MIN_COORDINATES && coordinate <= 
MAX_COORDINATES;
	}
	
}

