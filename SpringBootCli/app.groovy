@RestController
class SpringBootStart {

	@RequestMapping("/cli-example")
	String index() {
		"<h2>Hello World!</h2>"
	}

}
