package rss.reader.minase.rss.reader.service.impl

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import rss.reader.minase.rss.reader.domain.converter.RssConverter
import rss.reader.minase.rss.reader.domain.model.RssModel
import rss.reader.minase.rss.reader.domain.usecase.RssUseCase
import rss.reader.minase.rss.reader.service.RssService


@Component
class RssServiceImpl(private val rssConverter: RssConverter, private val rssUseCase: RssUseCase) : RssService {
    @Value("\${properties.url.hatena}")
    lateinit var url: String

    override fun fetchRss(): List<RssModel> {
        val syndFeed = rssUseCase.fetchRss(url)
        return this.rssConverter.toRssModel(syndFeed)
    }
}