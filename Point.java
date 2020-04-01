class Point {
	String color;
	String id
	double x,y;

	//TODO add new variable

	//TODO constructor
	public Point(String c, String ID, double X, double Y){
		this.color=c;
		this.id=ID;
		this.x=X;
		this.y=Y;
	}

	//TODO setters and getters
	public void setColor(String c){
		this.color=c;
	}
	public void setId(String ID){
		this.id=ID;
	}
	public void setX(double X){
		this.x=X;
	}
	public void setX(double X){
		this.x=X;
	}
	public String getColor(){
		return color;
	}
	public String getId(){
		return id;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		x=x+xDirection;
		y=y+yDirection;
	}

	public void draw () {
		//TODO
		System.out.println("("+x+", "+y+")");
	}



}