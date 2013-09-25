package com.idea

import org.scalatest.FunSuite

/**
 * @author Jan Paw
 *         Date: 9/25/13
 */
class EmailTest extends FunSuite {
  test("Email with valid address") {
    val email: Email = Email("example@email.com")
    assert(email.address != null)
  }

  test("Email with invalid address") {
    intercept[IllegalArgumentException] {
      Email("invalid.address")
    }
  }
}
