package barcode.android.model;

import java.util.Calendar;

public class Message {
	private int id;
	private Unit sender;
	private Unit receiver;
	private MessageStatus status;
	private String content;
	private Calendar time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Unit getSender() {
		return sender;
	}

	public void setSender(Unit sender) {
		this.sender = sender;
	}

	public Unit getReceiver() {
		return receiver;
	}

	public void setReceiver(Unit receiver) {
		this.receiver = receiver;
	}

	public MessageStatus getStatus() {
		return status;
	}

	public void setStatus(MessageStatus status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Calendar getTime() {
		return time;
	}

	public void setTime(Calendar time) {
		this.time = time;
	}
}
