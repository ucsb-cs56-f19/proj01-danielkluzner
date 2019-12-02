package earthquakes.searches;

public class EqSearch {

    private int distance;
    private int minmag;
    private double lat;
    private double lon;
    private String location;

    public EqSearch(){
	distance = 0;
	minmag = 0;
	lat = 0.0;
	lon = 0.0;
	location = "";
    }

    public int getDistance(){
	return distance;
    }

    public int getMinmag(){
	return minmag;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }

    public String getLocation(){
	return location;
    }
    
    public void setDistance(int distance){
	this.distance = distance;
    }

    public void setMinmag(int minmag){
	this.minmag = minmag;
    }

    public void setLat(double lat){
	this.lat = lat;
    }

    public void setLon(double lon){
	this.lon = lon;
    }

    public void setLocation(String location){
	this.location = location;
    }
    
}
