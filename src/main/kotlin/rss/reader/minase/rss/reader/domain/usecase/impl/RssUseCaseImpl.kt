package rss.reader.minase.rss.reader.domain.usecase.impl

import com.rometools.rome.feed.synd.SyndFeed
import org.springframework.stereotype.Service
import rss.reader.minase.rss.reader.domain.usecase.RssUseCase
import rss.reader.minase.rss.reader.infustructure.RssReader

@Service
class RssUseCaseImpl(private var rssReader: RssReader): RssUseCase {

    override fun fetchRss(url: String): SyndFeed {
        return rssReader.fetchRss(url)
    }
}