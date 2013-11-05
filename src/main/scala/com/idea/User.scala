package com.idea

/**
 * @param email
 * @author Jan Paw
 *         Date: 9/25/13
 */
case class User(email: Email) {
  override def toString: String = s"[Email: ${email.address}]"
}
