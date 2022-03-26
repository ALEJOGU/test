Feature:Hora del dia

  Scenario: Es Night cuando la hora esta entre 6 y 0
    Given Hora 3
    When Verificamos si es Night
    Then Obtenemos que es Night

  Scenario: Es Morning cuando la hora esta entre 12 y 6
    Given Hora 8
    When Verificamos si es Morning
    Then Obtenemos que es Morning

  Scenario: Es Afternoon cuando la hora esta entre 12 y 18
    Given Hora 14
    When Verificamos si es Afternoon
    Then Obtenemos que es Afternoon

  Scenario: Es Evening cuando la hora es mas de 18
    Given Hora 21
    When Verificamos si es Evening
    Then Obtenemos que es Evening

  Scenario: Es Invalid hour cuando la hora es mas de 24
    Given Hora 32
    When Verificamos si es Invalid hour
    Then Obtenemos que es Invalid hour