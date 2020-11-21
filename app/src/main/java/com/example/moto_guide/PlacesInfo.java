package com.example.moto_guide;

import android.os.Parcel;
import android.os.Parcelable;

public class PlacesInfo implements Parcelable {
    private String name,address,desc;
    private String imageUrl;

    public PlacesInfo() {
        this.name = name;
        this.address = address;
        this.imageUrl = imageUrl;
        this.desc=desc;
    }
    protected PlacesInfo(Parcel in) {
        name = in.readString();
        address = in.readString();
        desc = in.readString();
        imageUrl = in.readString();
    }

    public static final Creator<PlacesInfo> CREATOR = new Creator<PlacesInfo>() {
        @Override
        public PlacesInfo createFromParcel(Parcel in) {
            return new PlacesInfo(in);
        }

        @Override
        public PlacesInfo[] newArray(int size) {
            return new PlacesInfo[size];
        }
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "PlacesInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(desc);
        dest.writeString(imageUrl);
    }
}

