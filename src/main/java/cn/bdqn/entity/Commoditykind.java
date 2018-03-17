package cn.bdqn.entity;

/**
 * Created by samsung on 2018/3/17.
 */
public class Commoditykind {
    /*
    *
    *
        商品类型	typeId	int			TRUE	FALSE	TRUE
        商品ID	commodityID	int			FALSE	TRUE	FALSE
        类型名称	typeName	varchar(50)	50		FALSE	FALSE	FALSE
    *
    * */
    private int typeId , commodityID ;
    private String typeName;
    private Commodity commodity;

    public Commoditykind() {
    }

    public Commoditykind(int typeId, int commodityID, String typeName, Commodity commodity) {
        this.typeId = typeId;
        this.commodityID = commodityID;
        this.typeName = typeName;
        this.commodity = commodity;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    @Override
    public String toString() {
        return "Commoditykind{" +
                "typeId=" + typeId +
                ", commodityID=" + commodityID +
                ", typeName='" + typeName + '\'' +
                ", commodity=" + commodity +
                '}';
    }
}
