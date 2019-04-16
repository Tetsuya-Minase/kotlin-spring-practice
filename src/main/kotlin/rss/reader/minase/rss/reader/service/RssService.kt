package rss.reader.minase.rss.reader.service

import rss.reader.minase.rss.reader.domain.model.RssModel

/**
 * RssService
 */
interface RssService {

    /**
     * Rssフィード取得メソッド
     * @return 最新5件のRssFeed
     */
    fun fetchRss(): List<RssModel>
}