package todo;
public class Todo {
	
	private String number;
	private String name;
	private String date;
	
	public Todo(String number, String name, String date) {
		this.number = number;
		this.name = name;
		this.date = date;
	}
	
	public Todo() {
		
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
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
