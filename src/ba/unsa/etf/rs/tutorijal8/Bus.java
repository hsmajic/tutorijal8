package ba.unsa.etf.rs.tutorijal8;

public class Bus {
    private Integer idBus = null;
    private String maker, series;
    private int seatNumber;
    private Driver driverOne = null;
    private Driver driverTwo = null;


public Bus(String maker, String series, int seatNumber){
    this.maker = maker;
    this.series = series;
    this.seatNumber = seatNumber;
}

public Bus(Integer idBus, String maker, String series, int seatNumber){
    this.idBus = idBus;
    this.maker = maker;
    this.series = series;
    this.seatNumber = seatNumber;
}

    public Bus() {
    }

    public Integer getIdBus() {
        return idBus;
    }

    public void setIdBus(Integer idBus) {
        this.idBus = idBus;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Driver getDriverOne() {
        return driverOne;
    }

    public void setDriverOne(Driver driverOne) {
        this.driverOne = driverOne;
    }

    public Driver getDriverTwo() {
        return driverTwo;
    }

    public void setDriverTwo(Driver driverTwo) {
        this.driverTwo = driverTwo;
    }

    @Override
    public String toString() {
        String ime = "";
        ime += this.maker + " " + this.series + " (br. sjedista: " + this.getSeatNumber() + " )";
        if(driverOne != null){
            ime += driverOne.toString();
        }
        if(driverTwo != null){
            ime += driverTwo.toString();
        }
        return ime;
    }

    public boolean equals (Bus bus){
    if(idBus != null) {
        return (bus.getIdBus().equals(this.getIdBus()));
    }
        return false;
    }

}
