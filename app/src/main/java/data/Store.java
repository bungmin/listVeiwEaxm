package data;

// 가계가 가지고 있는 고유 정보를 저장하는 역할
public class Store {
    public String name;
    //거리 : 가게의 좌표와 나의 좌표를 비교해서 계산
    // 위도/ 경도 => 37.123 , 128.014
    public double latitude;
    public double longitude;


    public String addr;
    public String openTime;
    public String closeTime;

    public Store(String name, double latitude, double longitude, String addr, String openTime, String closeTime) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.addr = addr;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}
