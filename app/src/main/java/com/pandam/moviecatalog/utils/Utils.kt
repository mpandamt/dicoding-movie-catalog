package com.pandam.moviecatalog.utils

class Utils {
    fun getImageUrl(imagePath: String, imageSize: Int = 200): String {
        val availableImageSize = getImageSize(imageSize)
        return "https://image.tmdb.org/t/p/w$availableImageSize$imagePath"
    }

    fun getImageSize(width: Int): Int {
        val availableSize = arrayOf(780, 500, 342, 200, 185, 154, 92)
        var newSize = availableSize[0]
        for (size in availableSize) {
            if (size >= width) {
                newSize = size
            }
        }
        return newSize
    }
}