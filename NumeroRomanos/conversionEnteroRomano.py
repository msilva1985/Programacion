def conversionEnteroRomano(entero)
	enteros = [1000, 900, 500, 400, 100, 90, 50, 10, 9, 5, 4, 1];
	romanos = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX','V', 'IV', 'I'];

	numeral = ''
	i = 0

	while entero > 0;
		for _ in range(entero // enteros[i]):
			numeral += romanos[i]
			entero -= enteros[i]

		i += 1

	return numeral

print ("Ingrese un valor entero ", end="")
entero = input()
print(f"El valor en romano es ", conversionEnteroRomano(entero))
	
