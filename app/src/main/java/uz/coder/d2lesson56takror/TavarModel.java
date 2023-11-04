package uz.coder.d2lesson56takror;

public class TavarModel {
    String tavarName;
    int tavarNarxi;
    String hajmBirligi;

    public String getTavarName() {
        return tavarName;
    }

    public void setTavarName(String tavarName) {
        this.tavarName = tavarName;
    }

    public int getTavarNarxi() {
        return tavarNarxi;
    }

    public void setTavarNarxi(int tavarNarxi) {
        this.tavarNarxi = tavarNarxi;
    }

    public String getHajmBirligi() {
        return hajmBirligi;
    }

    public void setHajmBirligi(String hajmBirligi) {
        this.hajmBirligi = hajmBirligi;
    }

    public TavarModel(String tavarName, int tavarNarxi, String hajmBirligi) {
        this.tavarName = tavarName;
        this.tavarNarxi = tavarNarxi;
        this.hajmBirligi = hajmBirligi;
    }
}
