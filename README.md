# API
## [Configure your local environment](https://docs.microsoft.com/en-us/azure/azure-functions/create-first-function-vs-code-java)
* An Azure account with an active subscription.

* The [Azure Functions Core Tools](https://docs.microsoft.com/en-us/azure/azure-functions/functions-run-local) version 3.x..

* The [Azure CLI](https://docs.microsoft.com/en-us/cli/azure/install-azure-cli) version 2.4 or later.

* The [Java Developer Kit](https://docs.microsoft.com/en-us/azure/developer/java/fundamentals/java-jdk-long-term-support), version 8 or 11. The JAVA_HOME environment variable must be set to the install location of the correct version of the JDK.

* [Apache Maven](https://maven.apache.org/), version 3.0 or above.

* Visual Studio Code on one of the supported platforms.

* The [Java extension pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) for VS Code

* The [Azure Functions extension](https://marketplace.visualstudio.com/items?itemName=ms-azuretools.vscode-azurefunctions) for VS Code.

Check your setup

`func --version`

`az version`

`mvn -version`

`java -version`

To build and serve functions locally:
```
mvn clean package
mvn azure-functions:run
```

## Source Control
On GitHub saved in this depositary. To be synced with repos from Azure DevOps.

## CI/CD Pipeline
More on Azure DevOps

## Testing
More on Azure DevOps