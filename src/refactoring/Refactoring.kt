package refactoring

class PhotosInteractor(
    val photosRepository: IPhotosRepository
) {

    var cachedPhotos: MutableList<PhotoItem> = mutableListOf()

    fun loadPhotosAndMakeFavourite(): List<PhotoItem> {
        return photosRepository.loadPhotosAsync().also {
            println("Loading photos")
        }!!.map {
            it.isFavourite = true
            it
        }.run {
            filterMediaType(this)
        }.also {
            cachedPhotos.addAll(it)
        }
    }

    fun loadPhotosOnCall(): List<PhotoItem> {
        val list = photosRepository.loadPhotosOnCall()
        val filteredList = filterMediaType(list)

        return filteredList
    }

    fun getFavouritePhotos(): List<PhotoItem> {
        return photosRepository.getFavouritePhotosFromCache().map {
            it.isFavourite = true

            return@map it
        }
    }


    /** Возвращает данные с медиатипом "image" */
    private fun filterMediaType(data: List<PhotoItem>): List<PhotoItem> {
        return data.filter { photo ->
            photo.mediaType == "image"
        }
    }
}

class PhotoItem(
    var title: String?,
    var date: String? = null,
    var image: String? = null,
    var isFavourite: Boolean = false,
    var mediaType: String? = null
)

interface IPhotosRepository {

    fun loadPhotosAsync(): List<PhotoItem>?

    fun loadPhotosOnCall(): List<PhotoItem>

    fun getFavouritePhotosFromCache(): List<PhotoItem>
}
