object Test {

  @Benchmark
  def test[String]: Double = {

    val x = 2.0 + 2.0
    Math.pow(x, x)

  }

}