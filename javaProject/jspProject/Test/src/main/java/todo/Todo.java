package todo;
public class Todo {
	
	private int number;
	private String name;
	private String date;
	
	public Todo(int number, String name, String date) {
		this.number = number;
		this.name = name;
		this.date = date;
	}
	
	public Todo() {
		
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Todo [number=" + number + ", name=" + name + ", date=" + date + "]";
	}
	
}
