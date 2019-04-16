package rss.reader.minase.rss.reader.interfaces.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import rss.reader.minase.rss.reader.domain.model.RssModel
import rss.reader.minase.rss.reader.service.RssService

/**
 * Rssフィード取得APIコントローラー
 */
@RestController("/v1/rss")
class RssReaderController(private val rssService: RssService) {

    /**
     * Rssフィード取得
     */
    @GetMapping
    fun readRss(): List<RssModel> {
        return this.rssService.fetchRss()
    }
}