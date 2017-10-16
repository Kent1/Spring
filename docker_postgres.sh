#!/usr/bin/env bash
docker run --rm --name postgres -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres
