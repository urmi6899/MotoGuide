package com.example.moto_guide;

import android.util.Log;

import java.util.ArrayList;

public class Utilis {
    private static final String TAG="Utilis";
    private static ArrayList<PlacesInfo> allPlaces;

    public Utilis() {
    }
    public static void initializeAll(){
        Log.d(TAG, "initializeAll: called");
        if(null == allPlaces)
            allPlaces=new ArrayList<>();
        PlacesInfo dumas=new PlacesInfo();
        dumas.setName("Dumas");
        dumas.setAddress("Along the Arabian Sea, Surat, Gujarat, 395007, India");
        dumas.setDesc("Dumas Beach is an urban beach along the Arabian Sea, located 21 kilometres (13 mi) southwest of " +
                "the City of Surat in the Indian state of Gujarat.It is a popular " +
                "tourist destination in South Gujarat. Dumas Beach is unjustly infamous for being " +
                "in the top 35 haunted spots in India.Apart from the beach, places of interest at Dumas " +
                "include the Dariya Ganesh Temple located adjacent to the main beach. " +
                "The promenade has several shops selling Indian snacks like Bhajiya " +
                "(including the famous \"Lashkari Tomato Bhajiya\"), Pav Bhaji, sweet corn roasted on charcoal, " +
                "besides Chinese food. There are also several restaurants serving Chinese and Indian food are also " +
                "available, with vegetarian options for people. Restrooms are available near Morarji Desai " +
                "Circle.. In the recent days, PM Narendra Modi has inaugurated the Surat International Airport " +
                "named as \"Morarji Desai\".From which, a visitors for the surat's historical places will be " +
                "increases very soon. Before reaching Dumas beach, you will find an Anchor at a circle famous as " +
                "Sultanabad's circle. Near the Anchor Circle, you can see the Lashkari Bhajiya(લશ્કરી ભજીયા હાઉસ)," +
                "which is known for its various type of bhajiyas (\"bhajiya is one of the famous dishes amongst " +
                "Gujarati people\").");
        dumas.setImageUrl("https://static.toiimg.com/photo/62550904/.jpg");
        allPlaces.add(dumas);

        PlacesInfo amaziaa=new PlacesInfo();
        amaziaa.setName("Amaziaa");
        amaziaa.setAddress("Opp. Dumbal Transport Godown Canal Road Parvat Patiya, Magob, Surat, Gujarat 395010");
        amaziaa.setDesc("Amaazia Amusement Park or Amaazia Waterpark is an amusement water park in Surat. " +
                "Amaazia has been opened for public on 15th December, 2016 by the Chief Minister of Gujarat, " +
                "Vijay Rupani.It is built by Rajgreen Group of Companies.");
        amaziaa.setImageUrl("https://media-cdn.tripadvisor.com/media/photo-s/0d/eb/f6/9b/wave-pool.jpg");
        allPlaces.add(amaziaa);

        PlacesInfo scienceCenter=new PlacesInfo();
        scienceCenter.setName("Science Center");
        scienceCenter.setDesc("Science Centre, Surat is a multi-facility complex in Surat, " +
                "Gujarat, India built by the Surat Municipal Corporation in 2009, the first of its type in " +
                "western India.The complex houses a Science Centre, museum, an art gallery, an auditorium, " +
                "an Amphitheatre and a planetarium. It has been designed by Ahmedabad " +
                "based architectural firm, HCP Design, Planning and Management Pvt. Ltd.");
        scienceCenter.setAddress("City Light Road, Maheshwari Cir, beside Shree Maheshwari Bhawan, Surat, Gujarat 395007");
        scienceCenter.setImageUrl("https://www.suratmunicipal.gov.in/Images/ScienceCentre/ImageGallery/gallery_funscience4_big.jpg");
        allPlaces.add(scienceCenter);

        PlacesInfo aquarium=new PlacesInfo();
        aquarium.setName("Aquarium");
        aquarium.setAddress("Adajan Hazira Road, Opp. STAR BAZAR, Surat.");
        aquarium.setDesc("The exiting Aquarium is an integral unit & aqua part of " +
                "Dr.Shyamprasad Mukerjee Zoological Garden & is situated at Kasturba Gandhi Bal Udhyan, " +
                "popularly known as Pakshighar (old mini zoo, Chowk Bazar.Being located in the heart of the " +
                "Surat City, it attracts more & more children from the walled city area of Surat. " +
                "It contains 36 nos.of beautiful aquarium boxes, in which 36 varities of fresh water " +
                "ornamental fishes have been displayed in simulated, safe & secured environment. " +
                "This aquarium was damaged severly during dreades flood-2006, which has again been up " +
                "dated by the efforts of zoo & aquarium staff with the valuable guidence of the superiors " +
                "and support of competent authority.");
        aquarium.setImageUrl("https://surattourism.in/images/places-to-visit/header/jagdish-chandra-bose-aquarium-surat-tourism-entry-fee-timings-holidays-reviews-header.jpg");
        allPlaces.add(aquarium);

        PlacesInfo gopi=new PlacesInfo();
        gopi.setName("Gopi Talav");
        gopi.setAddress(" Samlasar, Surat, Gujarat, 395002, India");
        gopi.setDesc("Gopi Talav is a lake in the Gopipura locality in the city of Surat in Gujarat state of India. " +
                "It was built in circa 1510 CE by Malik Gopi, who was an affluent merchant and governor of Surat " +
                "during the Mughal Empire. In 2012, the lake was renovated by Surat Municipal Corporation and the " +
                "area surrounding it was redeveloped as a recreational facility.");
        gopi.setImageUrl("https://surattourism.in/images/places-to-visit/header/gopi-talav-surat-tourism-entry-fee-timings-holidays-reviews-header.jpg");
        allPlaces.add(gopi);

        PlacesInfo vr=new PlacesInfo();
        vr.setName("VR Mall");
        vr.setDesc("VR Surat is Virtuous Retail South Asia's flagship destination and is a first-of-its-kind, " +
                "community-oriented integrated lifestyle destination. Spread over 615,000 sq. ft. the " +
                "Centre has established itself as Surat's only destination that offers a curated mix of " +
                "local and global programmes in the fields of retail, food, music, art, culture and " +
                "entertainment. Over the years, VR Surat, has emerged as a platform for cultural festivals, " +
                "public-private partnerships and cross-border collaborations that encourage civic pride, " +
                "strengthen the local economy and enhance the city’s brand image, thereby " +
                "“Connecting Communities©\".");
        vr.setAddress("Dumas Rd, Magdalla, Surat, Gujarat 395007");
        vr.setImageUrl("https://media-cdn.tripadvisor.com/media/photo-s/06/0d/45/90/vr-surat.jpg");
        allPlaces.add(vr);

    }

    public static ArrayList<PlacesInfo> getAllPlaces() {
        return allPlaces;
    }
   /* public static void setAllPlaces(ArrayList<PlacesInfo> allPlaces) {
        Utilis.allPlaces = allPlaces;
    }*/

}

