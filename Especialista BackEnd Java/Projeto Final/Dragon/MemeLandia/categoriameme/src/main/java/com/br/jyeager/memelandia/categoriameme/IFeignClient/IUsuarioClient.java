
package com.br.jyeager.memelandia.categoriameme.IFeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.jyeager.memelandia.usuario.entity.Usuario;



/**
 *
 * @author jyeager
 */

 @FeignClient(name="usuario-service", url="http://localhost:8083")
public interface IUsuarioClient {
    @GetMapping("/usuarios/{id}")
    Usuario getUsuarioById(@PathVariable("id") Long id);
}
