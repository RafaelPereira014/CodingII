import java.awt.*;

public class Room {
		private String roomtype;
		private Point bl;
		private Point tr;
		
		public Room(String roomType,Point bl,Point tr){
			this.roomtype=roomType;
			this.tr=tr;
			this.bl=bl;
		}	
	public String roomType(){
		return roomtype;
	}
	public Point bottomLeft(){
		return bl;
	}
	public Point topRight(){
		return tr;
	}
	public double area(){
		return (tr.y()-bl.y())*(tr.x()-bl.x());
	}
	public Point geomCenter(){
		return new Point(((tr.x()+bl.x())/2),((tr.y()+bl.y())/2));
	}
	
	
	
	
}