package JavaPrc;

public class Facade {
	private String beverage_name = "";
	private String movie_name = "";
	
	public Facade(String beverage_name,String movie_name) {
		this.beverage_name = beverage_name;
		this.movie_name = movie_name;
	}
	
	public void view_Movie() {
		Beverage beverage = new Beverage(beverage_name);
		Remote_Control remote = new Remote_Control();
		Movie movie = new Movie(movie_name);
		
		beverage.Prepare();
		beverage.Drink_name();
		remote.Turn_On();
		movie.Search_Movie();
		movie.Charge_Movie();
		movie.Play_Movie();
		remote.Turn_Off();
	}
}
