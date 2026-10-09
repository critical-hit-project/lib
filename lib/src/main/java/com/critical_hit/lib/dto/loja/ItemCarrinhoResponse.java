package com.critical_hit.lib.dto.loja;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

@Schema(description = "Item do carrinho de compras")
public record ItemCarrinhoResponse(

    @Schema(example = "1")
    Long jogoId,

    @Schema(description = "Preço unitário no momento da compra",
            example = "46.99")
    BigDecimal precoUnitario

) {}