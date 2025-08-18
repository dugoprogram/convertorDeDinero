 <h1> 💱 Conversor de Moneda</h1>

¡Bienvenido/a a mi **Conversor de Moneda** en Java! 🚀  
Un proyecto hecho con cariño, código limpio y un toque de paciencia para que puedas cambiar entre monedas sin dolores de cabeza.  
Porque nunca se sabe cuándo vas a necesitar saber cuántos yenes te puedes comprar con esas monedas que tienes por ahí. 😉

---

## 📋 Descripción del proyecto
Este programa convierte montos entre diferentes monedas usando datos reales de la API de ExchangeRate.  
Está pensado para ejecutarse en consola y cuenta con:
- Un **menú interactivo** fácil de usar.
- Validación para evitar opciones fuera de rango.
- **Historial de las últimas 5 conversiones** realizadas.
- Nombres de monedas claros en cada resultado.

---

## 🖼️ Pantallazos del programa
Aquí puedes ver cómo luce el Conversor en acción:  


Menu principal ![Menú principal](imagenes/Menu%20principal.png)  
Selecciona una opcion ![Selecciona una opcion](imagenes/Selecciona%20una%20opcion.png)
Ingresa monto a convertir ![Ingresa monto a convertir](imagenes/Ingresa%20monto%20a%20convertir.png)
Resultado y opciones nuevamente ![Resultado y opciones nuevamente](imagenes/Resultado%20y%20opciones%20nuevamente.png)
Historial de las ultimas 5 conversiones ![Historial de las ultimas 5 conversiones](imagenes/Historial%20de%20las%20ultimas%205%20conversiones.png)  
Salir ![Salir](imagenes/Salir.png)  

---

## 🛠️ Tecnologías utilizadas
- **Java 17**
- **Maven**
- **Gson** (para manejar JSON)
- **ExchangeRate API** (para obtener tasas reales)

---

## ▶️ Cómo usarlo
1. Clona este repositorio:
```bash
git clone https://github.com/dugoprogram/conversor-moneda.git
Ingresa a la carpeta del proyecto:

bash
Copiar
Editar
cd conversor-moneda
Compila y ejecuta:

bash
Copiar
Editar
mvn clean compile exec:java -Dexec.mainClass="com.tuempresa.Principal"


📊 Ejemplo de uso
bash
Copiar
Editar
============================
Conversor de Moneda
============================
1) Pesos chilenos a Dólares
2) Pesos chilenos a Reales
3) Dólares a Pesos chilenos
...
Seleccione una opción: 1
Ingrese cantidad: 1000
Resultado: 1000 CLP = 1.23 USD
👨‍💻 Autor
Pablo Andrés Verdugo Salazar
Tatuador, programador en formación y curioso por naturaleza.
Si no estoy tatuando un dragón, probablemente esté escribiendo código. 🐉💻
Tambien me ayude con IA ChatGPT para corregir y mejorar mi codigo.

Estado del README.md terminado
