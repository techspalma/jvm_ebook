#!/bin/sh

# Número total de URLs que queremos gerar
total_urls=100

# URL base para as solicitações
base_url="GET http://localhost:8080/user/"

# Loop para gerar e escrever cada URL no arquivo
for ((i=1; i<=total_urls; i++)); do
    url="${base_url}${i}/lock"
    echo $url >> request-lock.txt
done