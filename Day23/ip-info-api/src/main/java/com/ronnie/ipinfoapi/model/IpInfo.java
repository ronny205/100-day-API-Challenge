package com.ronnie.ipinfoapi.model;


import lombok.Data;

@Data
public class IpInfo {
    private String ip;
    private String hostname;
    private String city;
    private String region;
    private String country;
    private String loc;
    private String org;
    private String postal;
    private String timezone;
}
