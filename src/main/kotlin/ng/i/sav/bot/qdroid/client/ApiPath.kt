package ng.i.sav.bot.qdroid.client

object ApiPath {
    const val GET_GATEWAY = "/gateway"
    const val GET_GATEWAY_BOT = "/gateway/bot"
    const val GET_USERS_ME = "/users/@me"
    const val GET_USERS_ME_GUILDS = "/users/@me/guilds"
    const val POST_CHANNELS_MESSAGES = "/channels/{channel_id}/messages"
    const val GET_GUILDS = "/guilds/{guild_id}"
    const val GET_GUILDS_CHANNELS = "/guilds/{guild_id}/channels"
    const val GET_CHANNELS = "/channels/{channel_id}"
    const val CREATE_GUILDS_CHANNELS = "/guilds/{guild_id}/channels"
    const val MODIFY_CHANNELS = "/channels/{channel_id}"
    const val DELETE_CHANNELS = "/channels/{channel_id}"
    const val GET_CHANNELS_ONLINE_NUMS = "/channels/{channel_id}/online_nums"
    const val GET_GUILDS_MEMBERS = "/guilds/{guild_id}/members"
    const val GET_GUILDS_MEMBER = "/guilds/{guild_id}/roles/{role_id}/members"
    const val GET_GUILDS_MEMBERS_ROLES = "/guilds/{guild_id}/roles/{role_id}/members"
    const val DELETE_GUILDS_MEMBERS = "/guilds/{guild_id}/members/{user_id}"
    const val GET_GUILDS_ROLES = "/guilds/{guild_id}/roles"
    const val CREATE_GUILDS_ROLES = "/guilds/{guild_id}/roles"
    const val MODIFY_GUILDS_ROLES = "/guilds/{guild_id}/roles/{role_id}"
    const val DELETE_GUILDS_ROLES = "/guilds/{guild_id}/roles/{role_id}"
    const val ADD_GUILDS_ROLES_MEMBERS = "/guilds/{guild_id}/members/{user_id}/roles/{role_id}"
    const val DELETE_GUILDS_ROLES_MEMBERS = "/guilds/{guild_id}/members/{user_id}/roles/{role_id}"
    const val GET_CHANNELS_MEMBERS_PERMISSIONS = "/channels/{channel_id}/members/{user_id}/permissions"
    const val MODIFY_CHANNELS_MEMBERS_PERMISSIONS = "/channels/{channel_id}/members/{user_id}/permissions"
    const val GET_CHANNELS_ROLES_PERMISSIONS = "/channels/{channel_id}/roles/{role_id}/permissions"
    const val MODIFY_CHANNELS_ROLES_PERMISSIONS = "/channels/{channel_id}/roles/{role_id}/permissions"
    const val GET_CHANNELS_MESSAGES = "/channels/{channel_id}/messages/{message_id}"
    const val DELETE_CHANNELS_MESSAGES = "/channels/{channel_id}/messages/{message_id}"
    const val GET_GUILDS_MESSAGE_SETTING = "/guilds/{guild_id}/message/setting"
    const val CREATE_USERS_DMS = "/users/@me/dms"
    const val POST_DMS_MESSAGES = "/dms/{guild_id}/messages"
    const val DELETE_DMS_MESSAGES = "/dms/{guild_id}/messages/{message_id}"
    const val SET_GUILDS_MUTE = "/guilds/{guild_id}/mute"
    const val SET_GUILDS_MUTE_LIST = "/guilds/{guild_id}/members/{user_id}/mute"
    const val SET_GUILDS_MEMBERS_MUTE = "/guilds/{guild_id}/members/{user_id}/mute"
    const val CREATE_GUILDS_ANNOUNCES = "/guilds/{guild_id}/announces"
    const val DELETE_GUILDS_ANNOUNCES = "/guilds/{guild_id}/announces/{message_id}"
    const val ADD_CHANNELS_PINS = "/channels/{channel_id}/pins/{message_id}"
    const val DELETE_CHANNELS_PINS = "/channels/{channel_id}/pins/{message_id}"
    const val GET_CHANNELS_PINS = "/channels/{channel_id}/pins"
    const val GET_CHANNELS_SCHEDULES = "/channels/{channel_id}/schedules"
    const val GET_CHANNELS_SCHEDULE = "/channels/{channel_id}/schedules/{schedule_id}"
    const val CREATE_CHANNELS_SCHEDULES = "/channels/{channel_id}/schedules"
    const val MODIFY_CHANNELS_SCHEDULES = "/channels/{channel_id}/schedules/{schedule_id}"
    const val DELETE_CHANNELS_SCHEDULES = "/channels/{channel_id}/schedules/{schedule_id}"
    const val SET_CHANNELS_MESSAGES_REACTIONS = "/channels/{channel_id}/messages/{message_id}/reactions/{type}/{id}"
    const val DELETE_CHANNELS_MESSAGES_REACTIONS = "/channels/{channel_id}/messages/{message_id}/reactions/{type}/{id}"
    const val GET_CHANNELS_MESSAGES_REACTIONS = "/channels/{channel_id}/messages/{message_id}/reactions/{type}/{id}"
    const val SET_CHANNELS_AUDIO = "/channels/{channel_id}/audio"
    const val PUT_CHANNELS_MIC = "/channels/{channel_id}/mic"
    const val DELETE_CHANNELS_MIC = "/channels/{channel_id}/mic"
    const val GET_CHANNELS_THREADS = "/channels/{channel_id}/threads"
    const val GET_CHANNELS_THREAD = "/channels/{channel_id}/threads/{thread_id}"
    const val CREATE_CHANNELS_THREADS = "/channels/{channel_id}/threads"
    const val DELETE_CHANNELS_THREADS = "/channels/{channel_id}/threads/{thread_id}"
    const val GET_GUILDS_API_PERMISSION = "/guilds/{guild_id}/api_permission"
    const val CREATE_GUILDS_API_PERMISSION_DEMAND = "/guilds/{guild_id}/api_permission/demand"
}
