package com.critical_hit.lib.dto.loja;

import com.critical_hit.lib.enums.StatusCarrinho;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.List;

@Schema(description = "Dados do carrinho de compras")
public record CarrinhoResponse(

    @Schema(example = "1")
    Long id,

    @Schema(example = "1")
    Long usuarioId,

    @Schema(example = "99.98")
    BigDecimal valorTotal,

    @Schema(description = "Status atual do carrinho")
    StatusCarrinho status,

    @Schema(description = "Itens da compra")
    List<ItemCarrinhoResponse> itens

) {}