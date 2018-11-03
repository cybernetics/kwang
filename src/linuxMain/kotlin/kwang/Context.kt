package kwang

interface RequestContext {
    fun getQuery(key: String): String?
    fun getCookie(key: String): String?
    fun getBodyParam(key: String): String?
    val requestBody: String?
    val method: Int
    val authorization: String?
    val contentType: String?
}

interface ResponseContext {
    fun respond(body: String, mimeType: String = "text/plain")
    fun sendChunk(body: String)
    fun setHeaders(headers: List<Pair<String, String>>) : ResponseContext
}