package com.empiricus.statusviajante.security;

import java.util.Collection;

import com.empiricus.statusviajante.model.CadastroUsuarioModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//#Nessa classe pegamos o usuario e senha da classe de cadastro para autorizar o acesso ao sistema
public class UserLogin implements UserDetails{

   private static final long serialVersionUID = 1L;

    private String userName;
    private String password;
    public UserLogin(CadastroUsuarioModel user) {
        this.userName = user.getUsuario();
        this.password = user.getSenha();
    }
    public UserLogin() {
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public String getUsername() {
        return userName;
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
