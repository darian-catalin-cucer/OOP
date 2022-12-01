package cucerdariancatalin.oop.test

object NuclearsData {
    private val nuclearNames = arrayOf(
        "Kashiwazaki-Kariwa Nuclear Power Plant",
        "Kori Nuclear Power Plant",
        "Bruce Nuclear Power Plant",
        "Tianwan Nuclear Power Plant",
        "Zaporizhzhia Nuclear Power Plant",
        "Gravelines Nuclear Power Plant",
        "Palo Verde Nuclear Power Plant",
        "Rostov Nuclear Power Plant",
        "Forsmark Nuclear Power Plant",
        "Tihange Nuclear Power Plant",
        "Fukushima Daiichi Nuclear Power Plant",
        "Chernobyl Nuclear Power Plant",
        "Three Mile Island Nuclear Generating Station",
        "Biblis Nuclear Power Plant"
    )

    private val nuclearDetails = arrayOf(
        "The Kashiwazaki-Kariwa Nuclear Power Plant (柏崎刈羽原子力発電所, Kashiwazaki-Kariwa genshiryoku-hatsudensho, Kashiwazaki-Kariwa NPP) is a large, modern (housing the world's first advanced boiling water reactor or ABWR) nuclear power plant on a 4.2-square-kilometer (1,000-acre) site including land in the towns of Kashiwazaki and Kariwa in Niigata Prefecture, Japan, on the coast of the Sea of Japan, from where it gets cooling water. The plant is owned and operated by Tokyo Electric Power Company (TEPCO). It is the largest nuclear generating station in the world by net electrical power rating.",
        "The Kori Nuclear Power Plant (Korean: 고리원자력발전소, Hanja: 古里原子力發電所) is a South Korean nuclear power plant located in Kori, a suburban village in Busan. It is the world's largest fully operational nuclear generating station by total reactor count and the number of currently operational reactors since 2016, after it exceeded in nameplate capacity Canada's Bruce Nuclear Generating Station. It is owned and operated by Korea Hydro & Nuclear Power, a subsidiary of KEPCO. The first reactor began commercial operation in 1978 and operated until 2017 when it was decommissioned. Units 2, 3, and 4 started commercial operations in the 1980s. All reactors on site are pressurized water reactors.",
        "Bruce Nuclear Generating Station is a nuclear power station located on the eastern shore of Lake Huron in Ontario, Canada. It occupies 932 ha (2300 acres) of land. The facility derives its name from Bruce Township, the local municipality when the plant was constructed, now Kincardine due to amalgamation. With eight CANDU pressurized heavy-water reactors, it was the world's largest fully operational nuclear generating station by total reactor count and the number of currently operational reactors until 2016, when it was exceeded in nameplate capacity by South Korea's Kori Nuclear Power Plant.The station is the largest employer in Bruce County, with over 4000 workers.",
        "Tianwan Nuclear Power Plant is a nuclear power plant (NPP) in the city of Lianyungang in Jiangsu Province, China. It is located on the coast of the Yellow Sea approximately 30 kilometers east of Lianyungang proper. It is co-owned by Jiangsu Nuclear Power Corporation, a joint venture partially owned by the China National Nuclear Corporation (CNNC), and Atomstroyexport (ASE), the nuclear equipment exporter branch of the Russian nuclear corporation Rosatom.",
        "The Zaporizhzhia Nuclear Power Station (Ukrainian: Запорізька атомна електростанція, romanized: Zaporizʹka atomna elektrostantsiya) in southeastern Ukraine is the largest nuclear power plant in Europe and among the 10 largest in the world. It was built by the Soviet Union near the city of Enerhodar, on the southern shore of the Kakhovka Reservoir on the Dnieper river. It is operated by Energoatom, who operate Ukraine's three other nuclear power stations also.",
        "The Gravelines Nuclear Power Station is a nuclear power plant located near the commune of Gravelines in Nord, France, approximately 20 km (12 mi) from Dunkerque and Calais. It is the seventh largest nuclear power station in the world, and the largest in Western Europe. Its cooling water comes from the North Sea. The plant consists of 6 nuclear reactors of 900 MW each. In 2017 the plant produced 31.67 TWh of electric energy, 5.9% of French electricity production. Two reactors entered service in 1980, two in 1981, and two in 1985.",
        "The Palo Verde Generating Station is a nuclear power plant located near Tonopah, Arizona, in western Arizona. It is located about 45 miles (72 km) due west of downtown Phoenix, Arizona, and it is located near the Gila River, which is dry save for the rainy season in late summer.",
        "Rostov Nuclear Power Plant (Russian: Ростовская АЭС []), also known as Volgodonsk Nuclear Power Plant (Russian: Волгодонская АЭС []), is a Russian nuclear power plant located on the left bank of the Tsimlyansk reservoir in the lower stream of the Don River near Volgodonsk, Rostov Oblast. The post-Soviet Union revival of the nuclear industry of Russia took place at Rostov in the early 2000s, with the completion of the building of unit 2 in 2010, unit 3 in 2015 and unit 4 in 2017. Unit 4 was the last VVER-1000/V-320 reactor built.",
        "Forsmark Nuclear Power Plant is a nuclear power plant in Forsmark, Sweden, and also the site of the Swedish Final repository for radioactive operational waste. It is operated by a company mainly owned by Vattenfall. The radiation monitors at Forsmark were the first outside the Soviet Union to detect the elevated radiation levels resulting from the Chernobyl disaster in April 1986, over 1,000 km away, forcing the Soviet government to publicly acknowledge it after two days of them trying to cover it up.",
        "The Tihange Nuclear Power Station is one of two nuclear energy production sites in Belgium and contains 3 nuclear power plants. The site is located on the bank of the Meuse river, near the village of Tihange in the Walloon province of Liège. The station is operated and majority-owned by vertically-integrated Belgian energy corporation Electrabel. EDF Luminus has a 50% stake in the oldest unit and a 10% stake in the two newest units. It employs 1074 workers and covers an area of 75 hectares (190 acres). The plant represents about 15% of Belgium's total electricity production capacity. Nuclear energy typically provides half of Belgium's domestically-generated electricity and is the country's lowest-cost source of power.",
        "The Fukushima Daiichi Nuclear Power Plant (福島第一原子力発電所, Fukushima Daiichi Genshiryoku Hatsudensho, Fukushima I NPP) is a disabled nuclear power plant located on a 3.5-square-kilometre (860-acre) site in the towns of Ōkuma and Futaba in Fukushima Prefecture, Japan. The plant suffered major damage from the magnitude 9.0 earthquake and tsunami that hit Japan on March 11, 2011. The chain of events caused radiation leaks and permanently damaged several reactors, making them impossible to restart. By political decision, the remaining reactors were not restarted.",
        "The Chernobyl Nuclear Power Plant (ChNPP), officially the Vladimir Lenin Nuclear Power Plant, is a closed nuclear power plant located near the abandoned city of Pripyat in northern Ukraine, 16.5 kilometers (10 mi) northwest of the city of Chernobyl, 16 kilometers (10 mi) from the Belarus–Ukraine border, and about 100 kilometers (62 mi) north of Kyiv. The plant was cooled by an engineered pond, fed by the Pripyat River about 5 kilometers (3 mi) northwest from its juncture with the Dnieper.",
        "Three Mile Island Nuclear Generating Station (TMI) is a closed nuclear power plant on Three Mile Island in Londonderry Township, Pennsylvania on Lake Frederic, a reservoir in the Susquehanna River just south of Harrisburg. It had two separate units, TMI-1 (owned by Constellation Energy) and TMI-2 (owned by EnergySolutions). The plant was the site of the most significant accident in United States commercial nuclear energy when, on March 28, 1979, TMI-2 suffered a partial meltdown. According to the Nuclear Regulatory Commission (NRC) report, the accident resulted in no deaths or injuries to plant workers or in nearby communities. Follow-up epidemiology studies have linked no incidents of cancer to the accident. Only one work-related death has occurred on-site during decommissioning.",
        "The Biblis Nuclear Power Plant is in the South Hessian municipality of Biblis and consists of two units: unit A with a gross output of 1200 megawatts and unit B with a gross output of 1300 megawatts. Both units are pressurized water reactors. The operator of this power plant is the German RWE Power AG, an electrical utility based in Essen.Unit A began operation on July 16, 1974 and entered commercial service on August 25, 1974; unit B reached criticality on March 25, 1976. Both units now are shut down definitely for political reasons (Atomausstieg)."
    )

