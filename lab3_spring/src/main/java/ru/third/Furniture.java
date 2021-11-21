package ru.third;


public class Furniture {
    private Integer id;

    private String type;

    private Integer productionYear;

    private Integer height;
    private Integer width;
    private Integer depth;

    public Furniture(Integer id, String type, Integer productionYear, Integer height, Integer width, Integer depth) {
        this.id = id;
        this.type = type;
        this.productionYear = productionYear;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", productionYear=" + productionYear +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
