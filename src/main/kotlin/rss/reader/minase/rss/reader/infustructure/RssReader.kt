package rss.reader.minase.rss.reader.infustructure

import com.rometools.rome.feed.synd.SyndFeed

interface RssReader {
    /**
     * RSSフィード取得
     * @param url 取得URL
     * @return 取得したRssFeed
     */
    fun fetchRss(url: String): SyndFeed
}