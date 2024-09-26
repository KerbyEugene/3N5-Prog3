import org.jsoup.Jsoup
import org.jsoup.nodes.Document
fun main(args:Array<String>){
  
    var url = args[0]
    var doc= Jsoup.connect(url).get()
    println(doc.html())
}