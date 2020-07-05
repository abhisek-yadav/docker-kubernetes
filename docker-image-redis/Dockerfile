# import from base image

FROM alpine

# run command to install Redis

RUN apk add --update redis

# command on startup

CMD ["redis-server"]


# to build the image with tag
# docker build -t abhisek-yadav/docker-image-redis:latest .