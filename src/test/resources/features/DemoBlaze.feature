Feature: Flujo de Compra en Demoblaze

  @DemoBlaze
  Scenario: Compra de dos productos
    Given estoy en la página de la tienda demoblaze
    When agrego un celular al carrito
    And agrego otro celular al carrito
    Then visualizo el carrito
    And realizo la orden
    And completo el formulario de pedido con los siguientes datos:
      | nombre       | país       | ciudad     | tarjeta   | mes   | año  |
      | Alexis Chasi | Ecuador    | Quito      | 0000000   | JULIO | 2028 |
    And confirmo el pedido
    Then verifico la confirmación de la compra
