import time
RECIBIR = 23
RELOJ = 9
NUMERO = '00'
GPIO.setmode(GPIO.BCM)
GPIO.setup(RECIBIR, GPIO.IN)
GPIO.setup(RELOJ, GPIO.IN)
codigo = {'a': '0000', 'b': '0001', 'c': '0010', 'd': '0011', 'e': '0100', 'f': '0101', 'g':
'0110', 'h': '0111', 'i': '1000', 'j': '1001', 'k': '1010', 'l': '1011', 'm': '1100', 'n':
'1101', 'o': '1110', 'p': '1111'}
def getCaracter(cod):
    for i in codigo:
if cod == codigo[i]:
    return i
    return "error"
print("Recibimos: ")
while True:
    datos = ""
    for i in range(6):
    while GPIO.input(RELOJ) == GPIO.LOW:
    pass
    if GPIO.input(RECIBIR) == GPIO.LOW:
    datos += "0"
    print("Recibo 0")
    else:
    datos += "1"
    print("Recibo 1")
    time.sleep(0.1)
    while GPIO.input(RELOJ) == GPIO.HIGH:
    pass

print(getCaracter(datos))
GPIO.cleanup()