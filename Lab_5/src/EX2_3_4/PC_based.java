package EX2_3_4;

public class PC_based extends Game{
    private String minimumRam;
    private String numberHardDriver;
    private String minimumGPU;

    public PC_based(String newDescription, String minimumRam, String numberHardDriver, String minimumGPU) {
        super(newDescription);
        this.minimumRam = minimumRam;
        this.numberHardDriver = numberHardDriver;
        this.minimumGPU = minimumGPU;
    }

    @Override
    public String toString() {
        return "PC_based{" + super.toString()+ ", " +
                "minimumRam='" + minimumRam + '\'' +
                ", numberHardDriver='" + numberHardDriver + '\'' +
                ", minimumGPU='" + minimumGPU + '\'' +
                '}';
    }
}
