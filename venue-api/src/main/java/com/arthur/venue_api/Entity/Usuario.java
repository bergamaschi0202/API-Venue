package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Enum.PerfilEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "TBL_USUARIO")
@Data
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "username", unique = true, nullable = false, length = 50)
    private String username;

    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;

    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "senha", nullable = false, length = 255)
    private String senha;

    @CreationTimestamp
    @Column(name = "data_cadastro", nullable = false, updatable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "foto", length = 255)
    private String foto;

    // Endereço
    @Column(name = "cep", length = 10)
    private String cep;

    @Column(name = "logradouro", length = 100)
    private String logradouro;

    @Column(name = "numero", length = 10)
    private String numero;

    @Column(name = "complemento", length = 50)
    private String complemento;

    @Column(name = "bairro", length = 50)
    private String bairro;

    @Column(name = "cidade", length = 50)
    private String cidade;

    @Column(name = "estado", length = 2)
    private String estado;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<UsuarioPerfil> perfis = new ArrayList<>();


    public Usuario() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return perfis.stream()
                .map(UsuarioPerfil -> new org.springframework.security.core.authority.SimpleGrantedAuthority(
                        "ROLE_" + UsuarioPerfil.getPerfil().name()
                ))
                .toList();
    }

    @Override
    public String getUsername() {
        // O email é uma ótima escolha.
        return this.email;
    }

    @Override
    public String getPassword() {
        // Retorna a senha (hashada) do seu usuário.
        return this.senha;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
