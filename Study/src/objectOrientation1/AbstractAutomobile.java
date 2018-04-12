package objectOrientation1;

public abstract class AbstractAutomobile {
    /**
     * 車種区分
     */
    protected enum CarType {
        LIGHT_CAR,        //軽自動車
        STANDERD_CAR,    //普通者
        MEDIUM_CAR,        //中型車
        LARGE_CAR,        //大型車
        OVERSIZE        //特大車
    } ;


    /**
     * コンストラクタ
     */
    protected AbstractAutomobile(){

    }
    /**
     * コンストラクタ
     * @param carType 車種区分
     */
    protected AbstractAutomobile(CarType carType){
        this.setCarType(carType) ;
    }

    /**
     * 車種区分
     */
    private CarType carType;

    /**
     * @return 乗車定員
     */
    public abstract int getCapacity();


    /**
     * @return 車種(モデル)
     */
    public abstract String getCarModel();

    /**
     * @return 車種区分
     */
    public CarType getCarType() {
        return carType;
    }
    /**
     * @param carType 車種区分
     */
    public void setCarType(CarType carType) {
        this.carType = carType;
    }


    /**
     * @return 車種区分（文字列）
     */
    public String getCarTypeString(){
        String typeName = "" ;
        if(this.carType.equals(CarType.LIGHT_CAR)){
            typeName = "軽自動車";
        }else if(this.carType.equals(CarType.STANDERD_CAR)){
            typeName = "普通者";
        }else if(this.carType.equals(CarType.MEDIUM_CAR)){
            typeName = "中型車";
        }else if(this.carType.equals(CarType.LARGE_CAR)){
            typeName = "大型車";
        }else if(this.carType.equals(CarType.OVERSIZE)){
            typeName = "特大車";
        }
        return typeName ;
    }
}
