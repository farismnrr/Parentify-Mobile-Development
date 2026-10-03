package com.example.newsapp.data.mock

import com.example.newsapp.data.model.Article
import com.example.newsapp.data.model.Source
import com.example.newsapp.data.model.food.FoodResponse
import com.example.newsapp.data.model.food.ListInformation

object MockData {
    val articles = mutableListOf(
        Article(
            articleId = 1,
            author = "dr. Amanda Putri, Sp.OG",
            title = "Panduan Lengkap Asupan Nutrisi & Asam Folat untuk Ibu Hamil Trimester 1–3",
            description = "Memenuhi kebutuhan asam folat, kalsium, zat besi, dan DHA sangat penting untuk perkembangan janin yang optimal dan kesehatan Bunda.",
            url = "https://parentify.id/articles/nutrisi-ibu-hamil",
            urlToImage = "https://images.unsplash.com/photo-1516627145497-ae6968895b74?w=800&auto=format&fit=crop",
            publishedAt = "01 Oktober 2026",
            source = Source("1", "Kesehatan Ibu & Janin"),
            content = """Kehamilan adalah masa-masa paling berharga yang membutuhkan perhatian nutrisi ekstra sejak hari pertama. Setiap trimester memiliki kebutuhan gizi spesifik untuk mendukung pembentukan organ vital janin serta menjaga kebugaran tubuh Bunda.

📌 Trimester 1: Fondasi Pembentukan Organ
Pada 12 minggu pertama, pembentukan tabung saraf (neural tube) janin sedang berlangsung sangat pesat. Bunda sangat disarankan mengonsumsi 400–600 mcg asam folat setiap hari. Asam folat alami dapat diperoleh dari bayam, brokoli, alpukat, dan kacang-kacangan. Bila mengalami morning sickness, konsumsi makanan dalam porsi kecil namun sering, serta perbanyak minum air hangat atau wedang jahe alami.

📌 Trimester 2: Pertumbuhan Tulang & Volume Darah
Memasuki minggu ke-13 hingga 27, nafsu makan Bunda biasanya mulai membaik. Janin membutuhkan asupan kalsium (sekitar 1000 mg/hari) dan zat besi untuk pembentukan tulang dan volume sel darah merah. Sumber terbaik meliputi susu hamil, keju cheddar, telur, serta daging sapi tanpa lemak. Jangan lupa menambahkan vitamin C (seperti jeruk atau stroberi) untuk memaksimalkan penyerapan zat besi.

📌 Trimester 3: Penyempurnaan Otak & Paru-Paru Janin
Di trimester akhir, perkembangan jaringan otak dan penambahan berat badan janin mencapai puncaknya. Asam lemak Omega-3 (DHA & EPA) sangat penting untuk mielinisasi saraf otak dan retina mata janin. Konsumsilah ikan kembung, salmon matang, atau suplemen minyak ikan yang telah direkomendasikan dokter kandungan Anda.

💡 Pesan Penting dari dr. Amanda Putri, Sp.OG:
"Jangan biarkan mitos 'makan untuk dua porsi' membuat Bunda mengonsumsi kalori berlebih tanpa nilai gizi. Utamakan variasi piring gizi seimbang: 50% sayur & buah, 25% protein hewani/nabati, dan 25% karbohidrat kompleks. Selalu konsultasikan asupan suplemen dengan dokter atau bidan Anda."
"""
        ),
        Article(
            articleId = 2,
            author = "Bidan Dian Maharani, S.ST, M.Keb",
            title = "Tips Menjaga Kebugaran & Nutrisi Ibu Menyusui (Rahasia ASI Booster Alami)",
            description = "Bahan pangan lokal seperti daun katuk, kelor, kacang almond, dan hidrasi teratur yang terbukti ampuh melancarkan produksi ASI berkualitas.",
            url = "https://parentify.id/articles/nutrisi-ibu-menyusui",
            urlToImage = "https://images.unsplash.com/photo-1555252333-9f8e92e65df9?w=800&auto=format&fit=crop",
            publishedAt = "02 Oktober 2026",
            source = Source("2", "Dunia Bunda"),
            content = """Menyusui adalah proses alami yang membutuhkan energi dan ketenangan pikiran. Secara biologis, tubuh ibu menyusui membutuhkan tambahan kalori sekitar 450–500 kkal per hari serta cairan minimal 2,5 hingga 3 liter per hari untuk menjaga volume dan kekentalan ASI (hindmilk).

🌿 Bahan Alami Peningkat Produksi ASI (Galaktagog Lokal):
1. Daun Katuk & Daun Kelor: Mengandung steroid dan polifenol yang merangsang hormon prolaktin dan oksitosin untuk memicu letdown reflex (LDR).
2. Kacang-kacangan & Gandum (Oats): Sumber zat besi, magnesium, dan serat larut yang membantu menjaga stamina Bunda tidak mudah drop.
3. Protein Hewani Rendah Lemak: Ikan gabus, telur ayam kampung, dan daging ayam rebus membantu meningkatkan kadar imunoglobulin A (IgA) dalam ASI untuk daya tahan tubuh si kecil.

💧 Pola Hidrasi Cerdas:
Minumlah satu gelas air putih hangat setiap sebelum dan sesudah sesi menyusui atau memompa (pumping). Hindari kafein berlebihan dan minuman bersoda karena dapat membuat bayi rewel atau kembung.

🧘‍♀️ Manajemen Stres & Istirahat:
Hormon oksitosin—yang bertugas memancarkan ASI keluar—sangat dipengaruhi oleh suasana hati Bunda. Jika Bunda merasa lelah, mintalah bantuan Ayah untuk menggendong atau menyendawakan bayi agar Bunda bisa tidur sejenak. Ingat Bunda, produksi ASI bukan lomba kuantitas, tetapi komitmen cinta kasih tanpa henti.
"""
        ),
        Article(
            articleId = 3,
            author = "dr. Siti Rahma, Sp.A(K)",
            title = "Panduan Gizi Seimbang & Stimulasi untuk Optimalkan Otak Balita di Periode Emas",
            description = "Asupan omega-3, zat besi, zinc, dan kolin dalam 1000 hari pertama kehidupan sangat menentukan kecerdasan kognitif anak.",
            url = "https://parentify.id/articles/gizi-seimbang-balita",
            urlToImage = "https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?w=800&auto=format&fit=crop",
            publishedAt = "02 Oktober 2026",
            source = Source("3", "Parentify Health"),
            content = """Periode 1000 Hari Pertama Kehidupan (HPK)—mulai dari masa kehamilan hingga anak berusia 2 tahun—adalah fase kritis pertumbuhan otak manusia. Sebanyak 80% volume otak orang dewasa terbentuk pada fase emas ini.

🧠 Nutrisi Esensial untuk Kecerdasan Si Kecil:
1. Zat Besi Heme: Sumber terbaik berasal dari protein hewani seperti hati ayam, daging merah, dan kuning telur. Zat besi adalah bahan bakar utama sintesis neurotransmiter otak.
2. DHA & Asam Lemak Esensial: Mendukung kecepatan transmisi sinyal saraf. Bunda bisa menyajikan ikan laut lokal seperti ikan kembung, cakalang, atau lele budidaya bersih.
3. Kolin & Zinc: Terkandung dalam telur dan daging unggas, berperan penting dalam pembentukan memori jangka panjang dan fungsi belajar anak.

🍽️ Strategi Penyajian Makanan:
Terapkan prinsip porsi gizi seimbang: Isi piring anak dengan lauk hewani kaya zat besi pada setiap jadwal makan utama. Jangan menggantikan makan utama dengan susu formula berlebihan yang dapat memicu anemia defisiensi besi (ADB).

🎯 Sinergi Nutrisi dengan Stimulasi:
Nutrisi terbaik harus dibarengi dengan stimulasi bermain interaktif, seperti bernyanyi, membacakan buku dongeng bergambar (read aloud), dan permainan sensori agar sinapsis otak anak terhubung secara optimal.
"""
        ),
        Article(
            articleId = 4,
            author = "Tim Edukasi Bunda Parentify",
            title = "Resep & Tekstur MPASI 6 Bulan Pertama: Puree Wortel & Daging Sapi Lembut",
            description = "Resep MPASI tekstur lumat yang kaya vitamin A dan zat besi hewani, lembut dan mudah dicerna oleh lambung mungil si kecil.",
            url = "https://parentify.id/articles/resep-mpasi-6-bulan",
            urlToImage = "https://images.unsplash.com/photo-1544717302-de2939b7ef71?w=800&auto=format&fit=crop",
            publishedAt = "03 Oktober 2026",
            source = Source("1", "Resep Bunda"),
            content = """Saat bayi genap berusia 6 bulan, cadangan zat besi yang dibawanya sejak lahir mulai menipis, sehingga ASI saja tidak lagi mencukupi seluruh kebutuhan energinya. Inilah saat yang tepat memulai Makanan Pendamping ASI (MPASI).

🥣 Bahan-Bahan Pilihan:
- 30 gr Beras putih organik (karbohidrat utama)
- 25 gr Daging sapi giling segar (protein hewani kaya zat besi)
- 15 gr Wortel manis, kupas dan potong kecil (vitamin A & serat lembut)
- 1 sdt Minyak kelapa atau mentega tawar / unsalted butter (lemak tambahan)
- 200 ml Kaldu ayam kampung tanpa garam

👩‍🍳 Cara Membuat yang Benar:
1. Masak beras bersama kaldu ayam kampung hingga menjadi bubur kental.
2. Masukkan daging sapi giling dan wortel, masak dengan api kecil hingga seluruh bahan matang sempurna dan empuk.
3. Tambahkan 1 sendok teh mentega tawar atau santan matang hangat sebagai lemak tambahan booster berat badan.
4. Saring bubur menggunakan saringan kawat (jangan gunakan blender agar tidak terlalu encer), pastikan tidak ada gumpalan kasar yang dapat membuat bayi tersedak.

🥄 Aturan Pemberian:
- Frekuensi: 2 kali sehari di awal minggu pertama (sekitar 2–3 sendok makan per porsi).
- Tekstur: Bubur lumat kental (tidak tumpah saat sendok dimiringkan).
- Suasana Makan: Ciptakan suasana riang gembira tanpa paksaan dan hindari distraksi layar gawai (screen-free feeding).
"""
        ),
        Article(
            articleId = 5,
            author = "Psikolog Anak Dian Lestari, M.Psi",
            title = "Self-Care & Kesehatan Mental Bunda Pasca Melahirkan: Mengenali Postpartum & Baby Blues",
            description = "Mengenali baby blues dan cara merawat ketenangan emosional Bunda di masa-masa awal mengasuh buah hati.",
            url = "https://parentify.id/articles/self-care-bunda",
            urlToImage = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?w=800&auto=format&fit=crop",
            publishedAt = "03 Oktober 2026",
            source = Source("4", "Keluarga Bahagia"),
            content = """Perubahan hormonal yang drastis, kelelahan fisik karena kurang tidur, serta adaptasi peran baru seringkali memicu gejolak emosi pada Bunda baru. Hingga 80% ibu melahirkan mengalami 'baby blues' dalam 2 minggu pertama.

🌸 Membedakan Baby Blues vs Postpartum Depression:
- Baby Blues: Perasaan cemas, mudah menangis, dan sensitif yang muncul di hari ke-3 hingga ke-14 setelah persalinan dan mereda dengan istirahat yang cukup.
- Postpartum Depression (PPD): Rasa putus asa mendalam, hilangnya minat merawat diri atau bayi, berlangsung lebih dari 2 minggu, dan membutuhkan penanganan profesional.

💖 Langkah Praktis Merawat Diri (Bunda Self-Care):
1. Bagikan Tanggung Jawab: Menyusui memang tugas Bunda, tetapi memandikan bayi, mengganti popok, dan mencuci botol dapat dikerjakan bersama Ayah.
2. Berjemur Pagi: Sinar matahari pagi selama 15 menit bersama si kecil dapat merangsang hormon serotonin penenang pikiran.
3. Jangan Merasa Harus Sempurna: Rumah yang sedikit berantakan adalah hal yang wajar. Prioritas utama adalah kesehatan fisik dan emosional Bunda.

Ingatlah Bunda: 'Happy Mom raises Happy Baby'. Merawat diri sendiri bukanlah bentuk keegoisan, melainkan pondasi utama untuk memberikan kasih sayang terbaik bagi keluarga.
"""
        ),
        Article(
            articleId = 6,
            author = "Nutrisionis Rina Marlina, S.Gz",
            title = "Trik Cerdas Mengatasi Balita Picky Eater Tanpa Drama & Tangisan di Meja Makan",
            description = "Cara menyenangkan mengenalkan sayuran dan protein baru kepada balita melalui variasi bentuk dan warna hidangan.",
            url = "https://parentify.id/articles/mengatasi-picky-eater",
            urlToImage = "https://images.unsplash.com/photo-1544717305-2782549b5136?w=800&auto=format&fit=crop",
            publishedAt = "03 Oktober 2026",
            source = Source("2", "Gizi Keluarga"),
            content = """Anak tiba-tiba menutup mulut rapat-rapat atau membuang makanan ke lantai adalah fase perkembangan wajar yang biasa disebut neofobia makanan (ketakutan mencoba rasa atau tekstur baru).

💡 4 Aturan Emas Responsive Feeding:
1. Batasi Waktu Makan Maksimal 30 Menit: Lewat dari 30 menit, nafsu makan anak biasanya sudah hilang dan proses makan hanya akan menjadi ajang adu kesabaran.
2. Jangan Memberikan Camilan 2 Jam Sebelum Makan Utama: Pastikan perut anak dalam keadaan siap menerima asupan nutrisi lengkap.
3. Kenalkan Berulang Tanpa Paksaan: Anak membutuhkan waktu antara 10 hingga 15 kali paparan visual dan rasa sebelum mau menerima jenis sayuran baru.
4. Hadirkan Makanan 'Jembatan': Sajikan sayuran hijau bersama makanan favoritnya, misalnya membuat nugget brokoli keju buatan rumah atau omelet gulung warna-warni.

Jadikan meja makan sebagai tempat yang hangat, bercerita, dan penuh apresiasi untuk setiap suapan yang berhasil dihabiskan si kecil.
"""
        ),
        Article(
            articleId = 7,
            author = "dr. Farhan Malik, Sp.A",
            title = "Mengenal 5 Tanda Utama Kesiapan Bayi Memulai Makanan Pendamping ASI (MPASI)",
            description = "Ciri-ciri fisik dan motorik si kecil yang menandakan sistem pencernaannya sudah siap menerima makanan padat.",
            url = "https://parentify.id/articles/tanda-kesiapan-mpasi",
            urlToImage = "https://images.unsplash.com/photo-1516627145497-ae6968895b74?w=800&auto=format&fit=crop",
            publishedAt = "03 Oktober 2026",
            source = Source("3", "Tumbuh Kembang"),
            content = """Organisasi Kesehatan Dunia (WHO) dan Ikatan Dokter Anak Indonesia (IDAI) merekomendasikan pemberian MPASI tepat saat bayi menginjak usia 6 bulan (180 hari). Namun, kesiapan fisik dan neurologis bayi juga wajib Bunda perhatikan.

👶 5 Sinyal Fisik Kesiapan Bayi:
1. Leher dan Kepala Tegak Stabil: Bayi mampu menahan kepalanya tetap tegak saat didudukkan di kursi makan bayi (high chair).
2. Refleks Menjulurkan Lidah (Tongue-Thrust Reflex) Berkurang: Bayi tidak lagi secara otomatis mendorong keluar makanan padat dengan lidahnya.
3. Ketertarikan Tinggi pada Makanan Orang Dewasa: Bayi memandangi piring makan Bunda, membuka mulutnya saat melihat sendok mendekat, atau mencoba meraih makanan di meja.
4. Koordinasi Tangan dan Mulut: Bayi mulai mampu meraih benda dan memasukkannya ke dalam mulut dengan koordinasi yang baik.
5. Merasa Lapar Lebih Cepat: Bayi menunjukkan tanda lapar meskipun sudah diberi ASI secara teratur sesuai jadwal.

Bunda tidak perlu terburu-buru memberikan MPASI sebelum 6 bulan kecuali atas indikasi medis spesifik dari dokter spesialis anak.
"""
        ),
        Article(
            articleId = 8,
            author = "Tim Tumbuh Kembang Parentify",
            title = "Aktivitas Stimulasi Sensorik & Motorik Anak Usia 1–3 Tahun yang Mudah di Rumah",
            description = "Aktivitas bermain sederhana di rumah untuk melatih koordinasi tangan-mata, keseimbangan, dan rasa ingin tahu balita.",
            url = "https://parentify.id/articles/stimulasi-sensorik-anak",
            urlToImage = "https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?w=800&auto=format&fit=crop",
            publishedAt = "03 Oktober 2026",
            source = Source("1", "Aktivitas Anak"),
            content = """Bermain adalah pekerjaan utama bagi seorang balita. Melalui permainan sensorik (sensory play), seluruh panca indra anak bekerja serentak membentuk memori dan keterampilan motorik halus maupun kasar.

🎨 3 Ide Permainan Sensorik Edukatif:
1. Kotak Sensori Beras Warna (Sensory Bin): Gunakan beras yang diwarnai pewarna makanan aman. Biarkan anak menyendok, menuang, dan menyembunyikan mainan kecil untuk melatih kekuatan otot jari tangan.
2. Playdough Rumahan Bebas Racun: Campurkan tepung terigu, minyak kelapa, garam, dan air hangat. Tekstur kenyal playdough sangat baik melatih motorik halus sebelum usia belajar memegang pensil.
3. Jalur Halang Rintang Bantal: Susun bantal dan guling di atas karpet bersih, ajak anak merangkak, melangkah, dan melompat untuk memperkuat koordinasi vestibular dan keseimbangan tubuh.

Dampingi selalu waktu bermain si kecil dan berikan pujian tulus saat anak berhasil menyelesaikan tantangan sederhana!
"""
        )
    )

