FROM payara/micro:6.2024.5-jdk21

USER root

COPY dockerbuild/server/entrypoint.sh /opt/payara/

RUN mkdir -p "/backup" \
    "/opt/domain"  \
    "/opt/domain/config" \
    && chmod +x /opt/payara/entrypoint.sh \
    && chown -R 1000:1000 /opt/payara /opt/domain

VOLUME /backup

USER 1000
ENTRYPOINT ["/bin/sh", "/opt/payara/entrypoint.sh"]

