package tps_hr;

public class Notification {
	private String header;
	private String note;
	private GA writer;
	
	
	Notification(String header,String note,GA writer){
		setHeader(header);
		setNote(note);
		setWriter(writer);
	}
	
	@Override
	public String toString() {
		return this.header.toUpperCase()+"\n"+this.note+"\n"+"Annouced by"+this.writer.getName()+" "+this.writer.getSurname();
	}
	
	//getters and setters
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public GA getWriter() {
		return writer;
	}
	public void setWriter(GA writer) {
		this.writer = writer;
	}
	
	
}
