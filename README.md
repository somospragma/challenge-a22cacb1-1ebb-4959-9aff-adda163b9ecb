# Implementación de un protocolo de comunicación en tiempo real para una aplicación de chat

El equipo de desarrollo necesita implementar un protocolo de comunicación en tiempo real para una aplicación de chat o notificaciones en vivo. El sistema debe ser capaz de manejar múltiples usuarios y enviar mensajes de manera eficiente y en tiempo real. El objetivo es mejorar la experiencia del usuario al proporcionar una comunicación instantánea y confiable.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Protocolos de comunicación no convencionales |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Diseño del protocolo de comunicación

**Objetivo:** Definir las características y funcionalidades del protocolo de comunicación en tiempo real.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identificar los requisitos del sistema en términos de comunicación en tiempo real.
- Definir los mensajes y eventos que se deben enviar y recibir en la aplicación de chat.
- Establecer las reglas de negocio para la comunicación entre usuarios.

**Entregable:** Documento que describe el protocolo de comunicación en tiempo real, incluyendo los mensajes, eventos y reglas de negocio.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la eficiencia y confiabilidad en la transmisión de mensajes.
- Piensa en cómo manejar la concurrencia y la sincronización de mensajes entre usuarios.

</details>

### Fase 2: Implementación del protocolo de comunicación

**Objetivo:** Implementar el protocolo de comunicación en tiempo real en la aplicación de chat.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Desarrollar la lógica necesaria para enviar y recibir mensajes en tiempo real.
- Implementar la gestión de conexiones y desconexiones de usuarios.
- Asegurar la entrega confiable de mensajes a los destinatarios correctos.

**Entregable:** Código funcional que implementa el protocolo de comunicación en tiempo real en la aplicación de chat.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza mecanismos de notificación y suscripción para enviar y recibir mensajes en tiempo real.
- Considera la posibilidad de utilizar tecnologías de WebSocket para la comunicación en tiempo real.
- Implementa mecanismos de reintento y manejo de errores para garantizar la entrega confiable de mensajes.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un protocolo de comunicación en tiempo real y cuáles son sus características principales?
- **paraQueSirve**: ¿Para qué sirve implementar un protocolo de comunicación en tiempo real en una aplicación de chat?
- **comoSeUsa**: ¿Cómo se utiliza un protocolo de comunicación en tiempo real para enviar y recibir mensajes en una aplicación de chat?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al implementar un protocolo de comunicación en tiempo real en una aplicación de chat y cómo se pueden solucionar?

## Criterios de Evaluacion

- Diseño del protocolo de comunicación en tiempo real.
- Implementación funcional del protocolo de comunicación en tiempo real en la aplicación de chat.
- Gestión de conexiones y desconexiones de usuarios.
- Entrega confiable de mensajes a los destinatarios correctos.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
