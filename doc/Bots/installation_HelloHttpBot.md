## How to run HelloHttpBot

You need to : 
 * [install hAPI]()
 * [install HubotSDK]()
 * fill the file _config.txt_
    - Your _config.txt_ would look like:

```js

{
  "type" : "com.mycompany.WordCount",
  "actor" : "urn:localhost:u1", // your login to connect
	"pwd" : "urn:localhost:u1", // your password to connect
	"hserver" : "http://localhost:8080", // your server url to connect
	"adapters" : [
		{
            "type" : "org.hubiquitus.hubotsdk.adapters.HHttpAdapterInbox", // fix, the path of the class HHttpAdapterInbox
            "properties" :
                {
                    "host" : "localhost", // host + port (+ path) :  the endpoint where you want to receive the request
                    "port" : "8082",
                    "path" : "?id=1" //optional
                }
        },
        {
            "actor" : "httpOutbox", // the actor of your outbox adapter
            "type" : "org.hubiquitus.hubotsdk.adapters.HHttpAdapterOutbox" // fix, the path of the class HHttpAdapterOutbox
        }
	]
}


```