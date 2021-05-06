package easy;

public class Song {
	private String name;
	private Song nextSong;

	public Song(String name) {
		this.name = name;
	}

	public void setNextSong(Song nextSong) {
		this.nextSong = nextSong;
	}

	public boolean isRepeatingPlaylist() {
		Song slow = this.nextSong;
		Song fast = slow == null ? null : slow.nextSong;
		while (fast != null) {
			System.out.println("This "+this.name+" -- "+this.nextSong.name);
			System.out.println("slow "+slow.name+" -- "+slow.nextSong.name);
			System.out.println("fast "+fast.name+" -- "+fast.nextSong.name);
			if (slow == this || slow == fast)
				return true;
			slow = slow.nextSong;
			fast = fast.nextSong;
			if (fast != null)
				fast = fast.nextSong;
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		Song song = (Song) obj;
		return this.name.equals(song.name);
	}

	public static void main(String[] args) {
		Song first = new Song("f1");
		Song second = new Song("f2");

		Song first1 = new Song("f3");
		Song second1 = new Song("f4");

		Song first2 = new Song("f5");
		Song second2 = new Song("f6");

		first.setNextSong(second);
		second.setNextSong(first1);
		first1.setNextSong(second1);
		second1.setNextSong(first2);
		first2.setNextSong(second2);
		second2.setNextSong(second1);
		System.out.println(first.isRepeatingPlaylist());
	}
}