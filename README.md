# Real time web-app with Spring Boot and Websockets
Any app that gives user instant feedback, soon or after while interacting
with the app can be considered as realtime web app.

Real time apps are powered by Websockets api. To improve user experience 
and user wait times, client-server requests have evolved from XHR and AJAX
to Websockets.

Websockets allow a persistent connection and a bidirectional conversation
between web-browsers and servers.

Websockets data flow - message order is not guaranteed unlike with XHR
data flow.

Websocket is low level protocol mostly used for communication purpose
between web-browser and server, so at application level STOMP (Simple 
Text Oriented Messaging Protocol) is used for messaging. STOMP is an
application level protocol ensuring interoperability across languages
and platforms. STOMP provides different methods for messaging that are 
related with Websockets. 
STOMP methods are - connect(), subscribe(), send(), onmessage() etc.