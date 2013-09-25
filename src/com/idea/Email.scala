package com.idea

import java.util.regex.Matcher

/**
 * A class, which represents a valid email address.
 * @param address A __valid__ address
 * @author Jan Paw
 *         Date: 9/25/13
 */
case class Email(val address: String) {
  private val matcher: Matcher = """([\w\.]+)@([\w\.]+)""".r.pattern.matcher(address)
  if (!matcher.matches()) {
    throw new IllegalArgumentException("Address is invalid")
  }
}

object Email {
  implicit def string2Email(address: String): Email = Email(address)
}