    private val nuclearCountry = arrayOf(
        "Japan",
        "South Korea",
        "Canada",
        "China",
        "Ukraine",
        "France",
        "United States",
        "Russia",
        "Sweden",
        "Belgium",
        "Japan",
        "Ukraine",
        "Germany",
        "United States"
    )

    private val nuclearConstruction = arrayOf(
        "1980-06-05",
        "1972-08-01",
        "1970-12-01",
        "1999",
        "1980-04-01",
        "1974",
        "1976-05-25",
        "1977",
        "1980",
        "1970-06-01",
        "1967-07-25",
        "1972-08-15",
        "1969",
        "1968-05-18"
    )

    private val nuclearDecommission = arrayOf(
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "-",
        "2011-03-11",
        "2000-12-15",
        "2019-09-20",
        "1974-08-25"
    )

    private val nuclearCapacity = arrayOf(
        "7965 MW",
        "7489 MW",
        "6550 MW",
        "6070 MW",
        "5700 MW",
        "5460 MW",
        "3942 MW",
        "3922 MW",
        "3138 MW",
        "3016 MW",
        "4546 MW",
        "3515 MW",
        "2407 MW",
        "1685 MW"
    )

    private val nuclearUnit = arrayOf(
        "7 Unit",
        "7 Unit",
        "8 Unit",
        "6 Unit",
        "6 Unit",
        "6 Unit",
        "3 Unit",
        "4 Unit",
        "3 Unit",
        "3 Unit",
        "6 Unit",
        "4 Unit",
        "2 Unit",
        "2 Unit"
    )

    private val nuclearsImages = intArrayOf(
        R.drawable.kashiwazaki_kariwa,
        R.drawable.kori,
        R.drawable.bruce,
        R.drawable.tianwan,
        R.drawable.zaporizhzhia,
        R.drawable.gravelines,
        R.drawable.palo_verde,
        R.drawable.rostov,
        R.drawable.forsmark,
        R.drawable.tihange,
        R.drawable.fukushima_daiichi,
        R.drawable.chernobyl,
        R.drawable.three_mile_island,
        R.drawable.biblis
    )

    val listData: ArrayList<Nuclear>
        get() {
            val list = arrayListOf<Nuclear>()
            for (position in nuclearNames.indices) {
                val nuclear = Nuclear()
                nuclear.name         = nuclearNames[position]
                nuclear.detail       = nuclearDetails[position]
                nuclear.country      = nuclearCountry[position]
                nuclear.construction = nuclearConstruction[position]
                nuclear.decommission = nuclearDecommission[position]
                nuclear.capacity     = nuclearCapacity[position]
                nuclear.unit         = nuclearUnit[position]
                nuclear.photo        = nuclearsImages[position]
                list.add(nuclear)
            }
            return list
        }
}