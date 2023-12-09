//class PhotosInteractor2(
//    val photosRepository: IPhotosRepository
//) {
//
//    fun loadPhotosAndMakeFavourite(): List<PhotoItem> {
//        return photosRepository.loadPhotosAsync().also {
//            println("Loading photos")
//        }.map {
//            it.copy(isFavourite = true)
//        }.run {
//            filterMediaType(this)
//        }
//    }
//
////    fun loadPhotosAsync(): List<PhotoItem> {
////        val favPhotos = photosRepository.getFavouritePhotosFromCache()
////        println("Loading photos")
////
////        return photosRepository.loadPhotosAsync().map {
////            if (favPhotos.contains(it)) photo.isFavourite = true
////
////            return@map it
////        }.run {
////            filterMediaType(this)
////        }
////    }
//
//    fun loadPhotosOnCall(): List<PhotoItem> {
//        return photosRepository.loadPhotosOnCall().apply {
//            filterMediaType(this)
//        }
//    }
//
//    fun getFavouritePhotos(): List<PhotoItem> {
//        return photosRepository.getFavouritePhotosFromCache().map {
//            it.isFavourite = true
//
//            return@map it
//        }
//    }
//
//
//    /** Возвращает данные с медиатипом "image" */
//    private fun filterMediaType(data: List<PhotoItem>): List<PhotoItem> {
//        return data.filter { photo ->
//            photo.mediaType == "image"
//        }
//    }
//}
//
//data class PhotoItem(
//    var title: String?,
//    var date: String? = null,
//    var image: String? = null,
//    var isFavourite: Boolean = false,
//    var mediaType: String? = null
//)
//
//interface IPhotosRepository {
//
//    fun loadPhotosAsync(): List<PhotoItem>
//
//    fun loadPhotosOnCall(): List<PhotoItem>
//
//    fun getFavouritePhotosFromCache(): List<PhotoItem>
//}
