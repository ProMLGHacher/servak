package com.example.server.models.getModels;

import com.example.server.models.PlaceInfo;

import java.util.ArrayList;

public class Place {
    //Moscow
    PlaceInfo cityHotel1905 = new PlaceInfo(
            0,
            "City Hotel 1905",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/163362143.jpg?k=660c16405493478fa648e18524b3353fa434f353025c5bb14815d1e7575bd2a9&o=&hp=1",
            "3 Shmitovskiy Proyezd 3, Пресненский, Москва", "Отель"
    );

    //Moscow
    PlaceInfo corsaVita = new PlaceInfo(
            1,
            "Corsa Vita",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/313532524.jpg?k=e4c68260f3c7c188db56d9f8042e06bad155f381083bd3b648fd6cc99c2055ac&o=&hp=1",
            "Ulitsa 1905 goda 10/1, Пресненский, Москва, Россия", "Отель"
    );

    //Moscow
    PlaceInfo filiHouseHotel = new PlaceInfo(
            2,
            "Fili House Hotel",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/80369067.jpg?k=fd466de185c6c6b1a028b875fa0f15128ca8a0936537dc085ff6cc63ce84dd27&o=&hp=1",
            "ул. Тучковская, 11, корпус 2, Филевский парк, Москва, Россия", "Отель"
    );

