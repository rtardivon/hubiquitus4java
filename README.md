# Hubiquitus4java - An implementation of Hubiquitus for the Java platform

Hubiquitus4java is a set of Java components :

* [Hubiquitus API](https://github.com/hubiquitus/hubiquitus4java/tree/master/hapi) : the Java bindings for the hubiquitus semantics

* [HubotSDK](https://github.com/hubiquitus/hubiquitus4java/tree/master/HubotsSDK) : a kit for Java developers allowing rapid development of hubiquitus agents called hubots

* [Hubiquitus Components](https://github.com/hubiquitus/hubiquitus4java/tree/master/HubiquitusComponents) : HTwitterAPI-1.1, HFacebook and HGooglePlus. The API used for the corresponding bots.

* [Bots](https://github.com/hubiquitus/hubiquitus4java/tree/master/Bots) : it contains the sample bots you can lance for test.


## Prerequisite

[maven](http://maven.apache.org/) : all our jars are managed by maven.

## How to install

First of all, clone the project.
Tap the following command in terminal(Linux) or in Powershell(Windows) : 

```js
git clone git://github.com/hubiquitus/hubiquitus4java.git
```

Then install hAPI and HubotSDK : 

 * See [Installation of hAPI](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/hAPI/installation_hapi.md) to install hAPI.

 * See [Installation of HubotSDK](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/HubotSDK/installation_HubotSDK.md) to install HubotSDK.


## How to use

### How to use hAPI


 * [Codes](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/hAPI/Codes.md) : ConnectionStatus, ConnectionError, ResultStatus ... All the enumeration of Hubiquitus.

 * [Datamodel](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/hAPI/hAPI_Datamodel.md) : Information about hAPI Datamodel.

 * [hClient Functions](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/hAPI/HClient_functions.md) : Connect, disconnect, builder ... All the function of the client.

 * [Options](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/hAPI/Options.md) : Information about options class.



### How to use HubotSDK



 * [HubotSDK Adapters](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/HubotSDK/HubotsdkAdapters.md) : Information about the adapters of hubot.

 * [HubotSDK Introduction](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/HubotSDK/HubotSDKIntroduction.md) : Introduction of a hubot.

 * [HubotSDK API](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/HubotSDK/HubotSDK_API.md) : Information about the API.


## The test projects

### Bots

The "Bots" folder contains five samples bots :

* TwitterBot allows to retrive data from twitter and post a tweets. [Run the bot](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Bots/installation_TwitterBot.md)

* FacebookBot allows to retrive data from facebook.  [Run the bot](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Bots/installation_FacebookBot.md)

* InstagramBot allows to retrive data from instagram.  [Run the bot](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Bots/installation_InstagramBot.md) 

* GooglePlusBot allows to retrive data from googleplus.  [Run the bot](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Bots/installation_GooglePlusBot.md) 

* HelloBot allows to retrive a string and publish it on a node.  [Run the bot](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Bots/installation_HelloBot.md) 

* HelloHttpBot allows to retrive data from a url.  [Run the bot](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Bots/installation_HelloHttpBot.md) 

### Examples

The "Examples" folder content a sample exemples as :

* TestClient allows to test a hubiquitus plateform. Click [here](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Examples/TestClient.md) to see how to run the project.

* HFacebook simple client allows to retrive data from facebook using HFacebook componement. Click [here](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Examples/HFacebookSimpleClient.md) 

* HTwitter Simples Clients allows to retrive data from twitter and post a tweets using HTwitterAPI-1.1. Click [here](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Examples/HTwitterSimpleClient.md)

* HGooglePlus Simple client allows to retrive data from Instagram using HGooglePlus. Click [here](https://github.com/hubiquitus/hubiquitus4java/blob/master/doc/Examples/HGooglePlusSimpleClient.md)

