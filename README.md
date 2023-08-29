# Esercizio 1
Implementare una classe Calculator che fornisce metodi per effettuare somma, sottrazione, divisione e moltiplicazione fra due numeri in virgola mobile. Oltre ai vincoli già presenti in ogni operazione (es: il divisore non può essere 0), nelle operazioni vanno rispettati i seguenti vincoli, lanciando un'eccezione nel caso in cui vengano violati:

- Il risultato di un'operazione non deve essere maggiore di 49999.
- Il risultato di un'operazione non deve essere minore di -49999.
- Gli operandi di una moltiplicazione non possono essere entrambi negativi. 
- Il risultato di una sottrazione non può essere negativo.

Si possono utilizzare i tipi di eccezione già presenti in Java o definirne di propri, stando attenti a fornire un'eccezione che rappresenti accuratamente il problema riscontrato.

# Esercizio 2
Scrivere un metodo main che chieda in loop in input da tastiera all'utente quale operazione vuole effettuare e gli operandi, utilizzando un oggetto Calculator appositamente creato, gestendo tutte le eventuali eccezioni stampando un errore a schermo. Il loop non deve fermarsi in caso di errore, ma aggiungere un'opzione di input per l'utente che termini il programma.

# Esercizio 3
Scrivere unit test per la classe Calculator, gestendo sia i casi in cui gli operandi portano ad un risultato valido sia i casi in cui uno o più vincoli vengo violati.