    val foods = mapOf(
        "nasigoreng" to FoodResponse(
            img = "https://images.unsplash.com/photo-1603133872878-684f208fb84b?w=800&auto=format&fit=crop",
            name = "Nasi Goreng Sehat Balita & Bunda",
            type = "Karbohidrat & Protein Ramah Anak",
            description = "Nasi goreng rendah garam dengan potongan wortel, buncis, telur orak-arik, dan ayam suwir lembut yang disukai anak.",
            nutrition = "Kalori: 250 kcal • Protein: 12g • Lemak: 8g • Karbohidrat: 32g",
            data = listOf(
                ListInformation(information = "Mengandung protein hewani dari telur dan ayam untuk mendukung pertumbuhan otot dan tinggi badan anak.", status = "Sangat Baik", texture = "Lembut"),
                ListInformation(information = "Serat dari sayuran cincang membantu pencernaan balita dan Bunda tetap sehat bebas sembelit.", status = "Tinggi Serat", texture = "Halus"),
                ListInformation(information = "Gunakan minyak zaitun atau mentega tawar untuk menjaga asupan lemak sehat alami si kecil.", status = "Rekomendasi", texture = "Aman Ditelen")
            )
        ),
        "sup" to FoodResponse(
            img = "https://images.unsplash.com/photo-1547592166-23ac45744acd?w=800&auto=format&fit=crop",
            name = "Sup Ayam Wortel Kentang Hangat",
            type = "Sayur & Kaldu Bugar Kaya Elektrolit",
            description = "Sup hangat berkuah kaldu ayam kampung dengan irisan kentang empuk, wortel manis, dan jagung manis yang ramah pencernaan anak.",
            nutrition = "Kalori: 180 kcal • Protein: 14g • Lemak: 5g • Karbohidrat: 20g",
            data = listOf(
                ListInformation(information = "Kaldu ayam kaya elektrolit alami yang menghangatkan tubuh Bunda dan si kecil saat kurang enak badan.", status = "Sangat Baik", texture = "Kuah lembut"),
                ListInformation(information = "Vitamin A dari wortel menjaga daya tahan tubuh dan kesehatan penglihatan mata anak.", status = "Tinggi Vitamin", texture = "Empuk"),
                ListInformation(information = "Cocok sebagai menu pemulihan pasca imunisasi atau saat anak sedang tumbuh gigi.", status = "Higienis", texture = "Mudah dicerna")
            )
        ),
        "bubur" to FoodResponse(
            img = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?w=800&auto=format&fit=crop",
            name = "Bubur Ayam Hati Sapi MPASI",
            type = "Tinggi Zat Besi Heme Anti Stunting",
            description = "Bubur beras organik dengan cincangan halus hati sapi segar, labu siam, dan santan kelapa matang sebagai lemak tambahan.",
            nutrition = "Kalori: 220 kcal • Protein: 11g • Lemak: 10g • Karbohidrat: 22g",
            data = listOf(
                ListInformation(information = "Hati sapi merupakan sumber zat besi heme terbaik untuk mencegah anemia dan risiko stunting.", status = "Prioritas", texture = "Saring halus"),
                ListInformation(information = "Lemak tambahan dari santan kelapa membantu peningkatan berat badan (BB booster) anak secara sehat.", status = "Booster BB", texture = "Gurih lembut"),
                ListInformation(information = "Dapat disesuaikan teksturnya sesuai usia anak (mulai dari lumat 6 bulan hingga cincang kasar 12 bulan).", status = "Fleksibel", texture = "Sesuai Tahap")
            )
        )
    )

    fun getFoodDetail(keyword: String): FoodResponse {
        val key = keyword.lowercase().replace(" ", "")
        return foods.entries.find { key.contains(it.key) || it.key.contains(key) }?.value
            ?: foods["nasigoreng"]!!
    }
}
