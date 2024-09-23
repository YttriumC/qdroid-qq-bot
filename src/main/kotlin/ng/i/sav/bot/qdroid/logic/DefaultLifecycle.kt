package ng.i.sav.bot.qdroid.logic

import ng.i.sav.bot.qdroid.client.BotLifecycle
import ng.i.sav.bot.qdroid.client.GuildBot
import ng.i.sav.log.Slf4kt
import org.slf4j.event.Level
import org.springframework.stereotype.Component

@Component
class DefaultLifecycle : BotLifecycle() {
    override fun onAuthenticationSuccess(bot: GuildBot) {
        if (Slf4kt.getLevel().toInt() <= Level.DEBUG.toInt()) {
            bot.getUsersMeGuilds().forEach {
                bot.getGuildsApiPermission(it.id).let { ps ->
                    log.debug(
                        "Permission for {}: {}",
                        it.name,
                        ps.fold("") { acc, p -> "$acc${p.desc} ${if (p.authStatus == 1) "GOT" else "None"}, " })
                }
            }
        }
    }

    companion object {
        val log = Slf4kt.getLogger(DefaultLifecycle::class.java)
    }
}

