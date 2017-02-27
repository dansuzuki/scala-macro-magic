package me.dan.macros


import language.experimental.macros
import reflect.macros.Context

object Macro1 {
  def hello(): Unit = macro hello_impl

  def hello_impl(c: Context)(): c.Expr[Unit] = {
    import c.universe._
    reify { println("Hello World!") }
  }
}
