package com.example.moto_guide;
import android.os.Parcel;
import android.os.Parcelable;

public class EventsInfo implements Parcelable {
    private String name,address,desc;
    private String imageUrl;

    public EventsInfo() {
        this.name = name;
        this.address = address;
        this.imageUrl = imageUrl;
        this.desc=desc;
    }
    protected EventsInfo(Parcel in) {
        name = in.readString();
        address = in.readString();
        desc = in.readString();
        imageUrl = in.readString();
    }
    public static final Creator<EventsInfo> CREATOR = new Creator<EventsInfo>() {
        @Override
        public EventsInfo createFromParcel(Parcel in) {
            return new EventsInfo(in);
        }

        @Override
        public EventsInfo[] newArray(int size) {
            return new EventsInfo[size];
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

