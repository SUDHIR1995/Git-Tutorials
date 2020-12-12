package UserDefineWebDriver;



public interface WebDriver {
	
	public void get(String url);
	public void	findElement(String locater);
	public void close();
	public void quit();
	

}
