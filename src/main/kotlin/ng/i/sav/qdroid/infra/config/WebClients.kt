package ng.i.sav.qdroid.infra.config

import ng.i.sav.qdroid.infra.client.QDroid
import ng.i.sav.qdroid.log.Slf4kt
import org.springframework.web.client.RestOperations
import org.springframework.web.socket.WebSocketHttpHeaders
import org.springframework.web.socket.client.WebSocketClient
import java.net.URI

class RestClient(private val restTemplate: RestOperations) : RestOperations by restTemplate

class WsClient(private var webSocketClient: WebSocketClient) {
    companion object {
        private val log = Slf4kt.getLogger(WsClient::class.java)
    }

    fun setWebSocketClient(webSocketClient: WebSocketClient) {
        this.webSocketClient = webSocketClient
    }

    fun startConnection(bot: QDroid, uri: URI, headers: WebSocketHttpHeaders? = null) {
        webSocketClient.execute(bot.webSocketHandler, headers, uri)
    }

}
