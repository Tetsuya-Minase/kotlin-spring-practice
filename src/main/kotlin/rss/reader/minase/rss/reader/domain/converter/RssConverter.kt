package rss.reader.minase.rss.reader.domain.converter

import com.rometools.rome.feed.synd.SyndFeed
import rss.reader.minase.rss.reader.domain.model.RssModel

/**
 * SyndFeedを必要なフォーマットへ変換するクラス
 */
interface RssConverter {

    /**
     * SyndFeed 2 RssModel
     * @param syndFeed 取得したfeed
     * @return rssModelリスト
     */
    fun toRssModel(syndFeed: SyndFeed): List<RssModel>
}