package rss.reader.minase.rss.reader.infustructure.impl

import com.rometools.rome.feed.synd.SyndFeed
import com.rometools.rome.io.SyndFeedInput
import com.rometools.rome.io.XmlReader
import org.springframework.stereotype.Service
import rss.reader.minase.rss.reader.infustructure.RssReader
import java.net.URL

@Service
class RssReaderImpl: RssReader {

    override fun fetchRss(url: String): SyndFeed {
        return SyndFeedInput().build(XmlReader(URL(url)))
    }
}