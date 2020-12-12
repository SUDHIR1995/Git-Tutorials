package UserDefineWebDriver;



public class ChromeDriver implements WebDriver{
	public  ChromeDriver() {
		System.out.println("Lounch ChromeDriver Browser::>>" );
		System.out.println();
	}
	public void get(String url) {
		System.out.println("Lounch url::"+"  "+url);
	}
	public void	findElement(String locater) {
		System.out.println("findElement locater is::"+"  "+locater);
	}
	public void close() {
		System.out.println("close the browser");
		
	}
	public void quit(){
		System.out.println("quit  the all tab of browser");
	}
	
}