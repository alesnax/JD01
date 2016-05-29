package by.alesnax.hotel.bean;

import java.sql.Date;

public class Booking {
	
	private int staff_id;
	private int guest_id;
	private int room_id;
	private Date check_in;
	private Date check_out;
	
	public Booking(int staff_id, int guest_id, int room_id, Date check_in, Date check_out) {
		super();
		this.staff_id = staff_id;
		this.guest_id = guest_id;
		this.room_id = room_id;
		this.check_in = check_in;
		this.check_out = check_out;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public int getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public Date getCheck_in() {
		return check_in;
	}

	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}

	public Date getCheck_out() {
		return check_out;
	}

	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}
	
	
	
	
	
}
