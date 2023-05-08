package com.nocountry;


import com.nocountry.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Properties;


@SpringBootApplication
@EnableJpaAuditing
public class
SpotifyApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpotifyApplication.class, args);
	}

	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);

		mailSender.setUsername("mimailsoda.com");
		mailSender.setPassword("kyhqfgubfggrxzkt");

		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");

		return mailSender;
	}

	@Override
	public void run(String... args) throws Exception {

		/*	Usuario usuario = new Usuario();
			usuario.setNombre("Alex");
			usuario.setApellido("Soto");
			usuario.setUsername("alex@gmail.com");
			usuario.setPassword(bCryptPasswordEncoder.encode("1234"));
			usuario.setEmail("alex@gmail.com");
			usuario.setTelefono("988212020");
			//usuario.setPerfil("foto.png");
			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setRolNombre("ADMIN");
			Set<UsuarioRol> usuariosRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuariosRoles.add(usuarioRol);
			Usuario usuarioGuardado = usuarioService.saveUsuario(usuario, usuariosRoles);
			System.out.println(usuarioGuardado.getUsername());

	}*/



	}
}