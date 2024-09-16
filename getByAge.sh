#!/bin/bash

# Loop de 1 a 100 para idade
for age in {1..10}; do
    # Execute o comando wrk com a idade atual
    wrk -t12 -c20 -d5s --latency --timeout 10s "http://localhost:8080/user/$age"
done
