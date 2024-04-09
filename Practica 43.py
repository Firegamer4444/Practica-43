
    
def introducir_datos():
    try:
        nombre = str(input("introduce el nombre: "))
        edad = int(input("introduce la edad: "))
        if edad >= 0 :
            altura = float(input("introduce la altura: "))
            print("Has introducido los datos correctamente")
            print("nombre: " , nombre)
            print("edad: " , edad , "años")
            print("altura: " , altura , "metros")
        else:
            print("Has introducido una edad negativa \nIntrodusca los datos de nuevo")
            introducir_datos()
    except ValueError:
        print("Has introducido alguno de los datos mal \nIntrodusca los datos de nuevo")
        introducir_datos()
    except KeyboardInterrupt:
        print("\nHas interrumpido el programa")
        
introducir_datos()
        