#!/bin/bash

wrk -t100 -c15 -d60s -s get-by-id.lua http://localhost:8080
