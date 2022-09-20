# Traffic Logic
Data pipeline for Ivy (video-based object counting software).

## Architecture
![](traffic_logic_architecture.png)

## Setup
- Build and run containers: `docker compose up --build`.
- Setup filebeat: `docker exec -it filebeat sh -c "filebeat setup -E setup.kibana.host=kibana:5601 -E output.elasticsearch.hosts=[\"elasticsearch:9200\"]"` (run first time containers are started).

## Demo
- Stream video to server with ffmpeg: `ffmpeg -re -i data/videos/demo.mp4 -c copy -f flv rtmp://localhost:1935/stream/ivy?secret_key=secret419`.
- Monitor video stream and logs in real time: http://localhost:6969.
