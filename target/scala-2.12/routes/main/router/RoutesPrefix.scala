
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/helloworld/conf/routes
// @DATE:Fri Oct 20 15:26:17 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
