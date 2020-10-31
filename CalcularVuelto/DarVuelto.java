Public class DarVuelto {
	
	public void Vuelto (int monto){

		int[] Dinero= new int[9];
		/* donde los indices son:
		0->500	1->200 2->100...etc etc


		//Calculo numero de billetes de 500
		Dinero[0]=monto/500;
		monto=monto-(Dinero[0] * 500);

		//Calculo numero de billetes de 200
		Dinero[1]=monto/200;
		monto=monto-(Dinero[1] * 200);

		//Calculo numero de billetes de 100
		Dinero[2]=monto/100;
		monto=monto-(Dinero[2] * 100);

		//Calculo numero de billetes de 50
		Dinero[3]=monto/50;
		monto=monto-(Dinero[3] * 50);

		//Calculo numero de billetes de 20
		Dinero[4]=monto/20;
		monto=monto-(Dinero[4] * 20);

		//Calculo numero de billetes de 10
		Dinero[5]=monto/10;
		monto=monto-(Dinero[5] * 10);

		//Calculo numero de monedas de 5
		Dinero[6]=monto/5;
		monto=monto-(Dinero[6] * 5);

		//Calculo numero de monedas de 2
		Dinero[7]=monto/2;
		monto=monto-(Dinero[7] * 2);

		//Calculo numero de monedas de 1
		Dinero[8]=monto/1;
		monto=monto-(Dinero[8] * 1);

		//Imprimo el arreglo

		for(int i=0;i< Dinero.lenght; i++){
			if (Dinero[i] > 0){
				for (int j=0; j< Dinero[i]; j++){	
					System.out.print(valor(i));
				}
			}
			

		}

	} 

	public int valor(int index){

	switch index
	{
     case 0:
     	return (500)
     ;
     case 1:
     return (200)
     ;
     case 2:
     return (100)
     ;
     case 3:
     return (50)
     ;
     case 4:
     return (20)
     ;
     case 5:
     return (10)
     ;
     case 6:
     return (5)
     ;
     case 7:
     return (2)
     ;
     case 8:
    return (1)
     ;
	}
	}

}