package com.pandam.moviecatalog.utils

import com.pandam.moviecatalog.data.MovieEntity
import com.pandam.moviecatalog.data.TvShowEntity

object DataDummy {
    fun generateDummyMovies(): List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                567189,
                "Tom Clancy's Without Remorse",
                false,
                "An elite Navy SEAL uncovers an international conspiracy while seeking justice for the murder of his pregnant wife.",
                "/rEm96ib0sPiZBADNKBHKBv5bve9.jpg",
                "2021-04-29",
                7.3,
                829
            )
        )
        movies.add(
            MovieEntity(
                460465,
                "Mortal Kombat",
                true,
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "2021-04-07",
                7.7,
                2429
            )
        )
        movies.add(
            MovieEntity(
                399566,
                "Godzilla vs. Kong",
                false,
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                "2021-03-24",
                8.1,
                5455
            )
        )
        movies.add(
            MovieEntity(
                615678,
                "Thunder Force",
                false,
                "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
                "/duK11VQd4UPDa7UJrgrGx90xJOx.jpg",
                "2021-03-24",
                5.8,
                556
            )
        )
        movies.add(
            MovieEntity(
                811367,
                "22 vs. Earth",
                false,
                "Set before the events of ‘Soul’, 22 refuses to go to Earth, enlisting a gang of 5 new souls in attempt of rebellion. However, 22’s subversive plot leads to a surprising revelation about the meaning of life.",
                "/32vLDKSzcCMh55zqqaSqqUA8naz.jpg",
                "2021-04-30",
                7.2,
                66
            )
        )
        movies.add(
            MovieEntity(
                804435,
                "Vanquish",
                false,
                "Victoria is a young mother trying to put her dark past as a Russian drug courier behind her, but retired cop Damon forces Victoria to do his bidding by holding her daughter hostage. Now, Victoria must use guns, guts and a motorcycle to take out a series of violent gangsters—or she may never see her child again.",
                "/AoWY1gkcNzabh229Icboa1Ff0BM.jpg",
                "2021-04-16",
                6.4,
                81
            )
        )
        movies.add(
            MovieEntity(
                615457,
                "Nobody",
                false,
                "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \"nobody.\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                "/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg",
                "2021-03-26",
                8.4,
                1323
            )
        )
        movies.add(
            MovieEntity(
                791373,
                "Zack Snyder's Justice League",
                false,
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
                "2021-03-18",
                8.5,
                5319
            )
        )
        movies.add(
            MovieEntity(
                632357,
                "The Unholy",
                false,
                "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
                "/b4gYVcl8pParX8AjkN90iQrWrWO.jpg",
                "2021-04-16",
                5.6,
                85
            )
        )
        movies.add(
            MovieEntity(
                793723,
                "Sentinelle",
                false,
                "Transferred home after a traumatizing combat mission, a highly trained French soldier uses her lethal skills to hunt down the man who hurt her sister.",
                "/AmUGn1rJ9XDDP6DYn9OA2uV8MIg.jpg",
                "2021-03-05",
                5.9,
                381
            )
        )

        return movies;
    }

    fun generateDummyTvShow(): List<TvShowEntity> {
        val tvShow = ArrayList<TvShowEntity>()

        tvShow.add(
            TvShowEntity(
                88396,
                "The Falcon and the Winter Soldier",
                "/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "2021-03-19",
                7.9,
                5226
            )
        )

        tvShow.add(
            TvShowEntity(
                60735,
                "The Flash",
                "/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
               "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014-10-07",
                7.7,
                7615
            )
        )

        tvShow.add(
            TvShowEntity(
                71712,
                "The Good Doctor",
                "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                "2017-09-25",
                8.6,
                8386
            )
        )

        tvShow.add(
            TvShowEntity(
                95557,
                "Invincible",
                "/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg",
                "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                "2017-09-25",
                8.9,
                1386
            )
        )

        tvShow.add(
            TvShowEntity(
                93484,
                "Jupiter's Legacy",
                "/9yxep7oJdkj3Pla9TD9gKflRApY.jpg",
                "When the world's first generation of superheroes received their powers in the 1930s become the revered elder guard in the present, their superpowered children struggle to live up to the legendary feats of their parents.",
                "2021-05-07",
                7.4,
                196
            )
        )

        tvShow.add(
            TvShowEntity(
                1416,
                "Grey's Anatomy",
                "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2021-05-07",
                8.2,
                6048
            )
        )

        tvShow.add(
            TvShowEntity(
                1416,
                "Lucifer",
                "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2021-05-07",
                8.2,
                8548
            )
        )

        tvShow.add(
            TvShowEntity(
                105971,
                "The Bad Batch",
                "/WjQmEWFrOf98nT5aEfUfVYz9N2.jpg",
                "Follow the elite and experimental Clones of the Bad Batch as they find their way in a rapidly changing galaxy in the aftermath of the Clone Wars.",
                "2021-05-04",
                8.9,
                170
            )
        )

        tvShow.add(
            TvShowEntity(
                79008,
                "Luis Miguel: The Series",
                "/34FaY8qpjBAVysSfrJ1l7nrAQaD.jpg",
                "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                "2018-04-22",
                8.1,
                406
            )
        )

        tvShow.add(
            TvShowEntity(
                69050,
                "Riverdale",
                "/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2021-05-04",
                8.6,
                11258
            )
        )

        return tvShow;
    }


}