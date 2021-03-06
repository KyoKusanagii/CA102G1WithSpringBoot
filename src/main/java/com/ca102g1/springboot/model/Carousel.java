package com.ca102g1.springboot.model;

public class Carousel {
    private Integer carouselNo;

    private String carouselTitle;

    private String carouselSubtitle;

    private byte[] carouselPic;

    public Integer getCarouselNo() {
        return carouselNo;
    }

    public void setCarouselNo(Integer carouselNo) {
        this.carouselNo = carouselNo;
    }

    public String getCarouselTitle() {
        return carouselTitle;
    }

    public void setCarouselTitle(String carouselTitle) {
        this.carouselTitle = carouselTitle == null ? null : carouselTitle.trim();
    }

    public String getCarouselSubtitle() {
        return carouselSubtitle;
    }

    public void setCarouselSubtitle(String carouselSubtitle) {
        this.carouselSubtitle = carouselSubtitle == null ? null : carouselSubtitle.trim();
    }

    public byte[] getCarouselPic() {
        return carouselPic;
    }

    public void setCarouselPic(byte[] carouselPic) {
        this.carouselPic = carouselPic;
    }
}