    public ArrayList<PlaceInfo> getMoscowHotels() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(cityHotel1905);
        returnArray.add(corsaVita);
        returnArray.add(filiHouseHotel);
        return returnArray;
    }

    public PlaceInfo getCityHotel1905() {
        return cityHotel1905;
    }

    public PlaceInfo getCorsaVita() {
        return corsaVita;
    }

    public PlaceInfo getFiliHouseHotel() {
        return filiHouseHotel;
    }

    //Сочи
    PlaceInfo рiLoftHostel = new PlaceInfo(
            3,
            "HiLoft Hostel",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/318731599.jpg?k=62afdf384326df9a5c60fe97356d928aa8f87c0fcd16504c412a89b1aeb20253&o=&hp=1",
            "Chernomorskaya 15/1, Сочи, Россия", "Отель"
    );

    //Сочи
    PlaceInfo apartHotelHouse = new PlaceInfo(
            4,
            "Апарт-отель House",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/311441515.jpg?k=d63dcec29426fc1785a6e268eec5668899b500e8c3e2c19bcb1cf1f0fb099c9c&o=&hp=1",
            "39 улица Бытха, Сочи, Россия", "Отель"
    );

    //Сочи
    PlaceInfo hostelAlpiyskaya = new PlaceInfo(
            5,
            "Гостиница Alpyskaya",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/247556020.jpg?k=cc1eacc5ae585eac434b9ee8e5d8a770cd537568a8b84c76f07210d2dbdac55d&o=&hp=1",
            "Ulitsa Alpiyskaya 27 A, Сочи, Россия", "Отель"
    );

    public ArrayList<PlaceInfo> getSochiHotels() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(рiLoftHostel);
        returnArray.add(apartHotelHouse);
        returnArray.add(hostelAlpiyskaya);
        return returnArray;
    }

    public PlaceInfo getРiLoftHostel() {
        return рiLoftHostel;
    }

    public PlaceInfo getApartHotelHouse() {
        return apartHotelHouse;
    }

    public PlaceInfo getHostelAlpiyskaya() {
        return hostelAlpiyskaya;
    }

    //Краснодар
    PlaceInfo parallelHotelAndConferenceKrasnodar = new PlaceInfo(
            6,
            "Parallel Hotel & Conference Krasnodar",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/233219230.jpg?k=2c2814f9ae3bc1467e8216ab1a1501c5aaaf6bca9e61d21d3647aa81c16b2d2b&o=&hp=1",
            "Ulitsa Imeni bryusova 145, Краснодар, Россия", "Отель"
    );

    //Краснодар
    PlaceInfo parkHotel = new PlaceInfo(
            7,
            "Парк Отель",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/159674467.jpg?k=abe6b1742f024db4fb09777f5501700cc8d0ec9d7a5a29df3e3542cc17cae600&o=&hp=1",
            "Улица Береговая 28А, Краснодар, Россия", "Отель"
    );

    //Краснодар
    PlaceInfo pushkinApartments = new PlaceInfo(
            8,
            "Pushkin Apartments",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/287487742.jpg?k=4feb10970d9549a217885f8d9a17cc91e3602945b0bb684f12f3c13841c244b8&o=&hp=1",
            "ул. Пушкина, 2, Краснодар, Россия", "Отель"
    );

    public ArrayList<PlaceInfo> getKrasnodarHotels() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(parallelHotelAndConferenceKrasnodar);
        returnArray.add(parkHotel);
        returnArray.add(pushkinApartments);
        return returnArray;
    }

    public PlaceInfo getParallelHotelAndConferenceKrasnodar() {
        return parallelHotelAndConferenceKrasnodar;
    }

    public PlaceInfo getParkHotel() {
        return parkHotel;
    }

    public PlaceInfo getPushkinApartments() {
        return pushkinApartments;
    }

    //Анапа
    PlaceInfo hotelOrionPlus = new PlaceInfo(
            9,
            "Hotel Orion Plus",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/248316833.jpg?k=300830eb6f56e5dd9f3fbf89e51d030c725f268a729478566c988e135d41c843&o=&hp=1",
            "Ulitsa Lenina121, Анапа, Россия", "Отель"
    );

    //Анапа
    PlaceInfo makarenaGuestHouse = new PlaceInfo(
            10,
            "MAKARENA Guest House",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/156572205.jpg?k=fdcdebe9a779660fe0ef1db5553e32ae32a8f5e30b7f675e1f739b4d74928b18&o=&hp=1",
            "Ulitsa Samburova 156, Анапа, Россия", "Отель"
    );

    //Анапа
    PlaceInfo hotelWarmSea = new PlaceInfo(
            11,
            "Отель Тёплое море",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/299624258.jpg?k=aa0b5c47c49017799ed8ac1eb5eec52d4993ae2572093d71856c1a4ea280ba0f&o=&hp=1",
            "Chernomorskaya ulitsa 16a, Анапа, Россия", "Отель"
    );

    public ArrayList<PlaceInfo> getAnapaHotels() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(hotelOrionPlus);
        returnArray.add(makarenaGuestHouse);
        returnArray.add(hotelWarmSea);
        return returnArray;
    }

    public PlaceInfo getHotelOrionPlus() {
        return hotelOrionPlus;
    }

    public PlaceInfo getMakarenaGuestHouse() {
        return makarenaGuestHouse;
    }

    public PlaceInfo getHotelWarmSea() {
        return hotelWarmSea;
    }

    //Питер
    PlaceInfo strawberryDuckStPetersburg = new PlaceInfo(
            12,
            "Strawberry Duck St. Petersburg",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/242131728.jpg?k=282c5c188bf885e19529e42cf607ff71b3d5ddee6ede88ec60afb0960a8fabee&o=&hp=1",
            "Лермонтовский проспект 43/1, Адмиралтейский район, Санкт-Петербург, Россия", "Отель"
    );

    //Питер
    PlaceInfo wolfsHotel = new PlaceInfo(
            13,
            "Отель Волков",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/170417621.jpg?k=67a25ed15b6056fa1d06e5b1a73f8a42c6ab70a94ea0829247bef94bf7b6c871&o=&hp=1",
            "Измайловский проспект 17, Адмиралтейский район, Санкт-Петербург, Россия", "Отель"
    );

    //Питер
    PlaceInfo margaritaHotel = new PlaceInfo(
            14,
            "Margarita Hotel",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/199179346.jpg?k=29ec0806c06bcf161ebcaab9ea3a36cdc6848aeeddb89906422f37be1a03579d&o=&hp=1",
            "14 Srednyaya Pod'yacheskaya Ulitsa, Адмиралтейский район, Санкт-Петербург, Россия", "Отель"
    );

    public ArrayList<PlaceInfo> getPiterHotels() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(strawberryDuckStPetersburg);
        returnArray.add(wolfsHotel);
        returnArray.add(margaritaHotel);
        return returnArray;
    }

    public PlaceInfo getStrawberryDuckStPetersburg() {
        return strawberryDuckStPetersburg;
    }

    public PlaceInfo getWolfsHotel() {
        return wolfsHotel;
    }

    public PlaceInfo getMargaritaHotel() {
        return margaritaHotel;
    }

    //Ростов-на-Дону
    PlaceInfo hotelMone = new PlaceInfo(
            15,
            "Hotel Mone",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/282794751.jpg?k=2c3fe7623d319dee4c0f1f2293e5b870cb7e4c85fd229f6a05af4dfba0c74536&o=&hp=1",
            "Michurinskaya Ulitsa 12, Ростов-на-Дону, Россия", "Отель"
    );

    //Ростов-на-Дону
    PlaceInfo villaRio = new PlaceInfo(
            16,
            "Villa Rio",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/252415255.jpg?k=eacbfcd79f2ded805ca4c350f6a63896d3080e491043ad52a5aa779381d5548d&o=&hp=1",
            "Michurinskaya Ulitsa 12, Ростов-на-Дону, Россия", "Отель"
    );

    //Ростов-на-Дону
    PlaceInfo villaDiego = new PlaceInfo(
            17,
            "Вилла Диего",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/157248172.jpg?k=d7c76248ff4a0c51504fc411ca00db117424e89f63a7ef824de9087edc744595&o=&hp=1",
            "Улица Плиева 65, Ростов-на-Дону, Россия", "Отель"
    );

    public ArrayList<PlaceInfo> getRostovHotels() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(hotelMone);
        returnArray.add(villaRio);
        returnArray.add(villaDiego);
        return returnArray;
    }

    public ArrayList<PlaceInfo> getHotels() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(cityHotel1905);
        returnArray.add(corsaVita);
        returnArray.add(filiHouseHotel);
        returnArray.add(рiLoftHostel);
        returnArray.add(apartHotelHouse);
        returnArray.add(hostelAlpiyskaya);
        returnArray.add(parallelHotelAndConferenceKrasnodar);
        returnArray.add(parkHotel);
        returnArray.add(pushkinApartments);
        returnArray.add(hotelOrionPlus);
        returnArray.add(makarenaGuestHouse);
        returnArray.add(hotelWarmSea);
        returnArray.add(strawberryDuckStPetersburg);
        returnArray.add(wolfsHotel);
        returnArray.add(margaritaHotel);
        returnArray.add(hotelMone);
        returnArray.add(villaRio);
        returnArray.add(villaDiego);
        return returnArray;
    }






    //Moscow
    PlaceInfo varenichnaya = new PlaceInfo(
            18,
            "Вареничная № 1",
            "https://www.restoran.ru/upload/resize_cache/iblock/fc0/1000_667_11a88371ca9e7ba72ce6f5767ba9eff1a/3v7a4263d82.jpg",
            "Никольская ул., 11-13с2, Москва, Россия", "Кафе"
    );

    //Moscow
    PlaceInfo stolovaya57 = new PlaceInfo(
            19,
            "Столовая № 57",
            "https://irecommend.ru/sites/default/files/imagecache/copyright1/user-images/1654978/es7bkqBLnfxn1IgxPuzgKQ.jpg",
            "Красная площадь, 3, Москва, Россия (ТЦ ГУМ, этаж 3)", "Кафе"
    );

    //Moscow
    PlaceInfo drShivago = new PlaceInfo(
            20,
            "Dr. Живаго",
            "https://msk.webbanket.ru/images/katalog/restoran/dr_jivago/dr_jivago_00014.jpg",
            "Моховая ул., 15/1, Москва, Россия", "Кафе"
    );

    public ArrayList<PlaceInfo> getMoscowEat() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(varenichnaya);
        returnArray.add(stolovaya57);
        returnArray.add(drShivago);
        return returnArray;
    }

    public PlaceInfo getVarenichnaya() {
        return varenichnaya;
    }

    public PlaceInfo getStolovaya57() {
        return stolovaya57;
    }

    public PlaceInfo getDrShivago() {
        return drShivago;
    }

    //Sochi
    PlaceInfo midPlace = new PlaceInfo(
            21,
            "Мидийное Место",
            "https://irecommend.ru/sites/default/files/imagecache/copyright1/user-images/1314767/DDHIB3OFWPJH2cKA2n4X3g.jpg",
            "Приморская ул., 17, микрорайон Центральный, Сочи, Россия", "Кафе"
    );

    //Sochi
    PlaceInfo fettuchine = new PlaceInfo(
            22,
            "Феттуччине",
            "https://d34gu9h9mtzjxz.cloudfront.net/lib/profiles/82578/hall_portfolio/p_82578_21412_dbf8dae95da7a3f26b7f9ea87ae54f6e1c24bb5b_x3.jpg",
            "Театральная ул., 11, микрорайон Центральный, Сочи, Россия", "Кафе"
    );

    //Sochi
    PlaceInfo cheHarcho = new PlaceInfo(
            23,
            "Чё? Харчо!",
            "https://api.parkseason.ru/images/styles/1440_auto/e6/ae/156005c5baf40ff51a327f1c34f2975b584f32ebebd2b091476594.jpg",
            "Приморская ул., 3/10, микрорайон Центральный, Сочи, Россия", "Кафе"
    );

    public ArrayList<PlaceInfo> getSochiEat() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(midPlace);
        returnArray.add(fettuchine);
        returnArray.add(cheHarcho);
        return returnArray;
    }

    public PlaceInfo getMidPlace() {
        return midPlace;
    }

    public PlaceInfo getFettuchine() {
        return fettuchine;
    }

    public PlaceInfo getCheHarcho() {
        return cheHarcho;
    }

    //Krasnodar
    PlaceInfo lovePech = new PlaceInfo(
            24,
            "Любим печь",
            "https://cafetyt.ru/wp-content/uploads/2021/01/common-5673.jpeg",
            "ул. Ломоносова, 90, Центральный округ, микрорайон Центральный, Краснодар, Россия", "Кафе"
    );

    //Krasnodar
    PlaceInfo cafeKrasnodar = new PlaceInfo(
            25,
            "Cafe Krasnodar",
            "https://s3.yugopolis.ru/media/media/cache/longrid2x/data/img/3548184ecd9b928a2d4254a7fdfab739/281799.jpg",
            "ул. Разведчика Леонова, 4, Краснодар, Россия (Парк Краснодар)", "Кафе"
    );

    //Krasnodar
    PlaceInfo petrushka = new PlaceInfo(
            26,
            "Petrushka",
            "https://23krasnodar.fra1.cdn.digitaloceanspaces.com/2019/11/Petrushka-restoran-Kommunarov-268.jpg",
            "Красная ул., 154, Краснодар, Россия (этаж цокольный)", "Кафе"
    );

    public ArrayList<PlaceInfo> getKrasnodarEat() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(lovePech);
        returnArray.add(cafeKrasnodar);
        returnArray.add(petrushka);
        return returnArray;
    }

    public PlaceInfo getLovePech() {
        return lovePech;
    }

    public PlaceInfo getCafeKrasnodar() {
        return cafeKrasnodar;
    }

    public PlaceInfo getPetrushka() {
        return petrushka;
    }

    //Anapa
    PlaceInfo stolovochka = new PlaceInfo(
            27,
            "Столовочка",
            "https://i9.photo.2gis.com/images/branch/74/10414574183010784_7c87.jpg",
            "Краснодарская ул., 40, Анапа, Россия", "Кафе"
    );

    //Anapa
    PlaceInfo shpinat = new PlaceInfo(
            28,
            "Shpinat",
            "https://i9.photo.2gis.com/images/branch/74/10414574169841479_f09c.jpg",
            "Астраханская ул., 21, Анапа, Россия (эт. 1)", "Кафе"
    );

    //Anapa
    PlaceInfo letov = new PlaceInfo(
            29,
            "Летов",
            "https://baryha.ru/wp-content/uploads/2020/02/common-4831.jpeg",
            "ул. Ленина, 30А, Анапа, Россия", "Кафе"
    );

    public ArrayList<PlaceInfo> getAnapaEat() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(stolovochka);
        returnArray.add(shpinat);
        returnArray.add(letov);
        return returnArray;
    }

    public PlaceInfo getStolovochka() {
        return stolovochka;
    }

    public PlaceInfo getShpinat() {
        return shpinat;
    }

    public PlaceInfo getLetov() {
        return letov;
    }

    //Piter
    PlaceInfo koreana = new PlaceInfo(
            30,
            "Кореана",
            "https://storage.googleapis.com/tblr-images/d2d2318c-c0b7-34ae-9c6f-65d4eae99703.jpg",
            "просп. Испытателей, 37, Санкт-Петербург, Россия", "Кафе"
    );

    //Piter
    PlaceInfo ultramen = new PlaceInfo(
            31,
            "Ultramen",
            "https://i5.photo.2gis.com/images/branch/38/5348024603804566_da53.jpg",
            "наб. реки Фонтанки, 59, Санкт-Петербург, Россия", "Кафе"
    );

    //Piter
    PlaceInfo meal = new PlaceInfo(
            32,
            "Meal",
            "https://a-a-ah-ru.s3.amazonaws.com/uploads/items/151760/313276/large_%D0%B91.jpg",
            "Литейный просп., 17-19, Санкт-Петербург, Россия (пом. 9Н)", "Кафе"
    );

    public ArrayList<PlaceInfo> getPiterEat() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(koreana);
        returnArray.add(ultramen);
        returnArray.add(meal);
        return returnArray;
    }

    public PlaceInfo getKoreana() {
        return koreana;
    }

    public PlaceInfo getUltramen() {
        return ultramen;
    }

    public PlaceInfo getMeal() {
        return meal;
    }

    //Postov
    PlaceInfo raksAndGads = new PlaceInfo(
            33,
            "Раки и Гады",
            "https://assets.allcafe.ru/k/places/1920x1080/pic/places/30090/577b670052799d4610237dc64a31b200.jpeg",
            "ул. Шаумяна, 57, Ростов-на-Дону, Россия", "Кафе"
    );

    //Postov
    PlaceInfo choliBurgers = new PlaceInfo(
            34,
            "Choli Burgers",
            "https://i7.photo.2gis.com/images/branch/24/3377699757557203_66f2.jpg",
            "Красноармейская ул., 104, Ростов-на-Дону, Россия (эт. 1)", "Кафе"
    );

    //Postov
    PlaceInfo arisa  = new PlaceInfo(
            35,
            "Лариса жарит",
            "https://azur.ru/data/newfotos1/big/26/155326.jpg",
            "пер. Семашко, 113, Ростов-на-Дону, Россия", "Кафе"
    );

    public ArrayList<PlaceInfo> getRostovEat() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(raksAndGads);
        returnArray.add(choliBurgers);
        returnArray.add(arisa);
        return returnArray;
    }

    public PlaceInfo getRaksAndGads() {
        return raksAndGads;
    }

    public PlaceInfo getCholiBurgers() {
        return choliBurgers;
    }

    public PlaceInfo getArisa() {
        return arisa;
    }









    //Moscow
    PlaceInfo kreml = new PlaceInfo(
            36,
            "Московский Кремль",
            "https://7deti.ru/wp-content/uploads/2018/05/kreml.jpg",
            "Россия, Москва, Ивановская площадь", "Достопремичатеьлность"
    );

    //Moscow
    PlaceInfo tretiakovaskayaGallery = new PlaceInfo(
            37,
            "Государственная Третьяковская галерея",
            "https://ianed.ru/wp-content/uploads/2019/08/gallery_2_391_693799.jpg",
            "Россия, Москва, Ивановская площадь", "Достопремичатеьлность"
    );

    //Moscow
    PlaceInfo gum = new PlaceInfo(
            38,
            "ГУМ",
            "https://i1.wallbox.ru/wallpapers/main/201433/38b4007e15a35ed.jpg",
            "Красная площадь, 3, Москва, Россия", "Достопремичатеьлность"
    );

    public ArrayList<PlaceInfo> getMoscowAttractions() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(kreml);
        returnArray.add(tretiakovaskayaGallery);
        returnArray.add(gum);
        return returnArray;
    }

    public PlaceInfo getKreml() {
        return kreml;
    }

    public PlaceInfo getTretiakovaskayaGallery() {
        return tretiakovaskayaGallery;
    }

    public PlaceInfo getGum() {
        return gum;
    }

    //Sochi
    PlaceInfo fisht = new PlaceInfo(
            39,
            "Олимпийский Стадион «Фишт»",
            "https://s15.stc.all.kpcdn.net/russia/wp-content/uploads/2019/02/Stadion-2048.jpg",
            "Олимпийский просп., 15, Сочи", "Достопремичатеьлность"
    );

    //Sochi
    PlaceInfo sportComplex = new PlaceInfo(
            40,
            "Дворец спорта Большой",
            "https://i.archi.ru/i/213916.jpg",
            "Олимпийский просп., 7, п. г. т. Сириус", "Достопремичатеьлность"
    );

    //Sochi
    PlaceInfo brilliantHand = new PlaceInfo(
            41,
            "Памятник героям фильма Бриллиантовая рука",
            "https://tochka-na-karte.ru/modules/photo/images/4786-Pamjatnik-gerojam-filma-Brilliantovaja-ruka-v-Sochi.jpg",
            "ул. Войкова, 1/1, микрорайон Центральный, Сочи", "Достопремичатеьлность"
    );

    public ArrayList<PlaceInfo> getSochiAttractions() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(fisht);
        returnArray.add(sportComplex);
        returnArray.add(brilliantHand);
        return returnArray;
    }

    public PlaceInfo getFisht() {
        return fisht;
    }

    public PlaceInfo getSportComplex() {
        return sportComplex;
    }

    public PlaceInfo getBrilliantHand() {
        return brilliantHand;
    }

    //Krasnodar
    PlaceInfo ozMoll = new PlaceInfo(
            42,
            "OZ МОЛЛ",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/16/1e/37/7d/oz.jpg?w=1100&h=-1&s=1",
            "ул. Крылатая, 2, Краснодар 350910 Россия", "Достопремичатеьлность"
    );

    //Krasnodar
    PlaceInfo galitckPark = new PlaceInfo(
            43,
            "Парк Галицкого",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/16/ed/54/82/photo3jpg.jpg?w=1200&h=-1&s=1",
            "улица Разведчика Леонова, Краснодар 350059 Россия", "Достопремичатеьлность"
    );

    //Krasnodar
    PlaceInfo rosha = new PlaceInfo(
            44,
            "Чистяковская роща",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/04/98/27/62/caption.jpg?w=1200&h=-1&s=1",
            "ул. Колхозная, д. 86, Краснодар 350010 Россия", "Достопремичатеьлность"
    );

    public ArrayList<PlaceInfo> getKrasnodarAttractions() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(ozMoll);
        returnArray.add(galitckPark);
        returnArray.add(rosha);
        return returnArray;
    }

    public PlaceInfo getOzMoll() {
        return ozMoll;
    }

    public PlaceInfo getGalitckPark() {
        return galitckPark;
    }

    public PlaceInfo getRosha() {
        return rosha;
    }

    //Anapa
    PlaceInfo naberezhnaya = new PlaceInfo(
            45,
            "Набережная Анапы",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/11/57/75/ed/caption.jpg?w=1200&h=-1&s=1",
            "Набережная Анапы", "Достопремичатеьлность"
    );

    //Anapa
    PlaceInfo whiteCap = new PlaceInfo(
            46,
            "Памятник Белой шляпе",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/17/10/88/50/caption.jpg?w=1200&h=-1&s=1",
            "парк 30-летия Победы, Анапа 353440 Россия", "Достопремичатеьлность"
    );

    //Anapa
    PlaceInfo sunIsland = new PlaceInfo(
            47,
            "Парк \"Солнечный Остров\"",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/14/08/59/2d/caption.jpg?w=1200&h=-1&s=1",
            "Пионерский проспект, 38А, Анапа 353450 Россия", "Достопремичатеьлность"
    );

    public ArrayList<PlaceInfo> getAnapaAttractions() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(naberezhnaya);
        returnArray.add(whiteCap);
        returnArray.add(sunIsland);
        return returnArray;
    }

    public PlaceInfo getNaberezhnaya() {
        return naberezhnaya;
    }

    public PlaceInfo getWhiteCap() {
        return whiteCap;
    }

    public PlaceInfo getSunIsland() {
        return sunIsland;
    }

    //Piter
    PlaceInfo museum = new PlaceInfo(
            48,
            "Государственный Музей-Заповедник Царское Село",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/18/32/28/23/predio-principal-do-tsarskoe.jpg?w=1000&h=-1&s=1",
            "ул. Садовая, д. 7, Пушкин, Санкт-Петербург 196601 Россия", "Достопремичатеьлность"
    );

    //Piter
    PlaceInfo museumComplex = new PlaceInfo(
            49,
            "Музейный комплекс \"Государственный музей-памятник \"",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/06/ab/7c/63/caption.jpg?w=1200&h=-1&s=1",
            "Исаакиевская площадь, 4 м. Невский проспект, Санкт-Петербург 190000 Россия", "Достопремичатеьлность"
    );

    //Piter
    PlaceInfo orenienbaum = new PlaceInfo(
            50,
            "Ораниенбаум",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0f/a7/14/17/caption.jpg?w=1200&h=-1&s=1",
            "пр. Дворцовый, 46, Ломоносов, Санкт-Петербург 198412 Россия", "Достопремичатеьлность"
    );

    public ArrayList<PlaceInfo> getPiterAttractions() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(museum);
        returnArray.add(museumComplex);
        returnArray.add(orenienbaum);
        return returnArray;
    }

    public PlaceInfo getMuseum() {
        return museum;
    }

    public PlaceInfo getMuseumComplex() {
        return museumComplex;
    }

    public PlaceInfo getOrenienbaum() {
        return orenienbaum;
    }

    //Rostov
    PlaceInfo lukSlaboda = new PlaceInfo(
            51,
            "Лукова Слобода",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0b/9e/ce/bc/caption.jpg?w=1200&h=-1&s=1",
            "ул. Достоевского, 39, Ростов 152155 Россия", "Достопремичатеьлность"
    );

    //Rostov
    PlaceInfo zapovednikRostov = new PlaceInfo(
            52,
            "Государственный музей-заповедник Ростовский кремль",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/13/5a/19/14/caption.jpg?w=1100&h=-1&s=1",
            "ул. Петровичева, 1 Ростовский кремль, Ростов 152151 Россия", "Достопремичатеьлность"
    );

    //Rostov
    PlaceInfo frogPrincessMuseum = new PlaceInfo(
            53,
            "Музей Царевны-лягушки",
            "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/96/e2/91/caption.jpg?w=1200&h=-1&s=1",
            "ул. Ленинская, 20, Ростов 152155 Россия", "Достопремичатеьлность"
    );

    public ArrayList<PlaceInfo> getRostovAttractions() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();
        returnArray.add(lukSlaboda);
        returnArray.add(zapovednikRostov);
        returnArray.add(frogPrincessMuseum);
        return returnArray;
    }

    public PlaceInfo getLukSlaboda() {
        return lukSlaboda;
    }

    public PlaceInfo getZapovednikRostov() {
        return zapovednikRostov;
    }

    public PlaceInfo getFrogPrincessMuseum() {
        return frogPrincessMuseum;
    }

    public ArrayList<PlaceInfo> getAttractions() {
        ArrayList<PlaceInfo> returnArray = new ArrayList<>();

        returnArray.add(kreml);
        returnArray.add(tretiakovaskayaGallery);
        returnArray.add(gum);

        returnArray.add(fisht);
        returnArray.add(sportComplex);
        returnArray.add(brilliantHand);

        returnArray.add(ozMoll);
        returnArray.add(galitckPark);
        returnArray.add(rosha);

        returnArray.add(naberezhnaya);
        returnArray.add(whiteCap);
        returnArray.add(sunIsland);

        returnArray.add(museum);
        returnArray.add(museumComplex);
        returnArray.add(orenienbaum);

        returnArray.add(lukSlaboda);
        returnArray.add(zapovednikRostov);
        returnArray.add(frogPrincessMuseum);

        return returnArray;
    }


    public PlaceInfo getHotelMone() {
        return hotelMone;
    }

    public PlaceInfo getVillaRio() {
        return villaRio;
    }

    public PlaceInfo getVillaDiego() {
        return villaDiego;
    }
}
