package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Song {
	private StringProperty name;
	private StringProperty artist;
	private StringProperty album;
	private StringProperty year;
	

	public Song(String name, String artist) {
		// TODO Auto-generated constructor stub
		this.name = new SimpleStringProperty (name);
		this.artist = new SimpleStringProperty (artist);
		
		this.album = new SimpleStringProperty("Jay");
		this.album = new SimpleStringProperty("1998");
	}
	public String getname() {
		return name.get();
	}
	public void setName(String name) {
		this.name.set(name);
	}
	public StringProperty nameproperty() {
		return name;
	}
	public String getartist() {
		return artist.get();
	}
	public void setartist(String artist) {
		this.artist.set(artist);
	}
	public StringProperty artistproperty() {
		return artist;
	}
	public String getalbum() {
		return album.get();
	}
	public void setalbum(String album) {
		this.album.set(album);
	}
	public StringProperty albumproperty() {
		return album;
	}
	public String getyear() {
		return year.get();
	}
	public void setyear(String year) {
		this.year.set(year);
	}
	public StringProperty yearproperty() {
		return year;
	}


	

}
