package rss.reader.minase.rss.reader.domain.converter.impl

import com.rometools.rome.feed.synd.SyndFeed
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import rss.reader.minase.rss.reader.domain.converter.RssConverter
import rss.reader.minase.rss.reader.domain.model.RssModel

@Service
class RssConverterImpl() : RssConverter {
    @Value("\${properties.count}")
    val count: Int = 0

    override fun toRssModel(syndFeed: SyndFeed): List<RssModel> {
        val rssList: MutableList<RssModel> = mutableListOf()
        val getMax = count - 1
        // 最新5件のみ取得
        for (i in 0..getMax) {
            val entry = syndFeed.entries[i]
            rssList.add(RssModel(entry.title, entry.description.value, entry.link))
        }

        return rssList
    }
}