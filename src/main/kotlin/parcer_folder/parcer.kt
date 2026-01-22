package org.example.parcer_folder

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8")) //Для кирилицы в консоли, иначе не читается

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    val result = doc.select(".sc-2aegk7-2")

    for(bloquote: Element in result) {
        println("${bloquote.text()}\n")
    }
}
