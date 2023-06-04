package tech.navicore.lotsofnamesj;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.PathVariable;
import tech.navicore.lotsofnames.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
  @Timed(value="name.get.time",description="time to lookup name",percentiles={0.5,0.9})
	@GetMapping("/name/{src}")
	public Name name(@PathVariable String src) {
		String name = LotsOfPeople.apply(src);
	    Name result = new Name();
		result.setSrc(src);
		result.setValue(name);

		return result;
	}
}
