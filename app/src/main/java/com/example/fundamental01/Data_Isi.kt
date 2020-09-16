package com.example.fundamental01

object Data_Isi {
    private var data = arrayOf(
        arrayOf(
            "Faris Ar Rasyid",
            "1 followers \n2 following",
            "https://avatars1.githubusercontent.com/u/48386460?s=460&u=ca1f72084d227f0d19163e5f23510eb968fb1016&v=4",
            "Isi 1 ",
                    "STT NF\n"+
                    "Jakarta Selat\n"

        ),
        arrayOf(
            "Rista F.N",
            "4 followers \n3 following",
            "https://avatars1.githubusercontent.com/u/56180169?s=460&u=4e0a29095b4b2bf8a2c8dadf0880ddca7516f087&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "-\n" +
                    "-\n"

        ),
        arrayOf(
            "Muhammad Ardiansyah",
            "119 followers \n102 following",
            "https://avatars1.githubusercontent.com/u/35548920?s=460&u=9f5875ed2ea57249afd47c267603010d8f126269&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "@sttnf\n" +
                    "Depok, Jawa Barat, Indonesia\n"

        ),
        arrayOf(
            "Auzan Assidqi",
            "64 followers \n59 following",
            "https://avatars0.githubusercontent.com/u/16509580?s=460&u=3ce91e1bb2be98cc363b321e330aede7fdd9337c&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "-\n" +
                    "Jakarta\n"

        ),
        arrayOf(
            "Rizki Hanif",
            "3 followers \n7 following",
            "https://avatars3.githubusercontent.com/u/43870164?s=460&u=cea3ce5d393d0eb50b673ffce5aef16d31adbfd1&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "Informatic's in STTNF\n" +
                    "PULAU JAWA\n"

        ),
        arrayOf(
            "Muhammad Ghilman Firdaus",
            "10 followers \n27 following",
            "https://avatars2.githubusercontent.com/u/43835888?s=460&u=cb662734d13a65f522bf6ecb3b68050764483ee8&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "-\n" +
                    "Jakarta\n"

        ),
        arrayOf(
            "Zulkifli Jufri",
            "3 followers \n4 following",
            "https://avatars1.githubusercontent.com/u/37392155?s=460&u=75128e28f77e1d620bbcb9b2b63fc345a83233f1&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "STT Terpadu Nurul Fikri\n" +
                    "Depok, Jawa Barat, Indonesia\n"

        ),
        arrayOf(
            "Habib Nur Fathan",
            "9 followers \n24 following",
            "https://avatars1.githubusercontent.com/u/43870125?s=460&u=e92da58978812761a1ffd4f66b5cd02f6b0feb37&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "-\n" +
                    "-\n"

        ),
        arrayOf(
            "Muhammad Naufal",
            "5 followers \n9 following",
            "https://avatars1.githubusercontent.com/u/37301865?s=460&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "-\n" +
                    "Earth\n"

        ),
        arrayOf(
            "Atrisa",
            "62 followers \n71 following",
            "https://avatars3.githubusercontent.com/u/30512312?s=460&u=82b82cc5691df442e81d4a7addc802fa2c3b730e&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "@neapps @mizudev\n" +
                    "Jakarta, Indonesia\n"

        ),
        arrayOf(
            "Fathiah AlHabsyi",
            "3 followers \n11 following",
            "https://avatars3.githubusercontent.com/u/33709757?s=460&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "-\n" +
                    "-\n"

        ),
        arrayOf(
            "Aditya Fitriadi",
            "18 followers \n23 following",
            "https://avatars0.githubusercontent.com/u/39262811?s=460&u=4bf1a4c504e0e224bd9cc9db81699e8428f445ff&v=4",
            "Isi 1.\n" +
                    "\n ",
                    "-\n" +
                    "Depok, Jawa Barat, Indonesia\n"

        )

    )

    val listData: ArrayList<Data>
    get() {
        val list = ArrayList<Data>()
        for (aData in data) {
            val univ = Data()
            univ.name = aData[0]
            univ.rank = aData[1]
            univ.photo = aData[2]
            univ.overview = aData[3]
            univ.identity = aData[4]

            list.add(univ)
        }
        return list
    }
}