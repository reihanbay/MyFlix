package com.dicoding.submission.myapplication.utils

import com.dicoding.submission.myapplication.model.ListFilmModel

object DummyData {
    fun getDataFilm(): List<ListFilmModel> {
        val list = ArrayList<ListFilmModel>()
        //movies
        list.add(
            ListFilmModel(
                "mov",
                "m1",
                "Boku No Hero The Movies",
                4.0,
                "https://m.media-amazon.com/images/M/MV5BNDQ3MTMyNTktZWM0YS00MTQ3LWEwYTItYmViYjZmYmFlOGI3XkEyXkFqcGdeQXVyNDYzNDg2MTM@._V1_.jpg",
                2,
                "Janu",
                "Shounen"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m2",
                "Demon Slayer: Mugen Train",
                4.1,
                "https://m.media-amazon.com/images/M/MV5BODI2NjdlYWItMTE1ZC00YzI2LTlhZGQtNzE3NzA4MWM0ODYzXkEyXkFqcGdeQXVyNjU1OTg4OTM@._V1_.jpg",
                3,
                "Febi",
                "Action"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m3",
                "Naruto The Last : The Movie",
                4.2,
                "https://upload.wikimedia.org/wikipedia/id/0/0c/TheLastNarutomovie.jpg",
                1,
                "Marcha",
                "Romance"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m4",
                "Nusa and Rara",
                4.3,
                "https://m.media-amazon.com/images/M/MV5BZWZiODkxNjgtYmQ2OS00YmNlLThhZDMtMzNiN2Q5OGYzMzE2XkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_FMjpg_UX1000_.jpg",
                2,
                "Apreeli",
                "Religious"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m5",
                "Avengers: Endgame",
                4.4,
                "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_.jpg",
                2,
                "Meyda",
                "Action"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m6",
                "Kimi no Nawa",
                4.5,
                "https://static.wikia.nocookie.net/kiminonawa/images/6/62/Kimi-no-Na-wa.-Visual.jpg/revision/latest?cb=20160927170951",
                2,
                "Junee",
                "Romance"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m7",
                "Joker",
                4.6,
                "https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
                2,
                "Julia",
                "Dark"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m8",
                "Venom : Let there be Carnage",
                4.7,
                "https://cdn0-production-images-kly.akamaized.net/Ru3L2EAMpSo5AFCm1ORW8e_LaLU=/640x853/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3638471/original/034961200_1637388304-Venom_0.jpg",
                2,
                "Agus",
                "Action"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m9",
                "Spiderman: No Way Home",
                4.8,
                "https://cdn1-production-images-kly.akamaized.net/ByfoNPSMTMfPEtHmnQMFhgGP80Y=/640x853/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3635478/original/025116000_1637133546-253154135_2120128131476179_3401639978712735642_n.jpg",
                2,
                "Sephia",
                "Action"
            )
        )
        list.add(
            ListFilmModel(
                "mov",
                "m10",
                "Cek Toko Sebelah",
                4.9,
                "https://upload.wikimedia.org/wikipedia/id/2/20/Cek_Toko_Sebelah.jpg",
                2,
                "Oktavia",
                "Family"
            )
        )

        //Tv-Series
        list.add(
            ListFilmModel(
                "tvs",
                "tv1",
                "Good Doctor",
                4.0,
                "https://lh3.googleusercontent.com/proxy/eOHrzN_bT_azzdxRZp5yFmq165QYwx3RDfI4LD4VsqeXYD5MQYOiejxf7lLuYjJh762cxB3fE6w7_JQgNQH1t9kus9rwBYGwF6W1woVTpVY",
                4,
                "Janu",
                "Medic"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv2",
                "Demon Slayer",
                4.1,
                "https://traxonsky.com/wp-content/uploads/2021/07/Poster-Terbaru-Season-2-Demon-Slayer-Kimetsu-No-Yaiba-1.png",
                2,
                "Febi",
                "Action"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv3",
                "Attack on Titan",
                4.2,
                "https://picfiles.alphacoders.com/399/thumb-399521.png",
                4,
                "Marcha",
                "Romance"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv4",
                "Squid Game",
                4.3,
                "https://lh3.googleusercontent.com/proxy/_FqBi0K2eDtGL5Mvs8eOU5fJWmNVgqyu8YehgURt5v-j9WORRuwoSom3LEE1TQRdpJnCOyF5XOM7oRLYyQtc_vFiQ_X97ZFo2cDeaBznB2qUJqskoPjL7sRpUTg40fng82tcpFA6RWoYRg",
                1,
                "Apreeli",
                "Thriller"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv5",
                "Hawkeye",
                4.4,
                "https://i.pinimg.com/originals/be/ba/eb/bebaeb81fe95e103c5b464741952ed9a.jpg",
                2,
                "Meyda",
                "Action"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv6",
                "Loki",
                4.5,
                "https://terrigen-cdn-dev.marvel.com/content/prod/1x/arch_digital_keyart_teaser_v4_lg.jpg",
                1,
                "Junee",
                "Romance"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv7",
                "Tukang Bubur Naik Haji",
                4.6,
                "https://assets-a1.kompasiana.com/statics/crawl/552c78486ea834f5368b4567.jpeg",
                10,
                "Julia",
                "Family"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv8",
                "Money Heist",
                4.7,
                "https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2021/08/03/1363211994.jpg",
                5,
                "Agus",
                "Action"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv9",
                "Avatar The Last Airbender",
                4.8,
                "https://m.media-amazon.com/images/M/MV5BODc5YTBhMTItMjhkNi00ZTIxLWI0YjAtNTZmOTY0YjRlZGQ0XkEyXkFqcGdeQXVyODUwNjEzMzg@._V1_.jpg",
                4,
                "Sephia",
                "Action"
            )
        )
        list.add(
            ListFilmModel(
                "tvs",
                "tv10",
                "Jojo Bizare Adventure",
                4.9,
                "https://i0.wp.com/omnitos.com/wp-content/uploads/2021/04/IMG_20210406_221729.jpg",
                2,
                "Oktavia",
                "Adventure"
            )
        )
        return list
    }

}