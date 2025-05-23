#!/bin/sh

touch /opt/domain/config/prebootasadmin

java -jar -Djavax.net.debug=ssl,handshake /opt/payara/payara-micro.jar \
  --rootdir /opt/domain \
  --sslport 8181 \
  --deploymentdir /opt/payara/deployments \
  --postbootcommandfile /opt/domain/config/postbootasadmin \
  --prebootcommandfile /opt/domain/config/prebootasadmin \
  --autobindhttp \
  --autobindssl