package com.product.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.product.api.entitys.Images;
import com.product.api.entitys.Product2;

@Service
public class ImageManager {
	
	//this function for set the main_image and other 8 images if available
	public List<Images> setTheImages(Product2 product2){
		List<Images> img=new ArrayList<>();
		Images mainImg=new Images();
		mainImg.setUrl(product2.getImgMain());
		img.add(mainImg);
		if(product2.getImgUrl1()!=null) {
			Images img1=new Images();
			img1.setUrl(product2.getImgUrl1());
			img.add(img1);
		}
		if(product2.getImgUrl2()!=null) {
			Images img2=new Images();
			img2.setUrl(product2.getImgUrl2());
			img.add(img2);
		}
		if(product2.getImgUrl3()!=null) {
			Images img3=new Images();
			img3.setUrl(product2.getImgUrl3());
			img.add(img3);
		}
		if(product2.getImgUrl4()!=null) {
			Images img4=new Images();
			img4.setUrl(product2.getImgUrl4());
			img.add(img4);
		}
		if(product2.getImgUrl5()!=null) {
			Images img5=new Images();
			img5.setUrl(product2.getImgUrl5());
			img.add(img5);
		}
		if(product2.getImgUrl6()!=null) {
			Images img6=new Images();
			img6.setUrl(product2.getImgUrl6());
			img.add(img6);
		}
		if(product2.getImgUrl7()!=null) {
			Images img7=new Images();
			img7.setUrl(product2.getImgUrl7());
			img.add(img7);
		}
		if(product2.getImgUrl8()!=null) {
			Images img8=new Images();
			img8.setUrl(product2.getImgUrl8());
			img.add(img8);
		}
		return img;
	}
	
}

