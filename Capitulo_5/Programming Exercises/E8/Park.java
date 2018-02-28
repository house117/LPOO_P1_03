package testpark;
public class Park {
    private String name;
    private Integer size;
    private Boolean PicnicFacilities;

    public Park(String name, Integer size, Boolean PicnicFacilities, Boolean TennisCourt, Boolean Playground, Boolean SwimmingPool) {
        this.name = name;
        this.size = size;
        this.PicnicFacilities = PicnicFacilities;
        this.TennisCourt = TennisCourt;
        this.Playground = Playground;
        this.SwimmingPool = SwimmingPool;
    }
    private Boolean TennisCourt;
    private Boolean Playground;
    private Boolean SwimmingPool;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        if(size >= 0 && size <= 400){
            return size;
        } else{
            return 0;
        }
    }

    public void setSize(Integer size) {
        this.size = size;
        
       
    }

    public Boolean getPicnicFacilities() {
        return PicnicFacilities;
    }

    public void setPicnicFacilities(Boolean PicnicFacilities) {
        this.PicnicFacilities = PicnicFacilities;
    }

    public Boolean getTennisCourt() {
        return TennisCourt;
    }

    public void setTennisCourt(Boolean TennisCourt) {
        this.TennisCourt = TennisCourt;
    }

    public Boolean getPlayground() {
        return Playground;
    }

    public void setPlayground(Boolean Playground) {
        this.Playground = Playground;
    }

    public Boolean getSwimmingPool() {
        return SwimmingPool;
    }

    public void setSwimmingPool(Boolean SwimmingPool) {
        this.SwimmingPool = SwimmingPool;
    }
    
    
    
}
