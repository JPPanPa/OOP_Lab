public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	 //tiêu đề
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	//danh mục, tiêu đề và giá thành
    public DigitalVideoDisc(String category, String director, float cost) {
		super();
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	//đạo diễn, thể loại, tiêu đề và chi phí
    public DigitalVideoDisc(String director, String category, String title, float cost) {
    	super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    //tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

}