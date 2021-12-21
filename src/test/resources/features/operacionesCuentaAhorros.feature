Feature: Realizar operaciones con la cuenta de ahorros
  Yo como cliente del banco
  Quiero realizar operaciones con mi cuenta de ahorros
  Para administrar el dinero depositado en mi cuenta

  Scenario Outline: Retirar dinero de la cuenta de ahorros
    Given quiero retirar dinero de mi cuenta
    When le indico al sistema la <cantidadDeDineroaRetirar> de mi <saldoDisponible>
    Then el sistema debe mostrar el <saldoActualizado> con la cantidad retirada restada
    Examples:
      |cantidadDeDineroaRetirar|saldoDisponible|saldoActualizado|
      |300                     |1000           |700             |
      |500                     |800            |300             |

  Scenario Outline: Consignar dinero a la cuenta de ahorros
    Given quiero consignar dinero a mi cuenta
    When le indico al sistema la <cantidadDeDineroaConsignar> a mi <saldoDisponible>
    Then el sistema debe mostrar el <saldoActualizado> con la cantidad consignada aumentada
    Examples:
      |cantidadDeDineroaConsignar|saldoDisponible|saldoActualizado|
      |200                       |1000           |1200            |
      |300                       |800            |1100            |