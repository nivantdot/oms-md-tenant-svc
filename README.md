docker build --force-rm -f Dockerfile -t shk2123/tenant:1.0.0 .
docker push shk2123/tenant:1.0.0 
docker run -p 8081:8081 {container_id}