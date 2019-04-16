package rss.reader.minase.rss.reader.domain.usecase

import com.rometools.rome.feed.synd.SyndFeed

/**
 * Rss用ユースケースクラス
 */
interface RssUseCase {
    /**
     * Rssフィード取得
     * @param url Rssフィードを取得するURL
     * @return SyndFeed
     */
    fun fetchRss(url: String): SyndFeed
}