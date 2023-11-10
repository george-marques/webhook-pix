package unitins.pix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class PixController {

	@GetMapping
	public String get() {
	
		return "Teste";
	}
	
	@PostMapping("/receber")
	public String receberPix(@RequestBody PixRequest pixRequest) {

		return "Pix recebido com sucesso!";
	}
}
