package com.ninja.docker_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@RequestMapping("/test")
	public String test()
	{
	return "hello Docker";
}
	@RequestMapping("/docker")
	public String docker()
	{
		return "this is docker test";
	}
}