object Ceasercipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def encryption(c:Char, key:Int, a:String):Char = {
    val e = a((a.indexOf(c.toUpper)+key)%a.size)
    return e
  }

  def decryption(c:Char, key:Int, a:String):Char = {
    val e = a((a.indexOf(c.toUpper)-key)%a.size)
    return e
  }

  def cipher(algo:(Char, Int, String) => Char, s:String, key:Int, a:String):String = {
    val x = s.map(algo(_,key,a))
    return x
  }

  val ct = cipher(encryption, "Hello", 3, alphabet)

  val pt = cipher(decryption, ct, 3, alphabet)

  println("Encrypted code: "+ct)
  println("Decrypted code: "+pt)
}
