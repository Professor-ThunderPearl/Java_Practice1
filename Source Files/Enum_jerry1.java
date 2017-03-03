package abcd;

public enum Enum_jerry1 {
	Code_Geass(9.8,"war+action","amazing"),
	Samurai_Champloo(8.5,"action","funny"),
	Gundam_00(9.0,"war+action","amazing");
	
	// we need to define the constructor for setting these above values.
	// And, also the getter for the values.
	
	private double rating;
	private String genre;
	private String feel;
	
	Enum_jerry1(double rating, String genre, String feel)
	{
		this.rating = rating;
		this.genre = genre;
		this.feel = feel;
	}
	
	public double getRating()
	{
		return rating;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public String getFeel()
	{
		return feel;
	}
	

}
