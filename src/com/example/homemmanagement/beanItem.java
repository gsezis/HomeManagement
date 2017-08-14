package com.example.homemmanagement;

public class beanItem {
	private int imageId;
    private String title;
    private int imageforward;
    
   


	public beanItem(int imageId, String title,int imageforward){
    this.setImageId(imageId);
    this.setTitle(title);
    this.setImageId(imageforward);
}
//Get
	public int getImageId() {
		return imageId;
	}
	public String getTitle() {
		return title;
	}
	 public int getImageforward() {
			return imageforward;
		}
//Set
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	
	public void setImageforward(int imageforward) {
		this.imageforward = imageforward;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}
