package com.idea

/**
 * @author Jan Paw
 *         Date: 9/25/13
 */
object ScalaApp {
  def main(args: Array[String]) {
    val user: User = User("user@email.com")
    val nullable: Option[User] = Some(user)
    nullable.map((user: User) => {
        print(s"Found user:$user")
    })
    print(
      """
        |Hellom this is a sample Scala application.
        |
        |Find more info at http://www.scala-lang.org/
      """.stripMargin)
  }
}
