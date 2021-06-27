package com.pandam.moviecatalog.utils

import com.pandam.moviecatalog.data.source.local.entity.MovieEntity
import com.pandam.moviecatalog.data.source.local.entity.TvShowEntity
import com.pandam.moviecatalog.data.source.remote.MovieItem
import com.pandam.moviecatalog.data.source.remote.TvShowItem

object DataDummy {
    fun generateDummyMovies(): List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                129,
                "Spirited Away",
                false,
                "A young girl, Chihiro, becomes trapped in a strange new world of spirits. When her parents undergo a mysterious transformation, she must call upon the courage she never knew she had to free her family.",
                "/39wmItIWsg5sZMyRUHLkWBcuVCM.jpg",
                "2001-07-20",
                8.5,
                11447
            )
        )
        movies.add(
            MovieEntity(
                19404,
                "Dilwale Dulhania Le Jayenge",
                false,
                "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.",
                "/2CAL2433ZeIihfX1Hb2139CX0pW.jpg",
                "1995-10-20",
                8.7,
                2940
            )
        )
        movies.add(
            MovieEntity(
                278,
                "The Shawshank Redemption",
                false,
                "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.",
                "/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
                "1994-09-23",
                8.7,
                19091
            )
        )
        movies.add(
            MovieEntity(
                724089,
                "Gabriel's Inferno Part II",
                false,
                "Professor Gabriel Emerson finally learns the truth about Julia Mitchell's identity, but his realization comes a moment too late. Julia is done waiting for the well-respected Dante specialist to remember her and wants nothing more to do with him. Can Gabriel win back her heart before she finds love in another's arms?",
                "/x5o8cLZfEXMoZczTYWLrUo1P7UJ.jpg",
                "2020-07-31",
                8.7,
                1271
            )
        )
        movies.add(
            MovieEntity(
                238,
                "The Godfather",
                false,
                "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.",
                "/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
                "1972-03-14",
                8.7,
                14414
            )
        )
        movies.add(
            MovieEntity(
                761053,
                "Gabriel's Inferno Part III",
                false,
                "The final part of the film adaption of the erotic romance novel Gabriel's Inferno written by an anonymous Canadian author under the pen name Sylvain Reynard. Watch now : https://stream4k.xyz",
                "/fYtHxTxlhzD4QWfEbrC1rypysSD.jpg",
                "2020-11-19",
                8.7,
                830
            )
        )
        movies.add(
            MovieEntity(
                696374,
                "Gabriel's Inferno",
                false,
                "An intriguing and sinful exploration of seduction, forbidden love, and redemption, Gabriel's Inferno is a captivating and wildly passionate tale of one man's escape from his own personal hell as he tries to earn the impossible--forgiveness and love.",
                "/oyG9TL7FcRP4EZ9Vid6uKzwdndz.jpg",
                "2020-05-29",
                8.7,
                2059
            )
        )
        movies.add(
            MovieEntity(
                424,
                "Schindler's List",
                false,
                "The true story of how businessman Oskar Schindler saved over a thousand Jewish lives from the Nazis while they worked as slaves in his factory during World War II.",
                "/sF1U4EUQS8YHUYjNl3pMGNIQyr0.jpg",
                "1993-11-30",
                8.6,
                11477
            )
        )
        movies.add(
            MovieEntity(
                337404,
                "Cruella",
                false,
                "In 1970s London amidst the punk rock revolution, a young grifter named Estella is determined to make a name for herself with her designs. She befriends a pair of young thieves who appreciate her appetite for mischief, and together they are able to build a life for themselves on the London streets. One day, Estella’s flair for fashion catches the eye of the Baroness von Hellman, a fashion legend who is devastatingly chic and terrifyingly haute. But their relationship sets in motion a course of events and revelations that will cause Estella to embrace her wicked side and become the raucous, fashionable and revenge-bent Cruella.",
                "/rTh4K5uw9HypmpGslcKd4QfHl93.jpg",
                "2021-05-26",
                8.6,
                2943
            )
        )
        movies.add(
            MovieEntity(
                240,
                "The Godfather: Part II",
                false,
                "In the continuing saga of the Corleone crime family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba.",
                "/hek3koDUyRQk7FIhPXsa6mT2Zc3.jpg",
                "1974-12-20",
                8.6,
                8610
            )
        )
        movies.add(
            MovieEntity(
                372058,
                "Your Name.",
                false,
                "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other.",
                "/q719jXXEzOoYaps6babgKnONONX.jpg",
                "2016-08-26",
                8.6,
                7555
            )
        )
        movies.add(
            MovieEntity(
                447362,
                "Life in a Year",
                false,
                "A 17 year old finds out that his girlfriend is dying, so he sets out to give her an entire life, in the last year she has left.",
                "/bP7u19opmHXYeTCUwGjlLldmUMc.jpg",
                "2020-11-27",
                8.5,
                628
            )
        )
        movies.add(
            MovieEntity(
                496243,
                "Parasite",
                false,
                "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.",
                "/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
                "2019-05-30",
                8.5,
                11539
            )
        )
        movies.add(
            MovieEntity(
                592350,
                "My Hero Academia: Heroes Rising",
                false,
                "Class 1-A visits Nabu Island where they finally get to do some real hero work. The place is so peaceful that it's more like a vacation … until they're attacked by a villain with an unfathomable Quirk! His power is eerily familiar, and it looks like Shigaraki had a hand in the plan. But with All Might retired and citizens' lives on the line, there's no time for questions. Deku and his friends are the next generation of heroes, and they're the island's only hope.",
                "/zGVbrulkupqpbwgiNedkJPyQum4.jpg",
                "2019-12-20",
                8.5,
                735
            )
        )
        movies.add(
            MovieEntity(
                497,
                "The Green Mile",
                false,
                "A supernatural tale set on death row in a Southern prison, where gentle giant John Coffey possesses the mysterious power to heal people's ailments. When the cell block's head guard, Paul Edgecomb, recognizes Coffey's miraculous gift, he tries desperately to help stave off the condemned man's execution.",
                "/velWPhVMQeQKcxggNEU8YmIo52R.jpg",
                "1999-12-10",
                8.5,
                12372
            )
        )
        movies.add(
            MovieEntity(
                441130,
                "Wolfwalkers",
                false,
                "In a time of superstition and magic, when wolves are seen as demonic and nature an evil to be tamed, a young apprentice hunter comes to Ireland with her father to wipe out the last pack. But when she saves a wild native girl, their friendship leads her to discover the world of the Wolfwalkers and transform her into the very thing her father is tasked to destroy.",
                "/uRkDrsKwCCZC9zdHZs2CFTt1ATZ.jpg",
                "2020-10-26",
                8.5,
                477
            )
        )
        movies.add(
            MovieEntity(
                644479,
                "Dedicated to my ex",
                false,
                "The film tells the story of Ariel, a 21-year-old who decides to form a rock band to compete for a prize of ten thousand dollars in a musical band contest, this as a last option when trying to get money to save their relationship and reunite with his ex-girlfriend, which breaks due to the trip she must make to Finland for an internship. Ariel with her friend Ortega, decides to make a casting to find the other members of the band, although they do not know nothing about music, thus forming a band with members that have diverse and opposite personalities.",
                "/riAooJrFvVhotyaOgoI0WR7okSe.jpg",
                "2019-11-01",
                8.5,
                393
            )
        )
        movies.add(
            MovieEntity(
                680,
                "Pulp Fiction",
                false,
                "A burger-loving hit man, his philosophical partner, a drug-addled gangster's moll and a washed-up boxer converge in this sprawling, comedic crime caper. Their adventures unfurl in three stories that ingeniously trip back and forth in time.",
                "/d5iIlFn5s0ImszYzBPb8JPIfbXD.jpg",
                "1994-09-10",
                8.5,
                21255
            )
        )
        movies.add(
            MovieEntity(
                389,
                "12 Angry Men",
                false,
                "The defense and the prosecution have rested and the jury is filing into the jury room to decide if a young Spanish-American is guilty or innocent of murdering his father. What begins as an open and shut case soon becomes a mini-drama of each of the jurors' prejudices and preconceptions about the trial, the accused, and each other.",
                "/ppd84D2i9W8jXmsyInGyihiSyqz.jpg",
                "1957-04-10",
                8.5,
                5631
            )
        )
        movies.add(
            MovieEntity(
                572154,
                "Rascal Does Not Dream of a Dreaming Girl",
                false,
                "In Fujisawa, Sakuta Azusagawa is in his second year of high school. Blissful days with his girlfriend and upperclassman, Mai Sakurajima, are interrupted by the appearance of his first crush, Shoko Makinohara.",
                "/7Ai8vNEv4zEveh12JViGikoVPVV.jpg",
                "2019-06-15",
                8.5,
                276
            )
        )

        return movies
    }

    fun generateDummyTvShow(): List<TvShowEntity> {
        val tvShow = ArrayList<TvShowEntity>()

        tvShow.add(
            TvShowEntity(
                100,
                "I Am Not an Animal",
                "/qG59J1Q7rpBc1dvku4azbzcqo8h.jpg",
                "I Am Not An Animal is an animated comedy series about the only six talking animals in the world, whose cosseted existence in a vivisection unit is turned upside down when they are liberated by animal rights activists.",
                "2004-05-10",
                9.3,
                630
            )
        )
        tvShow.add(
            TvShowEntity(
                88040,
                "Given",
                "/pdDCcAq8RNSZNk81PXYoHNUPHjn.jpg",
                "Tightly clutching his Gibson guitar, Mafuyu Satou steps out of his dark apartment to begin another day of his high school life. While taking a nap in a quiet spot on the gymnasium staircase, he has a chance encounter with fellow student Ritsuka Uenoyama, who berates him for letting his guitar's strings rust and break. Noticing Uenoyama's knowledge of the instrument, Satou pleads for him to fix it and to teach him how to play. Uenoyama eventually agrees and invites him to sit in on a jam session with his two band mates: bassist Haruki Nakayama and drummer Akihiko Kaji.",
                "2019-07-12",
                9.1,
                473
            )
        )
        tvShow.add(
            TvShowEntity(
                83095,
                "The Rising of the Shield Hero",
                "/6cXf5EDwVhsRv8GlBzUTVnWuk8Z.jpg",
                "Iwatani Naofumi was summoned into a parallel world along with 3 other people to become the world's Heroes. Each of the heroes respectively equipped with their own legendary equipment when summoned, Naofumi received the Legendary Shield as his weapon. Due to Naofumi's lack of charisma and experience he's labeled as the weakest, only to end up betrayed, falsely accused, and robbed by on the third day of adventure. Shunned by everyone from the king to peasants, Naofumi's thoughts were filled with nothing but vengeance and hatred. Thus, his destiny in a parallel World begins...",
                "2019-01-09",
                9.1,
                534
            )
        )
        tvShow.add(
            TvShowEntity(
                83097,
                "The Promised Neverland",
                "/oBgRCpAbtMpk1v8wfdsIph7lPQE.jpg",
                "Surrounded by a forest and a gated entrance, the Grace Field House is inhabited by orphans happily living together as one big family, looked after by their \"Mama,\" Isabella. Although they are required to take tests daily, the children are free to spend their time as they see fit, usually playing outside, as long as they do not venture too far from the orphanage — a rule they are expected to follow no matter what. However, all good times must come to an end, as every few months, a child is adopted and sent to live with their new family... never to be heard from again. However, the three oldest siblings have their suspicions about what is actually happening at the orphanage, and they are about to discover the cruel fate that awaits the children living at Grace Field, including the twisted nature of their beloved Mama.",
                "2019-01-11",
                9.1,
                646
            )
        )
        tvShow.add(
            TvShowEntity(
                108261,
                "Mr. Queen",
                "/ozuyMnOO5pekDklyPpUL1Htkuzy.jpg",
                "In the modern age, Jang Bong-hwan is a chef who works for the country's top politicians at the Blue House. He has a free spirit, but he one day finds himself in the body of Queen Cheorin in the Joseon period.",
                "2020-12-12",
                9.0,
                150
            )
        )
        tvShow.add(
            TvShowEntity(
                61663,
                "Your Lie in April",
                "/IGbeFv5Ji4W0x530JcSHiQpamY.jpg",
                "Kousei Arima was a genius pianist until his mother's sudden death took away his ability to play. Each day was dull for Kousei. But, then he meets a violinist named Kaori Miyazono who has an eccentric playing style. Can the heartfelt sounds of the girl's violin lead the boy to play the piano again?",
                "2014-10-10",
                9.0,
                492
            )
        )
        tvShow.add(
            TvShowEntity(
                80564,
                "Banana Fish",
                "/1UV5di9UIXwrpCW3xQ4RNli5hEV.jpg",
                "Nature made Ash Lynx beautiful; nurture made him a cold ruthless killer. A runaway brought up as the adopted heir and sex toy of \"Papa\" Dino Golzine, Ash, now at the rebellious age of seventeen, forsakes the kingdom held out by the devil who raised him. But the hideous secret that drove Ash's older brother mad in Vietnam has suddenly fallen into Papa's insatiably ambitious hands—and it's exactly the wrong time for Eiji Okamura, a pure-hearted young photographer from Japan, to make Ash Lynx's acquaintance...",
                "2018-07-06",
                9.0,
                505
            )
        )
        tvShow.add(
            TvShowEntity(
                65648,
                "Maid Sama!",
                "/igkn0M1bgMeATz59LShvVxZNdVd.jpg",
                "Misaki Ayuzawa is the first female student council president at a once all-boys school turned co-ed. She rules the school with strict discipline demeanor. But she has a secret—she works at a maid cafe due to her families circumstances. One day the popular A-student and notorious heart breaker Takumi Usui finds out her secret and makes a deal with her to keep it hush from the school in exchange for spending some time with him.",
                "2010-04-02",
                9.0,
                372
            )
        )
        tvShow.add(
            TvShowEntity(
                79141,
                "Scissor Seven",
                "/A39DWUIrf9WDRHCg7QTR8seWUvi.jpg",
                "Seeking to recover his memory, a scissor-wielding, hairdressing, bungling quasi-assassin stumbles into a struggle for power among feuding factions.",
                "2018-04-25",
                9.0,
                163
            )
        )
        tvShow.add(
            TvShowEntity(
                91801,
                "Welcome to Demon School! Iruma-kun",
                "/aed6I1EMR4Lbk8bdikWrndbn5Og.jpg",
                "Fourteen-year-old Suzuki Iruma has just been abandoned and sold to a demon by his irresponsible parents! Surprisingly, the next thing he knows he's living with the demon who has adopted him as his new grandson, and has been transferred into a school in the demon world where his new \"demon\" grandfather works as the principal. Thus begins the cowardly Iruma-kun's extraordinary school life among the otherworldly as he faces his true self, takes on challenges, and rises to become someone great.",
                "2019-10-05",
                8.9,
                127
            )
        )
        tvShow.add(
            TvShowEntity(
                73055,
                "Attack on Titan: No Regrets",
                "/xGdz67d5WHIU7kIqVHO2TxIpmhZ.jpg",
                "Many years before becoming the famed captain of the Survey Corps, a young Levi struggles to survive in the capital's garbage dump, the Underground. As the boss of his own criminal operation, Levi attempts to get by with meager earnings while aided by fellow criminals, Isabel Magnolia and Farlan Church. With little hope for the future, Levi accepts a deal from the anti-expedition faction leader Nicholas Lobov, who promises the trio citizenship aboveground if they are able to successfully assassinate Erwin Smith, a squad leader of the Survey Corps. As Levi and Erwin cross paths, Erwin acknowledges Levi's agility and skill and gives him the option to either become part of the expedition team, or be turned over to the Military Police, to atone for his crimes. Now closer to the man they are tasked to kill, the group plans to complete their mission and save themselves from a grim demise in the dim recesses of their past home. However, they are about to learn that the surface world is not as liberating as they had thought and that sometimes, freedom can come at a heavy price. Based on the popular spin-off manga of the same name, Attack on Titan: No Regrets illustrates the encounter between two of Attack on Titan's pivotal characters, as well as the events of the 23rd expedition beyond the walls.",
                "2014-12-09",
                8.9,
                1429
            )
        )
        tvShow.add(
            TvShowEntity(
                93019,
                "ORESUKI: Are you the only one who loves me?",
                "/4MojZik5N62IShd2BFVEHyaRBLP.jpg",
                "Kisaragi Amatsuyu is invited out alone by the cool beauty upperclassman Cosmos and his childhood friend Himawari. Expecting to hear their confessions, he triumphantly goes to meet each of them in turn. But Cosmos and Himawari both instead confess to Amatsuyu that they like his friend. Amatsuyu fights this lonely battle, but there is another girl who is looking at him. She is a gloomy girl with glasses and braids. Amatsuyu finds that he hates her, because she's always turning her sharp tongue only on him and finding enjoyment in his troubles. But it turns out that she's the only one who actually does like him.",
                "2019-10-03",
                8.9,
                186
            )
        )
        tvShow.add(
            TvShowEntity(
                72636,
                "Made In Abyss",
                "/jLkCeh5xNCuQPHIbTfuLgSqt2OQ.jpg",
                "Located in the center of a remote island, the Abyss is the last unexplored region, a huge and treacherous fathomless hole inhabited by strange creatures where only the bravest adventurers descend in search of ancient relics. In the upper levels of the Abyss, Riko, a girl who dreams of becoming an explorer, stumbles upon a mysterious little boy.",
                "2017-07-07",
                8.9,
                197
            )
        )
        tvShow.add(
            TvShowEntity(
                65930,
                "My Hero Academia",
                "/phuYuzqWW9ru8EA3HVjE9W2Rr3M.jpg",
                "In a world where eighty percent of the population has some kind of super-powered Quirk, Izuku was unlucky enough to be born completely normal. But that won't stop him from enrolling in a prestigious hero academy. Now, he'll get his first taste of brutal rivalry from other schools as he braves the cutthroat, no-holds-barred provisional license exam.",
                "2016-04-03",
                8.9,
                2979
            )
        )
        tvShow.add(
            TvShowEntity(
                83121,
                "Kaguya-sama: Love is War",
                "/5khbC6AuNgnvnoDbjIMKCOhEtIc.jpg",
                "Considered a genius due to having the highest grades in the country, Miyuki Shirogane leads the prestigious Shuchiin Academy's student council as its president, working alongside the beautiful and wealthy vice president Kaguya Shinomiya. The two are often regarded as the perfect couple by students despite them not being in any sort of romantic relationship.",
                "2019-01-12",
                8.9,
                343
            )
        )
        tvShow.add(
            TvShowEntity(
                68349,
                "Weightlifting Fairy Kim Bok-Joo",
                "/4CrTjZ5MYdF5dtSockIStCkiX5C.jpg",
                "A spunky female weightlifter and free-spirited male swimmer meet on campus, only to find out their pasts may be intertwined.",
                "2016-11-16",
                8.9,
                354
            )
        )
        tvShow.add(
            TvShowEntity(
                68129,
                "Yuri!!! on Ice",
                "/oKVFf2uNCLMsovWBxAW14MmhHUm.jpg",
                "Yūri Katsuki carried all of Japan's hopes on his shoulders to win at the Gran Prix Finale ice skating competition, but suffered a crushing defeat. He returns home to Kyushu and half feels like he wants to retire, and half feels like he wants to continue ice skating. Suddenly the five-time consecutive world championship ice skater Victor Nikiforov appears before him with Yuri Plisetsky, a young Russian figure skater who is already defeating his seniors. Victor and both Yuris take up the challenge on an unprecedented Gran Prix series.",
                "2016-10-06",
                8.9,
                400
            )
        )
        tvShow.add(
            TvShowEntity(
                62741,
                "Kamisama Kiss",
                "/AkKduPOeIiEKl2VIjrKkohBX66D.jpg",
                "Nanami was just a normal high school girl down on her luck until a stranger’s lips marked her as the new Land God and turned her world upside down. Now, she’s figuring out the duties of a deity with the help of Tomoe, a reformed fox demon who reluctantly becomes her familiar in a contract sealed with a kiss. The new responsibilities—and boys—are a lot to handle, like the crow demon masquerading as a gorgeous pop idol and the adorable snake spirit who’s chosen the newly minted god to be his bride. As the headstrong Tomoe tries to whip her into shape, Nanami finds that love just might have cute, pointed fox ears. With romance in the air, will the human deity be able to prove herself worthy of her new title?",
                "2012-10-02",
                8.9,
                490
            )
        )
        tvShow.add(
            TvShowEntity(
                60863,
                "Haikyu!!",
                "/pLpQZHVduTzJTOVNmWfppY9tk3W.jpg",
                "Based off of the original Weekly Shonen Jump manga series from Haruichi Furudate, Haikyu!! is a slice-of-life sports anime revolving around Shouyou Hinata's love of volleyball. Inspired by a small-statured pro volleyball player, Hinata creates a volleyball team in his last year of middle school. Unfortunately the team is matched up against the \"King of the Court\" Tobio Kageyama's team in their first tournament and inevitably lose. After the crushing defeat, Hinata vows to surpass Kageyama. After entering high school, Hinata joins the volleyball team only to find that Tobio has also joined.",
                "2014-04-06",
                8.9,
                710
            )
        )
        tvShow.add(
            TvShowEntity(
                96316,
                "Rent-a-Girlfriend",
                "/4rqyyM0R3a0EeSlEvdpxDKbjiKB.jpg",
                "In today’s Japan, \"rental\" services can deliver an afternoon with a \"friend,\" a \"parent,\" even a fake girlfriend! Kinoshita Kazuya is a 20-year-old failure of a college student. He managed to kiss his girlfriend once, but was dumped after a month. Completely spiteful, Kazuya gets just desperate enough to give it a try. But he quickly discovers how complicated it can be to \"rent\" an emotional connection… and his new \"girlfriend,\" Mizuhara Chizuru, who’s trying to keep her side hustle secret, will panic when she finds out her real life and Kazuya’s are intertwined in surprising ways! A reckless rom-com filled with love and excitement is about to begin!",
                "2020-07-11",
                8.9,
                518
            )
        )

        return tvShow
    }

    fun generateDummyMoviesResponse(): List<MovieItem> {
        val movies = ArrayList<MovieItem>()

        movies.add(
            MovieItem(
                19404,
                "Dilwale Dulhania Le Jayenge",
                false,
                "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.",
                "/2CAL2433ZeIihfX1Hb2139CX0pW.jpg",
                "1995-10-20",
                8.7,
                2940
            )
        )
        movies.add(
            MovieItem(
                278,
                "The Shawshank Redemption",
                false,
                "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.",
                "/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
                "1994-09-23",
                8.7,
                19091
            )
        )
        movies.add(
            MovieItem(
                724089,
                "Gabriel's Inferno Part II",
                false,
                "Professor Gabriel Emerson finally learns the truth about Julia Mitchell's identity, but his realization comes a moment too late. Julia is done waiting for the well-respected Dante specialist to remember her and wants nothing more to do with him. Can Gabriel win back her heart before she finds love in another's arms?",
                "/x5o8cLZfEXMoZczTYWLrUo1P7UJ.jpg",
                "2020-07-31",
                8.7,
                1271
            )
        )
        movies.add(
            MovieItem(
                238,
                "The Godfather",
                false,
                "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.",
                "/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
                "1972-03-14",
                8.7,
                14414
            )
        )
        movies.add(
            MovieItem(
                761053,
                "Gabriel's Inferno Part III",
                false,
                "The final part of the film adaption of the erotic romance novel Gabriel's Inferno written by an anonymous Canadian author under the pen name Sylvain Reynard. Watch now : https://stream4k.xyz",
                "/fYtHxTxlhzD4QWfEbrC1rypysSD.jpg",
                "2020-11-19",
                8.7,
                830
            )
        )
        movies.add(
            MovieItem(
                696374,
                "Gabriel's Inferno",
                false,
                "An intriguing and sinful exploration of seduction, forbidden love, and redemption, Gabriel's Inferno is a captivating and wildly passionate tale of one man's escape from his own personal hell as he tries to earn the impossible--forgiveness and love.",
                "/oyG9TL7FcRP4EZ9Vid6uKzwdndz.jpg",
                "2020-05-29",
                8.7,
                2059
            )
        )
        movies.add(
            MovieItem(
                424,
                "Schindler's List",
                false,
                "The true story of how businessman Oskar Schindler saved over a thousand Jewish lives from the Nazis while they worked as slaves in his factory during World War II.",
                "/sF1U4EUQS8YHUYjNl3pMGNIQyr0.jpg",
                "1993-11-30",
                8.6,
                11477
            )
        )
        movies.add(
            MovieItem(
                337404,
                "Cruella",
                false,
                "In 1970s London amidst the punk rock revolution, a young grifter named Estella is determined to make a name for herself with her designs. She befriends a pair of young thieves who appreciate her appetite for mischief, and together they are able to build a life for themselves on the London streets. One day, Estella’s flair for fashion catches the eye of the Baroness von Hellman, a fashion legend who is devastatingly chic and terrifyingly haute. But their relationship sets in motion a course of events and revelations that will cause Estella to embrace her wicked side and become the raucous, fashionable and revenge-bent Cruella.",
                "/rTh4K5uw9HypmpGslcKd4QfHl93.jpg",
                "2021-05-26",
                8.6,
                2943
            )
        )
        movies.add(
            MovieItem(
                240,
                "The Godfather: Part II",
                false,
                "In the continuing saga of the Corleone crime family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba.",
                "/hek3koDUyRQk7FIhPXsa6mT2Zc3.jpg",
                "1974-12-20",
                8.6,
                8610
            )
        )
        movies.add(
            MovieItem(
                372058,
                "Your Name.",
                false,
                "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other.",
                "/q719jXXEzOoYaps6babgKnONONX.jpg",
                "2016-08-26",
                8.6,
                7555
            )
        )
        movies.add(
            MovieItem(
                129,
                "Spirited Away",
                false,
                "A young girl, Chihiro, becomes trapped in a strange new world of spirits. When her parents undergo a mysterious transformation, she must call upon the courage she never knew she had to free her family.",
                "/39wmItIWsg5sZMyRUHLkWBcuVCM.jpg",
                "2001-07-20",
                8.5,
                11447
            )
        )
        movies.add(
            MovieItem(
                447362,
                "Life in a Year",
                false,
                "A 17 year old finds out that his girlfriend is dying, so he sets out to give her an entire life, in the last year she has left.",
                "/bP7u19opmHXYeTCUwGjlLldmUMc.jpg",
                "2020-11-27",
                8.5,
                628
            )
        )
        movies.add(
            MovieItem(
                496243,
                "Parasite",
                false,
                "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.",
                "/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
                "2019-05-30",
                8.5,
                11539
            )
        )
        movies.add(
            MovieItem(
                592350,
                "My Hero Academia: Heroes Rising",
                false,
                "Class 1-A visits Nabu Island where they finally get to do some real hero work. The place is so peaceful that it's more like a vacation … until they're attacked by a villain with an unfathomable Quirk! His power is eerily familiar, and it looks like Shigaraki had a hand in the plan. But with All Might retired and citizens' lives on the line, there's no time for questions. Deku and his friends are the next generation of heroes, and they're the island's only hope.",
                "/zGVbrulkupqpbwgiNedkJPyQum4.jpg",
                "2019-12-20",
                8.5,
                735
            )
        )
        movies.add(
            MovieItem(
                497,
                "The Green Mile",
                false,
                "A supernatural tale set on death row in a Southern prison, where gentle giant John Coffey possesses the mysterious power to heal people's ailments. When the cell block's head guard, Paul Edgecomb, recognizes Coffey's miraculous gift, he tries desperately to help stave off the condemned man's execution.",
                "/velWPhVMQeQKcxggNEU8YmIo52R.jpg",
                "1999-12-10",
                8.5,
                12372
            )
        )
        movies.add(
            MovieItem(
                441130,
                "Wolfwalkers",
                false,
                "In a time of superstition and magic, when wolves are seen as demonic and nature an evil to be tamed, a young apprentice hunter comes to Ireland with her father to wipe out the last pack. But when she saves a wild native girl, their friendship leads her to discover the world of the Wolfwalkers and transform her into the very thing her father is tasked to destroy.",
                "/uRkDrsKwCCZC9zdHZs2CFTt1ATZ.jpg",
                "2020-10-26",
                8.5,
                477
            )
        )
        movies.add(
            MovieItem(
                644479,
                "Dedicated to my ex",
                false,
                "The film tells the story of Ariel, a 21-year-old who decides to form a rock band to compete for a prize of ten thousand dollars in a musical band contest, this as a last option when trying to get money to save their relationship and reunite with his ex-girlfriend, which breaks due to the trip she must make to Finland for an internship. Ariel with her friend Ortega, decides to make a casting to find the other members of the band, although they do not know nothing about music, thus forming a band with members that have diverse and opposite personalities.",
                "/riAooJrFvVhotyaOgoI0WR7okSe.jpg",
                "2019-11-01",
                8.5,
                393
            )
        )
        movies.add(
            MovieItem(
                680,
                "Pulp Fiction",
                false,
                "A burger-loving hit man, his philosophical partner, a drug-addled gangster's moll and a washed-up boxer converge in this sprawling, comedic crime caper. Their adventures unfurl in three stories that ingeniously trip back and forth in time.",
                "/d5iIlFn5s0ImszYzBPb8JPIfbXD.jpg",
                "1994-09-10",
                8.5,
                21255
            )
        )
        movies.add(
            MovieItem(
                389,
                "12 Angry Men",
                false,
                "The defense and the prosecution have rested and the jury is filing into the jury room to decide if a young Spanish-American is guilty or innocent of murdering his father. What begins as an open and shut case soon becomes a mini-drama of each of the jurors' prejudices and preconceptions about the trial, the accused, and each other.",
                "/ppd84D2i9W8jXmsyInGyihiSyqz.jpg",
                "1957-04-10",
                8.5,
                5631
            )
        )
        movies.add(
            MovieItem(
                572154,
                "Rascal Does Not Dream of a Dreaming Girl",
                false,
                "In Fujisawa, Sakuta Azusagawa is in his second year of high school. Blissful days with his girlfriend and upperclassman, Mai Sakurajima, are interrupted by the appearance of his first crush, Shoko Makinohara.",
                "/7Ai8vNEv4zEveh12JViGikoVPVV.jpg",
                "2019-06-15",
                8.5,
                276
            )
        )


        return movies
    }

    fun generateDummyTvShowsResponse(): List<TvShowItem> {
        val tvShow = ArrayList<TvShowItem>()

        tvShow.add(
            TvShowItem(
                100,
                "I Am Not an Animal",
                "/qG59J1Q7rpBc1dvku4azbzcqo8h.jpg",
                "I Am Not An Animal is an animated comedy series about the only six talking animals in the world, whose cosseted existence in a vivisection unit is turned upside down when they are liberated by animal rights activists.",
                "2004-05-10",
                9.3,
                630
            )
        )
        tvShow.add(
            TvShowItem(
                88040,
                "Given",
                "/pdDCcAq8RNSZNk81PXYoHNUPHjn.jpg",
                "Tightly clutching his Gibson guitar, Mafuyu Satou steps out of his dark apartment to begin another day of his high school life. While taking a nap in a quiet spot on the gymnasium staircase, he has a chance encounter with fellow student Ritsuka Uenoyama, who berates him for letting his guitar's strings rust and break. Noticing Uenoyama's knowledge of the instrument, Satou pleads for him to fix it and to teach him how to play. Uenoyama eventually agrees and invites him to sit in on a jam session with his two band mates: bassist Haruki Nakayama and drummer Akihiko Kaji.",
                "2019-07-12",
                9.1,
                473
            )
        )
        tvShow.add(
            TvShowItem(
                83095,
                "The Rising of the Shield Hero",
                "/6cXf5EDwVhsRv8GlBzUTVnWuk8Z.jpg",
                "Iwatani Naofumi was summoned into a parallel world along with 3 other people to become the world's Heroes. Each of the heroes respectively equipped with their own legendary equipment when summoned, Naofumi received the Legendary Shield as his weapon. Due to Naofumi's lack of charisma and experience he's labeled as the weakest, only to end up betrayed, falsely accused, and robbed by on the third day of adventure. Shunned by everyone from the king to peasants, Naofumi's thoughts were filled with nothing but vengeance and hatred. Thus, his destiny in a parallel World begins...",
                "2019-01-09",
                9.1,
                534
            )
        )
        tvShow.add(
            TvShowItem(
                83097,
                "The Promised Neverland",
                "/oBgRCpAbtMpk1v8wfdsIph7lPQE.jpg",
                "Surrounded by a forest and a gated entrance, the Grace Field House is inhabited by orphans happily living together as one big family, looked after by their \"Mama,\" Isabella. Although they are required to take tests daily, the children are free to spend their time as they see fit, usually playing outside, as long as they do not venture too far from the orphanage — a rule they are expected to follow no matter what. However, all good times must come to an end, as every few months, a child is adopted and sent to live with their new family... never to be heard from again. However, the three oldest siblings have their suspicions about what is actually happening at the orphanage, and they are about to discover the cruel fate that awaits the children living at Grace Field, including the twisted nature of their beloved Mama.",
                "2019-01-11",
                9.1,
                646
            )
        )
        tvShow.add(
            TvShowItem(
                108261,
                "Mr. Queen",
                "/ozuyMnOO5pekDklyPpUL1Htkuzy.jpg",
                "In the modern age, Jang Bong-hwan is a chef who works for the country's top politicians at the Blue House. He has a free spirit, but he one day finds himself in the body of Queen Cheorin in the Joseon period.",
                "2020-12-12",
                9.0,
                150
            )
        )
        tvShow.add(
            TvShowItem(
                61663,
                "Your Lie in April",
                "/IGbeFv5Ji4W0x530JcSHiQpamY.jpg",
                "Kousei Arima was a genius pianist until his mother's sudden death took away his ability to play. Each day was dull for Kousei. But, then he meets a violinist named Kaori Miyazono who has an eccentric playing style. Can the heartfelt sounds of the girl's violin lead the boy to play the piano again?",
                "2014-10-10",
                9.0,
                492
            )
        )
        tvShow.add(
            TvShowItem(
                80564,
                "Banana Fish",
                "/1UV5di9UIXwrpCW3xQ4RNli5hEV.jpg",
                "Nature made Ash Lynx beautiful; nurture made him a cold ruthless killer. A runaway brought up as the adopted heir and sex toy of \"Papa\" Dino Golzine, Ash, now at the rebellious age of seventeen, forsakes the kingdom held out by the devil who raised him. But the hideous secret that drove Ash's older brother mad in Vietnam has suddenly fallen into Papa's insatiably ambitious hands—and it's exactly the wrong time for Eiji Okamura, a pure-hearted young photographer from Japan, to make Ash Lynx's acquaintance...",
                "2018-07-06",
                9.0,
                505
            )
        )
        tvShow.add(
            TvShowItem(
                65648,
                "Maid Sama!",
                "/igkn0M1bgMeATz59LShvVxZNdVd.jpg",
                "Misaki Ayuzawa is the first female student council president at a once all-boys school turned co-ed. She rules the school with strict discipline demeanor. But she has a secret—she works at a maid cafe due to her families circumstances. One day the popular A-student and notorious heart breaker Takumi Usui finds out her secret and makes a deal with her to keep it hush from the school in exchange for spending some time with him.",
                "2010-04-02",
                9.0,
                372
            )
        )
        tvShow.add(
            TvShowItem(
                79141,
                "Scissor Seven",
                "/A39DWUIrf9WDRHCg7QTR8seWUvi.jpg",
                "Seeking to recover his memory, a scissor-wielding, hairdressing, bungling quasi-assassin stumbles into a struggle for power among feuding factions.",
                "2018-04-25",
                9.0,
                163
            )
        )
        tvShow.add(
            TvShowItem(
                91801,
                "Welcome to Demon School! Iruma-kun",
                "/aed6I1EMR4Lbk8bdikWrndbn5Og.jpg",
                "Fourteen-year-old Suzuki Iruma has just been abandoned and sold to a demon by his irresponsible parents! Surprisingly, the next thing he knows he's living with the demon who has adopted him as his new grandson, and has been transferred into a school in the demon world where his new \"demon\" grandfather works as the principal. Thus begins the cowardly Iruma-kun's extraordinary school life among the otherworldly as he faces his true self, takes on challenges, and rises to become someone great.",
                "2019-10-05",
                8.9,
                127
            )
        )
        tvShow.add(
            TvShowItem(
                73055,
                "Attack on Titan: No Regrets",
                "/xGdz67d5WHIU7kIqVHO2TxIpmhZ.jpg",
                "Many years before becoming the famed captain of the Survey Corps, a young Levi struggles to survive in the capital's garbage dump, the Underground. As the boss of his own criminal operation, Levi attempts to get by with meager earnings while aided by fellow criminals, Isabel Magnolia and Farlan Church. With little hope for the future, Levi accepts a deal from the anti-expedition faction leader Nicholas Lobov, who promises the trio citizenship aboveground if they are able to successfully assassinate Erwin Smith, a squad leader of the Survey Corps. As Levi and Erwin cross paths, Erwin acknowledges Levi's agility and skill and gives him the option to either become part of the expedition team, or be turned over to the Military Police, to atone for his crimes. Now closer to the man they are tasked to kill, the group plans to complete their mission and save themselves from a grim demise in the dim recesses of their past home. However, they are about to learn that the surface world is not as liberating as they had thought and that sometimes, freedom can come at a heavy price. Based on the popular spin-off manga of the same name, Attack on Titan: No Regrets illustrates the encounter between two of Attack on Titan's pivotal characters, as well as the events of the 23rd expedition beyond the walls.",
                "2014-12-09",
                8.9,
                1429
            )
        )
        tvShow.add(
            TvShowItem(
                93019,
                "ORESUKI: Are you the only one who loves me?",
                "/4MojZik5N62IShd2BFVEHyaRBLP.jpg",
                "Kisaragi Amatsuyu is invited out alone by the cool beauty upperclassman Cosmos and his childhood friend Himawari. Expecting to hear their confessions, he triumphantly goes to meet each of them in turn. But Cosmos and Himawari both instead confess to Amatsuyu that they like his friend. Amatsuyu fights this lonely battle, but there is another girl who is looking at him. She is a gloomy girl with glasses and braids. Amatsuyu finds that he hates her, because she's always turning her sharp tongue only on him and finding enjoyment in his troubles. But it turns out that she's the only one who actually does like him.",
                "2019-10-03",
                8.9,
                186
            )
        )
        tvShow.add(
            TvShowItem(
                72636,
                "Made In Abyss",
                "/jLkCeh5xNCuQPHIbTfuLgSqt2OQ.jpg",
                "Located in the center of a remote island, the Abyss is the last unexplored region, a huge and treacherous fathomless hole inhabited by strange creatures where only the bravest adventurers descend in search of ancient relics. In the upper levels of the Abyss, Riko, a girl who dreams of becoming an explorer, stumbles upon a mysterious little boy.",
                "2017-07-07",
                8.9,
                197
            )
        )
        tvShow.add(
            TvShowItem(
                65930,
                "My Hero Academia",
                "/phuYuzqWW9ru8EA3HVjE9W2Rr3M.jpg",
                "In a world where eighty percent of the population has some kind of super-powered Quirk, Izuku was unlucky enough to be born completely normal. But that won't stop him from enrolling in a prestigious hero academy. Now, he'll get his first taste of brutal rivalry from other schools as he braves the cutthroat, no-holds-barred provisional license exam.",
                "2016-04-03",
                8.9,
                2979
            )
        )
        tvShow.add(
            TvShowItem(
                83121,
                "Kaguya-sama: Love is War",
                "/5khbC6AuNgnvnoDbjIMKCOhEtIc.jpg",
                "Considered a genius due to having the highest grades in the country, Miyuki Shirogane leads the prestigious Shuchiin Academy's student council as its president, working alongside the beautiful and wealthy vice president Kaguya Shinomiya. The two are often regarded as the perfect couple by students despite them not being in any sort of romantic relationship.",
                "2019-01-12",
                8.9,
                343
            )
        )
        tvShow.add(
            TvShowItem(
                68349,
                "Weightlifting Fairy Kim Bok-Joo",
                "/4CrTjZ5MYdF5dtSockIStCkiX5C.jpg",
                "A spunky female weightlifter and free-spirited male swimmer meet on campus, only to find out their pasts may be intertwined.",
                "2016-11-16",
                8.9,
                354
            )
        )
        tvShow.add(
            TvShowItem(
                68129,
                "Yuri!!! on Ice",
                "/oKVFf2uNCLMsovWBxAW14MmhHUm.jpg",
                "Yūri Katsuki carried all of Japan's hopes on his shoulders to win at the Gran Prix Finale ice skating competition, but suffered a crushing defeat. He returns home to Kyushu and half feels like he wants to retire, and half feels like he wants to continue ice skating. Suddenly the five-time consecutive world championship ice skater Victor Nikiforov appears before him with Yuri Plisetsky, a young Russian figure skater who is already defeating his seniors. Victor and both Yuris take up the challenge on an unprecedented Gran Prix series.",
                "2016-10-06",
                8.9,
                400
            )
        )
        tvShow.add(
            TvShowItem(
                62741,
                "Kamisama Kiss",
                "/AkKduPOeIiEKl2VIjrKkohBX66D.jpg",
                "Nanami was just a normal high school girl down on her luck until a stranger’s lips marked her as the new Land God and turned her world upside down. Now, she’s figuring out the duties of a deity with the help of Tomoe, a reformed fox demon who reluctantly becomes her familiar in a contract sealed with a kiss. The new responsibilities—and boys—are a lot to handle, like the crow demon masquerading as a gorgeous pop idol and the adorable snake spirit who’s chosen the newly minted god to be his bride. As the headstrong Tomoe tries to whip her into shape, Nanami finds that love just might have cute, pointed fox ears. With romance in the air, will the human deity be able to prove herself worthy of her new title?",
                "2012-10-02",
                8.9,
                490
            )
        )
        tvShow.add(
            TvShowItem(
                60863,
                "Haikyu!!",
                "/pLpQZHVduTzJTOVNmWfppY9tk3W.jpg",
                "Based off of the original Weekly Shonen Jump manga series from Haruichi Furudate, Haikyu!! is a slice-of-life sports anime revolving around Shouyou Hinata's love of volleyball. Inspired by a small-statured pro volleyball player, Hinata creates a volleyball team in his last year of middle school. Unfortunately the team is matched up against the \"King of the Court\" Tobio Kageyama's team in their first tournament and inevitably lose. After the crushing defeat, Hinata vows to surpass Kageyama. After entering high school, Hinata joins the volleyball team only to find that Tobio has also joined.",
                "2014-04-06",
                8.9,
                710
            )
        )
        tvShow.add(
            TvShowItem(
                96316,
                "Rent-a-Girlfriend",
                "/4rqyyM0R3a0EeSlEvdpxDKbjiKB.jpg",
                "In today’s Japan, \"rental\" services can deliver an afternoon with a \"friend,\" a \"parent,\" even a fake girlfriend! Kinoshita Kazuya is a 20-year-old failure of a college student. He managed to kiss his girlfriend once, but was dumped after a month. Completely spiteful, Kazuya gets just desperate enough to give it a try. But he quickly discovers how complicated it can be to \"rent\" an emotional connection… and his new \"girlfriend,\" Mizuhara Chizuru, who’s trying to keep her side hustle secret, will panic when she finds out her real life and Kazuya’s are intertwined in surprising ways! A reckless rom-com filled with love and excitement is about to begin!",
                "2020-07-11",
                8.9,
                518
            )
        )

        return tvShow
    }
}