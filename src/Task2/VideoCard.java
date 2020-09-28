package Task2;

public class VideoCard extends ComponentPC {
    public VideoCard(String name, String volMem, String tipMem, String manufacturerName, CoolingType coolingVideo) {
        super(name, volMem, tipMem, manufacturerName);
        this.coolingVideo = coolingVideo;
        this.componentTip="VideoCard";
    }

    private CoolingType coolingVideo;
    public CoolingType getCoolingType() {
        return this.coolingVideo;
    }

}
/*
Характеристики видеокарты: производитель, тип памяти, объем
памяти, охлаждение(активное или пассивное).
 */