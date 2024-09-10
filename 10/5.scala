object LetterOccurrences extends App{
    val words = List("apple", "banana", "cherry", "date")
    println(s"Total count of letter occurrences: ${LetterCounter.countLetterOccurrences(words)}")
}

object LetterCounter{
    def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)

    val totalLetters = wordLengths.reduce(_ + _)

    totalLetters
  }
}